package by.htp.les02.main;

import static java.lang.Math.*;
import java.util.Scanner;

public class ConditionalTask {

	// Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 - вывести на
	// экран цифру 7, в противном случае - цифру 8.

	public static void task01() {

		int a;
		int b;

		a = 12;
		b = 13;

		if (a < b) {
			System.out.println(7);
		} else {
			System.out.println(8);
		}

		System.out.println();
	}

	// Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 - вывести на
	// экран слово «yes», в противном случае - слово «no»

	public static void task02() {

		int a;
		int b;

		a = 12;
		b = 13;

		if (a < b) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		System.out.println();
	}

	// Составить программу сравнения введенного числа а и цифры 3. Вывести на экран
	// слово «yes», если число а меньше 3; если больше, то вывести слово «no».

	public static void task03() {

		int a;

		a = 12;

		if (a < 3) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

		System.out.println();
	}

	// Составить программу: равны ли два числа а и b?

	public static void task04() {

		int a;
		int b;

		a = 12;
		b = 13;

		if (a == b) {
			System.out.println("число" + a + " равно числу " + b);
		} else {
			System.out.println("числа " + a + " и " + b + " не равны");
		}

		System.out.println();
	}

	// Составить программу: определения наименьшего из двух чисел а и b.

	public static void task05() {

		int a;
		int b;

		a = 12;
		b = 13;

		if (a < b) {
			System.out.println("наименьшее число " + a);
		} else {
			System.out.println("наименьшее число " + b);
		}

		System.out.println();
	}

	// Составить программу: определения наибольшего из двух чисел а и b

	public static void task06() {

		int a;
		int b;

		a = 12;
		b = 13;

		if (a > b) {
			System.out.println("наибольшее число " + a);
		} else {
			System.out.println("наибольшее число " + b);
		}

		System.out.println();
	}

	// Составить программу нахождения модуля выражения a*x*x + Ь*х + с при заданных
	// значениях a, Ь, с и х

	public static void task07() {

		int a;
		int b;
		int c;
		int x;

		int y;

		a = 1;
		b = 1;
		c = -3;
		x = 1;

		y = a * x * x + b * x + c;

		if (y < 0) {
			y = abs(y);
		}

		System.out.println(y);
		System.out.println();
	}

	// Составить программу нахождения наименьшего из квадратов двух чисел а и b.

	public static void task08() {

		int a;
		int b;

		a = 4;
		b = 5;

		if (a * a < b * b) {
			System.out.println("наименьший квадрат из двух чисел равен " + a * a);
		} else {
			System.out.println("наименьший квадрат из двух чисел равен " + b * b);
		}

		System.out.println();
	}

	// Составить программу, которая определит по трем введенным сторонам, является
	// ли данный треугольник равносторонним.

	public static void task09() {

		int a;
		int b;
		int c;

		a = 4;
		b = 4;
		c = 4;

		if (a == b && a == c) {
			System.out.println("треугольник является равностронним");
		} else {
			System.out.println("треугольник не является равносторонним");
		}

		System.out.println();
	}

	// Составить программу, которая определит площадь какого круга меньше.

	public static void task10() {

		int s1; // площадь круга №1
		int s2; // площадь круга №2

		s1 = 4;
		s2 = 5;

		if (s1 < s2) {
			System.out.println("площадь круга №1 меньше");
		} else {
			System.out.println("площадь круга №2 меньше");
		}

		System.out.println();
	}

	// Составить программу, которая определит площадь какого треугольника больше.

	public static void task11() {

		int s1; // площадь треугольника №1
		int s2; // площадь треугольника №2

		s1 = 4;
		s2 = 5;

		if (s1 < s2) {
			System.out.println("площадь треугольника №1 меньше");
		} else {
			System.out.println("площадь треугольника №2 меньше");
		}

		System.out.println();
	}

	// Даны три действительных числа. Возвести в квадрат те из них, значения которых
	// неотрицательны, и в четвертую степень — отрицательные.

