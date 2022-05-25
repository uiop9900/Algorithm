package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		word = word.replaceAll("[^0-9]", "");
		
		int num = Integer.parseInt(word);
		System.out.println(num);

	}

}
