package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			var j = 1;
			int startingNum = i;
			while (j <= i) {
				System.out.print(startingNum);
				startingNum++;
				j++;
			}
			System.out.println("");
			i++;

		}

	}

}
