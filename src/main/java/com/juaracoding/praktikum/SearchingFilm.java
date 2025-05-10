package com.juaracoding.praktikum;

import java.util.Scanner;

public class SearchingFilm {
    public void cariFilm() {
        Scanner input = new Scanner(System.in);
        // Membuat objek DaftarFilmBioskop dan mengambil data film dalam bentuk array 2 dimensi
        DaftarFilmBioskop bioskop = new DaftarFilmBioskop();
        String[][] daftarFilm = bioskop.getDaftarFilm();// Data diambil dengan getter dari Class DaftarFilmBioskop

        System.out.print("Masukkan judul film yang dicari: ");
        String keyword = input.nextLine().toLowerCase(); // Mengubah ke huruf kecil agar pencarian tidak case-sensitive
        boolean ditemukan = false; // Flag untuk menandai apakah film ditemukan

        System.out.println("\nHasil pencarian:");

        for (int i = 0; i < daftarFilm.length; i++) {
            if (daftarFilm[i][0].toLowerCase().contains(keyword)) { // validasi apakah judul film mengandung kata kunci pencarian
                // Menampilkan informasi film jika ditemukan
                System.out.println("Judul          : " + daftarFilm[i][0]);
                System.out.println("Urutan Film ke : " + daftarFilm[i][1]);
                System.out.println("Penayangan Jam : " + daftarFilm[i][2] + " WIB");
                System.out.println("Genre Film     : " + daftarFilm[i][3]);
                System.out.println("Durasi Film    : " + daftarFilm[i][4]);
                System.out.println("Rating Film    : " + daftarFilm[i][5]);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                ditemukan = true;
            }
        }

        // Jika Film tidak ditemukan
        if (!ditemukan) {
            System.out.println("Film tidak ditemukan.");
        }
    }
}
