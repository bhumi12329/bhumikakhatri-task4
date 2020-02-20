package cleancode;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.Math;
import java.util.Scanner;
public class interest
{
	double principle,interest1,year;
   public interest(double principle,double interest1,double year) 
   {
	   this.principle=principle;
	   this.interest1=interest1;
	   this.year=year;
   }
   public void findsimple(double principle,double interest1,double year)
   {
	   double simpleinterest;
	   simpleinterest=(principle*interest1*year)/100;
	   System.out.print(simpleinterest);
	   System.out.print("\n");
   }
   public void findcompound(double principle,double interest1,double year)
   {
	   double compoundinterest;
	   double futureamount;
	   double interestratio=interest1/100;
	   double a=1+interestratio;
	   double b=Math.pow(a,year);
	   futureamount=principle*b;
	   compoundinterest=futureamount-principle;
	   System.out.print(compoundinterest);
   }
  
    public static void main(String[] args) throws IOException {  
    
      double principle,interest1,year;
    	 Scanner sc=new Scanner(System.in);
	   OutputStreamWriter streamwriter=new OutputStreamWriter(System.out);
	   streamwriter.write("Enter the principle amount");
	   streamwriter.flush();
	   principle=sc.nextDouble(); 
	   streamwriter.write("Enter the interest");
	   streamwriter.flush();
	   interest1=sc.nextDouble();
	   streamwriter.write("Enter the year");
	   streamwriter.flush();
	   year=sc.nextDouble();
	   interest i=new interest(principle,interest1,year);
	   
	   streamwriter.write("Simple interest = ");
	   streamwriter.flush();
	   i.findsimple(principle,interest1,year);
	   streamwriter.write("Compound interest = ");
	   streamwriter.flush();
	   i.findcompound(principle,interest1,year);
    }
}   
   
   
