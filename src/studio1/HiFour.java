package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("Enter value for arg 0");
		String s1 = ap.nextString("Enter value for arg 1");
		String s2 = ap.nextString("Enter value for arg 2");
		String s3 = ap.nextString("Enter value for arg 3");
		System.out.println("Names: " + s3 + ", " + s2 + ", "  + s1 + ", " + s0);
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
