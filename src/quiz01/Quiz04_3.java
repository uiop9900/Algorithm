package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//word switch
public class Quiz04_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		
		String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = br.readLine();
		}
		
		
		ArrayList<String> answer = new ArrayList<>();
		for (String s : arr) {
			char[] charArr = s.toCharArray();
			int lt = 0;
			int rt = charArr.length - 1;
			while(lt > rt) {
				char temp = charArr[lt];
				charArr[lt] = charArr[rt];
				charArr[rt] = temp;
				lt++;
				rt--;
			}
			String word = String.valueOf(charArr);
			answer.add(word);
		}
		

		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}

}
