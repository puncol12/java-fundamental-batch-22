package com.juaracoding;

import java.util.Scanner;

public class Test2 {
    private static final int maxLooping = 3;
    private static int jmlPercobaan = 0;
    private static boolean isBlocked = false;
    private static int pin = 123456;

    public static void main(String[] args) {
        inputPin();
    }
    public static void inputPin() {
        do{
            System.out.println("Masukkan PIN : ");
            Scanner scanner = new Scanner(System.in);
            int inPin = scanner.nextInt();
            if (inPin == pin) break;
            jmlPercobaan++;
            if (jmlPercobaan == maxLooping) isBlocked = true;
        } while (jmlPercobaan < maxLooping);

        if (!isBlocked){
            System.out.println("Lanjutkan Transaksi");
        } else {
            System.out.println("PIN anda telah diblokir");
        }
    }
}
