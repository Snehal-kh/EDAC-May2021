import java.util.*;
class assignment15
{
public static void main(String args[])
{
 Scanner o=new Scanner(System.in);
 System.out.println("enter two numbers");
 int i=o.nextInt();
 int j=o.nextInt();
 int temp;
 System.out.println("number before swapping:"+i+" "+j);
  temp=i;
  i=j;
  j=temp;
 System.out.println("number after swapping:"+i+" "+j);
}
}