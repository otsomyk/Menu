package menu;

public class Cappuccino extends Coffee {
	
	private static Ingredients MILK;
	
	public Cappuccino(){
		
	}

	public Cappuccino(Ingredients WATER, Ingredients SUGAR) {
		super(WATER, SUGAR, MILK);

	}
		
}
