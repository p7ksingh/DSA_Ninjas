package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= 4) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