	public static void task12() {

		double a;
		double b;
		double c;

		a = 4;
		b = 5;
		c = -2;

		if (a > 0) {
			a *= a;
			System.out.println("число в квадрате равно " + a);
		} else {
			a = pow(a, 4);
			System.out.println("число в 4-ой степени равно " + a);
		}

		if (b > 0) {
			b *= b;
			System.out.println("число в квадрате равно " + b);
		} else {
			b = pow(b, 4);
			System.out.println("число в 4-ой степени равно " + b);
		}

		if (c > 0) {
			c *= c;
			System.out.println("число в квадрате равно " + c);
		} else {
			c = pow(c, 4);
			System.out.println("число в 4-ой степени равно " + c);
		}
		System.out.println();
	}

	// Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
	// которая из точек находится ближе к началу координат.

	public static void task13() {

		// координаты точки 1
		double x1;
		double y1;

		// координаты точки 2
		double x2;
		double y2;

		double d1;
		double d2;

		x1 = -2;
		y1 = 1;

		x2 = 3;
		y2 = 3;

		d1 = sqrt(pow(y1, 2) + pow(x1, 2));
		d2 = sqrt(pow(y2, 2) + pow(x2, 2));

		if (d1 < d2) {
			System.out.println("точка 1 ближе к центру координат");
		} else {
			System.out.println("точка 2 ближе к центру координат");
		}

	}

	// Даны два угла треугольника (в градусах). Определить, существует ли такой
	// треугольник, и если да, то будет ли он прямоугольным.

	public static void task14() {

		int x;
		int y;
		int z;

		x = 30;
		y = 90;

		z = 180 - x - y;

		if (z > 0 && (x == 90 || y == 90 || z == 90)) {
			System.out.println("треугольник с углами " + x + "," + y + "," + z + " существует.");
			System.out.println("Этот треугольник прямоугольный");
		} else if (z > 0) {
			System.out.println("треугольник с углами " + x + "," + y + "," + z + " существует");
		} else {
			System.out.println("треугольника с углами " + x + "," + y + "," + z + " не существует");
		}

		System.out.println();
	}

	// Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух
	// чисел заменить половиной их суммы, а большее — их удвоенным произведением.

	public static void task15() {

		int x;
		int y;

		int temp;

		x = 2;
		y = 4;

		System.out.println("начальные занчения x и y  равны " + x + " " + y);

		if (x != y && x < y) {
			temp = (x + y) / 2;
			y = x * y * 2;
			x = temp;
			System.out.println("конечные значения x и y  равны " + x + " " + y);
		} else {
			temp = (x + y) / 2;
			x = x * y * 2;
			y = temp;
			System.out.println("конечные значения x и y  равны " + x + " " + y);
		}

		System.out.println();
	}

	// На плоскости XOY задана своими координатами точка А. Указать, где она
	// расположена (на какой оси или в каком координатном угле).

	public static void task16() {

		// координаты точки
		int x;
		int y;

		x = 2;
		y = 4;

		if (x > 0 && y > 0) {
			System.out.println("точка находится в 1 координатном угле");
		} else if (x > 0 && y < 0) {
			System.out.println("точка находится во 2 координатном угле");
		} else if (x < 0 && y > 0) {
			System.out.println("точка находится в 3 координатном угле");
		} else {
			System.out.println("точка находится в 4 координатном угле");
		}

		System.out.println();
	}

	// Даны целые числа т, п. Если числа не равны, то заменить каждое из них одним и
	// тем же числом, равным большему из исходных, а если равны, то заменить числа
	// нулями

	public static void task17() {

		int m;
		int n;

		m = 4;
		n = 4;

		System.out.println("начальные занчения m и n  равны " + m + " " + n);

		if (m == n) {
			n = 0;
			m = 0;

		} else if (m > n) {
			n = m;

		} else {
			m = n;
		}

		System.out.println("конечные значения m и n  равны " + m + " " + n);
		System.out.println();
	}

	// Подсчитать количество отрицательных среди чисел а, b, с.

	public static void task18() {

		int a;
		int b;
		int c;

		a = 4;
		b = 4;
		c = -2;

		if (a < 0 && b < 0 && c < 0) {
			System.out.println("все числа отрицательные");

		} else if (a < 0 && b < 0 || a < 0 && c < 0 || b < 0 && c < 0) {
			System.out.println("среди трех заданных чисел есть два отрицательных числа");

		} else if (a < 0 || c < 0 || b < 0) {
			System.out.println("среди трех заданных чисел есть одно отрицательное число");

		} else {
			System.out.println("все числа положительные");
		}

		System.out.println();
	}

