package com.juaracoding.praktikum;

import java.util.ArrayList;

public class DaftarFilmBioskop {
    public static void main(String[] args) {
        // Membuat array daftar film
        String[][][] daftarFilm = {
                {{"Inception", "1", "12.00"}},
                {{"Avengers: Endgame", "2", "15.00"}},
                {{"The Matrix","3","17.00"}},
                {{"Interstellar","4","20,00"}},
                {{"Parasite","5","22.00"}}
        };
//        String[][][] daftarFilm = {
//                {   // Hari 1 (misalnya Senin)
//                        {"Inception", "1", "12.00"},
//                        {"Interstellar", "2", "15.00"},
//                        {"Tenet", "3", "18.00"}
//                },
//                {   // Hari 2 (misalnya Selasa)
//                        {"Avengers: Endgame", "1", "13.00"},
//                        {"The Matrix", "2", "16.00"},
//                        {"Parasite", "3", "19.00"}
//                }
//        };

        // Menampilkan isi array daftar film
        System.out.println("Daftar Film:");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". Judul : " + daftarFilm[i][0][0]);
            System.out.println("   Urutan Film ke : " + daftarFilm[i][0][1]);
            System.out.println("   Penayangan Jam : " + daftarFilm[i][0][2] +" WIB");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
