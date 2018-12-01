package view;

import java.util.Scanner;

public abstract class Menus{
	private String menuText;
	
	public void displayMenu() {
		System.out.println(this.menuText);
	}
	public abstract int handleMenuOption(Scanner in);
}