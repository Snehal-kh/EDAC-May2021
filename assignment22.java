import java.util.*;
import java.lang.*;

class assignment22

{
 public static void main(String argv[])
 {
 int st=0, i=0, rem;
 System.out.println("enter binary number");
  Scanner sc= new Scanner(System.in);
  int bin= sc.nextInt();
  while(bin!=0)
   {
    rem=bin%10;
    st+=rem*Math.pow(2,i);
      bin = bin/10;                        
     i++;                                 
                                          
   }
      System.out.println(st);
  }
 }
