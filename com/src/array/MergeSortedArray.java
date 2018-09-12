package com.src.array;

public class MergeSortedArray {
	
	
	public static int[] mergeArray(int[] arr1, int[] arr2, int[] arr3, int n1, int n2){
		
		int i=0, j=0, k =0;
		
		while(i < n1 && j < n2){
			if(arr1[i] > arr2[j])
				arr3[k++] = arr2[j++];
			else
				arr3[k++] = arr1[i++];
		}
		
		while(i < n1){
			arr3[k++] = arr1[i++];
		}
		
		while(j < n2){
			arr3[k++] = arr1[j++];
		}
	
		return arr3;
	}
	
	public static void main(String args[]){
		
		int[] arr1 = {1,3,5,5,9};
		int[] arr2 = {2,4,6,7,7,7,8};
		
		int[] arr3 = mergeArray(arr1, arr2, new int[arr1.length + arr2.length], arr1.length, arr2.length);
		for (int i=0; i < arr3.length; i++)
            System.out.print(arr3[i] + " ");
	}

}
