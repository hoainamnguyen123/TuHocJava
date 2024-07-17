package lab4;

import java.util.Scanner;

public class Product {
	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public Product() {
	}

	private String name;
	private double price;
	private double tax;

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		this.name = sc.nextLine();
		System.out.println("Enter Price: ");
		this.price = sc.nextDouble();
		System.out.println("Enter Tax: ");
		this.tax = sc.nextDouble();
		sc.close();
	}

	public void xuatThongTin() {
		System.out.println("Name: " + this.name);
		System.out.println("Price: " + this.price);
		System.out.println("Tax : " + this.tax);
		System.out.println("Tax Price: " + getTaxPrice());

	}

	public double getTaxPrice() {
		return this.price * this.tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
}
