package com.mahesh.unit2;

import java.util.Arrays;

public class MergeSort {

	private static void merge(int[] inputArray, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] la = new int[n1];
		int[] ra = new int[n2];

		for (int i = 0; i < n1; i++) {
			la[i] = inputArray[p + i];
		}

		for (int j = 0; j < n2; j++) {
			ra[j] = inputArray[q + 1 + j];
		}
		int i = 0;
		int j = 0;
		int k = p;
		while (i < n1 && j < n2) {
			if (la[i] <= ra[j]) {
				inputArray[k] = la[i];
				i++;
			} else {
				inputArray[k] = ra[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			inputArray[k] = la[i];
			i++;
			k++;
		}
		while (j < n2) {
			inputArray[k] = ra[j];
			k++;
			j++;
		}
	}

	private static void mergeSort(int[] inputArray, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;
			mergeSort(inputArray, p, q);
			mergeSort(inputArray, q + 1, r);
			merge(inputArray, p, q, r);
		}		
	}

	public static void main(String[] args) {
		int[] inputArray = new int[] {3,1,4,2};
		mergeSort(inputArray, 0, inputArray.length - 1);
		Arrays.stream(inputArray).forEach(item -> {
			System.out.print(item);
			System.out.print("\t");
		});
	}
}
