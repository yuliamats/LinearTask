package by.htp.les03.main;

import static java.lang.Math.*;

import java.util.Random;
import java.util.Scanner;

public class LoopTask {

	// Необходимо вывести на экран числа от 1 до 5.

	public static void task01() {

		for (int i = 1; i < 6; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

	// Необходимо вывести на экран числа от 5 до 1.

	public static void task02() {

		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// Необходимо вывести на экран таблицу умножения на 3:

	public static void task03() {

		for (int i = 1; i < 10; i++) {
			System.out.println("3 * " + i + " = " + 3 * i);
		}

		System.out.println();
	}

	// С помощью оператора while напишите программу вывода всех четных чисел в
	// диапазоне от 2 до 100 включительно.

	public static void task04() {

		int n;
		n = 2;

		while (n <= 100) {
			System.out.print(n + "  ");
			if (n % 10 == 0) {
				System.out.println();
			}
			n += 2;
		}

		System.out.println();
	}

	// С помощью оператора while напишите программу определения суммы всех нечетных
	// чисел в диапазоне от 1 до 99 включительно.

	public static void task05() {

		int n;
		int sum;

		n = 1;
		sum = 0;

		while (n < 10) {
			sum += n;
			n += 2;
		}

		System.out.println(sum);
		System.out.println();

	}

	// Напишите программу, где пользователь вводит любое целое положительное число.
	// А программа суммирует все числа от 1 до введенного пользователем числа.

	public static void task06() {

		Scanner k = new Scanner(System.in);
		System.out.println("введите любое целое положительное число: ");

		int n = k.nextInt();
		int sum;

		sum = 0;

		for (int i = 1; i < n; i++) {
			sum += i;
		}

		System.out.println(sum);
		System.out.println();
	}

	// Вычислить значение функции на отрезке [a,b] с шагом h

	public static void task07() {

		int a;
		int b;
		int h;
		int x;

		int y;

		a = 4;
		b = 10;
		h = 2;

		x = a;

		if (x > 2) {
			while (x <= b) {
				y = x;
				System.out.println("x равно " + x + " y равно " + y);
				x += h;
			}
		}

		if (x <= 2) {
			while (x <= b) {
				y = -x;
				System.out.println("x равно " + x + " y равно " + y);
				x += h;
			}
		}

		System.out.println();
	}

	// Вычислить значение функции на отрезке [a,b] с шагом h

	public static void task08() {

		int a;
		int b;
		int c;

		int h;
		int x;

		int y;

		a = 4;
		b = 10;
		c = 1;
		h = 2;

		x = a;

		if (x == 15) {
			while (x <= b) {
				y = (x + c) * 2;
				System.out.println("x равно " + x + " y равно " + y);
				x += h;
			}
		}

		if (x != 2) {
			while (x <= b) {
				y = (x - c) + 6;
				System.out.println("x равно " + x + " y равно " + y);
				x += h;
			}
		}

		System.out.println();
	}

	// Найти сумму квадратов первых ста чисел

	public static void task09() {

		double n;
		double sum;

		double temp;

		n = 1;
		sum = 0;

		for (int i = 1; i <= 200; i++) {
			temp = Math.pow(n, 2);
			sum += temp;
			n += 1;
		}

		System.out.println(sum);
		System.out.println();
	}

	// Составить программу нахождения произведения квадратов первых двухсот чисел

	public static void task10() {

		double n;
		long mult;

		double temp;

		n = 1;
		mult = 1;

		for (int i = 1; i <= 200; i++) {
			temp = Math.pow(n, 2);
			mult *= temp;
			n += 1;
		}

		System.out.println(mult);
		System.out.println();
	}

	// Составить программу нахождения разности кубов первых двухсот чисел

	public static void task11() {

		double n;
		double div;

		double temp;

		n = 1;
		div = Math.pow(n, 3);

		for (int i = 1; i <= 3; i++) {
			temp = Math.pow(n, 3);
			div -= temp;
			n += 1;
		}

		System.out.println(div);
		System.out.println();
	}

	// Последовательность ап строится так: а1 = 1, an =6+ ап-1 , для каждого n >1
	// Составьте программу нахождения произведения первых 10 членов этой
	// последовательности.

	public static void task12() {

		int a;

		int mult;

		int temp;

		a = 1;
		mult = 1;

		for (int i = 1; i < 3; i++) {
			temp = 6 + (a - 1);
			mult *= temp;
			a = temp;
		}

		System.out.println(mult);
		System.out.println();
	}

	// Составить таблицу значений функции у = 5 - x2/2 на отрезке [-5; 5]
	// с шагом 0.5.

	public static void task13() {

		double a;
		double b;
		double h;
		double x;

		double y;

		a = -5;
		b = 5;
		h = 0.5;

		x = a;

		while (x <= b) {
			y = 5 - x * x / 2;
			System.out.println("x равно " + x + " y равно " + y);
			x += h;
		}

		System.out.println();
	}

	// Дано натуральное п. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/п.

	public static void task14() {

		double n;
		double sum;

		double temp;

		n = 3;
		sum = 1;

		for (int i = 2; i <= n; i++) {
			temp = (double) 1 / i;
			sum += temp;
		}
		temp = (int) round(sum * 100);
		sum = (double) temp / 100;

		System.out.println(sum);
		System.out.println();
	}

	// Вычислить : 1+2+4+8+...+ 2 в 10 степени.

	public static void task15() {

		double n;
		double sum;

		double temp;

		n = 2;
		sum = 1;

		for (int i = 1; i <= 4; i++) {
			temp = Math.pow(n, i);
			sum += temp;
		}

		System.out.println(sum);
		System.out.println();
	}

	// Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

	public static void task16() {

		long mult;
		int sum;

		sum = 1;
		mult = 1;

		for (int i = 2; i <= 10; i++) {
			sum += i;
			mult *= sum;
		}

		System.out.println(mult);
		System.out.println();
	}

	// Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

	public static void task17() {

		double a;
		int n;

		double temp;
		double mult;

		a = 2.5;
		n = 3;
		mult = a;

		for (int i = 1; i < n; i++) {
			temp = a + i;
			mult *= temp;
		}

		System.out.println(mult);
		System.out.println();
	}

	// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
	// которых больше или равен заданному е. Общий член ряда имеет вид:

	public static void task18() {

		double a;
		double e;
		int n;

		double sum;

		e = 0.334;
		n = 4;
		sum = 0;

		for (int i = 1; i < n; i++) {
			a = Math.abs(Math.pow(-1, i - 1) / i);
			if (a >= e) {
				sum += a;
			}

		}
		System.out.println(sum);
		System.out.println();
	}

	// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
	// которых больше или равен заданному е. Общий член ряда имеет вид:

	public static void task19() {

		double a;
		double e;
		int n;

		double sum;

		double temp;

		e = 0.5;
		n = 4;
		sum = 0;

		for (int i = 1; i < n; i++) {
			a = Math.abs(1 / Math.pow(2, i) + 1 / Math.pow(3, i));
			if (a >= e) {
				sum += a;
			}
		}

		temp = (int) round(sum * 100);
		sum = (double) temp / 100;

		System.out.println(sum);
		System.out.println();
	}

	// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль
	// которых больше или равен заданному е. Общий член ряда имеет вид:

	public static void task20() {

		double a;
		double e;
		int n;

		double sum;

		double temp;

		e = 0.24;
		n = 4;
		sum = 0;

		for (int i = 1; i < n; i++) {
			a = Math.abs(1 / (double) ((3 * i - 2) * (3 * i + 1)));
			if (a >= e) {
				sum += a;
			}
		}
		System.out.println(sum);
		System.out.println();
	}

	// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
	// шагом h. Результат представить в виде таблицы, первый столбец которой -
	// значения аргумента, второй - соответствующие значения функции:
	// F(x) = x - sin(x)

	public static void task21() {

		int a;
		int b;
		int h;
		double x;

		double y;

		double temp;

		a = 4;
		b = 10;
		h = 2;

		x = a;

		while (x <= b) {
			y = x - Math.sin(x);
			temp = (int) round(y * 100);
			y = (double) temp / 100;
			System.out.println("x = " + x + " y = " + y);
			x += h;
		}

		System.out.println();
	}

	// оставить программу для вычисления значений функции F(x) на отрезке [а, b] с
	// шагом h. Результат представить в виде таблицы, первый столбец которой -
	// значения аргумента, второй - соответствующие значения функции:
	// F (x) = sin2(x)

	public static void task22() {

		double a;
		int b;
		int h;
		double x;

		double y;

		double temp;

		a = 4;
		b = 10;
		h = 2;

		x = a;

		while (x <= b) {
			y = Math.pow((Math.sin(x)), 2);
			temp = (int) round(y * 100);
			y = (double) temp / 100;
			System.out.println("x = " + x + " y = " + y);
			x += h;
		}

		System.out.println();
	}

	// Составить программу для вычисления значений функции F(x) на отрезке [а, b] с
	// шагом h. Результат представить в виде таблицы, первый столбец которой -
	// значения аргумента, второй - соответствующие значения функции:
	// F(x) — ctg (x/3) +1/2 sin(x)

	public static void task23() {

		double a;
		int b;
		int h;
		double x;

		double y;

		double temp;

		a = 4;
		b = 10;
		h = 2;

		x = a;

		while (x <= b) {
			y = 1 / Math.tan(x / 3) + 1 / 2 * Math.sin(x);
			temp = (int) round(y * 100);
			y = (double) temp / 100;
			System.out.println("x = " + x + " y = " + y);
			x += h;
		}

		System.out.println();
	}

	// Вводится натуральное число. Найти сумму четных цифр, входящих в его состав.
	// Преобразовать его в другое число, цифры которого будут следовать в обратном
	// порядке по сравнению с введенным числом

	public static void task24() {

		int x;
		int y;

		int temp;
		int sum;

		x = readFromConsole("введите натуральное число");
		y = 0;
		sum = 0;

		while (x > 0) {
			temp = x % 10;
			y = y * 10 + temp;
			if (temp % 2 == 0) {
				sum += temp;
			}
			x /= 10;
		}
		System.out.println(sum);
		System.out.println(y);
		System.out.println();
	}

	// Требуется определить факториал числа, которое ввел пользователь.

	public static void task25() {

		int n;

		int result;

		n = readFromConsole("введите натуральное число");
		result = 1;

		for (int i = 1; i <= n; i++) {
			result = result * i;
		}

		System.out.println(result);
		System.out.println();

	}

	// Вывести на экран соответствий между символами и их численными обозначениями в
	// памяти компьютера (Таблицу ASCII).

	public static void task26() {

		int i;
		char ch;

		for (i = 32; i <= 127; i++) {
			ch = (char) i;
			System.out.print(i + ":" + ch + "    ");
			if (i % 10 == 0) {
				System.out.println();
			}

		}
		System.out.println();
	}
	// Для каждого натурального числа в промежутке от m до n вывести все делители,
	// кроме единицы и самого числа. m и n вводятся с клавиатуры.

	public static void task27() {

		int m;
		int n;

		m = readFromConsole("введите число m");
		n = readFromConsole("введите число n");

		for (int i = m; i <= n; i++) {
			System.out.print("Делители числа " + i + ": ");
			for (int j = 2; j < n; j++) {
				if (i % j == 0 && i != j) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}

	}

	// Написать программу, в которой вводятся два операнда Х и Y и знак операции (+,
	// -, /, *). Вычислить результат Z в зависимости от знака. Предусмотреть реакции
	// на возможный неверный знак операции, а также на ввод Y=0 при делении.
	// Организовать возможность многократных вычислений без перезагрузки программа
	// (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.

	public static void task28() {

		int x;
		int y;
		char sign;

		boolean calc = true;

		int z;

		while (calc) {
			x = readFromConsole("введите число x");
			y = readFromConsole("введите число y");
			sign = readCharFromConsole("введите знак операции");

			switch (sign) {
			case '+':
				z = x + y;
				System.out.println(z);
				break;
			case '-':
				z = x - y;
				System.out.println(z);
				break;
			case '*':
				z = x * y;
				System.out.println(z);
				break;
			case '/':
				if (y == 0) {
					System.out.println("На ноль делить нельзя!");
				} else {
					z = x / y;
					System.out.println(z);
				}
				break;
			case '0':
				System.out.println("Прекращение вычислений");
				calc = false;
				break;
			default:
				System.out.println("Введен неверный знак операции");
				break;
			}
		}

	}

	// Даны два числа. Определить цифры, входящие в запись как первого так и второго
	// числа.

	public static void task29() {

		int m;
		int n;

		int c1;
		int c2;

		m = readFromConsole("введите число m");
		n = readFromConsole("введите число n");

		c1 = countNum(m);
		c2 = countNum(n);

		int[] mas1 = new int[c1];
		int[] mas2 = new int[c2];

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = m % 10;
			m = m / 10;
		}

		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = n % 10;
			n = n / 10;
		}

		System.out.print("Цифры, входящие в запись обеих чисел: ");

		for (int i = 0; i < mas1.length; i++) {
			int a = mas1[i];
			for (int j = 0; j < mas2.length; j++) {
				if (a == mas2[j]) {
					System.out.print(a + " ");
					break;
				}
			}
			System.out.println();
		}

	}

	// Написать программу, переводящую римские цифры в арабские.

	public static void task30() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("введите римскую цифру :");

		String letter;
		letter = sc.nextLine();

		switch (letter) {
		case "M":
			System.out.println("1000");
			break;
		case "CМ":
			System.out.println("900");
			break;
		case "D":
			System.out.println("500");
			break;
		case "CD":
			System.out.println("400");
			break;
		case "C":
			System.out.println("100");
			break;
		case "XC":
			System.out.println("90");
			break;
		case "L":
			System.out.println("50");
			break;
		case "XL":
			System.out.println("40");
			break;
		case "X":
			System.out.println("10");
			break;
		case "IX":
			System.out.println("9");
			break;
		case "V":
			System.out.println("5");
			break;
		case "IV":
			System.out.println("4");
			break;
		case "I":
			System.out.println("1");
			break;
		default:
			System.out.println("введены некорректные данные");
		}

		System.out.println();
	}

	// Компьютер генерирует пять чисел в диапазоне от 1 до 15 включительно. Человек
	// пытается их угадать. Программа должна выводить угаданные и неугаданные числа
	// из тех, что сгенерировала программа, а также ошибочные числа пользователя.

	public static void task31() {

		int[] mas1 = new int[] { 5, 10, 2, 3, 4 };
		int[] mas2 = new int[5];

		initMas(mas2);

		printMas(mas1);
		printMas(mas2);

		System.out.println("Угаданные числа: ");

		for (int i = 0; i < mas1.length; i++) {
			int a = mas1[i];
			for (int j = 0; j < mas2.length; j++) {
				if (a == mas2[j]) {
					System.out.print(a + " ");
					break;
				}
			}
		}
		System.out.println("");
		System.out.println("Неугаданные числа: ");

		for (int i = 0; i < mas2.length; i++) {
			int a = mas2[i];
			for (int j = 0; j < mas1.length; j++) {
				if (a != mas1[j]) {
					if (j == mas1.length - 1) {
						System.out.print(a + " ");
					}
				} else {
					break;
				}
			}
		}

		System.out.println("");
		System.out.println("Ошибочно введенные числа: ");

		for (int i = 0; i < mas1.length; i++) {
			int a = mas1[i];
			for (int j = 0; j < mas2.length; j++) {
				if (a != mas2[j]) {
					if (j == mas2.length - 1) {
						System.out.print(a + " ");
					}
				} else {
					break;
				}
			}
		}
		System.out.println("");
	}

	// Проверить введенную пользователем строку на наличие недопустимых символов. В
	// качестве первого символа допустимы только буквы и знак подчеркивания.
	// Остальные символы могут быть буквами, цифрами и знаком подчеркивания.

	public static void task32() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("введите строку:");

		String str;
		str = sc.nextLine();

		char[] arr = str.toCharArray();

		char r = arr[0]; // первая буква
		if (Character.isLetter(r) || r == '_') {
			System.out.println("символ " + r + " корректен");
		} else {
			System.out.println("символ " + r + " некорректен");
		}

		for (int i = 1; i < arr.length; i++) {
			char ch = arr[i];
			if (Character.isDigit(ch) || Character.isLetter(ch) || ch == '_') {
				System.out.println("символ " + ch + " корректен");
			} else {
				System.out.println("символ " + ch + " некорректен");
			}
		}

	}

