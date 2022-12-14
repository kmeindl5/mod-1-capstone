package com.techelevator;

import java.math.BigDecimal;

public class Item implements VendableItems {

    public String locationID;
    public String name;
    public BigDecimal price;
    public String sound;
    public int stock = 5;

    public Item (){

    }
    public Item(String locationID, String name, BigDecimal price, String sound, int stock) {
        this.locationID = locationID;
        this.name = name;
        this.price = price;
        this.sound = sound;
        this.stock = stock;
    }

    public Item(String locationID, String name) {
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice() {
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