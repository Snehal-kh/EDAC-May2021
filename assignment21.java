import java.util.*;

class assignment21
{
 public static void main(String argv[])
 {
  int i=0;
  int binary[]= new int[20];

   System.out.println("enter decimal number");
   Scanner sc= new Scanner(System.in);
   int num= sc.nextInt();

   while(num>0)
   {
    binary[i]=num%8;
      num=num/8;
       i++;                                
   };
    --i;
    while(i>=0)
      {
         System.out.print(binary[i]); 
       i--;
    
      }
 }
}
