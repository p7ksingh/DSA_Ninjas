package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			var j = 1;
			while (j <= i) {
				System.out.print(i + j - 1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
