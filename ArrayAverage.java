// Compute the average value of an array of integers except the largest and smallest values.

package com.exam.bll;

import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		
		System.out.println("Enter" + num.length +" Numbers:");
		for(int i =0; i<num.length;i++) {
			num[i] =sc.nextInt();
			
		}
		
		int flag =0;
		
		for(int i=0; i<num.length;i++) {
			
				for(int j=i+1;j<num.length;j++) {
					
					if(num[i]>num[j]) {
						//Swapping
						
						flag = num[i];
						num[i] =num[j];
						num[j] =flag;
					}
				}
		}
		
		int sum =0;
		double average=0;
		for(int i=0; i<num.length;i++) {
			
			//Traversing the array from start to end
			
			sum = sum + num[i];
		}
		/* computing average by removal of 1st and last element of the arraayas we have alreadysorted the array
		 */
		 
		average=(double)((sum-num[0])-num[num.length-1])/(num.length-2);
		System.out.println("Average except the largest and smallest values:"+average);
		sc.close();

	}

}
