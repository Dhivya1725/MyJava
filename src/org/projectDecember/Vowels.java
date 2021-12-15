package org.projectDecember;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Vowels {
	public static void main(String[] args) {
		String s="Application112233@#$%";
		
		//No of vowels
		Map<String,Integer> m=new HashMap<>();
		
		String[] slt = s.split("");
		
		
		for (int i = 0; i < slt.length; i++) {
			System.out.println(slt[i]);
			if(m.containsKey(slt[i])){
				Integer x = m.get(slt[i]);
				m.put(slt[i], x+1);
				
			}
			else {
				m.put(slt[i], 1);
			}
			
		}
		System.out.println(m);
		
		
			
		
		
	}

}
