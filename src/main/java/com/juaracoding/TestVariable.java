package com.juaracoding;

import java.net.SocketOption;

public class TestVariable {
    public static void main(String[] args) {

        byte id = 1;
        String name = "Yusuf";
        String email = "yusuf@gmail.com";
        String nomerHp = "08123457890";
        char gender = '1';
        boolean isActive = false;
        System.out.println("name = "+name);
        //System.out.println("email = "+email);
            if (isActive == true ) {
            System.out.println("Email = "+email);
            } else {
            System.out.println("Email = Maaf email anda belum diverifikasi");
            }
            if (gender == '1' ) {
            System.out.println("Jenis Kelamin = Laki-laki");
            } else {
            System.out.println("Jenis Kelamin = Perempuan");
            }
        System.out.println("nomer HP = "+nomerHp);

//            Implicit Casting
//            int num = 100;
//            double dataNumber = num;
//            System.out.println(dataNumber);
//
//            Explicit Casting
//            long number = 2200000000L;

    }
}