	// Найдите наибольшую цифру данного натурального числа.

	public static void task33() {

		int m;

		int max;

		m = readFromConsole("введите натуральное число m");

		int[] mas1 = numInMas(m);

		max = mas1[0];

		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] > max) {
				max = mas1[i];
			}

		}
		System.out.println("наибольная цифра введенного числа равна " + max);
	}

	// Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15

	public static void task34() {

		int sum;
		int count;

		sum = 0;
		count = 0;

		for (int i = 1000; i < 10000; i++) {
			sum = sumOfFourNum(i);
			if (sum == 15) {
				count++;
				System.out.print(i + "    ");
				if (count % 10 == 0) {
					System.out.println();
				}
			}
		}

		System.out.println();
	}

	// Найдите количество четных цифр данного натурального числа.

	public static void task35() {

		int m;

		int count;

		count = 0;

		m = readFromConsole("введите натуральное число m");

		int[] mas1 = numInMas(m);

		for (int i = 0; i < mas1.length; i++) {
			if (mas1[i] % 2 == 0) {
				count++;
			}

		}
		System.out.println("количество четных цифр введенного числа: " + count);
		System.out.println("");
	}

	// Два двузначных числа, записанных одно за другим , образуют четырёхзначное
	// число, которое делится на их произведение. Найти эти числа.

	public static void task36() {

		int x;
		int y;

		int mult;

		mult = 1;

		for (int i = 1000; i < 10000; i++) {
			x = i / 100;
			y = i % 100;
			mult = x * y;
			if (mult != 0) {
				if (i % mult == 0) {
					System.out.print(i + "    ");
				}
			}
		}

		System.out.println();
	}

	

	public static int readFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int x;

		System.out.print(message + " : ");
		while (scanner.hasNextInt() == false) {
			String str = scanner.next();
			System.out.print("вы ввели " + str);
			System.out.print(message + " : ");
		}
		x = scanner.nextInt();
		return x;

	}

	public static char readCharFromConsole(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		char letter;

		System.out.print(message + " : ");
		String str = scanner.next();
		letter = str.charAt(0);
		return letter;
	}

	public static int countNum(int m) {

		int count;

		count = 0;

		while (m > 0) {
			m = m / 10;
			count++;
		}
		return count;
	}

	public static void initMas(int[] mas) {

		Random rand = new Random();

		for (int i = 0; i < mas.length; i++) {
			mas[i] = rand.nextInt(15);
		}

	}

	public static void printMas(int[] mas) {

		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			System.out.printf("%2d ", mas[i]);
			;
		}
		System.out.println();
	}

	public static int[] numInMas(int m) {

		int c1;

		c1 = countNum(m);

		int[] mas1 = new int[c1];

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = m % 10;
			m = m / 10;
		}

		return mas1;
	}

	public static int sumOfFourNum(int num1) {

		int sum;

		int temp1;
		int temp2;
		int temp3;
		int temp4;

		temp1 = num1 % 10;
		temp2 = (num1 / 10) % 10;
		temp3 = (num1 / 100) % 10;
		temp4 = num1 / 1000;

		sum = temp1 + temp2 + temp3 + temp4;

		return sum;
	}

}
