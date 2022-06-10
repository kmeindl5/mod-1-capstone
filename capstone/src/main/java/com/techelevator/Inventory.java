package com.techelevator;

import com.techelevator.Item;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class Inventory {


    private Map<String, Item> listOfProducts = new HashMap<>();


    public Map<String, Item> getListOfProducts(){
        return listOfProducts;
    }

    public Inventory() {

        String filePath = "vendingmachine.csv";
        File inputFile = new File(filePath);

        //Map<String, String> setListOfProducts = new HashMap<>();

        try {
            Scanner fileScanner = new Scanner(inputFile);
            while (fileScanner.hasNextLine()) {
                String currentLine = fileScanner.nextLine();
                String[] productInfo = currentLine.split("\\|");

                // this is where we will add it to the list and Parse it

                //create local item
                Item genericItem = new Item();
                //populate item properties from the string array
                genericItem.name = productInfo[1];
                genericItem.price = BigDecimal.valueOf(Double.valueOf(productInfo[2]));
                genericItem.locationID = productInfo[0];
                genericItem.stock = 5;
                if(productInfo[3]=="Chip"){
                    genericItem.setSound("Crunch Crunch, Yum!");
                }else if(productInfo[3]=="Candy"){
                    genericItem.setSound("Munch Munch, Yum!");
                }else if (productInfo[3]== "Drink"){
                    genericItem.setSound("Glug Glug, Yum!");
                }else if(productInfo[3]== "Gum"){
                    genericItem.setSound("Chew Chew, Yum!");
                }
                //put string key and local item into list of products
                listOfProducts.put(productInfo[0],genericItem);


            }
        } catch (FileNotFoundException e) {
            System.out.println("No vendingmachine.csv file");
        }


    }
    public Inventory (String locationID,String name, BigDecimal price){

    }


    }

