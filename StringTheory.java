/* 
* @Author: austinlee
* @Date:   2015-09-24 15:22:09
* @Last Modified by:   austinlee
* @Last Modified time: 2015-09-30 12:10:06
*/

import java.util.Scanner;

public class StringTheory {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	System.out.print("Please enter your name: ");

    	String s = input.nextLine();

    	System.out.print("You wrote: ");
    	System.out.println(s);

    	s = s.toUpperCase();

    	System.out.print("I wanted: ");
    	System.out.println(s);

    }
}
