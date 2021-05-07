import java.util.*;
import java.lang.Math.*;

class assignment11
{
 public static void main(String args[])
 {
 Scanner sc= new Scanner(System.in);
 System.out.println("enter redius of circle");
 double redius= sc.nextDouble();
 //float area=3.14*redius*redius;
 System.out.println("area of circle is="+(Math.PI*redius*redius));
 //float perimeter= 2*3.14*.radius;
 System.out.println("area of circle is=:"+(2*Math.PI*redius));
}
}