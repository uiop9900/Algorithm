package quiz01;

import java.util.Scanner;

public class Quiz07_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next().toLowerCase();
		
		String answer = "YES";
		for (int i = 0; i < word.length()/2; i++) {
			if (word.charAt(i) != word.charAt(word.length()-1-i)) {
				answer = "NO";
			}
		}
		System.out.println(answer);
	}

}
