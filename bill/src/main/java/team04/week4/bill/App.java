package team04.week4.bill;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        String planType, minUsage, numberOfLines;
        int min, lines;
        double totalFee;
        Calculator cal;
        
        while(true){
        	System.out.println("input your plan type(exit is 0)");
        	
        	planType = scan.nextLine();
        	if ( "0".equals(planType) )
        		break;
        	
        	System.out.println("your plan type is "+planType);
        	
        	System.out.println("input your usage(minutes)");
        	
        	minUsage = scan.nextLine();
        	min = Integer.parseInt(minUsage);
        	
        	System.out.println("your plan usage is "+minUsage+ " minutes");
        	
        	System.out.println("input your number of lines");
        	
        	numberOfLines = scan.nextLine();
        	lines = Integer.parseInt(numberOfLines);
        	
        	System.out.println("your line is "+numberOfLines);
        	
        	cal = new Calculator(lines, min, planType);
        	
        	totalFee = cal.calculateTotalRate();
        	
        	System.out.printf("your total fee is %.2f%n",totalFee);
        }        
    }
}
