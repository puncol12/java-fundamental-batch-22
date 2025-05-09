package com.juaracoding.praktikum;

public class DaftarFilmBioskop {
    public void daftarFilm(){
        String[][][] daftarFilm = {
                {{"Inception", "1", "12.00"}},
                {{"Avengers: Endgame", "2", "15.00"}},
                {{"The Matrix","3","17.00"}},
                {{"Interstellar","4","20,00"}},
                {{"Parasite","5","22.00"}}
        };
        System.out.println("Daftar Film:");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". Judul : " + daftarFilm[i][0][0]);
            System.out.println("   Urutan Film ke : " + daftarFilm[i][0][1]);
            System.out.println("   Penayangan Jam : " + daftarFilm[i][0][2] +" WIB");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
