package lab02;

import java.util.Scanner;

//- Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
//- Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
//- Còn lại: x = -b/a => thông báo x = ?
public class bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
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
			System.out.printf("Phuong trinh co nghiem la : %g", x);
		}
	}
}
