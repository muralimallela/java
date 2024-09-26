/*
 * Author      : Murali Krishna Mallela
 * Roll Number : 21C51A0522
 * Date        : 26/09/2024
 */
import java.util.*;
public class Elect {
	     String meterNo;
	     String customerName;
	     int previousReading;
	     int presentReading;
	     int units;
	     int charge;
	     int extraCharge;
	     int totalBill;
	     int amount;
		  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
			Elect bill = new Elect();
            System.out.print("Enter Meter Number: ");
	        bill.meterNo = scanner.nextLine();
            System.out.print("Enter Customer Name: ");
	        bill.customerName = scanner.nextLine();
	        System.out.print("Enter Previous Reading: ");
	        bill.previousReading = scanner.nextInt();
            System.out.print("Enter Present Reading: ");
	        bill.presentReading = scanner.nextInt();
            bill.calculateBill();
            bill.displayBill();
            scanner.close();
	    }
		 public void calculateBill() {
	        units = presentReading - previousReading;

	        if (units < 0) {
	            System.out.println("Error: Present reading cannot be less than previous reading.");
	            return ;
	        }
	        if (units <= 100) {
	            charge = 2;
	        } else if (units <= 300) {
	            charge = 4;
	        }
	            else if (units <=500) {
	            	charge = 5;
	            }
	            else if (units <= 800) {
	            	charge = 7;
	        }
	            else if(units <=1000) {
	            	charge = 8;
					}
	            else {
	            charge = 10;
	        }
	        amount =units * charge;


	        if (units<200) {
	            extraCharge = amount+charge*10;
	        }
	        else if(units < 400)
	        {
	        	extraCharge = amount+charge*20;
	        }
	        else if(units < 600)
	        {
	        	extraCharge = amount+charge*40;
	        }
	        else if(units < 1000)
	        {
	        	extraCharge=amount+charge*50;
	        }
	        else {
	            extraCharge =amount+charge*100;
	        }

	        totalBill = extraCharge;
	    }
	    public void displayBill() {
	        System.out.println("Electricity Bill Details:");
	        System.out.println("Meter No: " + meterNo);
	        System.out.println("Customer Name: " + customerName);
	        System.out.println("Units Consumed: " + units);
	        System.out.println("Charge: " + charge);
	        System.out.println("Amount: "+amount);
	        System.out.println("Extra Charge: " + extraCharge);
	        System.out.println("Total Bill: " + totalBill);
	    }

	 }



