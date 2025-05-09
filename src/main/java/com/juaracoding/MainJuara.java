package com.juaracoding;

public class MainJuara {
//    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//
//        int x = 99;
//        if(true){
//            System.out.println("true");
//            System.out.println(x);
//        }
//        for (int i = 0; i < 11; i++){
//            System.out.println(i);
//            System.out.println(x);
//        }
//    }
    public static void main(String[] args) {





//        for ( int j = 0; j < 5; j++ ) {
//
//            for ( int i = 0; i < 20; i++ ){
//
//                System.out.println("anu");
//
//            }
//
//        }


//        for ( int i = 0; i < 10; i++ ) {
//
//            for ( int j = 0; j < 20; j++ ){
//
//                System.out.println("“anu”");
//
//            }
//
//        }


//        for ( int j = 0; j < 10; j++ ) {
//
//            for ( int i = 0; i < 20; i++ ){
//
//                System.out.println("anuuu");
//
//            }
//
//        }


//        for ( int j = 0; j < 50; j++ ) {
//
//            for ( int i = 0; i < 5; i++ ){
//
//                System.out.println("“anu”");
//
//            }
//
//        }

        String kata = "Tess";

        while (kata.length()<12) {

            kata = kata + "y";

        }

        String kata1 = "Tess";

        while (kata1.length()<12) {

            kata1 = kata1 + "y";

        }

        System.out.println(kata1);

//        for (int i = 0; i < 5; i++) {
//
//            if (i == 3) {
//
//                continue;
//
//            }
//
//            System.out.print("Heu");
//
//        }

        for (int i = 0; i < 5; i++) {

            System.out.print("Heu");

            if (i == 3) {

                break;

            }

        }
        System.out.println();

        for (int i = 1; i < 5; i++) {

            for (int j = 0; j<i; j++) {

                System.out.print(5-j);

            }

            System.out.println();

        }
        System.out.println();

        for (int i = 1; i < 5; i++) {

            for (int j = 0; j<i; i++) {

                System.out.print(5-j);

            }

            System.out.println();

        }

    }

}