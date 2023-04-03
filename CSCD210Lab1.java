package cscd210lab1;

import java.util.Scanner;

public class CSCD210Lab1
{
   public static void main(String[] args)//visibilty modifier special mod. return type method type(parameter)   
   {  
      int credits;
      String name; 
      Scanner scnr = new Scanner(System.in);
      
      
      System.out.print("Please enter your name:");
      name = scnr.nextLine();  
      
      System.out.print("Enter the no. of credits taken:");
      credits = scnr.nextInt();
      
      System.out.print("Welcome " + name + ".");
      System.out.printf(" Goodluck taking %d %s\n", credits, (credits!= 1 && credits!= -1? "credits":"credit") );  //printf: print with special attribute, %s: string, %d: integer, %c: character, %f: float, %x: hexadecimal(base 16)  
 
    }  
    
}//end of class, this is a comment
/* this is a 
multiline comment
*/ 