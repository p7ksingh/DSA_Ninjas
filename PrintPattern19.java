package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int space = 1;
			while (space <= n - i) {
				System.out.print(" ");
				space++;
			}
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			j = 1;
			while (j <= i - 1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
