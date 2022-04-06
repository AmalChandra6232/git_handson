import java.util.*;
public class Reverse
{
 static int reverseNumber(int num)
 {
	 int rev=0;
	 int remainder;
	 while(num>0)
	 {
		 remainder=num%10;
		 rev=(rev*10) + remainder;
		 num=num/10;
	 }
 
		return rev;
	 }
  
 public static void main(String[] args)
 {
	 int num;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number");
	 num=sc.nextInt();
 System.out.println("Reversed Number is "+ reverseNumber(num));
	 git checkout feature
 System.out.println("reversed ittttttttt");
 }
}
