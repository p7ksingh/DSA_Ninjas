package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		int i = 1;
		while (i <= n) {

			var space = n - i;
			int j = 1;
			while (j < space) {
				System.out.print("*");
				space--;
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
