package java_programs;

public class Palindrome {
	
	    public static void main(String[] args) {
	        int num = 121;      // number to check
	        int original = num; // store original number
	        int rev = 0;        // variable to store reverse

	        while (num != 0) {
	            int digit = num % 10;      // get last digit
	            rev = rev * 10 + digit;    // build reverse number
	            num = num / 10;            // remove last digit
	        }

	        if (original == rev)
	            System.out.println(original + " is a Palindrome number");
	        else
	            System.out.println(original + " is NOT a Palindrome number");
	    }
	}



