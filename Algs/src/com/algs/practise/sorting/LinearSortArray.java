package com.algs.practise.sorting;

import java.util.Random;

public class LinearSortArray {

	
	public static void main(String[] args) {
		
		int[] unsorted = new int[10];
	
		
		//Randomly generating input numbers
		Random myRandom = new Random();
		myRandom.setSeed(System.currentTimeMillis());
		for(int l=0;l<unsorted.length;l++){
			unsorted[l]=myRandom.nextInt(100);
		}
		
		
		System.out.println("Unsorted array");
		for(int i=0;i<unsorted.length;i++){
			System.out.print(unsorted[i]);
			System.out.print(" ");
		}
		
		//Sorting logic
		for(int j=1;j<unsorted.length;j++) {
			for(int k=0;k<j;k++){
				if(unsorted[j]<unsorted[k]){
					int temp=unsorted[k];
					unsorted[k]=unsorted[j];
					unsorted[j]=temp;
				}											
			}	
		}	
		
		System.out.println();
		System.out.println("Sorted array");
		
		for(int i=0;i<unsorted.length;i++){
			System.out.print(unsorted[i]);
			System.out.print(" ");
		}	
		
		
		
		
		
		
	}
	
}
