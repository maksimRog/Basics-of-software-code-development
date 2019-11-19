package ветвления;

public class Main {

	public static void main(String[] args) {
		countTask1(190, 60);
		countTask4(555, 60, 900);

	}

	/*
	 * 1. Даны два угла треугольника (в градусах). Определить, существует ли
	 * такой треугольник, и если да, то будет ли он прямоугольным.
	 */

	public static void countTask1(int x, int y) {
		if (180 - x - y > 0) {
			System.out.print("Треуголник существует");
			if (180 - x - y == 90) {
				System.out.println("Треуголник прямоуголный");
			}
		} else {
			System.out.println("Треуголник не существует");
		}
	}

	// 2. Найти max{min(a, b), min(c, d)}.

	public static int countTask2(int a, int b, int c, int d) {
		return Math.max(Math.min(a, b), Math.min(c, d));
	}
	// 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
	// расположены на одной прямой.

	public static Boolean countTask3(int x1, int y1, int x2, int y2, int x3, int y3) {
		if ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0) {
			return true;
		} else
			return false;
	}
	/*
	 * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z
	 * кирпича. Определить, пройдет ли кирпич через отверстие.
	 */

	public static void countTask4(int x, int y, int z) {
		int a = 250;
		int b = 300;
		if (x < a && y < b || x < a && z < b || y < a && z < b || y < a && x < b || z < a && x < b || z < a && y < b) {
			System.out.println("кирпич пройдет");

		} else {
			System.out.println("кирпич не пройдет");

		}
	}

	// 5. Вычислить значение функции:
	public static double countTask5(double x) {
		if (x <= 3) {
			return x * x - 3 * x + 9;
		} else {
			return 1 / (Math.pow(x, 3) + 6);
		}

	}
}
