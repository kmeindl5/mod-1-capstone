package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator {

    public final int QUARTER_VALUE = 25;
    public final int DIME_VALUE = 10;
    public final int NICKEL_VALUE = 5;

    public BigDecimal currentFunds = BigDecimal.valueOf(0.00);

    public BigDecimal getCurrentFunds() {
        return currentFunds;
    }

    Scanner moneyInput = new Scanner(System.in);

    public Calculator(){
        BigDecimal currentFunds = moneyInput.nextBigDecimal();
        System.out.println("Your current money provided is: " + currentFunds);
        System.out.println("Would you like to add more? 1 - Yes or 2 - No");

    }




}
