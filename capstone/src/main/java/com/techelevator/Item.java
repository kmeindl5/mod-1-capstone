package com.techelevator;

public abstract class Item implements VendableItems {

    public String locationID;
    public String name;
    public double price;
    public String sound;
    public int stock = 5;

    public Item(String locationID, String name, double price, String sound, int stock) {
        this.locationID = locationID;
        this.name = name;
        this.price = price;
        this.sound = sound;
        this.stock = stock;
    }

    public String getLocationID() {
        return locationID;
    }

    public void setLocationID(String locationID) {
        this.locationID = locationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}