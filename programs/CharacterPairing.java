import java.io.*;
import java.util.*;
import java.lang.*;
class CharacterPairing
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<Character> arrl = new ArrayList<>();
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0 ; i<s.length();i++)
		{
			if(map.containsKey(s.charAt(i)))
			{
				int k = map.get(s.charAt(i));
				map.put(s.charAt(i),k+1);
			}
			else
			{
				map.put(s.charAt(i),1);
				arrl.add(s.charAt(i));
			}
		}
		int flag = 1;
		for(int i=0;i<arrl.size();i++)
		{
			if(map.get(arrl.get(i)) % 2 != 0)
			{
				flag = 0;
				break;
			}
		}
		if(flag==1)
				System.out.println("True");	
		else
			System.out.println("False");
	}
}
