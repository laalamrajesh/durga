import java.io.*;
import java.util.*;
import java.lang.*;
class UniqueCharsFromStringHashMap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2 = sc.next();
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		ArrayList<Character> arrl = new ArrayList<>();
		for(int j=0;j<s1.length();j++)
		{
			if(map1.containsKey(s1.charAt(j)))
			{
				Integer k = map1.get(s1.charAt(j));
				map1.put(s1.charAt(j),k+1);
			}
			else
				map1.put(s1.charAt(j),1);
		}
		for(int j=0;j<s2.length();j++)
		{
			if(map2.containsKey(s2.charAt(j)))
			{
				Integer k = map2.get(s2.charAt(j));
				map2.put(s2.charAt(j),k+1);
			}
			else
			{
				map2.put(s2.charAt(j),1);
				arrl.add(s2.charAt(j));
			}
		}
		System.out.println(map1);
		System.out.println(map2);
		for(int j=0 ; j<arrl.size();j++)
		{
			if(map1.containsKey(arrl.get(j)))
			{
				if(map1.get(arrl.get(j)) <= map2.get(arrl.get(j)))
					map1.put(arrl.get(j),-1);
				else
					map1.put(arrl.get(j),map2.get(arrl.get(j)));
			}
			else
				map1.put(arrl.get(j),0);
		}
		System.out.println(map1);
		System.out.println(map2);
		for(int j=0;j<s1.length();j++)
		{
			if(map1.get(s1.charAt(j)) > 0)
				map1.put(s1.charAt(j),map1.get(s1.charAt(j)-1));
			else if(map1.get(s1.charAt(j)) == 0)
				System.out.print(s1.charAt(j));
		}
	}
}
