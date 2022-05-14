package quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
//StringBuilder	version
public class Quiz04_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		
		String[] arr = new String[num];
		for (int i = 0; i < num; i++) {
			arr[i] = br.readLine();
		}
		
		
		ArrayList<String> answer = new ArrayList<>();
		
		for (String str : arr) {

			String temp = new StringBuilder(str).reverse().toString();
			answer.add(temp);
		}
		
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}

	}

}
