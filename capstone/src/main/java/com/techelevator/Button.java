package com.techelevator;

import java.util.Map;
import java.util.TreeMap;

public class Button {

    Map<String, String> buttonMenu = new TreeMap<>();
    public Button(){
        buttonMenu.put("1","Feed Money");
        buttonMenu.put("2", "Select Product");
        buttonMenu.put("3","Finish Transaction");

    }
    public String buttonDisplay(){
        for(String buttonKey: buttonMenu.keySet()){
            System.out.println(buttonKey +" " + buttonMenu.get(buttonKey));
        }return buttonDisplay();
    }



}

