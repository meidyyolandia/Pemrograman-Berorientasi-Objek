/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar3;

/**
 *
 * @author yemmey
 */
public class lingkaran {
    double jari;
    
    lingkaran(double jari){
        this.jari = jari;
    }
    
    void hitungKeliling(){
        double keliling =  2 * 3.14 * this.jari;
        System.out.println("Keliling Lingkaran : " + keliling + "cm2");
    }
    
    void hitungLuas(){
        double luas =  3.14 * this.jari * this.jari;
        System.out.println("Luas Lingkaran : " + luas + "cm2");
    }
}
