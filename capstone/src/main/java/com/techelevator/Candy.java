package com.techelevator;

public class Candy extends Item{

    public Candy(String locationID, String name, double price, String sound, int stock) {
        super(locationID, name, price, sound, stock);
    }

    Candy moonpie = new Candy("B1", "Moonpie", 1.80, "Munch Munch, Yum!", 5);
    Candy cowtales = new Candy("B2", "Cowtales", 1.50, "Munch Munch, Yum!", 5);
    Candy wonkaBar = new Candy("B3", "Wonka Bar", 1.50, "Munch Munch, Yum!", 5);
    Candy crunchie = new Candy("B4", "Crunchie", 1.75, "Munch Munch, Yum!", 5);

}
