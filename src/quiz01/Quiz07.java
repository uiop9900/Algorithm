package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next().toLowerCase();
		String afterWord = "";
		for (int i = word.length()-1; i >= 0; i--) {
			afterWord += word.charAt(i);
		}
		
		if (word.equals(afterWord)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		
	}

}
