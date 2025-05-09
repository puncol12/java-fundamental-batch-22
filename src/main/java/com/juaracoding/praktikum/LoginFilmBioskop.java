package com.juaracoding.praktikum;

import java.util.Scanner;

public class LoginFilmBioskop {
    private static final int maxLooping = 3;
    private static int jumlahPercobaan = 0;
    private static boolean isBlocked = false;
    public static boolean cekJumlahPercobaan(String type, int jumlahPercobaan) {
        if (jumlahPercobaan >= maxLooping) {
            System.out.println("Akun diblokir karena mencoba memasukkan " + type + " salah " + maxLooping + " kali.");
            return true;
        }
        return false;
    }
    public void inputUsername(){
        if (isBlocked) {
            System.out.println("Akun Anda telah diblokir. Hubungi pihak terkait.");
            System.exit(0);
        }
        Scanner input1 = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        String usernameMasukkan = input1.next();
        if (!validasiUsername(usernameMasukkan)) {
            jumlahPercobaan++;
            System.out.println("Username salah. Coba lagi!!");
            isBlocked = cekJumlahPercobaan("Username", jumlahPercobaan);
            inputUsername();
        }
    }
    public void inputPassword() {
        if (isBlocked) {
            System.out.println("Akun Anda telah diblokir. Hubungi pihak terkait.");
            System.exit(0);
        }
        Scanner input2 = new Scanner(System.in);
        System.out.print("Masukkan Password : ");
        String passwordMasukan = input2.next();
        if (!validasiPassword(passwordMasukan)) {
            jumlahPercobaan++;
            System.out.println("Password anda salah. Coba lagi. Jumlah percobaan: " + jumlahPercobaan);
            isBlocked = cekJumlahPercobaan("Username", jumlahPercobaan);
            inputPassword();
        } else {
            System.out.println("Login berhasil !!");
            jumlahPercobaan = 0;
        }
    }
    private static boolean validasiUsername(String username){
        String usernameBenar = "admin";
        return username.equals(usernameBenar);
    }
    private static boolean validasiPassword(String password) {
        String passwordBenar = "12345";
        return password.equals(passwordBenar);
    }
}
