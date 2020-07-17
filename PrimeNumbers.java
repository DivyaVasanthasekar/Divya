package Assignments;

public class PrimeNumbers {

	public static void main(String[] args) {
		
	
	int no=13;
	int count=0;

	for(int i=1;i<=no;i++) {
		if(no%i==0) {
			count = count+1;
		}
	}
	
	if(count==2) {
		System.out.println("Prime number");
	}
	else {
		System.out.println("not prime number");
	}
	}
}
