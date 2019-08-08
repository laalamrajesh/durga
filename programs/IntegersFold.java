import java.io.*;
import java.util.*;
import java.lang.*;
class IntegersFold
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arrl1 = new ArrayList<>();
		ArrayList<Integer> arrl2 = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int s = sc.nextInt();
			arrl1.add(s);
		}
		for(int i=0,j=n-1;i<n/2&&j>=n/2;i++,j--)
		{
			arrl2.add(arrl1.get(i)+arrl1.get(j));
		}
		System.out.println(arrl2);
	}
}
