package projectbangundatar3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yemmey
 */
public class persegi {
    double sisi;    
    
    persegi(double a){
        this.sisi = a;
    }
    
    void hitungKeliling(){
        double keliling =  4 * this.sisi;
        System.out.println("Keliling Persegi : " + keliling + "cm2");
    }
    
    void hitungLuas(){
        double luas = this.sisi * this.sisi;
        System.out.println("Luas Persegi : " + luas + "cm2");
    }
}
