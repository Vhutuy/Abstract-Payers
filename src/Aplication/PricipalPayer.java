package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Backstage.Company;
import Backstage.Individual;
import Backstage.Payer;

public class PricipalPayer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Locale.setDefault(Locale.US);

		List<Payer> list = new ArrayList<Payer>();

		// Data in

		System.out.print("Enter the number of Tax Payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax Payer #" + i + " Data;");

			System.out.print("Individual or Company (i/c): ");
			String perg = sc.next();

			if (perg.equalsIgnoreCase("i")) {
				System.out.print("Name: ");
				String name = sc.next();

				System.out.print("Anual Income: ");
				double anualIncome = sc.nextDouble();

				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();

				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else if (perg.equalsIgnoreCase("c")) {
				System.out.print("Name: ");
				String name = sc.next();

				System.out.print("Anual Income: ");
				double anualIncome = sc.nextDouble();

				System.out.print("Number of Employees: ");
				Integer numberEmployees = sc.nextInt();

				list.add(new Company(name, anualIncome, numberEmployees));
			}

		}
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.println("Taxer paid:");
		for (Payer p : list) {
			System.out.printf("%s: $ %.2f%n",p.getName(),p.taxesPaid());
		}
		
		
		double sum = 0;
		for (Payer p : list) {
			sum =+ p.taxesPaid();
		}
		System.out.println("-------------------------------------------");
		System.out.println();
		System.out.printf("Total: %.2f%n", sum);

		sc.close();
	}

}
