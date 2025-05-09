package com.juaracoding;

import java.util.Scanner;

public class TestValidasiLogin {
    public static void main(String[] args) {
        String username;
        String phone;
        String PIN;

        username = "yusuf123";
        phone = "081234567890";
        boolean isActive = false;
        boolean isOTPReceived = false;
        boolean isOTPExpired = false;
        boolean isBlocked = false;
        int maxPercobaan = 3;
        int isPercobaan = 0;
        PIN = "1234";


        Scanner input1 = new Scanner(System.in);
        System.out.println("Masukkan Username : ");
        String usernameOrphone = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Masukkan PIN : ");
        String PINLogin = input2.next();


        if (username.equals(usernameOrphone) || phone.equals(usernameOrphone)) {
            if (isBlocked) {
                System.out.println("Akun Anda telah diblokir");
                return;
            }
//            else if (PIN.equals(PINLogin)) {
//                System.out.println("Maaf PIN yang Anda Masukkan salah!!");
//            }
            else {
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
//        }

//            else {
//            System.out.println("Maaf Username & Password yang Anda Masukkan salah!!");
//        }

//        int grade = 70;
//        String keterangan = grade <= 65 ? "Lulus" : "Belum lulus";
//        System.out.println(keterangan);

//        } else if (isBlocked){
//            System.out.println("Akun Anda telah diblokir");
//        }

            }
        }
        else {
            System.out.println("Akun Anda belum terdaftar");
        }
    }

//    public static void PINLogin(){
//
//    }
}
