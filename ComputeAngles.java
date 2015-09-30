/* 
* @Author: austinlee
* @Date:   2015-09-24 15:22:09
* @Last Modified by:   austinlee
* @Last Modified time: 2015-09-30 11:36:24
*/

// Listing 4.1 (pg. 123) is an example of a program that prompts the user to enter the x- and y-coordinates
// of the three corner points in a triangle and then displays the three angles.

import java.util.Scanner;

public class ComputeAngels {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	 //Prompt user for the three points.
    	 System.out.print("Enter three points: ");
    	 double x1 = input.nextDouble();
    	 double y1 = input.nextDouble();
    	 double x2 = input.nextDouble();
    	 double y2 = input.nextDouble();
    	 double x3 = input.nextDouble();
    	 double y3 = input.nextDouble();

    	 // Compute 3 sides.
    	 double a = Math.sqrt((x2 - x3) * (x2 - x3) 
    	 	+ (y2 - y3)  * (y2 - y3));
    	 double b = Math.sqrt((x1 - x3) * (x1 - x3)
    	 	+ (y1 - y3) * (y1 - y3));
    	 double c = Math.sqrt((x1 - x3) * (x1 - x3)
    	 	+ (y1 - y3) * (y1 - y3));

    	 // Compute 3 angles/\
    }
}