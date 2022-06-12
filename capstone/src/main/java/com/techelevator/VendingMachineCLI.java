package com.techelevator;
import java.math.BigDecimal;
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
	Scanner inputNum = new Scanner(System.in);



	public VendingMachineCLI(Menu menu) {
		this.menu = menu;
	}

	public void run() throws FileNotFoundException {
		Inventory showList = new Inventory();
		BigDecimal currentBalance = new BigDecimal(0.00);



		while (true) {
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);


			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {


				//For each loop?
				System.out.println((showList.getListOfProducts().get("A1").locationID) + "|"+ showList.getListOfProducts().get("A1").getName() + "|$" + showList.getListOfProducts().get("A1").getPrice());
				System.out.println((showList.getListOfProducts().get("A2").locationID) + "|"+ showList.getListOfProducts().get("A2").getName() + "|$" + showList.getListOfProducts().get("A2").getPrice());
				System.out.println((showList.getListOfProducts().get("A3").locationID) + "|"+ showList.getListOfProducts().get("A3").getName() + "|$" + showList.getListOfProducts().get("A3").getPrice());
				System.out.println((showList.getListOfProducts().get("A4").locationID) + "|"+ showList.getListOfProducts().get("A4").getName() + "|$" + showList.getListOfProducts().get("A4").getPrice());
				System.out.println((showList.getListOfProducts().get("B1").locationID) + "|"+ showList.getListOfProducts().get("B1").getName() + "|$" + showList.getListOfProducts().get("B1").getPrice());
				System.out.println((showList.getListOfProducts().get("B2").locationID) + "|"+ showList.getListOfProducts().get("B2").getName() + "|$" + showList.getListOfProducts().get("B2").getPrice());
				System.out.println((showList.getListOfProducts().get("B3").locationID) + "|"+ showList.getListOfProducts().get("B3").getName() + "|$" + showList.getListOfProducts().get("B3").getPrice());
				System.out.println((showList.getListOfProducts().get("B4").locationID) + "|"+ showList.getListOfProducts().get("B4").getName() + "|$" + showList.getListOfProducts().get("B4").getPrice());
				System.out.println((showList.getListOfProducts().get("C1").locationID) + "|"+ showList.getListOfProducts().get("C1").getName() + "|$" + showList.getListOfProducts().get("C1").getPrice());
				System.out.println((showList.getListOfProducts().get("C2").locationID) + "|"+ showList.getListOfProducts().get("C2").getName() + "|$" + showList.getListOfProducts().get("C2").getPrice());
				System.out.println((showList.getListOfProducts().get("C3").locationID) + "|"+ showList.getListOfProducts().get("C3").getName() + "|$" + showList.getListOfProducts().get("C3").getPrice());
				System.out.println((showList.getListOfProducts().get("C4").locationID) + "|"+ showList.getListOfProducts().get("C4").getName() + "|$" + showList.getListOfProducts().get("C4").getPrice());
				System.out.println((showList.getListOfProducts().get("D1").locationID) + "|"+ showList.getListOfProducts().get("D1").getName() + "|$" + showList.getListOfProducts().get("D1").getPrice());
				System.out.println((showList.getListOfProducts().get("D2").locationID) + "|"+ showList.getListOfProducts().get("D2").getName() + "|$" + showList.getListOfProducts().get("D2").getPrice());
				System.out.println((showList.getListOfProducts().get("D3").locationID) + "|"+ showList.getListOfProducts().get("D3").getName() + "|$" + showList.getListOfProducts().get("D3").getPrice());
				System.out.println((showList.getListOfProducts().get("D4").locationID) + "|"+ showList.getListOfProducts().get("D4").getName() + "|$" + showList.getListOfProducts().get("D4").getPrice());





			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				Calculator vendCalc = new Calculator();
				Button returnPurchaseMenu = new Button ();

				System.out.println((showList.getListOfProducts().get("A1").locationID) + "|"+ showList.getListOfProducts().get("A1").getName() );
				System.out.println((showList.getListOfProducts().get("A2").locationID) + "|"+ showList.getListOfProducts().get("A2").getName() );
				System.out.println((showList.getListOfProducts().get("A3").locationID) + "|"+ showList.getListOfProducts().get("A3").getName() );
				System.out.println((showList.getListOfProducts().get("A4").locationID) + "|"+ showList.getListOfProducts().get("A4").getName() );
				System.out.println((showList.getListOfProducts().get("B1").locationID) + "|"+ showList.getListOfProducts().get("B1").getName() );
				System.out.println((showList.getListOfProducts().get("B2").locationID) + "|"+ showList.getListOfProducts().get("B2").getName() );
				System.out.println((showList.getListOfProducts().get("B3").locationID) + "|"+ showList.getListOfProducts().get("B3").getName() );
				System.out.println((showList.getListOfProducts().get("B4").locationID) + "|"+ showList.getListOfProducts().get("B4").getName() );
				System.out.println((showList.getListOfProducts().get("C1").locationID) + "|"+ showList.getListOfProducts().get("C1").getName() );
				System.out.println((showList.getListOfProducts().get("C2").locationID) + "|"+ showList.getListOfProducts().get("C2").getName() );
				System.out.println((showList.getListOfProducts().get("C3").locationID) + "|"+ showList.getListOfProducts().get("C3").getName() );
				System.out.println((showList.getListOfProducts().get("C4").locationID) + "|"+ showList.getListOfProducts().get("C4").getName() );
				System.out.println((showList.getListOfProducts().get("D1").locationID) + "|"+ showList.getListOfProducts().get("D1").getName() );
				System.out.println((showList.getListOfProducts().get("D2").locationID) + "|"+ showList.getListOfProducts().get("D2").getName() );
				System.out.println((showList.getListOfProducts().get("D3").locationID) + "|"+ showList.getListOfProducts().get("D3").getName() );
				System.out.println((showList.getListOfProducts().get("D4").locationID) + "|"+ showList.getListOfProducts().get("D4").getName() );
				System.out.println("----------------");
				System.out.println("Current Money Provided: ");
				System.out.println();


				System.out.println("Please make a selection: ");
				String inputCode = userInput.nextLine();

				if(inputCode.equals("1")){
					boolean usingFeeder = true;


					System.out.println("Please insert $1.00 ,$2.00, $5.00, or $10.00: ");
					while (usingFeeder) {
						currentBalance= vendCalc.calcFunds(userInput, currentBalance);
						System.out.println("Current funds: " + currentBalance);

						System.out.println(returnPurchaseMenu);

						System.out.println("Please make a selection: ");
						String purchaseCode = userInput.nextLine();
						userInput.nextLine();
						if(purchaseCode.equals("1") ){
							//System.out.println(returnPurchaseMenu);
							System.out.println("Please make a selection: ");
							//inputCode = userInput.nextLine();
							usingFeeder = false;

						}

					}
					System.out.println("Current funds: " + currentBalance);


				}else if(inputCode.equals("2")){
					System.out.println((showList.getListOfProducts().get("A1").locationID) + "|"+ showList.getListOfProducts().get("A1").getName() );
					System.out.println((showList.getListOfProducts().get("A2").locationID) + "|"+ showList.getListOfProducts().get("A2").getName() );
					System.out.println((showList.getListOfProducts().get("A3").locationID) + "|"+ showList.getListOfProducts().get("A3").getName() );
					System.out.println((showList.getListOfProducts().get("A4").locationID) + "|"+ showList.getListOfProducts().get("A4").getName() );
					System.out.println((showList.getListOfProducts().get("B1").locationID) + "|"+ showList.getListOfProducts().get("B1").getName() );
					System.out.println((showList.getListOfProducts().get("B2").locationID) + "|"+ showList.getListOfProducts().get("B2").getName() );
					System.out.println((showList.getListOfProducts().get("B3").locationID) + "|"+ showList.getListOfProducts().get("B3").getName() );
					System.out.println((showList.getListOfProducts().get("B4").locationID) + "|"+ showList.getListOfProducts().get("B4").getName() );
					System.out.println((showList.getListOfProducts().get("C1").locationID) + "|"+ showList.getListOfProducts().get("C1").getName() );
					System.out.println((showList.getListOfProducts().get("C2").locationID) + "|"+ showList.getListOfProducts().get("C2").getName() );
					System.out.println((showList.getListOfProducts().get("C3").locationID) + "|"+ showList.getListOfProducts().get("C3").getName() );
					System.out.println((showList.getListOfProducts().get("C4").locationID) + "|"+ showList.getListOfProducts().get("C4").getName() );
					System.out.println((showList.getListOfProducts().get("D1").locationID) + "|"+ showList.getListOfProducts().get("D1").getName() );
					System.out.println((showList.getListOfProducts().get("D2").locationID) + "|"+ showList.getListOfProducts().get("D2").getName() );
					System.out.println((showList.getListOfProducts().get("D3").locationID) + "|"+ showList.getListOfProducts().get("D3").getName() );
					System.out.println((showList.getListOfProducts().get("D4").locationID) + "|"+ showList.getListOfProducts().get("D4").getName() );
					System.out.println("Please enter the product slot location: ");
					String location = userInput.nextLine();
					location = location.toUpperCase();

					if(location.equalsIgnoreCase(showList.getListOfProducts().get(location).getLocationID())){

						System.out.println("Dispensing selected product >>> " + location +" " +  showList.getListOfProducts().get(location).getName());
						System.out.println("Current remaining funds: " + vendCalc.calcChange(currentBalance));


					}

				}else if(inputCode.equals("3")){

				}else{
					System.out.println("Invalid Selection.");
				}





			}
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Menu menu = new Menu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();
	}
}
