package com.qa.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		ListMath calc = new ListMath();

		List<Integer> numbers = new ArrayList<Integer>();

		for (int i = 1; i < 11; i++) {
			numbers.add(i);
		}

		calc.maxValue(numbers);

		calc.minValue(numbers);

//		numbers.add(29);

//		calc.oddOnly(numbers);

//		calc.evenOnly(numbers);

		calc.sum(numbers);

		calc.dumb(numbers);

		double doubles1 = numbers.stream().reduce((num1, num2) -> Math.max(num1, num2)).get();
		System.out.println(doubles1);

		double doubles2 = numbers.stream().reduce((num1, num2) -> Math.min(num1, num2)).get();
		System.out.println(doubles2);

		List<Integer> oddNums = numbers.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
		System.out.println(oddNums);

		List<Integer> evenNums = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNums);

		int sum = numbers.stream().reduce((num1, num2) -> num1 + num2).get();
		System.out.println(sum);

		double dumb = numbers.stream().map(num -> Math.pow(num, 2)).filter(num -> num % 2 == 0)
				.reduce((num1, num2) -> Math.min(num1, num2)).get();
		System.out.println(dumb);
	}

}
