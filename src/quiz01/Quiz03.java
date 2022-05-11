package quiz01;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		ArrayList<String> strList = new ArrayList<>();
		for (String word : str.split(" ")) {
			strList.add(word);
		}
		
		int temp = 0;
		String answer = "";
		for (int i = 0; i < strList.size(); i++) {
			if (strList.get(i).length() > temp) {
				temp = strList.get(i).length();
				answer = strList.get(i);
			} else if (strList.get(i).length() == temp) {
				temp = strList.get(0).length();
				answer = strList.get(0);
				
			}
		} 
		
		System.out.println(answer);
	}

}
