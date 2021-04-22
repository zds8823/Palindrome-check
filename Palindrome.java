   //**************************************************************************
   //**************************************************************************
   //      Palindrome.java                           Author: Eric Lavoie
   //                                                       100122593
   // Asks the user to enter a txt. file name and then checks if that txt. file  
   //contains a palindrome or not
   //************************************************************************** 
   import java.util.Scanner;
   import java.io.*;

   public class Palindrome
   {
    public static void main(String[] args) throws IOException
    {
     //initializes  variables
     Scanner sc;
     String fileS, blankS , textString;
     fileS = "";
     blankS = "";
     char characters;
     int rs, ls;
     
     //initializes scanner
     sc = new Scanner(System.in); 
     //asks user to enter the txt file
     System.out.print("Enter a file name: ");
     //sets the scanner equal to  textString
     textString = sc.nextLine();
     //reads txt file
     sc = new Scanner(new File(textString));
     
     
     // converts the text file to a string and reads each line
     while (sc.hasNext())
     {
      fileS += sc.nextLine();
     }
     
      // converts the txt to all lower cases characters
      fileS = fileS.toLowerCase();
     
      //loop checks if its a valid character between a-z
      for (int count = 0; fileS.length() > count; count++)
      {
       // checks the file strings character calue and counts it
       characters = fileS.charAt(count);
       //if a character value is greater or less than the lower case alphabet
       if (characters >= 'a' && characters <= 'z')
       {
       // then convert the unknown character to blank
       blankS += characters;
       }
      }
      //reinitliazes the strings to be equal to eachother
      fileS = blankS;   
      
      //sets the intger values
      ls = 0;
      //right side of string works backwards hence the -1
      rs = fileS.length() - 1;
      
     
      //the while loop checks that the charachters on the left side are equal
      // to the characters on the right side
      while (fileS.charAt(ls) == fileS.charAt(rs) && rs > ls)
      {   
       //counts the character values from the right side to the middle
        rs--;
       //counts the character values from the left side to the middle
       ls++;
      }
      //closes the file scanner
      sc.close();
      //if the rs side of the string is greater than the ls side when they
      //meet at half the lenght of the texts string string its not a palindrome
      if (rs >ls)
      {
       System.out.println("\nThat string IS NOT a palindrome.");
      }
      else
      {
       System.out.println("\nThat string IS a palindrome.");
      }
    }
   }
   

   
   
   