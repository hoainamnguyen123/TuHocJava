package lab02;
//- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000

//- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500

import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double money = 0;
		System.out.println("Moi ban nhap so dien : ");
		int soDien = scanner.nextInt();
		if (soDien <= 100 && soDien > 0) {
			money = soDien * 1000;

		} else if (soDien > 100) {
			money = 100 * 1000 + (soDien - 100) * 1500;

		}
		System.out.println("Gia tien ban phai nop la : " + money + " vnd");
	}
}
