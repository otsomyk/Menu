package menu;

public abstract class AbstractCoffee extends AbstractDrinks{
	private int coffeCount;
    private double coffePrice = 1;
    private int chocholateCount;
    private double chocolatePrice = 0.1;

        public AbstractCoffee () {

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

 }
