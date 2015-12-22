package menu;

public class MilkCoffee extends Coffee{
	public MilkCoffee() {

	}

	private static Ingredients MILK;

	public MilkCoffee(Ingredients WATER, Ingredients SUGAR) {
		super(WATER, SUGAR, MILK);

	}
}
