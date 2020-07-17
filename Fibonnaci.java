package Assignments;

public class Fibonnaci {



		public static void main(String[] args) {
			
			int r=8;
			int n1=0;
			int n2=1;
			int n3;
			System.out.println(n1);
			System.out.println(n2);
			for(int i=3;i<=r;i++) {
				
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
			}
			
				
			
		}
	
}
