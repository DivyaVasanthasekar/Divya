package Assignment2;

import java.util.Arrays;

public class missingElement {
	
	public static void main(String[] args) {
		
		int me[] = {1,3,4,6,5};
		
	Arrays.sort(me);
	
	for (int i = 1;i<=me.length-1;i++) {
		if(i!=me[i-1]) {
			System.out.println("Missing element is " + i);
			break;
		}
	}
		
	}

}
