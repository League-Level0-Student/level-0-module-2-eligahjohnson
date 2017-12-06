//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class StringMethods1 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to whatever you want
String hi="Your kind of cool";

		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
		System.out.println(hi.charAt(3));
		// 3. Print the length of your String to the console.
	//    HINT: .length
      System.out.println(hi.length());
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how 
	for (int i = 0; i < hi.length(); i++) { 
		System.out.println(hi.charAt(i));
		
	}

		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
	String ih =	
	JOptionPane.showInputDialog("Pick a character that is the sentence");
	char hi1 = ih.charAt(0);
	for (int i = 0; i < hi.length(); i++) {
		if(hi1==hi.charAt(i)) {
			JOptionPane.showMessageDialog(null, ""+i);
		}
		
	}
	}
}



