package com.gpr.apps;

import java.util.*;
public class FirstClass {

	public static void main(String[] args)
	{
		int total=0;
		int a=60,b=90,c=120,d=45,e=30;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player Name ?");
		String name=s.nextLine();
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter Student 1 : ");
		int Student1=s1.nextInt();
		
		Scanner s2 = new Scanner(System.in);
		System.out.print("Enter Student 2 : ");
		int Student2=s2.nextInt();
		
		Scanner s3 = new Scanner(System.in);
		System.out.print("Enter Student 3 : ");
		int Student3=s3.nextInt();
		total=Student1+Student2+Student3;
		if(total==180) {
			
			if(Student1==90 || Student2==90 || Student3==90) {
				System.out.println(name+" you won Second Prize !");
			}
			else if(Student1==60 && Student2==60 && Student3==60) {
				System.out.println(name+" you won Third Prize !");
			}
			else {
				System.out.println(name+" You Won First Prize !");
			}
		}
		
		else {
			System.out.println(name+" You Got No Prize !");
			
		}
	}

}