package Backstage;

public abstract class Payer {
	private String name;
	protected double anualIncome;

	public Payer() {
		super();
	}

	public Payer(String name, double anualIncome) {
		super();
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(double anualIncome) {
		this.anualIncome = anualIncome;
	}

	public abstract double taxesPaid();

}
