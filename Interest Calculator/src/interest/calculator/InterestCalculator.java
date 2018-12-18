/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interest.calculator;

/**
 *
 * @author macbookair
 */

       
        import java.text.*;
        import java.util.*;

public class InterestCalculator
{
    public static void main(String[] args)
    {
        float annualInterestRate = (float)3.56;
        float dailyInterestRate = (annualInterestRate / 360) / 100;
        float loanAmount = 476000;	//initial loan amount
        float paymentAmount = 5000; //monthly payment
        int numberOfMonthsTillPayedOff = 0;
        float totalInterestPaid = 0;
        float totalPaid = 0; //loan + total interest
        DecimalFormat formatter;

        formatter = new DecimalFormat();

//        formatter.setCurrency(Currency.getInstance(Locale.GERMANY));
        
        
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("du", "GER"));
        nf.setCurrency(Currency.getInstance("EUR"));
        nf.format(3.56);

        formatter.setMaximumFractionDigits(2);

        for(float g = loanAmount; g >= 0; g -= paymentAmount) //make a payment each month until loan amount is paid off
        {
            numberOfMonthsTillPayedOff++;

            for(int i = 0; i < 30; i++) //for every day of the month, compute compound interest
            {
                totalInterestPaid += g * dailyInterestRate;
                g += g * dailyInterestRate; //interest gets added to total amount owed and extends the length of repayment
            }

        }

        totalPaid = loanAmount + totalInterestPaid;

        System.out.println("Initial loan amount: " + "€" + formatter.format(loanAmount));
        System.out.println("monthly payment amount: " + "€" + formatter.format(paymentAmount));
        System.out.println("annual interest rate: " + Float.toString(annualInterestRate) + "%");
        System.out.println();
        System.out.println("number of months till loan paid off: " + Integer.toString(numberOfMonthsTillPayedOff));
        System.out.println("total interest paid: " + "€" + formatter.format(totalInterestPaid));
        System.out.println("total amount paid: " + "€" + formatter.format(totalPaid));
    }
}
        
        
        
        
        
    
    

