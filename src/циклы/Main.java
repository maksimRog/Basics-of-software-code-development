package циклы;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

	}

	/*
	 * 1. Напишите программу, где пользователь вводит любое целое положительное
	 * число. А программа суммирует все числа от 1 до введенного пользователем
	 * числа.
	 */

	public static void task1() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {

			int i = scanner.nextInt();
			int result = 0;
			for (int y = 1; y <= i; y++) {
				result = result + y;
			}
			System.out.print(result);

		}

		scanner.close();
	}

	// 2. Вычислить значения функции на отрезке [а,b] c шагом h:

	public static void task2() {
		int y = 0;
		for (int x = 2; x <= 30; x = x + 2) {
			if (x > 2) {
				y = x;
			} else {
				y = -x;
			}
			System.out.print(y + " ");

		}
	}

	// 3. Найти сумму квадратов первых ста чисел.
	public static void task3() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i * i;
		}
		System.out.println(sum);
	}

	// 4. Составить программу нахождения произведения квадратов первых двухсот
	// чисел.

	public static void task4() {
		double sum = 1;
		for (int i = 2; i <= 200; i++) {
			sum = sum * Math.pow(i, 2);
		}
		System.out.println(sum);
	}

	/*
	 * 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда,
	 * модуль которых больше или равен заданному е. Общий член ряда имеет вид:
	 */

	public static void task5(int n, double e) {
		for (int i = 0; i <= n; i++) {
			double a = 1 / Math.pow(2, n) + 1 / Math.pow(2, n);
			if (Math.abs(a) >= e) {
				System.out.println(a);
			}
		}
	}

	// 6. Вывести на экран соответствий между символами и их численными
	// обозначениями в памяти компьютера.

	public static void task6() {
		for (int i = 0; i <= 256; i++) {
			char b = (char) (i + '0');
			System.out.print(i + " ");
			System.out.println(b);
		}
	}

	/*
	 * 7. Для каждого натурального числа в промежутке от m до n вывести все
	 * делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
	 */
	public static void task7() {
		int a = 40;
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			for (int i = m; i <= n; i++) {
				if (a % i == 0) {
					System.out.println("Делитель:" + i);
				}
			}
		}

		sc.close();
	}

	// 8. Даны два числа. Определить цифры, входящие в запись как первого так и
	// второго числа.
	
	public static void task8() {
		System.out.println("write a number or char");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			char[] m = sc.next().toCharArray();
			char[] n = sc.next().toCharArray();
			Set<Character> sd = new HashSet<>();
			for (char c : m) {
				for (char d : n) {
					if (c == d) {
						sd.add(c);
					}
				}

			}
			System.out.println(sd);

		}

		sc.close();
	}
}
