package test;

import java.util.Arrays;

public class SSG01 {

	public static void main(String[] args) {
		int[] v = {4,4,3};
		int a = 2;
		int b = 1;
		Arrays.sort(v);
		
		int answer = 1;
		
		while (v[v.length - 1] > a) {
			Arrays.sort(v);
			v[v.length-1] = v[v.length-1] - a;
			for (int i = v.length-2; i >= 0; i--) {
				v[i] = v[i] - b;
			}
			answer += 1;
		}
		System.out.println(answer);
			
	}

}
