package lab21;
import java.util.Scanner;
public class Reverse_Palindrome 
{
public static void main(String[] args) 

	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String revstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			revstr=ch+revstr;
			
		}
System.out.println("reverse of the string is \n"+ revstr);
if(str.equals(revstr))
		System.out.println("string is palindrome");
else
	System.out.println("string is not palindrome");
	}

}
