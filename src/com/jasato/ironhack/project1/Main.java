package com.jasato.ironhack.project1;

public class Main {

    public static void main(String[] args) {

        String product = " Gel de ducha ";
        String date = "13 de enero 2020  ";
        System.out.println(productFormatter(product, date));


    }

    public static String productFormatter(String product, String date) {
        return (product.trim().replace(" ", "_") +
                date.trim().replace(" ", "_")).toUpperCase();
    }
}
