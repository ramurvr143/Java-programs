package java_programs;

public class Factorial {
	static int factorial(int n) {

        return (n == 0) ? 1 : n * factorial(n - 1);

    }

	public static void main(String[] args) {
		 System.out.println("Factorial of 5:" + factorial(5));


	}

}
