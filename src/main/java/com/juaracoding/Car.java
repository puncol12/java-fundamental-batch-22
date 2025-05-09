package com.juaracoding;

public class Car {
    private String bahanBakar;
    private int tahunPembuatan = 2025;
    public Car(String bensol){
        this.bahanBakar = bensol;
    }
    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    void warna(){
        System.out.println("berwarna merah");
    }
    void mesin(){
        System.out.println("bermesin 1800cc");
    }

    public void setTahunPembuatan(int tahunPembuatan) {
        this.tahunPembuatan = tahunPembuatan;
    }

    public int getTahunPembuatan() {
        return tahunPembuatan;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }
}
