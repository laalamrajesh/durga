import java.util.*;
import java.io.*;
class DecriptMessage
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String msg = scan.next();
		String result="";
		if(msg.charAt(0)=='0')
			result=result+"1";
		else
			result=result+"0";
		String res=Character.toString(msg.charAt(0));
		//String result=Character.toString(msg.charAt(0));
		
		for(int j=1;j<msg.length();j++)
		{
			if(msg.charAt(j)!=msg.charAt(j-1))
			{
				if(msg.charAt(j)=='0')
					result=result+"1";
				else
					result=result+"0";
				res+=Character.toString(msg.charAt(j));
			}
		}
		System.out.println(res);
		System.out.println(result);
	}
}
