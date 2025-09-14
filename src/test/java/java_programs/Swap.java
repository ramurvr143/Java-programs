package java_programs;

public class Swap {

	public static void main(String[] args) {

		int a =10 , b = 5;
		
		a = a+b;
		b =a-b;
		a =a-b;
		System.out.println("swap a" + a);
		System.out.println("Swap b" + b);

		String srt1 = "ramu";
		String srt2 = "srinu";
		String temp = srt1; 
		
		
		srt1 = srt2;
		srt2 =temp;
		System.out.println("Stirng1" + srt1);
		System.out.println("string2" + srt2);
		
		
		
		
	}

}
