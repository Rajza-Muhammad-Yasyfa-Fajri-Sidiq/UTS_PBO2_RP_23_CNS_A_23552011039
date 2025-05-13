/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirasuransi;

import java.util.Scanner;

import kasirasuransi.model.*;
import kasirasuransi.service.AsuransiService;
/**
 *
 * @author hilma
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AsuransiService service = new AsuransiService();

        while (true) {
            System.out.println("\n=== KASIR ASURANSI ===");
            System.out.println("1. Tampilkan Nasabah");
            System.out.println("2. Tambah Polis");
            System.out.println("3. Hitung Premi");
            System.out.println("4. Tampilkan Polis");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int choice = input.nextInt();
            input.nextLine(); // buang enter

            switch (choice) {
                case 1 -> service.tampilkanNasabah();
                case 2 -> service.tambahPolis();
                case 3 -> service.hitungPremi();
                case 4 -> service.tampilkanPolis();
                case 5 -> {
                    System.out.println("Keluar...");
                    System.exit(0);
                }
                default -> System.out.println("Menu tidak valid.");
            }
        }
    }
}
