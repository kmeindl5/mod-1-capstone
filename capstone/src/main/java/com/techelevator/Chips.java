package com.techelevator;

public class Chips extends Item{

    public Chips(String locationID, String name, double price, String sound, int stock) {
        super(locationID, name, price, sound, stock);
    }

    public Chips getPotatoCrisps() {
        return potatoCrisps;
    }

    public void setPotatoCrisps(Chips potatoCrisps) {
        this.potatoCrisps = potatoCrisps;
    }

    public Chips getStackers() {
        return stackers;
    }

    public void setStackers(Chips stackers) {
        this.stackers = stackers;
    }

    public Chips getGrainWaves() {
        return grainWaves;
    }

    public void setGrainWaves(Chips grainWaves) {
        this.grainWaves = grainWaves;
    }

    public Chips getCloudPopcorn() {
        return cloudPopcorn;
    }

    public void setCloudPopcorn(Chips cloudPopcorn) {
        this.cloudPopcorn = cloudPopcorn;
    }

    Chips potatoCrisps = new Chips("A1", "Potato Crisps", 3.05, "Crunch Crunch, Yum!", 5);
    Chips stackers = new Chips("A2", "Stackers", 1.45, "Crunch Crunch, Yum!", 5);
    Chips grainWaves = new Chips("A3", "Grain Waves", 2.75, "Crunch Crunch, Yum!", 5);
    Chips cloudPopcorn = new Chips("A4", "Cloud Popcorn", 3.65, "Crunch Crunch, Yum!", 5);


}
