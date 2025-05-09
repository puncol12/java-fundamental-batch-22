package com.juaracoding.praktikum;

public class MainFilmBioskop {
    public static void main(String[] args) {
        LoginFilmBioskop login = new LoginFilmBioskop();
        MenuUtamaFilmBioskop menu = new MenuUtamaFilmBioskop();
        System.out.println("=====LOGIN=====");
        login.inputUsername();
        login.inputPassword();
        System.out.println("=====MENU UTAMA=====");
        menu.menu();
    }
}
