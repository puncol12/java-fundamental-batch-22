package com.juaracoding;


import com.juaracoding.exception.StockException;

import static com.juaracoding.qwerty.stock;

public class MethodJuara {

//    private static String productName = "Nvida";
//    private static String productName1 = "AMD";
//    private static int drawKotak1 = 10;
//    private static int drawKotak2 = 5;
//    private static final int maxStock = 100;
//    private static int jumlahStock = 0;
    static int stock = 10;

    public static void main(String[] args) throws StockException {

        detailProduct("AMD",100000, minBuy());
        detailProduct("Nvidia", 200000, minBuy());
        detailProduct("radeon", 300000, minBuy());
        setDrawKotak(10);
    }
//    public static void validasiStock(int jumlahStock) {
//        int maxStock = 100;
//        if (jumlahStock >= maxStock) {
//            System.out.println("barang yang diambil :" +jumlahStock);
//        }
//    }
        public static void detailProduct (String productName, double  price, int minBuy) throws StockException {
            System.out.println("Nama Produk : " + productName);
            System.out.println("Jumlah Stok : " + stock);
            System.out.println("Harga : " + price);
            System.out.println("minimal pembelian : " + minBuy);
            if (stock > 100){
                System.out.println("tidak boleh lebih dari 100");
            }

            System.out.println("Subtotal = " + subTotal(1, + price));
            System.out.println("");

        }

        public static double subTotal(int amount, double price) throws StockException {
        if (amount > stock){
            throw new StockException("Stok tidak mencukupi !!!");
//            System.out.println("minimal pembelian " + minBuy());
        }
            return amount * price;
        }
        public static int minBuy(){
        return 1;
        }

        // Percobaan exception
//        public void penjualan(int amount, int stock) throws StockException{
//        if (amount > stock){
//            throw new StockException("Stock habis");
//        }
//        stock -= amount;
//        }

        public static void setDrawKotak ( int sisi){
//            for (int i = 0; i < sisi; i++) {
//                for (int j = 0; j < sisi; j++) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
        }

}