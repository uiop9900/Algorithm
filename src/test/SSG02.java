package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SSG02 {

	public static void main(String[] args) {
		String[] logs = {"0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", 
				"0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"};
		
		for (int i = 0; i < logs.length; i++) {
			if(logs[i].toString().split(" ")[0] == logs[i+1].toString().split(" ")[0]) {
				
			}
		}
		
		
		Map<String, List<Map<String, String>>> result = new HashMap<>();
		List<Map<String, String>> scoreList = new ArrayList<>();
		String str = "";
		
		for (String log : logs) {
			str = log;
			Map<String, String> score = new HashMap<>();
			score.put(log.split(" ")[1], log.split(" ")[2]);
		}
		
		System.out.println(result);
		String[] answer = {};
		
	}
}

