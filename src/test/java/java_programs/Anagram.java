package java_programs;

public class Anagram {

	public static void main(String[] args) {
		
		String s1 = "dooo";
		String s2 = "god";
		boolean isAnagram = s1.length() == s2.length();
		
		if (!isAnagram) {
			System.out.println(isAnagram);
			System.exit(0);
		}
		
		for(int i=0;i < s1.length();i++) {
			int count = 0;
			for (int j=0; j < s2.length(); j++ ) {
				if (s1.charAt(i) == s2.charAt(j)) count++;
			}
			if (count == 1) isAnagram = true;
			else isAnagram = false;
		}
		
		System.out.println(isAnagram);
	}
	
	/* public static void main(String[] args) {

	        String str1 = “listen”, str2 = “silent”;

	        char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();

	        Arrays.sort(arr1);

	        Arrays.sort(arr2);

	        System.out.println(“Anagram: ” + Arrays.equals(arr1, arr2));

	    }*/



}
