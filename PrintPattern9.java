package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		int i = 1;
		var num = 1;
		while (i <= n) {
			var j = 1;
			while (j <= i) {
				System.out.print(num);
				num++;
				j++;
			}
			System.out.println();
			i++;

		}

	}

}
