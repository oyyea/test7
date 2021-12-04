package test7;

import java.util.ArrayList;
import java.util.Scanner;

public class U11_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of objects: 6");
		System.out.print("Enter the weights of objects: ");
		Scanner input=new Scanner(System.in);
		int[][] a=new int[6][6];
		int[] w=new int[6];
		int[] num=new int[6];
		for(int i=0;i<6;i++) {
			w[i]=10;
			num[i]=0;
		}
		int b;
		for(int i=0;i<6;i++) {
			b=input.nextInt();
			for(int j=0;j<6;j++) {
				if(w[j]>=b) {
					a[j][num[j]]=b;
					num[j]++;
					w[j]-=b;
					break;
				}
			}
		}
		for(int i=0;i<6;i++) {
			if(num[i]==0) break;
			System.out.print("Container "+(i+1)+" contains objects"
					+" with weight");
			for(int j=0;j<num[i];j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.printf("\n");
		}
		
	}

}
