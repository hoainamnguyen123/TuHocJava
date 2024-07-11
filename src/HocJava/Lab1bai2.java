package HocJava;

import java.util.Scanner;

public class Lab1bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Width: ");
		Double width = scanner.nextDouble();
		System.out.println("Lenght: ");
		Double lenght = scanner.nextDouble();
		System.out.println("perimeter = " + (width + lenght) * 2);
		System.out.println("spread = " + width * lenght);
		System.out.println("Min = " + Math.min(lenght, width));
		scanner.close();
	}

}
