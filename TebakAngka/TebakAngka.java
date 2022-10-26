/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

import java.util.Scanner;
import java.util.Random;

public class TebakAngka {
    public static void main(String[] args){
        int ans, tebak;
        final int max = 100;
  
        Scanner input = new Scanner(System.in);
        Random x = new Random();
        
        ans = x.nextInt(max) + 1;
        
        System.out.println("GAME TEBAK ANGKA");
        
        // loop
        while (true) {
            System.out.print("Silahkan tebak angka diantara 0 - 100 : ");
            tebak = input.nextInt();

            if (tebak == ans) {
                System.out.println("Bilangan tebakan anda BENAR!"); 
                System.out.println("Selamat yaa!!!");
                break;
            } else if (tebak < ans) {
                System.out.println("Bilangan tebakan anda terlalu kecil");
            } else if (tebak > ans){
                System.out.println("Bilangan tebakan anda terlalu besar");
            }
        }
    }
}