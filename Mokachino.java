package menu;

public class Mokachino extends Coffee {
	public Mokachino() {

	}

	private static Ingredients MILK;

	public Mokachino(Ingredients WATER, Ingredients SUGAR) {
		super(WATER, SUGAR, MILK);

	}

	@Override
	public void printIngredients() {
		super.printIngredients();

	}
}
