package java_pattern.pattern1;

public class PrintPattern {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < i+1; j++) {
              System.out.print(" "+(i+1));
              
			}
			System.out.println();
		
		}

	}

}