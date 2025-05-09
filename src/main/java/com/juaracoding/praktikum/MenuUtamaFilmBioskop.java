package com.juaracoding.praktikum;

import java.util.Scanner;

public class MenuUtamaFilmBioskop {
    public void menu() {
        Scanner input = new Scanner(System.in);
        char pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Daftar Film");
            System.out.println("2. Input Data Film");
            System.out.println("3. Cari Film");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            pilihan = input.next().charAt(0);

            switch (pilihan) {
                case '1':
                    System.out.println("Anda memilih Pilihan 1.");
                    DaftarFilmBioskop dfb = new DaftarFilmBioskop();
                    dfb.daftarFilm();
                    break;
                case '2':
                    System.out.println("Anda memilih Pilihan 2.");
                    break;
                case '3':
                    System.out.println("Anda memilih Pilihan 3.");
                    break;
                case '4':
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != '4');
        System.exit(0);
    }
}