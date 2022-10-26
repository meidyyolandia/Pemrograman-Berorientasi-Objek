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
public class ProjectBangunDatar3 {

    public static void main(String[] args) {
        //Persegi Panjang
        persegiPanjang pp1 = new persegiPanjang(10, 5);
        pp1.hitungKeliling();
        pp1.hitungLuas();
        
        persegiPanjang pp2 = new persegiPanjang(3.6, 8);
        pp2.hitungKeliling();
        pp2.hitungLuas();
        
        persegiPanjang pp3 = new persegiPanjang(6, 8.3);
        pp3.hitungKeliling();
        pp3.hitungLuas();
        
        persegiPanjang pp4 = new persegiPanjang(5.6, 8.8);
        pp4.hitungKeliling();
        pp4.hitungLuas();
        
        //Persegi
        System.out.println("");
        persegi p1 = new persegi(4.5);
        p1.hitungKeliling();
        p1.hitungLuas();
        
        persegi p2 = new persegi(7);
        p2.hitungKeliling();
        p2.hitungLuas();
        
        //Lingkaran
        System.out.println("");
        lingkaran l1 = new lingkaran(5);
        l1.hitungKeliling();
        l1.hitungLuas();
        
        lingkaran l2 = new lingkaran(7.4);
        l2.hitungKeliling();
        l2.hitungLuas();
        
        //Segitiga
        System.out.println("");
        segitiga s1 = new segitiga(8, 10);
        s1.hitungKeliling();
        s1.hitungLuas();
        
        segitiga s2 = new segitiga(8, 11.5);
        s2.hitungKeliling();
        s2.hitungLuas();
        
        segitiga s3 = new segitiga(12.2, 9);
        s3.hitungKeliling();
        s3.hitungLuas();
        
        segitiga s4 = new segitiga(13.9, 20.7);
        s4.hitungKeliling();
        s4.hitungLuas();
    }
    
}
