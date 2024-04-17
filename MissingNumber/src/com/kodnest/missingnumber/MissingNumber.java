package com.kodnest.missingnumber;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a = {1,2,4,5,7,6};
		int missingNumber = findMissingNumber(a);
		System.out.println(missingNumber);
	}

	public static int findMissingNumber(int[] a) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1; i<=a.length+1; i++) {
			sum1 = sum1 + i;
		}
		for(int i=0; i<a.length; i++) {
			sum2 = sum2 + a[i];
		}
		return sum1-sum2;
	}
}