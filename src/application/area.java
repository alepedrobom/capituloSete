package application;

import java.util.Locale;

import java.util.Scanner;

import util.Calculator;

public class area {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		System.out.print("Enter valor dolar: ");
		double dolar = sc.nextDouble();
		System.out.print("quantos dolaresr: ");
		double qtd = sc.nextDouble();
		double d = Calculator.conversao(dolar, qtd);
		System.out.printf("Valor a pagar: %.2f%n", d);
		sc.close();
	}
}