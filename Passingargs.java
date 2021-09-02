package com.hsbc;

import java.util.Arrays;

public class Passingargs {

	public void m1(int x) {
         x += 10;
         System.out.println("In m1 : " + x);  //20
	}

	
	public void m2(String s) {
        s += " world";
        System.out.println(s);  //Hello world
	}

	
	public void m3(int[] arr) {
		//for(int i=0; i< arr.length;i++)
			arr[0] = 1000;
	}
	
	
	public void m4(Box b) {
       b.setHeight(300);
	}

	
	public void m5(StringBuffer sb, String str) {
	       sb.append(str);
		}
	
	
	public static void main(String[] args) {
		Passingargs pa1 = new Passingargs();
		int a = 10;
		pa1.m1(a);
		System.out.println("After m1() call : " + a);  //10
		
		String str = "Hello";
		pa1.m2(str);
		System.out.println(str);  //Hello
		
		int arr[] = {1,2,3,4,5};
		pa1.m3(arr);
		System.out.println(Arrays.toString(arr)); //[1000, 2, 3, 4, 5]
		
		Box b1 = new Box(1,2,3);
		pa1.m4(b1);
		System.out.println(b1);  //Box [length=1, width=2, height=300]
		
		StringBuffer sb1 = new StringBuffer("Welcome ");
		pa1.m5(sb1, " to Java");
		System.out.println(sb1);  //Welcome to Java
		

	}
}
