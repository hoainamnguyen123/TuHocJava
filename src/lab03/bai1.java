package lab03;

import java.util.Scanner;

public class bai1 {
	public static boolean snt(int x) {
		for (int i = 2; i < Math.sqrt(x); i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if (snt(x)) {
			System.out.println("la so nguyen to");
		} else {
			System.out.println("deo phai snt ");
		}
	}
}
