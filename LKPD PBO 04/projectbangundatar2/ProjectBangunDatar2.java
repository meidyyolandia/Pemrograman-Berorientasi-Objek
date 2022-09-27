/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author yemmey
 */
public class ProjectBangunDatar2 {
    public static void main(String[] args) {
//        Persegi Panjang
        persegiPanjang pp1 = new persegiPanjang();
        System.out.println("");
        System.out.println("Keliling Persegi Panjang dengan panjang 10 dan lebar 5 : " + pp1.kelilingPersegiPanjang(10, 5));
        System.out.println("Luas Persegi Panjang dengan panjang 10 dan lebar 5 : "+ pp1.LuasPersegiPanjang(10, 5));
        System.out.println("Keliling Persegi Panjang dengan panjang 3.6 dan lebar 8 : " + pp1.kelilingPersegiPanjang(3.6, 8));
        System.out.println("Luas Persegi Panjang dengan panjang 3.6 dan lebar 8 : "+ pp1.LuasPersegiPanjang(3.6, 8));
        System.out.println("Keliling Persegi Panjang dengan panjang 6 dan lebar 8.3 : " + pp1.kelilingPersegiPanjang(6, 8.3));
        System.out.println("Luas Persegi Panjang dengan panjang 6 dan lebar 8.3 : "+ pp1.LuasPersegiPanjang(6, 8.3));
        System.out.println("Keliling Persegi Panjang dengan panjang 5.6 dan lebar 8.8 : " + pp1.kelilingPersegiPanjang(5.6, 8.8));        
        System.out.println("Luas Persegi Panjang dengan panjang 5.6 dan lebar 8.8 : "+ pp1.LuasPersegiPanjang(5.6, 8.8));
        
//        Persegi
        persegi p1 = new persegi();
        System.out.println("");
        System.out.println("Keliling Persegi dengan sisi 4.5 : " + p1.kelilingPersegi(4.5));
        System.out.println("Luas Persegi dengan sisi 4.5 : " + p1.LuasPersegi(4.5));
        System.out.println("Keliling Persegi dengan sisi 7 : " + p1.kelilingPersegi(7));
        System.out.println("Luas Persegi dengan sisi 7 : " + p1.LuasPersegi(7));
        
//        Lingkaran
        lingkaran l1 = new lingkaran();
        System.out.println("");
        System.out.println("Keliling Lingkaran dengan jari jari 5 : "+l1.kelilingLingkaran(5));
        System.out.println("Luas Lingkaran dengan jari jari 5 : "+l1.LuasLingkaran(5));
        System.out.println("Keliling Lingkaran dengan jari jari 7.4 : "+l1.kelilingLingkaran(7.4));
        System.out.println("Luas Lingkaran dengan jari jari 7.4 : "+l1.LuasLingkaran(7.4));
        
//        Segitiga
        segitiga s1 = new segitiga();
        System.out.println("");
        System.out.println("Keliling Segitiga dengan Panjang alas 8 dan Tinggi 10 : " + s1.kelilingSegitiga(8, 10));
        System.out.println("Luas Segitiga dengan Panjang alas 8 dan Tinggi 10 : " + s1.LuasSegitiga(8, 10));
        System.out.println("Keliling segitiga dengan Panjang alas 8 dan Tinggi 11.5 : " + s1.kelilingSegitiga(8, 11.5));
        System.out.println("Luas Segitiga dengan Panjang alas 8 dan Tinggi 11.5 : "+ s1.LuasSegitiga(8, 11.5));
        System.out.println("Keliling Segitiga dengan Panjang alas 12.2 dan Tinggi 9 : " + s1.kelilingSegitiga(12.2, 9));
        System.out.println("Luas segitiga dengan Panjang alas 12.2 dan Tinggi 9 : " + s1.LuasSegitiga(12.2, 9));
        System.out.println("Keliling Segitiga dengan Panjang alas 13.9 dan Tinggi 20.7 : " + s1.kelilingSegitiga(13.9, 20.7));
        System.out.println("Luas Segitiga dengan Panjang alas 13.9 dan Tinggi 20.7 : " + s1.LuasSegitiga(13.9, 20.7));
    }
}
