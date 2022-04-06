import java.util.*;
public class Odd_Even
{
 public static void main(String[] args)
 {
 int[] num={10,11,12,13,14,15,16,17,18,19,20};
 int even=0, odd=0;
 System.out.println("Original array:"+Arrays.toString(num));
 for(int i=0;i<num.length;i++)
 {
  if(num[i]%2==0)
  {
  even++;
  }
  else
  odd++;
 }
  System.out.printf("\nCount of even numbers: %d",even);
 System.out.printf("\nCount of odd numbers: %d",odd);
  System.out.println("Reversed it");
 }
}
