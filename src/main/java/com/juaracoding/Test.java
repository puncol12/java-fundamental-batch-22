package com.juaracoding;

import java.util.Scanner;

public class Test {

    private static final int maxLooping = 3;

    private static int jumlahPercobaan = 0;
    private static boolean isBlocked = false;

    public static void main(String[] args) {
        // Contoh penggunaan
        //input username
        inputUsername();
        inputPIN(); // Contoh memproses input PIN
    }

    public static boolean cekJumlahPercobaan(String type, int jumlahPercobaan) {
        if (jumlahPercobaan >= maxLooping) {
            System.out.println("Akun diblokir karena mencoba memasukkan " + type + " salah " + maxLooping + " kali.");
        return true;
        }
        return false;
    }

    public static void inputUsername(){
        if (isBlocked) {
            System.out.println("Akun Anda telah diblokir. Hubungi pihak terkait.");
            System.exit(0);
        }

        Scanner input1 = new Scanner(System.in);
        System.out.println("Masukkan Username : ");
        String usernameMasukkan = input1.next();

        if (!validasiUsername(usernameMasukkan)) {
            jumlahPercobaan++;
            System.out.println("Username salah. Coba lagi!! Jumlah Percobaan : " + jumlahPercobaan);
            isBlocked = cekJumlahPercobaan("Username", jumlahPercobaan);
            inputUsername();
        }
    }

    public static void inputPIN() {
        if (isBlocked) {
            System.out.println("Akun Anda telah diblokir. Hubungi pihak terkait.");
            System.exit(0);
        }
        // Simulasi input PIN (gunakan input dari user, misalnya dari console)
        // String pinMasukan = "1234"; // Contoh PIN yang dimasukkan user
        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukkan PIN : ");
        String pinMasukan = input2.next();

        // Validasi PIN (gunakan PIN yang benar dari sistem)
        if (!validasiPIN(pinMasukan)) {
            jumlahPercobaan++;
            System.out.println("PIN salah. Coba lagi. Jumlah percobaan: " + jumlahPercobaan);
            isBlocked = cekJumlahPercobaan("Username", jumlahPercobaan);
            inputPIN();

        } else {
            System.out.println("PIN benar. Akses berhasil.");
            jumlahPercobaan = 0; // Reset jumlah percobaan setelah berhasil
        }
    }

    private static boolean validasiUsername(String username){
        String usernameBenar = "yusuf123";
        return username.equals(usernameBenar);
    }

    private static boolean validasiPIN(String pin) {
        // Implementasi validasi PIN (gunakan PIN yang benar dari sistem)
        String pinBenar = "1234"; // Contoh PIN yang benar di sistem
        return pin.equals(pinBenar);
    }
    public void methodTanpaReturn() {

    }
}

