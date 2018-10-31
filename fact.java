import java.io.*;
class fact
{
  public static void main(String args[])
    {
        int n=0,fact=1;
        Scanner scr=new Scanner();
        System.out.println("Enter the number to find factorial of a number");
        n=scr.nextInt();
        for(i=0;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of"n "is" fact);
  
  
  
    }
 }
