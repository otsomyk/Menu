package menu;

public class Menu {

	private String name;
	AbstractDrinks[] drinks = new AbstractDrinks[20];
	private int Drink = 0;

	public AbstractDrinks[] getDrinks() {
		return drinks;
	}

	public String getName() {
		return name;
	}

	public void printMenu(AbstractFood[] drinks) {
		System.out.println("Drink: Black Tea, Price: 12 grn., Ingridients: water, sugar, black tea ");

	}

	public void addDrink(AbstractDrinks drink) {
		drinks[Drink] = drink;
		Drink++;

	}

}
