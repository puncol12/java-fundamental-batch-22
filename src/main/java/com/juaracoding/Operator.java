package com.juaracoding;

public class Operator {
    public static void main(String[] args) {

        int modulus = 11 % 3;
        System.out.println(modulus);

        int x = 3;
        int num1 = 100 * x++;
        System.out.println(num1);
        System.out.println(x);


        int y = 4;
        int num2 = 100 * ++y;
        System.out.println(num2);

        // CONTOH :
        String name = "Jakarta Pusat";
        System.out.println(name.replace(' ', '-'));

        int num3 = (10 + 5) * 4;
        System.out.println(num3);

        float b = 1 ;
        b /= 3;
        System.out.println(b);

        int a = 10;
        a += 5;
        System.out.println(a);

        boolean relationship = 3 > 6;
        if (relationship == true) {
            System.out.println("bilangan yang diinput lebih besar");
        } else {
            System.out.println("bilangan yang diinput tidak lebih besar");
        }

        //bitwise AND
        int num4 = 10 & 12;
        System.out.println(num4);

        //bitwise OR
        int num5 = 10 | 12;
        System.out.println(num5);

        //bitwise NOT
        int num6 = ~10;
        System.out.println(num6);

        //bitwise XOR
        int num7 = 10 ^ 12;
        System.out.println(num7);

        //bitwise lightshift
        int num8 = 10 << 2;
        System.out.println(num8);

        //bitwise rightshift
        int num9 = 10 >> 1;
        System.out.println(num9);
    }
}
