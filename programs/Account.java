import java.io.*;
import java.util.*;
class Account
{
	String name;
	double amount=0;
	String accountNumber;
	Account(String name,String accountNumber)
	{
		this.name=name;
		this.accountNumber=accountNumber;
	}
	public void display()
	{
		name=name.toLowerCase();
		int c=(int)name.charAt(0)-32;
		name=(char)c+name.substring(1,name.length());
		System.out.println("\nName: "+name+"\n"+"Account Number : "+accountNumber+"\n"+"Amount : "+amount);
		
	}
}
class IsValid
{
	int i;
	public int validName(String name,int accept)
	{
		for(i=0;i<name.length();i++)
		{
			if((int)name.charAt(i)>=65&&(int)name.charAt(i)<=90 || (int)name.charAt(i)>=97&&(int)name.charAt(i)<=122)
			{
				accept=1;
			}
			else
			{
				accept = 0;
				System.out.println("Invalid Name Entered");
				break;
			}
		}
		return accept;
	}
	public int validAccountNumber(String accountNumber,int accept)
	{
		
		for(i=0;i<accountNumber.length();i++)
		{
			if(accountNumber.charAt(i)>=48 && accountNumber.charAt(i)<=57)
				accept=1;
			else
			{
				accept = 0;
				System.out.println("Invalid Acc No ** Must contain numbers");
				break;
			}
		}
		if(accept==1)
		{
			if(accountNumber.length()!=11)
			{
				System.out.println("Invalid Acc No ** Length must be 11");
				accept=0;
			}
		}
		return accept;
	}
}
class Demo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int accept;
		String name,accountNumber;
		IsValid iv = new IsValid();
		do
		{
			accept=0;
			System.out.println("Accountant Name: ");
			name = sc.next();
			accept = iv.validName(name,accept);
		}while(accept==0);
		do
		{
			accept=0;
			System.out.println("Account Number: ");
			accountNumber = sc.next();
			accept = iv.validAccountNumber(accountNumber,accept);
		}while(accept==0);
		
		
		System.out.println("Account Successfully Created");
		Account acc = new Account(name,accountNumber);
		acc.display();
	}
}
