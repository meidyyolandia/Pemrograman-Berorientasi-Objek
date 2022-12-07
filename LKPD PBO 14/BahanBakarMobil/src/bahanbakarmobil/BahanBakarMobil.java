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
public abstract class BahanBakarMobil {
    public String nama;
    public String jenis;
    public double jarak;
    public double kecepatan;
    
    public abstract double hitungBahanBakar();
    public abstract double hitungWaktu();
    public void tampilHasil(){
        System.out.println("Mobil " + this.nama + " dengan jenis " + this.jenis);
        System.out.println("Jarak tempuh perjalanan " + this.jarak + " km");
        System.out.println("Jumlah bahan bakar : " + this.hitungBahanBakar() + " Liter");
        System.out.println("Lama waktu perjalanan : " + this.hitungWaktu() + " Jam");
        System.out.println("-------------------------------");
    }
}
    