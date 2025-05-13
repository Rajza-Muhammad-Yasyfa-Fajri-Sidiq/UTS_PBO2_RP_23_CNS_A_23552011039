package kasirasuransi.service;

import kasirasuransi.interfacee.LayananAsuransi;
import kasirasuransi.model.*;

import java.sql.*;
import java.util.Scanner;

public class AsuransiService implements LayananAsuransi {
    Scanner input = new Scanner(System.in);

    @Override
    public void tampilkanNasabah() {
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM nasabah")) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nama: " + rs.getString("nama") + ", Umur: " + rs.getInt("umur"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void tambahPolis() {
        System.out.print("Masukkan ID Nasabah: ");
        int nasabahId = input.nextInt();
        input.nextLine(); // buang enter
        System.out.print("Jenis Asuransi (Kesehatan/Jiwa): ");
        String jenis = input.nextLine();

        Asuransi asuransi = null;
        if (jenis.equalsIgnoreCase("Kesehatan")) {
            asuransi = new Kesehatan();
        } else if (jenis.equalsIgnoreCase("Jiwa")) {
            asuransi = new Jiwa();
        }

        if (asuransi != null) {
            double premi = asuransi.hitungPremi();
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement("INSERT INTO polis(nasabah_id, jenis, premi) VALUES (?, ?, ?)")) {
                pstmt.setInt(1, nasabahId);
                pstmt.setString(2, jenis);
                pstmt.setDouble(3, premi);
                pstmt.executeUpdate();
                System.out.println("Polis berhasil ditambahkan!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Jenis asuransi tidak valid.");
        }
    }

    @Override
    public void hitungPremi() {
        System.out.print("Jenis Asuransi (Kesehatan/Jiwa): ");
        String jenis = input.nextLine();

        Asuransi asuransi = null;
        if (jenis.equalsIgnoreCase("Kesehatan")) {
            asuransi = new Kesehatan();
        } else if (jenis.equalsIgnoreCase("Jiwa")) {
            asuransi = new Jiwa();
        }

        if (asuransi != null) {
            System.out.println("Premi: " + asuransi.hitungPremi());
        } else {
            System.out.println("Jenis asuransi tidak valid.");
        }
    }

    @Override
    public void tampilkanPolis() {
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM polis")) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Nasabah ID: " + rs.getInt("nasabah_id") +
                        ", Jenis: " + rs.getString("jenis") + ", Premi: " + rs.getDouble("premi"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
