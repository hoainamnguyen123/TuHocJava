package HocJava;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. Cộng |");
		System.out.println("| 2. Trừ |");
		System.out.println("| 3. Kết thúc |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);

		int option = scanner.nextInt();
		switch (option) {
		case 1: {
			System.out.println("Lựa chọn của bạn là : Cộng");
			break;
		}
		case 2: {
			System.out.println("Lựa chọn của bạn là : Trừ");
			break;
		}
		case 3: {
			System.out.println("Lựa chọn của bạn là thoát");
			System.exit(0);

		}
		}
	}

}
