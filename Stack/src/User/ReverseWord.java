package User;

import java.io.InputStreamReader;

import Designer.Stack;

import java.io.BufferedReader;
import java.io.IOException;


public class ReverseWord
{
  public static void main(String[] args) throws IOException
  {
    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader console = new BufferedReader(reader);

    while (true)
    {
      System.out.print("Enter a word [or Enter to terminate]: ");
      String input = console.readLine();
      if (input.equals(""))
        break;
      int nChars = input.length();
      Stack theStack = new Stack();
      for (int i=0; i<nChars; i++)
      {
        char c = input.charAt(i);
        Character cObj = new Character(c);
        theStack.push(cObj);
      }

      String output = "";
      while (!theStack.isEmpty())
      {
         Character cObj = (Character) theStack.pop(); 
         char c = cObj.charValue();
         output = output + c;
      }

      System.out.println("The reversed word: " + output);

     } // end while

  } // end main


} //end class
