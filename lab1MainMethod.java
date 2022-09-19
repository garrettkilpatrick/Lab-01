import java.util.*;
import java.io.*;
public class lab1MainMethod
{
   public static void main(String []args) throws IOException
   {
      Scanner input = new Scanner(System.in);
      //double object1q1 = input.nextDouble();
      System.out.println("Please enter the four quarterly sales for Div 0 separated by space:");
      String div0 = input.nextLine();
      String[] div0Splitted = div0.split("\\s+");
      double[] div0Parsed = new double[4];
      for(int i = 0; i< div0Splitted.length; i++)
      {
         div0Parsed[i] = Double.parseDouble(div0Splitted[i]);
      }
      
      //if (div0Parsed[0] <= 0 && div0Parsed[1] <= 0 && div0Parsed[2] <= 0 && div0Parsed[3] <= 0)
      //{
      
         System.out.println("Please enter the four quarterly sales for Div 1 separated by space:");
         String div1 = input.nextLine();
         String[] div1Splitted = div1.split("\\s+");
         double[] div1Parsed = new double[4];
         for(int i = 0; i< div1Splitted.length; i++)
         {
            div1Parsed[i] = Double.parseDouble(div1Splitted[i]);
         }
         
         //if (div1Parsed[0] <= 0 && div1Parsed[1] <= 0 && div1Parsed[2] <= 0 && div1Parsed[3] <= 0)
         //{
         
            DivSales[] divSalesObjects = new DivSales[2];
            divSalesObjects[0] = new DivSales(div0Parsed[0], div0Parsed[1], div0Parsed[2], div0Parsed[3]);
            divSalesObjects[1] = new DivSales(div1Parsed[0], div1Parsed[1], div1Parsed[2], div1Parsed[3]);
          // THROWS COMPILATION ERROR IN THIS LINE 
            divSalesObjects[0].quarters(divSalesObjects);
            
            
         //}
         //else
         //{
            //System.out.println("All values must be greater than or equal to 0. Please restart the program");
         //}
      //}
      //else
      //{
         //System.out.println("All values must be greater than or equal to 0. Please restart the program");
      //}

   }
}
