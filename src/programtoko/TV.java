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
public class TV extends Toko{
    String jenis;

    @Override
    public void Display() {
        System.out.println("Pembelian Televisi");
    }

    public void setMerk(String merk) {
        super.merk = merk;
    }

    public String getMerk() {
        System.out.println("Merk         : "+merk);
        return merk;
    }

    public void setHarga(int harga) {
        super.harga = harga;
    }

    public int getHarga() {
        System.out.println("Harga        : "+ "Rp"+harga+",00");
        return harga;
    }
    
    public void setTotal(int total) {
        super.total = total;
    }

    public int getTotal() {
        System.out.println("Total Barang : "+ total+" buah");
        return total;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        System.out.println("Jenis TV     : "+ jenis);
        return jenis;
    }
    
}