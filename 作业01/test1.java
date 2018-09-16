package com;

public class text {
	public static void main(String[] args)
	{
		for(int i=99;i>=0;i--) {
			
			if(i<=99&&i>2) {
			System.out.println(i+" bottles of beer on the wall,"+i+" bottles of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around");
			System.out.println((i-1)+" bottles of beer on the wall.");
			}
			if(i==2) {
				System.out.println(" 2 bottles of beer on the wall,2 bottles of beer.");
				System.out.println("Take one down.");
				System.out.println("Pass it around");
				System.out.println("1 bottle of beer on the wall.");
			}
			if (i==1) {
				System.out.println(" 1 bottle of beer on the wall,1 bottles of beer.");
				System.out.println("Take one down.");
				System.out.println("Pass it around");
				System.out.println("0 bottle of beer on the wall.");
			}
			if(i==0) {
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}

}
