package com.name.non.repeated.CountNonRepeatedWords;

public class CountNonrepeated {

	public static void main(String[] args) {
		int[] a = { 1, 1, 3, 2, 1 };
		a = sortList(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("....unique list...");
		int[] uniqueList = extractNonrepeatedElements(a);
		for (int i = 0; i < uniqueList.length; i++) {
			System.out.print(uniqueList[i] + " ");
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i < uniqueList.length; i++) {
			sum += uniqueList[i];

		}
		System.out.println("sum of unique element " + sum);

	}

	public static int[] sortList(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	public static int[] extractNonrepeatedElements(int[] a) {
		if (a == null || a.length == 0)
			return a;
		int j = 1;
		// add ist element in another array
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1]) {
				j++;
			}
		}
		int[] uniqueList = new int[j];
		uniqueList[0] = a[0];
		j = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i - 1]) {
				uniqueList[j++] = a[i];
			}
		}
		return uniqueList;
	}

}
