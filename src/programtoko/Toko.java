/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramToko;

/**
 *
 * @author rizwa
 */
public class Toko {
    private String admin;
    String merk;
    int harga;
    int total;

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getAdmin() {
        System.out.println("=====================================");
        System.out.println("KASIR: "+admin+"  2.1.1    15114/ES/02");
        System.out.println("=====================================");
        return admin;
    }
    public void Display(){
        System.out.println("     CANDIPURO/008  (0331)234561     ");
        System.out.println("     TOKO ELEKTRONIK PAK SUGIYO      ");
    }
}
