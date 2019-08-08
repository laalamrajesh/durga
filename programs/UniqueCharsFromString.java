import java.io.*;
import java.util.*;
import java.lang.*;
class UniqueCharsFromString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2 = sc.next();
		for(int i=0 ; i<s2.length() ; i++)
		{
			for(int j=0 ; j<s1.length() ; j++)
			{
				if(s2.charAt(i) == s1.charAt(j))
				{
					s1.replace(s1.charAt(j),'@');
					break;
				}
			}
		}
		System.out.println(s1);
		for(int i=0 ; i<s2.length() ; i++)
		{
			if(s1.charAt(i)!='@')
				System.out.print(s1.charAt(i));
		}
	}
}
