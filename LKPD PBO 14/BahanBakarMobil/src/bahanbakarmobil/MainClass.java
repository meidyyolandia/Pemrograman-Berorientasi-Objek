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
public class MainClass {
    public static void main(String[] args) {
        Sedan A = new Sedan();
        A.nama = "A";
        A.jenis = "Sedan";
        A.jarak = 157;
        A.kecepatan = 60;
        A.tampilHasil();
        
        Sedan B = new Sedan();
        B.nama = "B";
        B.jenis = "Sedan";
        B.jarak = 535;
        B.kecepatan = 65;
        B.tampilHasil();
        
        SUV C = new SUV();
        C.nama = "C";
        C.jenis = "SUV";
        C.jarak = 660;
        C.kecepatan = 57;
        C.tampilHasil();
        
        SUV D = new SUV();
        D.nama = "D";
        D.jenis = "SUV";
        D.jarak = 531;
        D.kecepatan = 62;
        D.tampilHasil();
        
        MPV E = new MPV();
        E.nama = "E";
        E.jenis = "MPV";
        E.jarak = 544;
        E.kecepatan = 64;
        E.tampilHasil();
        
        MPV F = new MPV();
        F.nama = "F";
        F.jenis = "MPV";
        F.jarak = 437;
        F.kecepatan = 53;
        F.tampilHasil();
    }
    
}
