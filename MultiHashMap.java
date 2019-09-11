import java.util.*;
class MultiHashMap
{
	public static void main(String args[])
	{
		MultiHashMap multi = new MultiHashMap();
		AddElement add = multi.new AddElement();
		add.start();
		PopElement pop = multi.new PopElement();
		pop.start();
	}
	class AddElement extends Thread
	{
		HashMap<Integer,Integer> map = new HashMap<>();
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				map.put(i,i);
				System.out.println(map.get(i)+" Add "+i);
			}	
		}
	}
	class PopElement extends Thread
	{
		public void run()
		{
			AddElement add1 = new AddElement();		
			for(int i=9;i>=0;i--)
			{
				add1.map.remove(i);
				System.out.println(add1.map.get(i)+" Pop "+i);
			}
				
		}
		
	}
}
