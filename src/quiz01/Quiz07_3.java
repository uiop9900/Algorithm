package quiz01;

import java.util.Scanner;

public class Quiz07_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		String afterWord = new StringBuilder(word).reverse().toString();
		
		if (word.equalsIgnoreCase(afterWord)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

}
