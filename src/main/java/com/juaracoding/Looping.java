package com.juaracoding;

public class Looping {
    public static void main(String[] args) {

        //Counted loop: Perulangan yang jumlah pengulangannya terhitung atau tentu.
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Next statement");

        for (int i = 1; i < 10; i += 2) {
            System.out.println(i);
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            i++;
        }

        int sisi1 = 10;
        for (int i = 1; i <= sisi1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int x = 0;
        while (x < 5) {
            System.out.println(x);
            x++;
        }

        int sum = 0;
        int item = 0;
        while (item < 5) {
            item++;
            if (item == 2) continue;
            sum += item;
        }
        System.out.println(sum);
    }
}