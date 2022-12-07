/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ACER
 */
public class Tabung extends BangunRuang {
    public double jari;
    public double tinggi;
    
    public double hitungLuasPermukaan(){
        double luas = 2 * 3.14 * this.jari;
        return luas;
    }
    
    public double hitungVolume(){
        double volume = 3.14 * this.jari * this.jari * this.tinggi;
        return volume;
    }
}
