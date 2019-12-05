package com.qa.app;

import java.util.ArrayList;
import java.util.List;

public class ListMath {
	public void maxValue(List<Integer> numbers) {
		int max1 = 0;
		int max = 0;

		for (int i : numbers) {

			max = Math.max(i, max1);
			max1 = max;

		}
		System.out.println(max);

	}

	public void minValue(List<Integer> numbers) {
		int min1 = numbers.get(1);
		int min = 0;

		for (int i : numbers) {

			min = Math.min(i, min1);
			min1 = min;

		}
		System.out.println(min);

	}

//	public void oddOnly(List<Integer> numbers) {
//		for (int i = 0; i < numbers.size(); i++) {
//			int num1 = numbers.get(i);
//			if (num1 % 2 == 0) {
//				numbers.remove(i);
//			}
//		}
//		System.out.println(numbers);
//	}

	public void oddOnly(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				numbers.remove(i);
			}
		}
		System.out.println(numbers);
	}

	public void evenOnly(List<Integer> numbers) {
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 1) {
				numbers.remove(i);
			}
		}
		System.out.println(numbers);
	}

	public void sum(List<Integer> numbers) {
		int total = 0;
		for (int i : numbers) {
			total += i;
		}

		System.out.println(total);
	}

	public void dumb(List<Integer> numbers) {
		List<Integer> newNum = new ArrayList<Integer>();
		for (int i = 0; i < numbers.size(); i++) {

			int num1 = (int) Math.pow(numbers.get(i), 2);

			newNum.add(num1);

		}
		for (int k = 0; k < newNum.size(); k++) {
			if (newNum.get(k) % 2 == 1) {
				newNum.remove(k);
			}
		}
		int min1 = newNum.get(1);
		int min = 0;

		for (int j : newNum) {

			min = Math.min(j, min1);
			min1 = min;

		}
		System.out.println(newNum);
		System.out.println(min1);

	}

}
