package com.techelevator;
import java.util.List;
import com.techelevator.view.Menu;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.Key;
import java.util.*;

public class VendingMachineCLI{

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

	private Menu menu;

	Scanner userInput = new Scanner(System.in);



	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() throws FileNotFoundException {
		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				List<Item> displayMenu = new ArrayList<>();
				

				for(Item menu : displayMenu){
					System.out.println(displayMenu);
				}



			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				Map<String, String> purchaseMenu = new LinkedHashMap<>();
				purchaseMenu.put("A1", "Potato Crisps");
				purchaseMenu.put("A2", "Stackers");
				purchaseMenu.put("A3", "Grain Waves");
				purchaseMenu.put("A4", "Cloud Popcorn");

				System.out.println(purchaseMenu);
				System.out.println("----------------");
				System.out.println("Please make a selection: ");
				String inputCode = userInput.nextLine();




			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
