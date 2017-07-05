# Reversenum
import java.io.*;
import java.util.*;
public class ReverseNumber 
{
 public static void main(String[] args) 
 {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number to be reversed : ");
    int input = sc.nextInt();
    int result = reverse(input);
    System.out.println("The reversed number is " + result);
  }
 public static int reverse(int n) 
 {
    int result = 0;
    int r;
    while (n > 0) {
      rem = n % 10;
      n = n / 10;
      result = result * 10 + r;
    }
    return result;
  }
}
