package quiz01;

import java.util.Scanner;

public class Quiz08_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		String answer = "NO";
		word = word.toUpperCase().replaceAll("[^A-Z]", ""); // 정규식으로 알파벳 아닌것은 없애기
		
		String word2 = new StringBuilder(word).reverse().toString();
		if (word.equals(word2)) {
			answer = "YES";
		}

		System.out.println(answer);
	}

}
