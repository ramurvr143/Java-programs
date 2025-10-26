package java_programs;

import java.util.HashSet;

public class Countcharacters {

	public static void main(String[] args) {
		
		  String str ="automation";

	        HashSet<Character> nodup = new HashSet<>();
	        for(char c : str.toCharArray()){
	        	
	        	if(nodup.add(c)) {
	        	System.out.print(c);
	        	}
	        }
	        System.out.println("\n" +nodup.size());
	        
		
	}

}
