import java.io.*;
import java.util.*;
public class Prime
{
	public boolean primeNumber(int n)
	{
		if(n<=1)
			return false;
		else
		{
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				if(n%i==0)
					return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] arr = new int[t];
		Prime p = new Prime();
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			arr[i]=n;
		}
		for(int i=0;i<t;i++)
		{
			if(p.primeNumber(arr[i]))
				System.out.println(arr[i]+" "+"is Prime");
			else
				System.out.println(arr[i]+" "+"is not Prime");
		}
	}
}
