
/**
 * Program Title.
 * Description of what program does ...
 * ...
 * 
 * @author (Your name here...) 
 * @version (Date or version number)
 */

import javax.swing.*;
import java.text.*;
import java.util.*;

public class MyProg 
{
                /*****************************************
                * Main method - required by all programs *
                ******************************************
                */
                                                 public static void main (String[] args)
       {                                          
           //Declare variables
                double[] numbers=new double[10];
                int numberValues;
                double avg;
       
            //1. Get number of values
                numberValues=getValues();     
   
            //2. Get numbers, and validate them
                numbers=getNumbers(numberValues);
                
            //3. Calculate Average
                avg=calcAvg(numberValues, numbers);
            
            //4. Display results
                displayResults(numberValues, avg, numbers);
                
       }        
                
       /*************
       *getValues() *
       **************
       */
                                                public static int getValues()
           {
             //Declare Variables
                String input;
                int numberValues;
            
             //Get the number of values from user and validate
                    do 
                    {
                       input=JOptionPane.showInputDialog("Enter the number of values (2-10)");
                       numberValues=Integer.parseInt(input);
                           if ((numberValues<2) || (numberValues>10))
                           {
                              JOptionPane.showMessageDialog(null,"Error, must be between 2 and 10!"); 
                           }
                    } while ((numberValues<2) || (numberValues>10));
                
             return numberValues;
             
           }
               
       /****************
        * getNumbers() *
        ****************
        */
                        
        
                                             public static double [] getNumbers(int numberValues)
       {
            //Declare variables
                String input;
                double[] numbers=new double[10];
            
            //Get numbers and validate
                for (int i=0;i<numberValues;i++)
                {
                    do
                    {
                        input=JOptionPane.showInputDialog("Enter a number between 0 and 100");
                        numbers[i]=Double.parseDouble(input);
                        
                            if ((numbers[i]<1) || (numbers[i]>100))
                            {
                                JOptionPane.showMessageDialog(null, "Try again");
                            }
                    }while ((numbers[i]<1) || (numbers[i]>100));
                }
           
           
           return numbers;
       }
                                             
       /**********
       * calcAvg *
       *********** 
       */ 
        
                                          public static double calcAvg(int numberValues, double[]numbers)
      {
        //Declare Variables
            double avg;
            double total=0;
        
            //Calculate total
                for (int i=0;i<numberValues;i++)
                {
                    total+=numbers[i];
                }
            //Calculate average
                avg=total/numberValues;
                
        return avg;
                                         
      }
                                          
      /******************
       * displayResults *
       ******************
       */
        
                                       public static void displayResults(int numberValues, double[]numbers, double avg)
      {
          
          
        System.out.println("The average is "+avg);    
          
      }
        
    
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
