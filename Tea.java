package menu;

public class Tea extends AbstractTea{
	private Ingredients kindTea;
    private int teaCount;
    private double teaPrice = 0.3;

    public Tea(Ingredients water, Ingredients sugar) {
		
	}

	public Ingredients getKindTea() {
        return kindTea;
    }

    public void setKindTea(Ingredients kindTea) {
        this.kindTea = kindTea;
    }

    public int getTeaCount() {
        return teaCount;
    }

    public double getTeaPrice() {
        return teaPrice;
    }

    public void setTeaCount(int teaCount) {
        this.teaCount = teaCount;
    }
    public void  printIngredients () {
        System.out.printf( "%s%5s%2s%s%n", getKindTea(), "tea:", getTeaCount()," mg");
        System.out.printf("%37s%7s%s%n","Water: ", 250, " ml");
    }
}
