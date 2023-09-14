package Backstage;

public class Company extends Payer {

	private Integer numberEmployees;

	public Company() {
		super();
	}

	public Company(String name, double anualIncome, Integer numberEmployees) {
		super(name, anualIncome);
		this.numberEmployees = numberEmployees;
	}

	public Integer getNumberEmployees() {
		return numberEmployees;
	}

	public void setNumberEmployees(Integer numberEmployees) {
		this.numberEmployees = numberEmployees;
	}

	@Override
	public double taxesPaid() {
		double total;

		if (numberEmployees > 10) {
			total = anualIncome * 0.14;
		} else {
			total = anualIncome * 0.16;
		}

		return total;

	}

}
