package quiz01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String line = scan.next().toUpperCase(); //문자열을 하나 읽
		char spell = Character.toUpperCase(scan.next().charAt(0));
			
		int sum = 0;
//		for (int i = 0; i < line.length(); i++) {
//			char spell2 = line.charAt(i);
//			if (Character.compare(spell2, spell) == 0) {
//				sum += 1;
//			}
//		}
		
		for (char x : line.toCharArray()) {
			 if (x == spell) {
				 sum += 1;
			 }
		}
		
		System.out.println(sum);
	}

}
