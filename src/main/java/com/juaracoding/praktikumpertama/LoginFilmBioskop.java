package com.juaracoding.praktikumpertama;

import java.util.Scanner;

public class LoginFilmBioskop {
    private static final int maxLooping = 3; // Maksimum percobaan yang diizinkan
    private static int jumlahPercobaan = 0;  // Hitungan percobaan
    private static boolean isBlocked = false; // Status akun

    //Mengecek apakah jumlah percobaan melebihi batas
    public static boolean cekJumlahPercobaan(String type, int jumlahPercobaan) {
        if (jumlahPercobaan >= maxLooping) {
            System.out.println("Akun diblokir karena mencoba memasukkan " + type + " salah sebanyak " + maxLooping + " kali.");
            return true; //Jika akun perlu diblokir
        }
        return false; //Jika akun belum perlu diblokir
    }

    //Input dan validasi username menggunakan loop
    public void inputUsername() {
        if (isBlocked) {
            System.out.println("Akun Anda telah diblokir. Hubungi pihak terkait.");
            System.exit(0);
        }

        Scanner input = new Scanner(System.in);
        boolean valid = false;

        // Loop sampai username valid
        while (!valid) {
            System.out.print("Masukkan Username : ");
            String usernameMasukkan = input.nextLine(); // nextLine() agar bisa mendeteksi spasi atau karakter kosong dengan benarr

            if (usernameMasukkan.trim().isEmpty()){ // Validasi jika usernaeme kosong atau terisi sspasi
                System.out.println("Username tidak boleh kosong");
                continue;
            }

            if (validasiUsername(usernameMasukkan)) {
                valid = true;
            } else {
                System.out.println("Username salah. Coba lagi!!");
            }
        }
    }

    //Input dan validasi password menggunakan loop
    public void inputPassword() {
        if (isBlocked) {
            System.out.println("Akun Anda telah diblokir. Hubungi pihak terkait.");
            System.exit(0);
        }

        Scanner input = new Scanner(System.in);
        boolean valid = false;

        // Loop selama password salah dan percobaan belum mencapai batas
        while (!valid && !isBlocked) {
            System.out.print("Masukkan Password : ");
            String passwordMasukkan = input.nextLine(); // nextLine() agar bisa mendeteksi spasi atau karakter kosong dengan benar.

            if (passwordMasukkan.trim().isEmpty()){ // Validasi jika passoword kosong
                System.out.println("Password tidak boleh kosong");
                continue;
            }

            if (validasiPassword(passwordMasukkan)) {
                valid = true;
                System.out.println("Login berhasil !!");
                jumlahPercobaan = 0; // Reset jika berhasil
            } else {
                jumlahPercobaan++;
                System.out.println("Password salah. Coba lagi. Percobaan ke-" + jumlahPercobaan);
                isBlocked = cekJumlahPercobaan("Password", jumlahPercobaan);
            }
        }

        // Jika akun diblokir saat input password
        if (isBlocked) {
            System.out.println("Akun Anda telah diblokir. Hubungi pihak terkait.");
            System.exit(0);
        }
    }

    //Validasi username terhadap nilai yang benar
    private static boolean validasiUsername(String username) {
        String usernameBenar = "admin";
        return username.equals(usernameBenar);
    }

    //Validasi password terhadap nilai yang benar
    private static boolean validasiPassword(String password) {
        String passwordBenar = "12345";
        return password.equals(passwordBenar);
    }
}
