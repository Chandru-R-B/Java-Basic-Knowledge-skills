Write a program to check whether it is a palindrome using a method in java

import java.io.*;
import java.util.*;
class Palindrome{
void reverse(String org)
{
	String rev="";
	int size=0;
	size=org.length();
	for(int i = size-1; i>=0 ; i--)
		rev = rev+org.charAt(i);
	if(org.equals(rev))
		System.out.println("It is a Palindrome");
	else
		System.out.println("It is not a palindrome");
}
public static void main(String[] args)
{
	String org;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string :");

	org=sc.nextLine();
	Palindrome pam = new Palindrome();
	pam.reverse(org);
}
}
