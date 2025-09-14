package java_programs;

import java.util.HashSet;

public class Remove_duplicates {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,5,3,1};
		
		HashSet<Integer> duplicated = new HashSet<>();
		for(int num : arr) {
			
			if(duplicated.add(num)) {
				System.out.println(num);
				
			} 
		} 
			
	}

}
