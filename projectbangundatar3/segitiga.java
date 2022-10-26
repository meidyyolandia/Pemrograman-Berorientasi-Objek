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
public class segitiga {
    double alas;
    double tinggi;

    segitiga(double a, double t){
        this.alas = a;
        this.tinggi = t;
    }
    
    segitiga(){
        
    }
    
    //Keliling segitiga sama sisi
    void hitungKeliling(){
        double keliling =  3 * this.alas;
        System.out.println("Keliling Segitiga : " + keliling + "cm2");
    }
    
    void hitungLuas(){
        double luas = (this.alas * this.tinggi)/2;
        System.out.println("Luas Segitiga : " + luas + "cm2");
    }
}
