package com.juaracoding;

import java.util.Arrays;
import java.util.Collections;

public class PostTestDay5 {
    public static void main(String[] args) {
        Integer [] number = new Integer [5];

        number[0] = 20;

        number[1] = 21;

        number[2] = 22;

        number[3] = 23;

        number[4] = 24;

        System.out.println(number[0] + " " + number[1] + " " + number[2]);
        Arrays.sort(number, Collections.reverseOrder());

        for(int num : number){
            System.out.println(num);
        }
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}
