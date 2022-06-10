package com.techelevator;

import java.math.BigDecimal;

public interface VendableItems {

    String getName();
    BigDecimal getPrice();
    int getStock();
    String getLocationID();
    String getSound();


}
