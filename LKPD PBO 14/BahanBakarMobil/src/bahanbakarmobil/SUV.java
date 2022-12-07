/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahanbakarmobil;

/**
 *
 * @author yemmey
 */
public class SUV extends BahanBakarMobil {

    public double hitungBahanBakar(){
        double bahanBakar = this.jarak / 12;
        return bahanBakar;
    }
    
    public double hitungWaktu(){
        double waktu = this.jarak / this.kecepatan;
        return waktu;
    }
}
