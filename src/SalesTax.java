/********************************************************
 * Sales Tax Program                                    *
 * This program asks the user to enter the amount of a  *
 * purchase, computes the state and county sales tax,   *
 * and then displays the breakdown and total cost.      *
 ********************************************************/

import java.util.Scanner;

public class SalesTax
{
    /********************************************************
     * Main Method                                          *
     * Prompts the user for the purchase amount, calculates *
     * state tax, county tax, total tax, and total amount.  *
     * Displays all results to the user.                    *
     ********************************************************/
    public static void main(String[] args)
    {
        //**********************************************
        // Constant Declarations                       *
        // State and county tax rates                  *
        //**********************************************
        final double STATE_TAX_RATE = 0.04;  // 4% state tax
        final double COUNTY_TAX_RATE = 0.02; // 2% county tax

        //**********************************************
        // Variable Declarations                       *
        // These variables store calculated values     *
        //**********************************************
        double purchaseAmount,  // Amount of the purchase
               totalStateTax,   // Calculated state tax
               totalCountyTax,  // Calculated county tax
               totalSalesTax,   // Total of state and county tax
               totalOfTheSale;  // Total amount including taxes

        //**********************************************
        // Input Section                               *
        // Prompting the user to enter purchase amount *
        //**********************************************
        System.out.println();
        System.out.print("Enter the amount of your purchase please: ");
        Scanner keyboardInput = new Scanner(System.in);
        purchaseAmount = keyboardInput.nextDouble();

        //**********************************************
        // Calculation Section                         *
        // Perform all necessary tax calculations      *
        //**********************************************
        totalStateTax = purchaseAmount*STATE_TAX_RATE;
        totalCountyTax = purchaseAmount*COUNTY_TAX_RATE;
        totalSalesTax = totalStateTax + totalCountyTax;
        totalOfTheSale = purchaseAmount + totalSalesTax;

        //**********************************************
        // Output Section                              *
        // Display all results to the user             *
        //**********************************************
        System.out.println();
        System.out.printf("%-25s $%.2f\n", "Purchase Amount:", purchaseAmount);
        System.out.printf("%-25s $%.2f\n", "State Sales Tax:", totalStateTax);
        System.out.printf("%-25s $%.2f\n", "County Sales Tax:", totalCountyTax);
        System.out.printf("%-25s $%.2f\n", "Total Sales Tax:", totalSalesTax);
        System.out.printf("%-25s $%.2f\n","Total Sale Amount:", totalOfTheSale);

        //**********************************************
        // Developer Credit                            *
        //**********************************************
        System.out.println("\nDeveloped by: Nikita Baiborodov");

        //**********************************************
        // Resource Cleanup                            *
        // Close the scanner to prevent resource leaks *
        //**********************************************
        keyboardInput.close();
        System.exit(0);
    }
}


