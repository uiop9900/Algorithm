package quiz01;

import java.util.Scanner;
//내가 푼 버전 
public class Quiz04_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		String[] strList = new String[num];
		
		
		for (int i = 0; i < num; i++) {
			String answer = "";
			String word = scan.next();
		
			for (int j = word.length()-1; j >= 0; j--) {
				answer += word.charAt(j);
			}
			
			strList[i] = answer;
			System.out.println(strList[i]);
		}
	}


}
