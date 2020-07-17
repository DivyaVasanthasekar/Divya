package Assignments;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		
		int num=183;
		int arm=0;
		int rem;
		int input=num; 
		
		while(input>0) {
			rem=input%10;
			arm=arm+(rem*rem*rem);
			input=input/10;
			
		}
		
		if(num==arm) {
			
		System.out.println(num + " is an armstrong number");
		}
		else
			System.err.println(num + " is not an armstrong number");
		}
	

}
