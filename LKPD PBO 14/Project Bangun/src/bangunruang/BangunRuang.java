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
public abstract class BangunRuang {
    public abstract double hitungLuasPermukaan();
    public abstract double hitungVolume();
    public void tampilHasil(){
        System.out.println("Luas Permukaannya: " + this.hitungLuasPermukaan());
        System.out.println("Volumenya: " + this.hitungVolume());
    }
}
