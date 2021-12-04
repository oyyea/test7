package test7;

import java.util.Scanner;

public class U11_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter an integer m: ");
		Scanner input=new Scanner(System.in);
		
		int m=input.nextInt();
		int m2=m;
		int n=1;
		for(int i=2;i<=m2;i++) {
			int c=0;
			while(m2%i==0) {
				m2/=i;
				c++;
			}
			if(c%2==1) {
				n*=i;
			}
		}
		
		System.out.println("The smallest number n for m*n "
				+"to be a perfect square is "+n);
		System.out.println("m * n is "+n*m);
	}

}