	// Подсчитать количество положительных среди чисел а, b, с.

	public static void task19() {

		int a;
		int b;
		int c;

		a = 4;
		b = 4;
		c = -2;

		if (a > 0 && b > 0 && c > 0) {
			System.out.println("все числа положительные");

		} else if (a > 0 && b > 0 || a > 0 && c > 0 || b > 0 && c > 0) {
			System.out.println("среди трех заданных чисел есть два положительных числа");

		} else if (a > 0 || c > 0 || b > 0) {
			System.out.println("среди трех заданных чисел есть одно положительное число");

		} else {
			System.out.println("все числа отрицательные");
		}

		System.out.println();
	}

	// Определить, делителем каких чисел а, b, с является число к.

	public static void task20() {

		int a;
		int b;
		int c;
		int k;

		a = 4;
		b = 4;
		c = -2;
		k = 3;

		if (a % k == 0 && b % k == 0 && c % k == 0) {
			System.out.println("k = " + k + " является делителем для всех чисел");

		} else if (a % k == 0 && b % k == 0 || a % k == 0 && c % k == 0 || b % k == 0 && c % k == 0) {
			System.out.println("k = " + k + " является делителем для двух чисел");

		} else if (a % k == 0 || b % k == 0 || c % k == 0) {
			System.out.println("k = " + k + " является делителем для одного числа");

		} else {
			System.out.println("k = " + k + " не является делителем ни для одного числа");
		}

		System.out.println();
	}

	// Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или
	// девочка? Введи Д или М». В зависимости от ответа на экране должен появиться
	// текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».

	public static void task21() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("введите букву Д или М :");

		String letter;
		letter = sc.nextLine();

		switch (letter) {
		case "Д":
			System.out.println("Мне нравятся мальчики!");
			break;
		case "М":
			System.out.println("Мне нравятся девочки!");
			break;
		default:
			System.out.println("введены некорректные данные");
		}

