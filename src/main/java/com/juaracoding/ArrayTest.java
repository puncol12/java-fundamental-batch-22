package com.juaracoding;

import java.util.Scanner;

public class ArrayTest {
    private static int totalPrice = 0;
    private static int totalPrice1 = 0;
    public static void main(String[] args) {
        inputJumlah1();
        inputJumlah2();
        }
//        int [] nilai    ={1,2,3,4,5};
//        System.out.println(nilai[2]);
    public static void inputJumlah1() {
        Scanner scanner = new Scanner(System.in);

// masukan jumlah data = 5
// price[] = input harga, sekalian totalkan
        System.out.println("Masukan jumlah data");
        int jumlah = scanner.nextInt();

        int[] price = new int[jumlah];
// looping, assignment value, operator +=

        for (int i = 0; i < price.length; i++) {
            System.out.println("Masukan harga:");
            price[i] = scanner.nextInt();
            totalPrice1 += price[i];
        }
        System.out.println("Total harga = " + totalPrice1);
    }
    public static void inputJumlah2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan jumlah data");
        int jumlah = scanner.nextInt();

        int[] price = new int[jumlah];
// looping, assignment value, operator +=

        for (int i = 0; i < price.length; i++) {
            System.out.println("Masukan harga:");
            price[i] = scanner.nextInt();
            totalPrice += price[i];
        }

        System.out.println("Total harga = " + totalPrice);
    }
//    public static boolean jumlahTotalHarga(int totalPrice1, int totalPrice){
//        if (totalPrice1 += totalPrice){
//            System.out.println("total = " + jumlahTotalHarga);
//        }
    }

