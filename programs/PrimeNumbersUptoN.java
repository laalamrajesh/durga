import java.io.*;
import java.util.*;
public class PrimeNumbersUptoN
{
	public boolean primeNumbers(int n)
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
		int n = sc.nextInt();
		int[] arr = new int[n];
		int ind=0;
		PrimeNumbersUptoN p = new PrimeNumbersUptoN();
		for(int i=2;i<n;i++)
		{
			if(p.primeNumbers(i))
				arr[ind++]=i;
		}
		for(int i=0;i<ind-1;i++)
			System.out.print(arr[i]+", ");
		System.out.println(arr[ind-1]);
	}
}
