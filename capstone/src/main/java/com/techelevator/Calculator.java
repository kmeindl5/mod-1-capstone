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
     public BigDecimal calcChange(Scanner moneyInput, BigDecimal currentValue){


         BigDecimal totalBalance = new BigDecimal(0.00);

         //System.out.println("Your current money provided is: " + currentFunds);
         //System.out.println("Please insert $1.00 ,$2.00, $5.00, or $10.00: ");
         BigDecimal insertedMoney = moneyInput.nextBigDecimal();


            currentValue = currentValue.add( insertedMoney);


         //System.out.println("Your current money provided is: " + totalBalance);
         //System.out.println("Would you like to add more? 1 - Yes or 2 - No");
         return currentValue;
     }

    public Calculator(){
       /* BigDecimal currentFunds = moneyInput.nextBigDecimal();
        System.out.println("Your current money provided is: " + currentFunds);
        System.out.println("Would you like to add more? 1 - Yes or 2 - No");*/
        return;


    }

/*BigDecimal startingBalance = new BigDecimal(0.00);
					String userLine = new String();
					boolean usingFeeder = true;
					BigDecimal insertedMoney = new BigDecimal("0.00");
					BigDecimal totalBalance = new BigDecimal(0.00);



					while(usingFeeder){
					System.out.println("Please insert $1.00 ,$2.00, $5.00, or $10.00: ");
					userLine = userInput.next();
						Calculator vendCalc = new Calculator();
						vendCalc.calcChange(userInput);

						startingBalance = BigDecimal.valueOf(Long.parseLong(userLine));
					//startingBalance += BigDecimal.valueOf(Double.valueOf(userLine));
					System.out.println("Current Money Provided: " + totalBalance);
					}*/





}
