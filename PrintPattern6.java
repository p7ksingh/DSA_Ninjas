package java_pattern.pattern1;

import java.util.Scanner;

public class PrintPattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= 4) {
				System.out.print(n-j+1);
				j++;
			}
			System.out.println();
			i++;
		}
	}

}