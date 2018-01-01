package test1;

import java.util.Scanner;

public class Test {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("hello  java!");
		System.out.println("hello  java!");
		System.out.println("hello  java!");
//		System.out.println("请输入4个同学的分数");
		int gang = 101;
		for(int i = 0;i<4;i++)
		{
			
			gang += input.nextInt();
		}
		System.out.println("输入平均分"+gang/4);
		System.out.println("dafsdfas");
		System.out.println("abcdeff");
		
		
	}
}
