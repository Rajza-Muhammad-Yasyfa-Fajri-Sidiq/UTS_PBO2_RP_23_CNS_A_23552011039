/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirasuransi.model;

/**
 *
 * @author hilma
 */
import java.util.Date;
public class Klaim {
    private int id;
    private int polisId;
    private Date tanggal;
    private String status;

    public Klaim(int id, int polisId, Date tanggal, String status) {
        this.id = id;
        this.polisId = polisId;
        this.tanggal = tanggal;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getPolisId() {
        return polisId;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public String getStatus() {
        return status;
    }
}