package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap so luong phan tu : ");
		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length - 1]);
		System.out.println(a[0]);
	}

}
