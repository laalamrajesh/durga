import java.io.*;
import java.util.*;

class AvailableSeats
{
	public static void main(String args[])
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> show1 = new HashMap<>();
		HashMap<String,Integer> show2 = new HashMap<>();
		show1.put("A1",1);
		show1.put("A2",1);
		show1.put("A3",1);
		show1.put("A4",1);
		show1.put("A5",1);
		show1.put("A6",1);
		show1.put("A9",1);
		show2.put("A1",1);
		show2.put("A2",1);
		show2.put("A4",1);
		show2.put("A5",1);
		show2.put("A6",1);
		show2.put("B1",1);
		show2.put("B3",1);
		show2.put("B4",1);
		show2.put("B5",1);
		show2.put("B6",1);
		show2.put("B7",1);
		do
		{
			System.out.println("Enter show no:- ");
			int n= sc.nextInt();
			System.out.println("Enterseats:- ");
			String s1 = sc.next();
			String s2 = sc.next();
			if(n==1)
			{
				if(show1.containsKey(s1) && show1.containsKey(s2))
				{
					show1.remove(s1);
					show1.remove(s2);
					System.out.println("Successfully booked");
					System.out.print("Available seat:- "+show1.keySet());
					
				}
				else if(show1.containsKey(s1))
					System.out.println("seat "+s2+" not available please try again");
				else if(show1.containsKey(s2))
					System.out.println("seat "+s1+" not available please try again");
				else
					System.out.println("seat "+s1+" and "+s2+" not available please try again");
			}
			else
			{
				if(show2.containsKey(s1) && show2.containsKey(s2))
				{
					show2.remove(s1);
					show2.remove(s2);
					System.out.println("Successfully booked");
					System.out.print("Available seat:- "+show2.keySet());
				}
				else if(show1.containsKey(s1))
					System.out.println("seat "+s2+" not available please try again");
				else if(show1.containsKey(s2))
					System.out.println("seat "+s1+" not available please try again");
				else
					System.out.println("seat "+s1+" and "+s2+" not available please try again");
			}
			System.out.println("\nDo you want to continue\n1.yes\n2.no");
			choice = sc.nextInt();
		}while(choice==1);
	}
}
