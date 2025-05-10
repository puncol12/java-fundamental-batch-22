package com.juaracoding.praktikumpertama;

public class DaftarFilmBioskop {
    private String[][] daftarFilm = {
            {"One Piece", "1", "12.00", "Action", "2 jam", "4"},
            {"Hunter x Hunter", "2", "15.00", "Superhero", "3 jam", "5"},
            {"Gintama", "3", "17.00", "Sci-Fi", "2.5 jam", "4.5"},
            {"Kimetsu no Yaiba", "4", "20.00", "Sci-Fi", "3 jam", "4.8"},
            {"Attack On Titan", "5", "22.00", "Thriller", "2 jam", "4.7"}
    };

    // Method untuk mengembalikan data film
    public String[][] getDaftarFilm() {
        return daftarFilm;
    }

    // Method untuk mencetak daftar film
    public void tampilkanDaftarFilm() {
        System.out.println("Daftar Film:");
        for (int i = 0; i < daftarFilm.length; i++) {
            System.out.println((i + 1) + ". Judul         : " + daftarFilm[i][0]);
            System.out.println("   Urutan Film ke: " + daftarFilm[i][1]);
            System.out.println("   Penayangan Jam: " + daftarFilm[i][2] + " WIB");
            System.out.println("   Genre Film    : " + daftarFilm[i][3]);
            System.out.println("   Durasi Film   : " + daftarFilm[i][4]);
            System.out.println("   Rating Film   : " + daftarFilm[i][5]);
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
    }
