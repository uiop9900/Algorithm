package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz05_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		char[] c = word.toCharArray();
		int lt = 0;
		int rt = word.length()-1;
		
		while (lt < rt) {
			if (!Character.isAlphabetic(c[lt])) {
				lt++;
			} else if (!Character.isAlphabetic(c[rt])) {
				rt--;
			} else {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
				lt++;
				rt--;
			}
		}
		String answer = String.valueOf(c);
		System.out.println(answer);
	}

}
