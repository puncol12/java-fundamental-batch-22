package com.juaracoding.praktikumpertama;

import java.util.Scanner;

public class InputFilmBioskop {

    // Method untuk menginput data film
    public void inputFilm() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data : ");//memasukkan jumlah data film yang ingin dimasukkan
        int jumlah = input.nextInt();  // Menyimpan jumlah data dalam variabel 'jumlah'
        input.nextLine(); // Membersihkan newline setelah nextInt()

        // Membuat array untuk menyimpan data film
        String[] judul = new String[jumlah];
        int[] urutanPenayangan = new int[jumlah];
        String[] penayangan = new String[jumlah];
        String[] genre = new String[jumlah];
        String[] durasi = new String[jumlah];
        double[] rating = new double[jumlah];

        // Loop untuk menerima input data film dari pengguna
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Masukkan Judul : ");
            judul[i] = input.nextLine();
            System.out.print("Masukkan jam Penayangan : ");
            penayangan[i] = input.nextLine();
            System.out.print("Masukkan Genre Film : ");
            genre[i] = input.nextLine();
            System.out.print("Masukkan Durasi Film : ");
            durasi[i] = input.nextLine();
            System.out.print("Masukkan Urutan Penayangan Film : ");
            urutanPenayangan[i] = input.nextInt();
            System.out.print("Masukkan Rating Film : ");
            rating[i] = input.nextDouble();
            input.nextLine();
        }

        // Menampilkan semua data yang sudah dimasukkan
        System.out.println("\n=== Data yang Dimasukkan ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". Judul Film : " + judul[i] +
                    "\n   Urutan Penayangan: " + urutanPenayangan[i] +
                    "\n   Jam Penayangan: " + penayangan[i] +
                    "\n   Genre: " + genre[i] +
                    "\n   Durasi Film: " + durasi[i] +
                    "\n   Rating: " + rating[i]);
        }
    }
}
