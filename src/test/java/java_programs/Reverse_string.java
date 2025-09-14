package java_programs;

public class Reverse_string {

	public static void main(String[] args) {
		String name = "Automation";
		//String reverse ="";
		
		/*for(int i = name.length()-1;i>=0;i--)
		{
			reverse += name.charAt(i);
		}
		System.out.println(reverse);*/
		
		String rev  = "";
		
		for(char ch : name.toCharArray()) {
			rev = ch + rev;
		}
		
		System.out.println(rev);
		
	}

}
