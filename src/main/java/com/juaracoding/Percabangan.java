package com.juaracoding;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
//        String username = "Yusuf123";
//        String password = "password";
//        char gender = '1';
//        boolean isActive = true;
        //System.out.println("email = "+email);
//        if (isActive) {
//            System.out.println(username + "Selamat berhasil Login");
//        } else {
//            System.out.println("Maaf username/email anda belum terdaftar");
//        }
        String username;
        String phone;

        username = "yusuf123";
        phone = "081234567890";
        boolean isActive = false;
        boolean isOTPReceived = false;
        boolean isOTPExpired = false;
        boolean isBlocked = false;

        Scanner input1 = new Scanner(System.in);
        System.out.println("Masukkan Username : ");
        String usernameOrphone = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukkan OTP : ");
        String password = input2.next();

        if (username.equals(usernameOrphone) || phone.equals(usernameOrphone)) {
            if (isBlocked) {
                System.out.println("Akun Anda telah diblokir");
            } else {
                isActive = true;

                if (isActive) {
                    isOTPReceived = true;
                    isOTPExpired = true;
                    if (isOTPReceived && isOTPExpired) {
                        System.out.println("Silahkan input OTP");
                    } else {
                        System.out.println("Kirim ulang OTP");
                    }
                }

//            System.out.println("Maaf akun anda tidak Terdaftar");
//
//        } else if (username.equals(Username)) {
//            System.out.println("Maaf Username yang Anda Masukkan salah!!");
//        } else if (password.equals(Password)) {
//            System.out.println("Maaf Password yang Anda Masukkan salah!!");
//        } else {
//            System.out.println("Maaf Username & Password yang Anda Masukkan salah!!");
//        }

//        int grade = 70;
//        String keterangan = grade <= 65 ? "Lulus" : "Belum lulus";
//        System.out.println(keterangan);

//        } else if (isBlocked){
//            System.out.println("Akun Anda telah diblokir");
//        }
                else {
                    System.out.println("Akun Anda belum terdaftar");
                }
            }
        }
    }
}