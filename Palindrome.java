import java.io.*;
import java.util.Scanner;
public class Palindrome{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int number=s.nextInt();
	int temp;
	int rem;
	int reverse=0;
	temp=number;
	while(temp>0)
	{
		rem=temp%10;
		reverse=reverse*10+rem;
		temp/=10;
	}
if(number==reverse)
{
	System.out.println(reverse+" is palindrome");
}
else{
System.out.println(reverse+" is not palindrome");
}

}
}