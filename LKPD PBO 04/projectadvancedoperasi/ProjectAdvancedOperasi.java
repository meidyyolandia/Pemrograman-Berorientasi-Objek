/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectadvancedoperasi;

/**
 *
 * @author yemmey
 */
public class ProjectAdvancedOperasi {
    public static void main(String[] args) {
    Operasi p = new Operasi();
    
    System.out.println(p.jumlahkan(3, 4));
    System.out.println(p.jumlahkan(4, 7, (-9)));
    System.out.println(p.jumlahkan(3.4, (-0.002), 0.12313));
    System.out.println("");
    System.out.println(p.kalikan(3, 4));
    System.out.println(p.kalikan(4, 7, (-9)));
    System.out.println(p.kalikan(3.4, (-0.002), 0.12313));
    }
}