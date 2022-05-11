package quiz01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		String answer = "";
		for (char x : str.toCharArray()) {
			if (Character.isUpperCase(x)) { //대문자이
				answer += Character.toLowerCase(x);
			} else { //소문자이면 
				answer += Character.toUpperCase(x);
			}
			
		}
		 System.out.println(answer);
	}

}