		System.out.println();
	}

	// Перераспределить значения переменных х и у так, чтобы в х оказалось большее
	// из этих значений, а в у - меньшее.

	public static void task22() {

		int x;
		int y;

		int temp;

		x = 4;
		y = 3;

		if (x < y) {
			temp = y;
			y = x;
			x = temp;
		}

		System.out.println(x + " " + y);
		System.out.println();
	}

	// Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
	// месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.

	public static void task23() {

		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.print("введите день и месяц: ");

		int day = k.nextInt();
		int month = k.nextInt();

		if (day < 1 || day > 31 || month < 1 || month > 12) {
			System.out.println("дата введена некорректно");
		} else {
			System.out.println("дата введена правильно");
		}

		System.out.println();
	}

	// Составить программу, определяющую результат гадания на ромашке — «любит—не
	// любит», взяв за исходное данное количество лепестков п.

	public static void task24() {

		int n = 10; // количество лепестков на ромашке
		int count = 0;

		for (int i = n; i == 1; i--) {
			n--;
			count++;
		}
		if (count % 2 == 0) {
			System.out.println("результат гадания: не любит");
		} else {
			System.out.println("результат гадания: любит");
		}

		System.out.println();
	}

	// Написать программу — модель анализа пожарного датчика в помещении, которая
	// выводит сообщение «Пожароопасная ситуация », если температура в комнате
	// превысила 60° С.

	public static void task25() {

		int t = 65; // температура в комнате

		if (t > 60) {
			System.out.println("пожароопасная ситуация");
		}
		System.out.println();
	}

	// Написать программу нахождения суммы большего и меньшего из трех чисел.

	public static void task26() {

		int a;
		int b;
		int c;

		int max;
		int min;

		int sum;

		a = 2;
		b = 3;
		c = 4;

		sum = 0;

		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else {
			min = c;
		}

		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}

		sum = min + max;

		System.out.println(sum);
		System.out.println();
	}

	// Найти max{min(a, b), min(c, d)}.

	public static void task27() {

		int a;
		int b;
		int c;
		int d;

		int max;

		int min1;
		int min2;

		a = 2;
		b = 3;
		c = 4;
		d = 5;

		if (a < b) {
			min1 = a;
		} else {
			min1 = b;
		}

		if (c < d) {
			min2 = c;
		} else {
			min2 = d;
		}

		max = Math.max(min1, min2);

		System.out.println(max);
		System.out.println();
	}

	// Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не
	// равно d, то найти max(d — a, d — b, d — c).

	public static void task28() {

		int a;
		int b;
		int c;
		int d;

		int max;

		int d1;
		int d2;
		int d3;

		a = 2;
		b = 3;
		c = 4;
		d = 5;

		if (a != d || b != d || c != d) {
			d1 = d - a;
			d2 = d - b;
			d3 = d - c;
			max = Math.max(d1, Math.max(d2, d3));
			System.out.println(max);
		} else if (a == d) {
			System.out.println("a = d = " + a);
		} else if (b == d) {
			System.out.println("a = b = " + b);
		} else {
			System.out.println("a = c = " + c);
		}

		System.out.println();
	}

	// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
	// расположены на одной прямой.

	public static void task29() {

		// координаты точки А
		int x1;
		int y1;

		// координаты точки B
		int x2;
		int y2;

		// координаты точки C
		int x3;
		int y3;

		x1 = 1;
		y1 = 1;

		x2 = 2;
		y2 = 2;

		x3 = 3;
		y3 = 3;

		if (Math.abs((x1 - x3) / (x2 - x1)) == Math.abs((y1 - y3) / (y2 - y3))) {
			System.out.println("точки А,B,С расположены на одной прямой");
		} else {
			System.out.println("точки А,B,С не расположены на одной прямой");
		}

		System.out.println();
	}

	// Даны действительные числа а,Ь,с. Удвоить эти числа, если а > b > с, и
	// заменить их абсолютными значениями, если это не так.

	public static void task30() {

		double a;
		double b;
		double c;

		a = 1.5;
		b = -2.5;
		c = 3.5;

		if (a > b && c < b) {
			a *= a;
			b *= b;
			c *= c;
		} else {
			a = Math.abs(a);
			b = Math.abs(b);
			c = Math.abs(c);
		}

		System.out.println(a + "," + b + "," + c);
		System.out.println();
	}

	// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
	// Определить, пройдет ли кирпич через отверстие.

	public static void task31() {

		// размеры отверстия ли*шир
		int a;
		int b;

		// размеры кирпича дл*шир*выс
		int x;
		int y;
		int z;

		a = 3;
		b = 6;

		x = 1;
		y = 8;
		z = 1;

		if (a < b) {
			if (z < a && x < b || y < b && z < a || x < a && y < b) {
				System.out.println("кирпич пролезет в отверстие");
			} else {
				System.out.println("кирпич не пролезет в отверстие");
			}
		} else {
			if (z < b && x < a || y < a && z < b || x < b && y < a) {
				System.out.println("кирпич пролезет в отверстие");
			} else {
				System.out.println("кирпич не пролезет в отверстие");
			}
		}

		System.out.println();
	}

	// Написать программу, которая по заданным трем числам определяет, является ли
	// сумма каких-либо двух из них положительной.

	public static void task32() {

		int a;
		int b;
		int c;

		a = 3;
		b = -2;
		c = -1;
		//
		if ((a + b > 0 && a + c > 0) || (a + b > 0 && b + c > 0)) {
			System.out.println("сумма двух чисел из трех является положительной");
		} else {
			System.out.println("сумма двух чисел из трех не является положительной");
		}

		System.out.println();
	}

	// Написать программу, которая по паролю будет определять уровень доступа
	// сотрудника к секретной информации в базе данных. Доступ к базе имеют только
	// шесть человек, разбитых на три группы по степени доступа. Они имеют следующие
	// пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
	// модули баз В, С; 9455, 8997 — доступен модуль базы С.

	public static void task33() {

		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.print("введите пароль: ");

		int password = k.nextInt();

		switch (password) {
		case 1747:
		case 9583:
			System.out.println("уровень доступа: доступны модули баз А,B,С");
			break;
		case 3331:
		case 7922:
			System.out.println("уровень доступа: доступны модули баз B,С");
			break;
		case 9455:
		case 8997:
			System.out.println("уровень доступа: доступны модули базы С");
			break;
		default:
			System.out.println("нет доступа к секретной информации");
		}

		System.out.println();
	}

	// Составить программу, реализующую эпизод применения компьютера в книжном
	// магазине. Компьютер запрашивает стоимость книг, сумму денег, внесенную
	// покупателем; если сдачи не требуется, печатает на экране «спасибо»; если
	// денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и
	// указывает сумму сдачи; если денег недостаточно, то печатает сообщение об этом
	// и указывает размер недостающей суммы.

	public static void task34() {

		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);

		System.out.print("введите стоимость книг: ");
		int bookValue = k.nextInt();

		System.out.print("введите внесенную сумму денег: ");
		int cashIn = k.nextInt();

		if (bookValue == cashIn) {
			System.out.println("Спасибо");
		} else if (bookValue < cashIn) {
			System.out.println("Возьмите сдачу: " + (cashIn - bookValue));
		} else {
			System.out.println("Денег недостаточно.Внесите: " + (bookValue - cashIn));
		}

		System.out.println();
	}

	// Вычислить число и месяц в невисокосном году по номеру дня.

	public static void task35() {

		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.print("введите номер дня в году: ");

		int t = k.nextInt();
		int m;
		int d;

		m = 0;
		d = 0;

		if (t > 0 && t < 366) {
			if (t > 0 && t <= 31) {
				m = 1;
			} else if (t > 31 && t <= 59) {
				m = 2;
			} else if (t > 59 && t <= 90) {
				m = 3;
			} else if (t > 90 && t <= 120) {
				m = 4;
			} else if (t > 120 && t <= 151) {
				m = 5;
			} else if (t > 151 && t <= 181) {
				m = 6;
			} else if (t > 181 && t <= 212) {
				m = 7;
			} else if (t > 212 && t <= 243) {
				m = 8;
			} else if (t > 243 && t <= 273) {
				m = 9;
			} else if (t > 273 && t <= 304) {
				m = 10;
			} else if (t > 304 && t <= 334) {
				m = 11;
			} else if (t > 334 && t <= 365) {
				m = 12;
			}
		} else {
			System.out.println("введены неверные данные");
		}

		switch (m) {
		case 1:
			d = t;
			break;
		case 2:
			d = t - 31;
			break;
		case 3:
			d = t - 59;
			break;
		case 4:
			d = t - 90;
			break;
		case 5:
			d = t - 120;
			break;
		case 6:
			d = t - 151;
			break;
		case 7:
			d = t - 181;
			break;
		case 8:
			d = t - 212;
			break;
		case 9:
			d = t - 243;
			break;
		case 10:
			d = t - 273;
			break;
		case 11:
			d = t - 304;
			break;
		case 12:
			d = t - 334;
			break;
		default:
		}

		if (m < 10) {
			System.out.print("месяц: 0" + m);
		} else {
			System.out.print("месяц: " + m);
		}
		System.out.println();

		if (d < 10) {
			System.out.print("день: 0" + d);
		} else {
			System.out.print("день: " + d);
		}
		System.out.println();

	}

	// 36. Вычислить значение функции:

	public static void task36() {

		double x;

		double y;

		x = 1;

		if (x <= 3) {
			y = Math.pow(x, 2) - 3 * x + 9;
		} else {
			y = 1 / (Math.pow(x, 3) + 6);
		}

		System.out.println("y= " + y);
	}

	// 37. Вычислить значение функции:

	public static void task37() {

		double x;

		double y;

		x = 3;

		if (x < 3) {
			y = 1 / (Math.pow(x, 3) - 6);
		} else {
			y = -Math.pow(x, 2) + 3 * x + 9;
		}

		System.out.println("y= " + y);
	}

	// 38. Вычислить значение функции:

	public static void task38() {

		double x;

		double y;

		x = -1;
		y = 0;

		if (x >= 0 && x <= 3) {
			y = Math.pow(x, 2);
		}
		if (x < 0 || x > 3) {
			y = 4;
		}

		System.out.println("y= " + y);
	}

	// 39. Вычислить значение функции:

	public static void task39() {

		double x;

		double y;

		x = 1;

		if (x >= 8) {
			y = -Math.pow(x, 2) + x - 9;
		} else {
			y = 1 / (Math.pow(x, 4) - 6);
		}

		System.out.println("y= " + y);
	}

	// 40. Вычислить значение функции:

	public static void task40() {

		double x;

		double y;

		x = 1;

		if (x <= 13) {
			y = -Math.pow(x, 3) + 9;
		} else {
			y = -3 / (x + 1);
		}

		System.out.println("y= " + y);
	}
}
