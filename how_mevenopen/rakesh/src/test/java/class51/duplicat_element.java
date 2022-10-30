package class51;

import java.util.HashSet;

public class duplicat_element {
	public static void main(String args[])
	{
		int arr[]= {2,23,2,53,65,85,65,96,3,32,96};
		HashSet<Integer> ch=new HashSet<Integer>();
		for(int r:arr)
		{
			ch.add(r);
			
		}
		for(int k:ch)
		{
			System.out.println(k);
		}
		
	}

}
