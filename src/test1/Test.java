package test1;

import java.util.Scanner;

public class Test {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		System.out.print("hello  java!");
		System.out.println("hello  java!");
		System.out.println("hello  java!");
//		System.out.println("������4��ͬѧ�ķ���");
		int gang = 101;
		for(int i = 0;i<4;i++)
		{
			
			gang += input.nextInt();
		}
		System.out.println("����ƽ����"+gang/4);
		System.out.println("dafsdfas");
		System.out.println("abcdeff");
		
		
	}
}
