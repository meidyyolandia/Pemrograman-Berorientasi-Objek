/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.bangun;
import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangunruang.Balok;
import bangunruang.Tabung;
import bangunruang.Bola;
/**
 *
 * @author yemmey
 */
public class MainClass {

    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        p1.sisi = 9;
        p1.tampilHasil();
        
        Lingkaran l1 = new Lingkaran();
        l1.jari = 6;
        l1.tampilHasil();
        
        Tabung t1 = new Tabung();
        t1.jari = 2;
        t1.tinggi = 7;
        t1.tampilHasil();
        
        Balok b1 = new Balok();
        b1.panjang = 4;
        b1.lebar = 3;
        b1.tinggi = 5;
        b1.tampilHasil();
        
        Bola bl1 = new Bola();
        bl1.jari = 8;
        bl1.tampilHasil();
    }
}
