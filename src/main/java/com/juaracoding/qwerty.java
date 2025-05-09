package com.juaracoding;

import com.juaracoding.exception.StockException;

public class qwerty {
    public static void main(String[] args) throws StockException {
        sell(1);
    }
    static int stock = 0;

    public static void sell(int quantity) throws StockException {
        if (quantity > stock) {
            throw new StockException("Stock tidak mencukupi untuk penjualan.");
        }
        stock -= quantity;
    }
}
