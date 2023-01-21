package com.gpr.apps;
import java.util.*;
public class FirstClass {

	public static void main(String[] args) 
	{
	
		int a=1,b=2,c=3,d=4;
		int e=1,f=2,g=3,h=4;
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter a Student roll no");
		int no=s1.nextInt();
		if(e==no) {
			System.out.println("You are SAPPHIRE");
		}
		else if(f==no) {
			System.out.println("You are PEARL");
		}
		else if(g==no) {
			System.out.println("You are RUBY");
		}
		else if(h==no) {
			System.out.println("You are EMERALD");
		}
		if(no<=25) {
			while(a<=25) {
				a=a+4;
				if(a==no) {
					
					System.out.println("You are SAPPHIRE");
				}	
			}
			while(b<=25) {
				b=b+4;
				if(b==no ) {
					System.out.println("You are PEARL");
				}
			}
			while(c<=25) {
				c=c+4;
				if(c==no) {
					System.out.println("You are RUBY");
				}
			}
			while(d<=25) {
				d=d+4;
				if(d==no) {
					
					System.out.println("You are EMERALD");
				}
			}
			
		}
	}

}