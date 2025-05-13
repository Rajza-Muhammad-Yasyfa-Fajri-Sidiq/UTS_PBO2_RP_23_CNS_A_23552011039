/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirasuransi.model;

/**
 *
 * @author hilma
 */
public abstract class Asuransi {
    protected String jenis;
    protected double premi;

    public Asuransi(String jenis) {
        this.jenis = jenis;
    }

    public abstract double hitungPremi();

    public String getJenis() {
        return jenis;
    }

    public double getPremi() {
        return premi;
    }
}
