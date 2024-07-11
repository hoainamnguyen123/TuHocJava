package lab02;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x;
		System.out.println("Nhap a : ");
		double a = scanner.nextInt();
		System.out.println("Nhap b : ");
		double b = scanner.nextInt();
		System.out.println("Nhap c : ");
		double c = scanner.nextInt();
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else if (b == 0 && c != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				x = -c / b;
				System.out.printf("Phuong trinh co nghiem la : %g", x);
			}
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				x = -b / 2 * a;
				System.out.printf("Phuong trinh co nghiem kep la : %g", x);
			} else {

				double x1 = (-b + Math.sqrt(delta)) / 2 * a;
				double x2 = (-b - Math.sqrt(delta)) / 2 * a;
				System.out.printf("Phuong trinh co nghiem 2 nghiem : x1 = %g , x2 = %g", x1, x2);
			}

		}
		scanner.close();
	}
}
