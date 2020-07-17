package Assignment2;


import java.util.*;

public class SecondLargest {

	public static void main(String[] args) {
		
		int[] sl = new int[4];
		
		sl[0]=4;
		sl[1]=3;
		sl[2]=6;
		sl[3]=13;
		
		System.out.println("original number");
		for(int i = 0;i<=sl.length-1; i++) {
			
			System.out.println(sl[i]);
		}
		Arrays.sort(sl);
		System.out.println("Ascending order");
		for (int i=0;i<=sl.length-1; i++)
		{
			System.out.println(sl[i]);
		}
			
		System.out.println("second largest number is "+sl[sl.length-2]);
			
		
		
	}
}
