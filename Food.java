import java.util.Scanner;

class Food {
	int weight;
	int discount;
	int amount;
	int bought = amount/weight;

	void range() {
	System.out.println("Your total savings are: $" + bought * discount);
	}
}

class FreshFoods {
	public static void main(String args[]) throws java.io.IOException {
	Scanner sc = new Scanner(System.in);

	 Food nuts = new Food();
	 Food flour = new Food();
	 Food vegetables = new Food();
	 Food grains = new Food();

	nuts.weight = 10;
	nuts.discount = 3;

	flour.weight = 20;
	flour.discount = 7;

	vegetables.weight = 10;
	vegetables.discount = 7;

	grains.weight = 50;
	grains.discount = 10;

	System.out.println("Please enter the weight of nuts, flour, vegetables, and grains you would like to buy.");
	 nuts.amount = System.in.nextLine();
	 flour.amount = System.in.nextLine();
	 vegetables.amount = System.in.nextLine();
	 grains.amount = System.in.read();

	nuts.range();
	flour.range();
	vegetables.range();
	grains.range();
 }
}	