package base;

import java.lang.Math;
import java.util.Scanner;

public class costOfTuition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Initial tuition cost: ");
		double initialTuition = input.nextDouble();
		System.out.print("Percentage increase (decimal value): ");
		double percIncrease = input.nextDouble();
		System.out.print("APR (decimal value): ");
		double APR = input.nextDouble();
		System.out.print("Term (years to pay):");
		double term = input.nextDouble();
		costOfTuition.calc(initialTuition, percIncrease, APR, term);
	}
	public static double calc(double initialTuition, double APR, double percIncrease, double term) {
		double totalTuition = 0;
		int i = 4;
		while (i != 0) {
			initialTuition += initialTuition * (percIncrease);
			i = i - 1;
			totalTuition += initialTuition;
		}
		double amort = ((APR / 12) * (totalTuition) * Math.pow((1+APR/12), (term*12)))/
				(Math.pow((1+APR/12),(term*12))-1);
		System.out.println(amort);
		return amort;	
	}
}
