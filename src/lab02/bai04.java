package lab02;

import java.util.Scanner;

public class bai04 {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai  |");
		System.out.println("| 3. Tính số tiền điện          |");
		System.out.println("| 4. Kết thúc                   |");
		System.out.println("++ ------------------ -----------++");
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Nhap lua chon cua ban : ");
			int option = scanner.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Nhap a : ");
				int a = scanner.nextInt();
				System.out.println("Nhap b : ");
				int b = scanner.nextInt();
				if (a == 0 && b == 0) {
					System.out.println("Phuong trinh vo so nghiem");
				} else if (a == 0 && b != 0) {
					System.out.println("Phuong trinh vo nghiem");
				} else {
					double x = -b / (double) a;
					System.out.printf("Phuong trinh co nghiem la : %g \n", x);
				}
				break;
			}
			case 2: {
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
						System.out.printf("Phuong trinh co nghiem la : %g \n", x);
					}
				} else {
					double delta = Math.pow(b, 2) - 4 * a * c;
					if (delta < 0) {
						System.out.println("Phuong trinh vo nghiem");
					} else if (delta == 0) {
						x = -b / 2 * a;
						System.out.printf("Phuong trinh co nghiem kep la : %g \n", x);
					} else {

						double x1 = (-b + Math.sqrt(delta)) / 2 * a;
						double x2 = (-b - Math.sqrt(delta)) / 2 * a;
						System.out.printf("Phuong trinh co nghiem 2 nghiem : x1 = %g , x2 = %g \n", x1, x2);
					}

				}
				break;
			}
			case 3: {
				double money = 0;
				System.out.println("Moi ban nhap so dien : ");
				int soDien = scanner.nextInt();
				if (soDien <= 100 && soDien > 0) {
					money = soDien * 1000;

				} else if (soDien > 100) {
					money = 100 * 1000 + (soDien - 100) * 1500;

				}
				System.out.println("Gia tien ban phai nop la : " + money + " vnd");
				break;
			}
			case 4: {
				System.out.println("ket thuc");
				System.exit(0);
			}
			}
		}
	}
}
