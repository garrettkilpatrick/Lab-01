public class DivSales
{
   private double q1Sales;
   private double q2Sales;
   private double q3Sales;
   private double q4Sales;
   
   public static double totalCorpSales = 0;
   
   DivSales(double q1Sales, double q2Sales, double q3Sales, double q4Sales)
   {
      this.q1Sales = q1Sales;
      this.q2Sales = q2Sales;
      this.q3Sales = q3Sales;
      this.q4Sales = q4Sales;
   }  
   
   public double corpSales()
   {
      double[] quarters = {this.q1Sales, this.q2Sales, this.q3Sales, this.q4Sales};
      for(int i = 0; i < quarters.length; i++)
      {
         this.totalCorpSales = totalCorpSales + quarters[i];
      }
      return totalCorpSales;
   }
   
   public double quarters()
   {
      double[] quarters = {this.q1Sales, this.q2Sales, this.q3Sales, this.q4Sales};
      for(int i = 0; i < quarters.length; i++)
      {
         this.totalCorpSales = totalCorpSales + quarters[i];
      }
      return totalCorpSales;
   }
   
   /*public double getQuarter(int quarter) 
   {
      return quarters[quarters];
   }*/

}