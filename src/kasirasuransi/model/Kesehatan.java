/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirasuransi.model;

/**
 *
 * @author hilma
 */
public class Kesehatan extends Asuransi {
    public Kesehatan() {
        super("Kesehatan");
    }

    @Override
    public double hitungPremi() {
        premi = 500000; // contoh premi tetap
        return premi;
    }
}
