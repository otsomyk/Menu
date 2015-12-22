package menu;

public class Coffee extends AbstractCoffee {

	private int coffeCount;
	private double coffePrice = 1;
	private int chocholateCount;
	private double chocolatePrice = 0.1;

	public Coffee() {

	}

	public Coffee(Ingredients water, Ingredients sugar, Ingredients additives) {

	}

	public int getCoffeCount() {
		return coffeCount;
	}

	public void setCoffeCount(int coffeCount) {
		this.coffeCount = coffeCount;
	}

	public double getCoffePrice() {
		return coffePrice;
	}

	public int getChocholateCount() {
		return chocholateCount;
	}

	public void setChocholateCount(int chocholateCount) {
		this.chocholateCount = chocholateCount;
	}

	public double getChocolatePrice() {
		return chocolatePrice;
	}

	@Override
	public void printIngredients() {
		System.out.printf("Coffee:", getCoffeCount(), " mg", "Water: ",
				getWater(), " ml", "Milk: ", getMilkCount(), " ml");

		if (getChocholateCount() > 0) {
			System.out.printf("Chocolate: ", getChocholateCount(), " mg");
		}

	}

}
