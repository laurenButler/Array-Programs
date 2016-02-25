//Lauren Butler ARRAY PROGRAM 1 Pd:2

   import java.lang.Math;
   import java.util.*;

   public class ArrayOne
   {
      public static void main(String[] args)
      {
      //instantiates scanner and array
         int[] values = new int[70];
         int i;
         int count = 0;
         int count2 = 0;
         int count3 = 0;
         int count4 = 0;
         int count5 = 0;
         int count6 = 0;
         int count7 = 0;
         int count8 = 0;
         int count9 = 0;
         int count10 = 0;
			int a;
         Scanner imput = new Scanner(System.in);
         String one; String eleven; String twentyone; String thirtyone; String fortyone; String fiftyone;
         String sixtyone; String seventyone; String eightyone; String ninetyone;
      
      
         for(i = 0; i <= 69; i++)//says theres going to be an array of 70 values
         {
            System.out.println("Imput number between 1 to 100.");
				a=imput.nextInt();

            //if the value is out of the range
            if((a> 1)&&(100 > a))
            {
               //System.out.println("This value is invalid. Please imput a number between 1 and 100.");               
               values[i] = a;
            }	
            else//when the value is in range
            {
               while((a < 1)||(100 < a))
               {System.out.println("This value is invalid. Please imput a number between 1 and 100.");
                  a = imput.nextInt();
                  values[i] = a;}
            }
         }
      	
			//Counters
         for( i = 0; i < values.length; i++)
         {
            if(values[i] <= 10)//1-10
            {
               count++;
            }
            else if(values[i] > 10 && values[i] <=20)//11-20
            {
               count2++;
            }
            else if(values[i] > 20 && values[i] <=30)//21-30
            {
               count3++;
            }
            else if(values[i] > 30 && values[i] <= 40)//31-40
            {
               count4++;
            }
            else if(values[i] > 40 && values[i] <= 50)//41-50
            {
               count5++;
            }
            else if(values[i] > 50 && values[i] <= 60)//51-60
            {
               count6++;
            }
            else if(values[i] > 60 && values[i] <= 70)//61-70
            {
               count7++;
            }
            else if(values[i] > 70 && values[i] <= 80)//71-80
            {
               count8++;
            }
            else if(values[i] > 80 && values[i] <= 90)//81-90
            {
               count9++;
            }
            else//91-100
            {
               count10++;
            }
         }     
      	  
           //prints out the # category, then the correct amount of *s
			  System.out.print("Between 1-10 is " + count + ": ");
           for(int p = 0; p < count; p++)
            {
             System.out.print("*");
            }
           
			  System.out.print("\n Between 11-20 is " + count2 + ": ");
           for(int b = 0; b < count2; b++)
            {
             System.out.print("*");
            }
           
			  System.out.print("\n Between 21-30 is " + count3 + ": "); 
           for(int c = 0; c < count3; c++)
            {
             System.out.print("*");
            }
            
			  System.out.print("\n Between 31-40 is " + count4 + ": ");
           for(int d = 0; d < count4; d++)
            {
             System.out.print("*");
            }
           
			  System.out.print("\n Between 41-50 is " + count5 + ": "); 
           for(int e = 0; e < count5; e++)
            {
             System.out.print("*");
            }
           
			  System.out.print("\n Between 51-60 is " + count6 + ": "); 
           for(int f = 0; f < count6; f++)
            {
             System.out.print("*");
            }
           
			  System.out.print("\n Between 61-70 is " + count7 + ": "); 
           for(int g = 0; g < count7; g++)
            {
             System.out.print("*");
            }
           
			  System.out.print("\n Between 71-80 is " + count8 + ": "); 
           for(int h = 0; h < count8; h++)
            {
             System.out.print("*");
            }
           
			  System.out.print("\n Between 81-90 is " + count9 + ": "); 
           for(int j = 0; j < count9; j++)
            {
             System.out.print("*");
            }
           
			  System.out.print("\n Between 91-100 is " + count2 + ": "); 
           for(int k = 0; k < count10; k++)
            {
             System.out.print("*");
            }
            
      }
   }