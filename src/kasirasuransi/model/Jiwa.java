/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kasirasuransi.model;

/**
 *
 * @author hilma
 */
public class Jiwa extends Asuransi {
    public Jiwa() {
        super("Jiwa");
    }

    @Override
    public double hitungPremi() {
        premi = 750000; // contoh premi tetap
        return premi;
    }
}

