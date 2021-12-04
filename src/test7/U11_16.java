package test7;

import java.util.ArrayList;
import java.util.Scanner;

public class U11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=(int)(Math.random()*10);
		int number2=(int)(Math.random()*10);
		ArrayList<Integer>list=new ArrayList<Integer>();
		
		Scanner input=new Scanner(System.in);
		System.out.print("What is "+number1+" + "+number2+"? ");
		int ans=input.nextInt();
		
		while(number1+number2!=ans) {
			if(list.contains(ans)) {
				System.out.println("You already entered "+ans);
			}else {
				list.add(ans);
			}
			System.out.print("Wrong answer. Try again. What is "+number1+" + "+number2+"? ");
			ans=input.nextInt();
		}
		System.out.println("You got it!");
	}

}
