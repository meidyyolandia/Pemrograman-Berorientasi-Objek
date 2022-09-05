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
public class ProjectBangunDatar {

    public static void main(String[] args) {
        System.out.println("Menghitung Luas dan Keliling");
        System.out.println("------Persegi Panjang------");
        PersegiPanjang A = new PersegiPanjang();
        A.panjang = 10;
        A.lebar = 7;
        A.hitungLuas();
        A.hitungKeliling();

        PersegiPanjang B = new PersegiPanjang();
        B.panjang = 14;
        B.lebar = 9;
        B.hitungLuas();
        B.hitungKeliling();
        
        PersegiPanjang C = new PersegiPanjang();
        C.panjang = 17;
        C.lebar = 8;
        C.hitungLuas();
        C.hitungKeliling();

        PersegiPanjang D = new PersegiPanjang();
        D.panjang = 26;
        D.lebar = 14;
        D.hitungLuas();
        D.hitungKeliling();
        

        System.out.println("--------Lingkaran--------");
        Lingkaran L1 = new Lingkaran();
        L1.jejari = 6;
        L1.hitungLuas();
        L1.hitungKeliling();
        
        Lingkaran L2 = new Lingkaran();
        L2.jejari = 12;
        L2.hitungLuas();
        L2.hitungKeliling();
      
    }
    
}


