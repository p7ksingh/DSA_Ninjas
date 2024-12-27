package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var input = sc.nextInt();
		int i = 1;
		while (i <= input) {
			int j = 1;
			while (j <= 4) {
				System.out.print(input);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
