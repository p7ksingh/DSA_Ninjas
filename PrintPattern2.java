package java_pattern.pattern1;

public class PrintPattern2 {

	public static void main(String[] args) {
		for (int i = 0; i < 4; i++) {
			for (int j = 4; j <i; j--) {
              System.out.print(j+1+" ");
              
			}
			System.out.println();
		
		}

	}

}
