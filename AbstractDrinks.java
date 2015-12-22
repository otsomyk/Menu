package menu;

public abstract class AbstractDrinks extends AbstractFood {
	private Ingredients waterCount;
	private Ingredients milkCount;
	private Ingredients sugar;
	private double milkPrice = 0.05;
	private double sugerPrice = 0.1;

	public AbstractDrinks() {

	}

	public Ingredients getWater() {
		return waterCount;
	}

	public void setWater(Ingredients water) {
		this.waterCount = water;
	}

	public Ingredients getMilkCount() {
		return milkCount;
	}

	public void setMilkCount(Ingredients milkCount) {
		this.milkCount = milkCount;
	}

	public Ingredients getSugar() {
		return sugar;
	}

	public void setSugar(Ingredients sugar) {
		this.sugar = sugar;
	}

	public double getMilkPrice() {
		return milkPrice;
	}

	public double getSugerPrice() {
		return sugerPrice;
	}

	
}
