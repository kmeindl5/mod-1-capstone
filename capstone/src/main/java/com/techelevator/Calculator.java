package com.techelevator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Calculator extends Inventory {

    public final int QUARTER_VALUE = 25;
    public final int DIME_VALUE = 10;
    public final int NICKEL_VALUE = 5;

    public BigDecimal currentFunds = BigDecimal.valueOf(0.00);

    public BigDecimal getCurrentFunds() {
        return currentFunds;
    }

    Inventory calcInventory = new Inventory();

    Scanner moneyInput = new Scanner(System.in);

    public BigDecimal calcFunds(Scanner moneyInput, BigDecimal currentValue) {

        BigDecimal totalBalance = new BigDecimal(0.00);

        //System.out.println("Your current money provided is: " + currentFunds);
        //System.out.println("Please insert $1.00 ,$2.00, $5.00, or $10.00: ");
        BigDecimal insertedMoney = moneyInput.nextBigDecimal();

        currentValue = currentValue.add(insertedMoney);

        //System.out.println("Your current money provided is: " + totalBalance);
        //System.out.println("Would you like to add more? 1 - Yes or 2 - No");
        return currentValue;
    }

    public BigDecimal calcChange(BigDecimal currentValue) {

        currentValue = currentValue.subtract(calcInventory.getListOfProducts().get("A1").price);


        //System.out.println("Your current money provided is: " + totalBalance);
        //System.out.println("Would you like to add more? 1 - Yes or 2 - No");
        return currentValue;
    }

    public Calculator() {

        return;
    }

}
       /* BigDecimal currentFunds = moneyInput.nextBigDecimal();
        System.out.println("Your current money provided is: " + currentFunds);
        System.out.println("Would you like to add more? 1 - Yes or 2 - No");*/








    /*BigDecimal currentBalance = new BigDecimal(0.00);
    boolean usingFeeder = true;
    Calculator vendCalc = new Calculator();
        System.out.println("Please insert $1.00 ,$2.00, $5.00, or $10.00: ");
                while (usingFeeder) {
                currentBalance= vendCalc.calcChange(userInput, currentBalance);
                System.out.println("Current funds: " + currentBalance);
                System.out.println("(R) to return to Purchase menu");
                userInput.nextLine();
                if(inputCode.equals("R") ){
                System.out.println("(1) Feed Money");
                System.out.println("(2) Select Product");
                System.out.println("(3) Finish Transaction");
                System.out.println("Please make a selection: ");
                inputCode = userInput.nextLine();
                usingFeeder = false;*/