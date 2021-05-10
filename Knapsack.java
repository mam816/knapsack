import java.io.*;
import java.util.*;

public class Knapsack
{
    public static void main(String args[])throws Exception
	{
	    Scanner infile = new Scanner( new FileReader( args[0] ) );
	    int [] set = loadSet(infile);
       int target = infile.nextInt();
       System.out.println(target);
	    for (int i = 1; i <= 0xFFFF; i++)
		     {			
            int sum = 0;
            String subset = "";
			   String binary = toBinary(i);
            for(int j = 0; j < 16; j++) 
			      {
				    if(binary.charAt(j) == '1')
			    	    {
                    sum += set[j];
                    subset += set[j] + " ";
				       }
			      }
            if(sum == target)
			     {
               System.out.println(subset);
			     }
		      }
	}  
	   
	
	
	
	static int [] loadSet( Scanner infile ) 
	{
		int count = 0;
		int [] theArray = new int [16];
		while(count < 16)
		{
			theArray[count] = infile.nextInt();
			System.out.print(theArray[count] + " ");
			count++;
		}
      System.out.println();
      return theArray;
	}
   
	public static String toBinary(int number)
	{	
		String binary = "";

		for(int i = 15 ; i >=0  ; --i )
		{
			if((number >> i) % 2 == 1 ) 
            {
				binary += "1";
            }
			else
            {
				binary += "0";
            }
		}
		return binary;
	}
}	  