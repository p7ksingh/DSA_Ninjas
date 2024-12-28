package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			char ch;
			while (j <= i) {
				ch = (char) ('A'+j - 1);
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;

		}

	}

}
