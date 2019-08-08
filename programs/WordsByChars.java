import java.util.*;
import java.io.*;
import java.lang.*;
class WordsByChars
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of strings: ");
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		
		HashMap<Character,Integer> map1 = new HashMap<>();
		for(int i=0 ; i<n ; i++)
		{
			String s = sc.next();
			list.add(s);
		}
		System.out.println("Enter the no. of charecters: ");
		int n1 = sc.nextInt();
		char[] c = new char[n1];
		
		for(int i=0 ; i<n1 ; i++)
		{
			c[i] = sc.next().charAt(0);
			if(map1.containsKey(c[i]))
			{
				Integer k = map1.get(c[i]);
				map1.put(c[i],k+1);
			}
			else
				map1.put(c[i],1);
		}
		for(String i:list)
		{
			int flag = 1;
			HashMap<Character,Integer> map = new HashMap<>();
			for(int j=0;j<i.length();j++)
			{
				if(map.containsKey(i.charAt(j)))
				{
					Integer k = map.get(i.charAt(j));
					map.put(i.charAt(j),k+1);
				}
				else
					map.put(i.charAt(j),1);
			}
			for(int p=0 ; p<i.length() ; p++)
			{
				if(map1.containsKey(i.charAt(p)))
				{
					if(map.get(i.charAt(p))>map1.get(i.charAt(p)))
					{
						flag=0;
						break;
					}
				}
			}
			if(flag==1)
				System.out.print(i+" ");
		}
	}
}
