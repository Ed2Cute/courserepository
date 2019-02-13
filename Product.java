import java.util.Scanner;

class Product {
	int tv;
	int laptop;
	int game;
}

class Shipping {
	public static void main(String args[]) throws java.io.IOException {
	
	Scanner sc = new Scanner(System.in);
	Product box = new Product();
	double ship;
	double price;
	char choice;

	box.tv = 15;
	box.laptop = 7;
	box.game = 5;
	ship = 1.25;

	System.out.println("Select what you would like to ship:");
	System.out.print("A) TV | ");
	System.out.print("B) Laptop | ");
	System.out.print("C) Game Console  :");

	choice = (char) System.in.read();

	if(choice == 'a' || choice == 'A') {
	price = box.tv * ship;
	System.out.println("To ship a TV it's $" + price + ".");
	}

	if(choice == 'b' || choice == 'B') {
	price = box.laptop * ship;
	System.out.println("To ship a laptop it's $" + price + ".");
	}

	if(choice == 'c' || choice == 'C') {
	price = box.game * ship;
	System.out.println("To ship a game console it's $" + price + ".");
	}

}
}