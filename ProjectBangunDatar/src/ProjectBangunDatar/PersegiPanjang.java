/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectBangunDatar;

/**
 *
 * @author yemmey
 */
public class PersegiPanjang {

    int panjang;
    int lebar;
    
    void hitungLuas(){
        int luas = this.panjang * this.lebar;
        System.out.println("Luas: " + luas + " satuan luas");
    }
    
    void hitungKeliling(){
        int keliling = 2 * (this.lebar + this.panjang);
        System.out.println("Keliling: " + keliling + " satuan panjang");
    }
    
}
