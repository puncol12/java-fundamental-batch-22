package com.juaracoding.praktikum;

import java.util.Scanner;

public class MenuUtamaFilmBioskop {
    public void tampilkanMenu() {
        Scanner input = new Scanner(System.in);
        char pilihan; // Variabel untuk menyimpan pilihan menu

        // Menggunakan do-while agar menu tetap tampil sampai pengguna memilih keluar
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Daftar Film");
            System.out.println("2. Input Data Film");
            System.out.println("3. Cari Film");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda: ");

            pilihan = input.next().charAt(0); // Membaca satu karakter sebagai input pilihan menu

            switch (pilihan) {
                case '1':
                    System.out.println("Anda memilih Pilihan 1.");
                    DaftarFilmBioskop dfb = new DaftarFilmBioskop();
                    dfb.tampilkanDaftarFilm(); //Mengambil dari method tampilkanFilm di Class DaftarFilmBioskop
                    break;
                case '2':
                    System.out.println("Anda memilih Pilihan 2.");
                    InputFilmBioskop ifb = new InputFilmBioskop();
                    ifb.inputFilm(); //Mengambil dari method inputFilm di Class InputFilmBioskop
                    break;
                case '3':
                    System.out.println("Anda memilih Pilihan 3.");
                    SearchingFilm sf = new SearchingFilm();
                    sf.cariFilm(); //Mengambil dari method cariFilm di Class SearchingFilm
                    break;
                case '4':
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
                default:
                    // Jika input yang tidak valid
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != '4'); // Ulangi menu sampai pilihan adalah 4 (keluar)

        System.exit(0); // Mengakhiri program secara eksplisit
    }
}
