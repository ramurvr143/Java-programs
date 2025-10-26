package java_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class New_class {

	public static void main(String[] arg) {
		/*
		 * String name; String rename =""; Scanner scan = new Scanner(System.in);
		 * System.out.println("entar a string"); name = scan.nextLine(); for(char
		 * ch:name.toCharArray() ) {
		 * 
		 * rename = ch + rename;
		 * 
		 * } System.out.println(rename); if(rename.equals(name)) {
		 * System.out.println("palindrome"); }else System.out.println("not palindrome");
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entar string:");

		String input = scan.nextLine();
		Map<Character, Integer> map =new HashMap<>();
		
		for(char ch: input.toCharArray()) {
			
			
				map.put(ch, map.getOrDefault(ch, 0)+1);//count character
			}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
			
		}
			scan.close();
		}
		
		
		
		
		
		
		
		
}
		
	

