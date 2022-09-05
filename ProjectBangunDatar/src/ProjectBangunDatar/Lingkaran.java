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
public class Lingkaran {
    
    int jejari;

    public void hitungLuas(){
        double hasil = 3.14 * this.jejari * this.jejari ;
        System.out.println("Luas : " + hasil + " satuan luas");
        
    }
    public void hitungKeliling(){
      double hasil = 3.14 * 2 * this.jejari;
        System.out.println("Keliling : " + hasil + " satuan keliling");
    }
}