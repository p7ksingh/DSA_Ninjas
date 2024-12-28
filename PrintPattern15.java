package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			char ch = (char) ('A'+n-1);
			while (j <= i) {
				
				System.out.print(ch);
				ch++;
				j++;
			}
			System.out.println();
			i++;

		}

	}

}
