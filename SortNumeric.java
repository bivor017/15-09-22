package com.exam.bll;

import java.util.Scanner;

public class SortNumeric {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num[] = new int[5]; //Size of an Array 5
		
		System.out.println("Enter " +num.length+ " Number:"); //Assign Value
		
		for(int i=0; i<num.length; i++)
			num[i]=sc.nextInt();
		
		//Before Sorting
		System.out.println("Number before Sorting:");
		for(int i=0; i<num.length; i++)
			System.out.println(num[i]);
		
		//Ascending order of the value
		
		for(int i=0; i<num.length; i++) {
				for(int j=i+1; j<num.length;j++) {
					if(num[i]>num[j]) {
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
				}
			 
			}
		}
		
		System.out.println("Number after sorting in Ascending order:");
		for(int i =0; i<num.length;i++)
			System.out.println(num[i]);
		
		//Descending order of the value
		
		for (int i =0; i<num.length; i++) {
				for(int j=i+1; j<num.length;j++) {
					if (num[i]<num[j]) {
						int temp = num[i];
						num[i] = num[j];
						num[j] = temp;
					}
				}
		}
		
		System.out.println("Number After sorting in Descending order:");
			for(int i =0; i<num.length;i++)
				System.out.println(num[i]);

	}

}
