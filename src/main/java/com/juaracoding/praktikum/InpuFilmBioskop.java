package com.juaracoding.praktikum;

import java.util.ArrayList;
import java.util.Scanner;

public class InpuFilmBioskop {
    public void inputFilm() {
        // Membuat ArrayList untuk daftar film
        ArrayList<String> daftarFilm = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Daftar Film ===");

        // Loop untuk menambahkan film
        while (true) {
            System.out.print("Masukkan nama film (atau ketik 'selesai' untuk keluar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            }

            daftarFilm.add(input);
        }

        // Menampilkan semua film yang telah ditambahkan
        System.out.println("\nDaftar Film yang Telah Ditambahkan:");
        for (int i = 0; i < daftarFilm.size(); i++) {
            System.out.println((i + 1) + ". " + daftarFilm.get(i));
        }
        scanner.close();
    }
}