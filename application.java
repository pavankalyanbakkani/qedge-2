class GFG {
    public static void main(String[] args)
    {
  
        // create a StringBuffer object
        StringBuffer str = new StringBuffer();
  
        // add the String to StringBuffer Object
        str.append("Geeksforgeeks");
  
        // get unicode of char at position 10
        int unicode = str.codePointAt(10);
  
        // print the result
        System.out.println("Unicode of Character "
                           + "at Position 10 "
                           + "in StringBuffer = "
                           + unicode);
    }
}
//  changes by ram
import java.util.Arrays;

class GFG {
	public static void main(String args[])
	{
		int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
		System.out.println("The original array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}