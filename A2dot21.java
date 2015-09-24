/* 
* @Author: austinlee
* @Date:   2015-09-23 11:35:33
* @Last Modified by:   austinlee
* @Last Modified time: 2015-09-23 12:06:49
*/

// (Financial application: calculate future investment value) Write a program that
// reads in investment amount, annual interest rate, and number of years, and displays
// the future investment value using the following formula:
// futureInvestmentValue =
// investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
// For example, if you enter amount 1000, annual interest rate 3.25%, and number
// of years 1, the future investment value is 1032.98.

import java.util.Scanner;

public class A2dot21 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter investment amount: ");
    	double investmentAmount = input.nextDouble();

    	System.out.print("Enter annual interest rate: ");
    	double interestRate = input.nextDouble();
    	interestRate /= 1200.0;

    	System.out.print("Enter number of years: ");
    	double numYears = input.nextDouble();

    	double futureValue = investmentAmount * Math.pow(1.0 + interestRate, 
    		numYears * 12.0);

    	System.out.println("Accumulative value is $" + 
    		(int)(futureValue * 100.0) / 100.0);
    }
}