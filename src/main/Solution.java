package main;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println("A maior SubString tem tamanho: " + lengthOfLongestSubstring("zabazc"));
	}

	public static int lengthOfLongestSubstring(String s) {
		
		Map<Character, Integer> chars = new HashMap<>();
		int max = 0;
		int count = 0;
		int begin = 0;
		
		for(int end = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			
			if(!chars.containsKey(c) || chars.get(c) < begin) {
				chars.put(c, end);
			}else {
				begin = chars.get(c) + 1;
				chars.put(c, end);
			}
			
			count = (end - begin) + 1;
			if(max < count)
				max = count;
		}
		
		return max;
	}
	
}
