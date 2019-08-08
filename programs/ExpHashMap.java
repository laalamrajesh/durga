import java.util.*;
import java.io.*;
import java.lang.*;

public class ExpHashMap
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no. of strings: ");
		int n = sc.nextInt();
		System.out.print("Enter the length of the each string: ");
		int m = sc.nextInt();
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++)
		{
			String s = sc.next();
			ArrayList<Character> arrl = new ArrayList<>();
			HashMap<Character, Integer> map = new HashMap<>();
			for(int j=0;j<m;j++)
			{
				if(map.containsKey(s.charAt(j)))
				{
					Integer k = map.get(s.charAt(j));
					map.put(s.charAt(j),k+1);
				}
				else
				{
					map.put(s.charAt(j),1);
					arrl.add(s.charAt(j));
				}
			}
			int val = 0;
			for(int p=0;p<arrl.size();p++)
			{
				val = val*10;
				val = val+map.get(arrl.get(p));
				
			}
			if(i==0)
				min = val;
			else
			{
				if(min>val)
				{
					min=val;
				}
			}
		}
		System.out.println(min);
		
	}
}
