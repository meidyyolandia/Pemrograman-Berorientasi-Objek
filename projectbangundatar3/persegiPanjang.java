package projectbangundatar3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class persegiPanjang {
    double panjang;
    double lebar;
    
    persegiPanjang(double p, double l){
        this.panjang = p;
        this.lebar = l;
    }
    
    void hitungKeliling(){
        double keliling =  2*(this.panjang + this.lebar);
        System.out.println("Keliling persegi panjang : " + keliling + "cm2");
    }
    
    void hitungLuas(){
        double luas = this.panjang * this.lebar;
        System.out.println("Luas Persegi Panjang : " + luas + "cm2");
    }
}
