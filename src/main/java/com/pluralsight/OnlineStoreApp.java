package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineStoreApp {
    ArrayList<Products> products = new ArrayList<Products>();
    public void fileInput() {
        try {
            FileReader fileReader = new FileReader("products.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String input;
            boolean header = true;
            while ((input = bufferedReader.readLine()) != null) {
                if (header) {
                    header = false;
                    continue; //skips header
                }
                String[] data = input.split("\\|");
                products.add(new Products(data[0], data[1], Double.parseDouble(data[2]), data[3]));
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
        public void displayProducts() {

        for (Products product : products) {
            System.out.println("SKU: " + product.getSku() + ", Name: " + product.getProductName() +
                    ", Price: $" + product.getPrice() + ", Department: " + product.getDepartment());
        }

    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Home Screen! Please select an option");
        System.out.println("1. Display products");
        System.out.println("");
    }
}