package javagithub;
import java.util.*;

public class Fibonacci {
	
		public static void main(String args[]) {
			int term1=0,term2=1;
			int term3;
			Scanner in=new Scanner(System.in);
			System.out.println("enter the number till you want series");
			int s=in.nextInt();
			System.out.print(term1+" "+term2);
			for(int i=2;i<s;i++) {
				term3=term1+term2;
				term1=term2;
				term2=term3;
				System.out.print(" "+term3);
			}
			
			
		}

}
