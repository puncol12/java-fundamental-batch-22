package com.juaracoding;

public class Kendaraan {
    public static void main(String[] args) {
        Car mobil = new Car("bensol");
        // setter
        mobil.warna();
        mobil.mesin();
//        mobil.setBahanBakar("Bensol");
//        mobil.setTahunPembuatan(2020);
        //getter
        System.out.println("bahanya : "+mobil.getBahanBakar());
        System.out.println("tahun pembuatan : "+mobil.getTahunPembuatan());
    }
}

