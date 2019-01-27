import java.util.Scanner;

class Weed {
	double price;
	int pounds;
}

class Dispensary {
	public static void main(String args[]) throws java.io.IOException {
	Scanner sc = new Scanner(System.in);

		Weed kush = new Weed();
		Weed pine = new Weed();
		Weed skunk = new Weed();
	double order;
	char select;
	char supply;
	boolean exit;

	kush.price = 10.99;

	pine.price = 15.99;

	skunk.price = 8.99;

System.out.println("Would you like to place an order? Y/N");
supply = (char) System.in.read();

if(supply == 'Y' || supply == 'y') {

	System.out.println("Which would you like to order?");
	System.out.print("a) Hazy Kush | b) Pineapple Express | c) Yummy Skunk |");
	System.out.println("'f' to finish order.");

	do {
	select = (char) System.in.read();
	switch(select) {
	case 'a':
		System.out.println("How much?");
		kush.pounds = (int) System.in.read();
		order = kush.price * kush.pounds;
		System.out.println("That will be: $" + order);
		exit = true;
	break;
	case 'b':
		System.out.println("How much?");
		pine.pounds = (int) System.in.read();
		order = pine.price * pine.pounds;
		System.out.println("That will be: $" + order);
		exit = true;
	break;
	case 'c':
		System.out.println("How much?");
		skunk.pounds = (int) System.in.read();
		order = skunk.price * skunk.pounds;
		System.out.println("That will be: $" + order);
		exit = true;
	break;
	case 'f':
		exit = false;
	break;
		}
	} while(exit = true);
} else {System.out.println("Have a good day!"); }

}
}