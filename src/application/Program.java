package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cryptocurrency;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Cryptocurrency crypto = new Cryptocurrency();

		System.out.print("Enter the cryptocurrency quantity: ");
		crypto.quantity = sc.nextDouble();

		System.out.print("Enter the bitcoin value of the coin: ");
		crypto.btcprice = sc.nextDouble();
		System.out.printf("Bitcoin total: %.8f BTC%n%n", crypto.TotalBTC());

		System.out.print("Enter the current value of 1 bitcoin in dollars: ");
		crypto.btcToDollar = sc.nextDouble();
		if (crypto.TotalDollar() < 1) {
			System.out.printf("Total in Dollars: $%.6f%n%n", crypto.TotalDollar());
		} else {
			System.out.printf("Total in Dollars: $%.2f%n%n", crypto.TotalDollar());
		}

		System.out.print("Enter the current value of 1 dollar to real: ");
		crypto.dollarToReal = sc.nextDouble();
		if (crypto.TotalReais() < 1) {
			System.out.printf("Total in Real: R$%.6f", crypto.TotalReais());
		} else {
			System.out.printf("Total in Real: R$%.2f", crypto.TotalReais());
		}

		sc.close();
	}

}
