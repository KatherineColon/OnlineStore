package com.pluralsight;

public class Products {
    private String sku;
    private String productName;
    private double price;
    private String department;

    public Products(String sku, String productName, double price, String department){
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.department = department;
    }
    //getters
    public String getSku(){
        return this.sku;
    }
    public String getProductName(){
        return this.productName;
    }
    public double getPrice(){
        return this.price;
    }
    public String getDepartment(){
        return this.department;
    }

}
