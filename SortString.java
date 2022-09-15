package com.exam.bll;

import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		
		System.out.println("Enter" + name.length + "Names:");
		for(int i=0; i<name.length;i++) {
			name[i] =sc.nextLine();
		}
		
		for(int i =0; i<name.length; i++) {
				
				for(int j=i+1; j<name.length;j++) {
				
					if(name[i].compareTo(name[j])>0) {
						//swapping
						String temp = name[i];
						name[i]=name[j];
						name[j]=temp;
					}
				}
		}
		
		for(int i =0; i<name.length; i++) {
			//Print the Sorted Array
			System.out.println(name[i]);
		}
		
		sc.close();

	}

}
