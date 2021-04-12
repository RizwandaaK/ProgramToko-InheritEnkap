/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramToko;

import java.util.Scanner;

/**
 *
 * @author rizwa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toko parentclass = new Toko();
        parentclass.setAdmin("RIZWANDA");
        parentclass.Display();
        parentclass.getAdmin();
        
        Scanner beli = new Scanner(System.in);
        int menu;
        int pilih;
        
        System.out.println("Program Toko");
        System.out.println("Pilihan produk: \n 1. Smartphone \n 2. Televisi \n 3. Kipas Angin \n");
        System.out.print("Masukkan pilihan: ");
        pilih = beli.nextInt();
        System.out.println("=================");
        System.out.println("");
        switch(pilih){
            case 1: 
                SmartPhone produk1 = new SmartPhone();
                produk1.setMerk("Vivo X60 Pro");
                produk1.setjmlkamera(4);
                produk1.setHarga(9999000);
                produk1.setTotal(1);
                produk1.getMerk();
                produk1.getjmlkamera();
                produk1.getHarga();
                produk1.getTotal();
            break;
            case 2:
                TV produk2 = new TV();
                produk2.setMerk("QA85Q950 SAMSUNG TV QLED 8K 85Q950TS 85 INCH");
                produk2.setJenis("TV QLED");
                produk2.setHarga(100000000);
                produk2.setTotal(1);
                produk2.getMerk();
                produk2.getJenis();
                produk2.getHarga();
                produk2.getTotal();
            break;
            case 3:
                KipasAngin produk3 = new KipasAngin();
                produk3.setMerk("TURBO WALL FAN - CFR 5889 Kipas Angin Dinding CFR588");
                produk3.setUkuran(16);
                produk3.setHarga(259000);
                produk3.setTotal(1);
                produk3.getMerk();
                produk3.getUkuran();
                produk3.getHarga();
                produk3.getTotal();
            break;
            default:
            System.out.println("Maaf, pilihan yang anda masukkan tidak ada, terima kasih.");    
        }
        System.out.println("");
        System.out.println("=====================================");
        System.out.println("    TERIMA KASIH SUDAH BERBELANJA    ");
        System.out.println("                  DI                 ");
        System.out.println("     TOKO ELEKTRONIK PAK SUGIYO      ");
        System.out.println("=====================================");
    }
}
   
