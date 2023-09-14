package Backstage;

public class Individual extends Payer {

	private double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxesPaid() {

		double healthPaid;
		double total;
		if (healthExpenditures > 0) {
			healthPaid = healthExpenditures;
		} else {
			healthPaid = 0;
		}

		if (anualIncome < 20000) {
			total = (anualIncome * 0.15) - (healthPaid/2);
		} else {
			total = (anualIncome / 4) - (healthPaid/2);
		}

		return total;
	}

}
