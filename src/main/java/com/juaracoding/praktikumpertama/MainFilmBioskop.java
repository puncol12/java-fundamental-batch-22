package com.juaracoding.praktikumpertama;

public class MainFilmBioskop {
    public static void main(String[] args) {
        LoginFilmBioskop login = new LoginFilmBioskop();// Membuat objek untuk proses login
        MenuUtamaFilmBioskop menu = new MenuUtamaFilmBioskop();// Membuat objek untuk menampilkan menu utama
        System.out.println("=====LOGIN=====");
        login.inputUsername();// Memanggil method untuk memasukkan username
        login.inputPassword();// Memanggil method untuk memasukkan password
        System.out.println("=====MENU UTAMA=====");
        menu.tampilkanMenu();// Menjalankan menu utama setelah login berhasil
    }
}
