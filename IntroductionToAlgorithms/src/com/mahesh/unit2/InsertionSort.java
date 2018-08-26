package com.mahesh.unit2;

import java.util.Arrays;

public class InsertionSort {

	private static void sort(int[] inputArray) {
		for (int j = 1; j < inputArray.length; j++) {
			int key = inputArray[j];
			int i = j - 1;
			while (i > -1 && inputArray[i] > key) {
				inputArray[i + 1] = inputArray[i];
				i = i - 1;
			}
			inputArray[i + 1] = key;
		}
		Arrays.stream(inputArray).forEach(item -> {
			System.out.print(item);
			System.out.print("\t");
		});
	}

	public static void main(String[] args) {
		int[] inputArray = new int[] { 5, 2, 4, 6, 1, 3 };
		sort(inputArray);
	}
}
