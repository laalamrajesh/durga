import java.util.*;
import java.io.*;
import java.lang.*;
class Santa
{
	public static void main(String args[]) throws java.lang.ArrayIndexOutOfBoundsException
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = 0,i;
		for(i=1;i<=n;i++)
		{
			int s1 = sc.nextInt();
			int s2 = sc.nextInt();
			int l1 = sc.nextInt();
			int l2 = sc.nextInt();
			if(s.substring(s1,s2+1).equals(s.substring(l1,l2+1)))
			{
				//System.out.println(s.substring(s1,s2+1));
				//System.out.println(s.substring(l1,l2+1));
				arr[k]=1;
			}
			else
			{
				//System.out.println(s.substring(s1,s2+1));
				//System.out.println(s.substring(l1,l2+1));
				arr[k]=0;
			}
				
			k++;
		}
		for(i=0;i<n;i++)
		{
			if(arr[i]==0)
				System.out.println("No");
			else
				System.out.println("Yes");
		}
	}
}
