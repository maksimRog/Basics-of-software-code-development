package линейныеПрограммы;

import static java.lang.Math.*;

import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {

		System.out.println(countTask1(5, 3, 5));
		System.out.println(countTask4(333.222));
		System.out.println(countTask5(500));
		System.out.println(countTask6(5, -2));
	}

	// 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
	public static float countTask1(float a, float b, float c) {
		return ((a - 3) * b / 2) + c;
	}
	// 2. Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения):

	public static double countTask2(float a, float b, float c) {
		return ((b + sqrt(b * b + 4 * a * c)) / (2 * a)) - pow(a, 3) * c + pow(b, -2);
	}
	// 3. Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения):

	public static double countTask3(float x, float y) {

		return (sin(x) + cos(y)) / (cos(x) - sin(y)) + tan(x * y);
	}

	// 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в
	// дробной и целой частях). Поменять местами
	// дробную и целую части числа и вывести полученное значение числа
	public static String countTask4(double x) {
		String s = Double.toString(x);
		String s1 = s.substring(4);

		String s2 = s.substring(0, 3);
		return s1 + "." + s2;
	}

	/*
	 * 5. Дано натуральное число Т, которое представляет длительность прошедшего
	 * времени в секундах. Вывести данное значение длительности в часах, минутах
	 * и секундах в следующей форме: ННч ММмин SSc.
	 */
	public static String countTask5(int x) {

		String date = x / 3600 + "ч " + x / 60 + "мин " + x + "с";
		return date;
	}

	/*
	 * 6. Для данной области составить линейную программу, которая печатает
	 * true, если точка с координатами (х, у) принадлежит закрашенной области, и
	 * false — в противном случае:
	 */
	public static Boolean countTask6(int x, int y) {

		if (-4 <= x && x <= 4 && y <= 0 && y >= -3) {
			return true;
		} else if (-2 <= x && x <= 2 && y >= 0 && y <= 4) {
			return true;
		} else {
			return false;
		}

	}
}
