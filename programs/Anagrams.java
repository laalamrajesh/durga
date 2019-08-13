import java.io.*;
import java.util.*;
import java.lang.*;
public class Anagrams
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		if(s1.length()!=s2.length())
			System.out.println("False");
		else
		{
			for(int j=0;j<s1.length();j++)
			{
				if(map1.containsKey(s1.charAt(j)))
				{
					Integer k = map1.get(s1.charAt(j));
					map1.put(s1.charAt(j),k+1);
				}
				else
					map1.put(s1.charAt(j),1);
					
				if(map2.containsKey(s2.charAt(j)))
				{
					Integer k = map2.get(s2.charAt(j));
					map2.put(s2.charAt(j),k+1);
				}
				else
					map2.put(s2.charAt(j),1);
			}
			System.out.println(map1);
			System.out.println(map2);
			System.out.println(map1.equals(map2));
		}
		
	}
}
