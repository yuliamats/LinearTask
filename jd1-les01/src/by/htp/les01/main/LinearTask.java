package by.htp.les01.main;

import static java.lang.Math.*;

public class LinearTask {

	//// Даны два действительных числа х и у. Вычислить их сумму, разность,
	//// произведение и частное

	public static void tast01() {

		double x;
		double y;

		double sum;
		double sub;
		double mult;
		double div;

		x = 5;
		y = 2;

		sum = x + y;
		sub = x - y;
		mult = x * y;
		div = x / y;

		System.out.println("сумма чисел x и y равна " + sum);
		System.out.println("разность чисел x и y равна " + sub);
		System.out.println("произведение чисел x и y равно " + mult);
		System.out.println("частное чисел x и y равно " + div);
		System.out.println();
	}

	////////////////////////////////////////////

	// Найдите значение функции: с = 3 + а.

	public static void tast02() {

		double a;

		double c;

		a = 10;

		c = 3 + a;

		System.out.println("значение функции равно " + c);
		System.out.println();
	}

	////////////////////////////////////////////

	// Найдите значение функции: z = 2 * x + (y - 2) * 5.

	public static void tast03() {

		double x;
		double y;

		double z;

		x = 2;
		y = 3;

		z = 2 * x + (y - 2) * 5;

		System.out.println("значение функции равно " + z);
		System.out.println();
	}

	///////////////////////////////////////////

	// Найдите значение функции: z = ((a - 3) * b /2) + c.

	public static void tast04() {

		double a;
		double b;
		double c;

		double z;

		a = 4;
		b = 3;
		c = 2;

		z = ((a - 3) * b / 2) + c;

		System.out.println("значение функции равно " + z);
		System.out.println();
	}

	/////////////////////////////////////////////////

	// Составить алгоритм нахождения среднего арифметического двух чисел

	public static void tast05() {

		double a;
		double b;

		double average;

		a = 2;
		b = 3;

		average = (a + b) / 2;

		System.out.println("среднее арифместическое чисел a и b равно " + average);
		System.out.println();
	}

	/////////////////////////////////////////////////

	// Написать код для решения задачи. В n малых бидонах 80 л молока.

	public static void tast06() {

		int n; // количество малых бидонов
		int nMilk; // количество молока в малых бидонах

		int mMilk;

		n = 10;
		nMilk = 80;

		mMilk = (nMilk / n + 12) * n;

		System.out.println("в больших бидонах " + mMilk + " литров молока");
		System.out.println();
	}

	////////////////////////////////////////////////

	// Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь
	// прямоугольника

	public static void tast07() {

		double a; // длина прямоугольника
		double b; // ширина прямоугольника

		double square;

		a = 3;

		b = a / 2;
		square = a * b;

		System.out.println("площадь прямоульника равна " + square);
		System.out.println();
	}

	//////////////////////////////////////////////////

	// Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения):

	public static void tast08() {

		double a;
		double b;
		double c;

		double temp;

		double result;

		a = 1.5;
		b = 2.5;
		c = 3.5;

		temp = sqrt(pow(b, 2) + 4 * a * c);
		result = (b + temp) / (2 * a) - pow(a, 3) * c + pow(b, -2);
		temp = (int) round(result * 100);
		result = (double) temp / 100;

		System.out.println("значение выражения равно " + result);
		System.out.println();
	}

	//////////////////////////////////////////////////

	// Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения):

	public static void tast09() {

		double a;
		double b;
		double c;
		double d;

		double temp;

		double result;

		a = 1.5;
		b = 2.5;
		c = 3.5;
		d = 4.5;

		result = (a / c) * (b / d) - (a * b - c) / (c * d);
		temp = (int) round(result * 100);
		result = (double) temp / 100;

		System.out.println("значение выражения равно " + result);
		System.out.println();
	}

	/////////////////////////////////////////////////

	// Вычислить значение выражения по формуле (все переменные принимают
	// действительные значения):

	public static void tast10() {

		double x;
		double y;

		double temp;

		double result;

		x = 1.5;
		y = 2.5;

		result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * tan(x * y);
		temp = (int) round(result * 100);
		result = (double) temp / 100;

		System.out.println("значение выражения равно " + result);
		System.out.println();
	}

	/////////////////////////////////////////////////

	// Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
	// катетов

	public static void tast11() {

		double a; // длина катета 1
		double b; // длина катета 2
		double c; // длина гипотенузы

		double temp;

		double perimeter;
		double square;

		a = 2;
		b = 3;

		c = sqrt(pow(a, 2) + pow(b, 2));
		perimeter = a + b + c;
		temp = (int) round(perimeter * 100);
		perimeter = (double) temp / 100;

		square = (a * b) / 2;
		temp = (int) round(square * 100);
		square = (double) temp / 100;

		System.out.println("периметр прямоульного треугольника равен " + perimeter);
		System.out.println("площадь прямоульного треугольника равна " + square);
		System.out.println();
	}

	//////////////////////////////////////////////////

	// Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
	// (x2, у2).

	public static void tast12() {

		// координаты первой точки
		double x1;
		double y1;

		// координаты второй точки
		double x2;
		double y2;

		double temp1;
		double temp2;
		double temp;

		double distance;

		x1 = 2;
		y1 = 3;
		x2 = 4;
		y2 = 5;

		temp1 = pow(abs(x2 - x1), 2);
		temp2 = pow(abs(y2 - y1), 2);

		distance = sqrt(temp1 + temp2);
		temp = (int) round(distance * 100);
		distance = (double) temp / 100;

		System.out.println("расстояние между двумя точками с координатами " + "(" + (int) x1 + "," + (int) y1 + ") и ("
				+ (int) x2 + "," + (int) y2 + ") равно " + distance);
		System.out.println();
	}

	/////////////////////////////////////////////////////

	// Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).
	// Найти его периметр и площадь.

	public static void tast13() {

		// координаты первой вершины треугольника
		double x1;
		double y1;

		// координаты второй вершины треугольника
		double x2;
		double y2;

		// координаты третьей вершины треугольника
		double x3;
		double y3;

		double temp1;
		double temp2;
		double temp3;
		double temp;

		double perimeter;
		double square;

		x1 = -1;
		y1 = 4;

		x2 = -1;
		y2 = 2;

		x3 = -7;
		y3 = 3;

		temp1 = sqrt(pow(abs(x2 - x1), 2) + pow(abs(y2 - y1), 2));
		temp2 = sqrt(pow(abs(x3 - x1), 2) + pow(abs(y3 - y1), 2));
		temp3 = sqrt(pow(abs(x3 - x2), 2) + pow(abs(y3 - y2), 2));

		perimeter = temp1 + temp2 + temp3;
		temp = (int) round(perimeter * 100);
		perimeter = (double) temp / 100;

		square = abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)) / 2;
		temp = (int) round(square * 100);
		square = (double) temp / 100;

		System.out.println("периметр треугольника равен " + perimeter);
		System.out.println("площадь треугольника равна " + square);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// Вычислить длину окружности и площадь круга одного и того же заданного радиуса
	// R.

	public static void tast14() {

		double radius;

		double temp;

		double circumference;
		double squareOfCircle;

		radius = 2;

		circumference = 2 * PI * radius;
		temp = (int) round(circumference * 100);
		circumference = (double) temp / 100;

		squareOfCircle = PI * pow(radius, 2);
		temp = (int) round(squareOfCircle * 100);
		squareOfCircle = (double) temp / 100;

		System.out.println("длина окружности равна " + circumference);
		System.out.println("площадь круга равна " + squareOfCircle);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// Написать программу, которая выводит на экран первые четыре степени числа пи.

	public static void tast15() {

		double x1;
		double x2;
		double x3;
		double x4;

		double temp;

		x1 = pow(PI, 1);
		temp = (int) round(x1 * 100);
		x1 = (double) temp / 100;

		x2 = pow(PI, 2);
		temp = (int) round(x2 * 100);
		x2 = (double) temp / 100;

		x3 = pow(PI, 3);
		temp = (int) round(x3 * 100);
		x3 = (double) temp / 100;

		x4 = pow(PI, 4);
		temp = (int) round(x4 * 100);
		x4 = (double) temp / 100;

		System.out.println("число пи в первой степени равно " + x1);
		System.out.println("число пи во второй степени равно " + x2);
		System.out.println("число пи в третьей степени равно " + x3);
		System.out.println("число пи в четвертой степени равно " + x4);
		System.out.println();
	}

	//////////////////////////////////////////////////////

	// Найти произведение цифр заданного четырехзначного числа.

	public static void tast16() {

		int x;

		int mult;

		int temp1;
		int temp2;
		int temp3;
		int temp4;

		x = 1234;

		temp1 = x % 10;
		temp2 = (x / 10) % 10;
		temp3 = (x / 100) % 10;
		temp4 = x / 1000;

		mult = temp1 * temp2 * temp3 * temp4;

		System.out.println("произведение цифр числа " + x + " равно " + mult);
		System.out.println();
	}

	//////////////////////////////////////////////////////

	// Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
	// геометрическое модулей этих чисел.

	public static void tast17() {

		double x;
		double y;

		double temp;

		double averageOfCube;
		double squareRoot;

		x = 1;
		y = 2;

		averageOfCube = (pow(x, 3) + pow(y, 3)) / 2;
		temp = (int) round(averageOfCube * 100);
		averageOfCube = (double) temp / 100;

		squareRoot = sqrt(abs(x) * abs(y));
		temp = (int) round(squareRoot * 100);
		squareRoot = (double) temp / 100;

		System.out.println("среднее арифметическое кубов чисел  " + x + " и " + y + " равно " + averageOfCube);
		System.out.println("среднее геометрическое модулей чисел  " + x + " и " + y + " равно " + squareRoot);
		System.out.println();
	}

	//////////////////////////////////////////////////////

	// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
	// объем этого куба.

	public static void tast18() {

		double a; // длина ребра куба

		double sideSquare;
		double allSideSquare;
		double cubeVolume;

		a = 2;

		sideSquare = pow(a, 2);
		allSideSquare = 6 * pow(a, 2);
		cubeVolume = pow(a, 3);

		System.out.println("площадь грани куба равна " + sideSquare);
		System.out.println("площадь полной поверхности куба равна " + allSideSquare);
		System.out.println("объем куба равен " + cubeVolume);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
	// его высоту, радиусы вписанной и описанной окружностей.

	public static void tast19() {

		double a; // сторона равностороннего треугольника

		double temp;

		a = 5;

		double square;
		double height;
		double inRadius;
		double roundRadius;

		square = (pow(a, 2) * sqrt(3)) / 4;
		temp = (int) round(square * 100);
		square = (double) temp / 100;

		height = sqrt(3) / 2 * a;
		temp = (int) round(height * 100);
		height = (double) temp / 100;

		inRadius = a / (2 * sqrt(3));
		temp = (int) round(inRadius * 100);
		inRadius = (double) temp / 100;

		roundRadius = a / sqrt(3);
		temp = (int) round(roundRadius * 100);
		roundRadius = (double) temp / 100;

		System.out.println("площадь равностороннего треугольника равна " + square);
		System.out.println("высота равностороннего треугольника равна " + height);
		System.out.println("радиус вписанной окружности равностороннего треугольника равен " + inRadius);
		System.out.println("радиус описанной окружности равностороннего треугольника равен " + roundRadius);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// Известна длина окружности. Найти площадь круга, ограниченного этой
	// окружностью.

	public static void tast20() {

		double c; // длина окружности

		double radius;
		double temp;

		double circleSquare;

		c = 5;

		radius = c / (2 * PI);
		circleSquare = 2 * PI * pow(radius, 2);
		temp = (int) round(circleSquare * 100);
		circleSquare = (double) temp / 100;

		System.out.println("площадь круга, ограниченная окружностью, равна " + circleSquare);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
	// целой частях).

	public static void tast21() {

		double x;

		int temp1;
		int temp2;

		x = 123.456;

		temp1 = (int) x;
		temp2 = (int) ((x - temp1) * 1000);

		System.out.print("полученное значение числа " + x + " равно " + temp2 + "." + temp1);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// Дано натуральное число Т, которое представляет длительность прошедшего
	// времени в секундах.
	// Вывести данное значение длительности в часах, минутах и секундах в следующей
	// форме: ННч ММмин SSc.

	public static void tast22() {

		int t; // длительность временив секундах

		int sec;
		int min;
		int hour;

		t = 3719;

		hour = t / 3600;
		min = t / 60 - hour * 60;
		sec = t - (hour * 3600 + +min * 60);

		if (hour < 10) {
			System.out.print("0" + hour + "ч. ");
		} else {
			System.out.print(hour + "ч. ");
		}

		if (min < 10) {
			System.out.print("0" + min + "мин. ");
		} else {
			System.out.print(min + "мин. ");
		}

		if (sec < 10) {
			System.out.print("0" + sec + "с. ");
		} else {
			System.out.print(sec + "с. ");
		}

		System.out.println();
	}

	////////////////////////////////////////////////////////

	// Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R>
	// r).

	public static void tast23() {

		double inRadius;
		double outRadius;

		double temp;

		double ringSquare;

		inRadius = 2;
		outRadius = 3;

		ringSquare = PI * (pow(outRadius, 2) - pow(inRadius, 2));
		temp = (int) round(ringSquare * 100);
		ringSquare = (double) temp / 100;

		System.out.println("площадь кольца равна " + ringSquare);
		System.out.println();
	}

	////////////////////////////////////////////////////////

	// Найти площадь равнобедренной трапеции с основаниями а и b и углом а при
	// большем основании а.

	public static void tast24() {

		double a; // нижнее основание равнобедренной трапеции
		double b; // верхнее основание равнобедренной трапеции
		double angle; // угол в градусах при нижнем основании равнобедренной трапеции

		double radAngle;
		double temp;

		double square;

		a = 4;
		b = 15;
		angle = 45;

		radAngle = angle * PI / 180;

		square = (pow(b, 2) - pow(a, 2)) * tan(radAngle) / 4;
		temp = (int) round(square * 100);
		square = (double) temp / 100;

		System.out
				.println("площадь равнобедренной трапеции с основаниями а = " + a + " и b = " + b + " равна " + square);
		System.out.println();
	}

	///////////////////////////////////////////////////////////

	// Вычислить корни квадратного уравнения ах2+ bx + с = 0 с заданными
	// коэффициентами a, b и с

	public static void tast25() {

		// коэффициенты квадратного уравнения
		double a;
		double b;
		double c;

		double temp;

		double squareRoot1;
		double squareRoot2;

		double d; // дискриминант квадратного уравнения

		a = 2;
		b = 20;
		c = 4;

		d = pow(b, 2) - 4 * a * c;

		if (a != 0 && d > 0) {

			squareRoot1 = (-b + sqrt(d)) / (2 * a);
			temp = (int) round(squareRoot1 * 100);
			squareRoot1 = (double) temp / 100;

			squareRoot2 = (-b - sqrt(d)) / (2 * a);
			temp = (int) round(squareRoot2 * 100);
			squareRoot2 = (double) temp / 100;

			System.out.println("корни квадратного уравнения равны " + squareRoot1 + " и " + squareRoot2);

		} else {

			System.out.println("неверно заданы коэффициенты");
		}

		System.out.println();
	}

	/////////////////////////////////////////////////////////////

	// Найти площадь треугольника, две стороны которого равны а и b, а угол между
	// этими сторонами у.

	public static void tast26() {

		// стороны треугольника
		double a;
		double b;

		double angle; // угол между сторонами а и b

		double radAngle;
		double temp;

		double square;

		a = 3;
		b = 5;
		angle = 45;

		radAngle = angle * PI / 180;

		square = (a * b * sin(radAngle)) / 2;
		temp = (int) round(square * 100);
		square = (double) temp / 100;

		System.out.println("площадь площадь треугольника со сторонами а = " + a + " и b = " + b + " равна " + square);
		System.out.println();
	}

	/////////////////////////////////////////////////////////////

	// Дано значение а. Не используя никаких функций и никаких операций, кроме
	// умножения,
	// получить значение а8 за три операции и а10 за четыре операции.

	public static void tast27() {

		double a;

		double x; // значение числа а в 8-ой степени
		double y; // значение числа а в 10-ой степени

		double temp1;
		double temp2;

		a = 2;

		temp1 = a * a;
		temp2 = temp1 * temp1;

		x = temp2 * temp2;
		y = x * temp1;

		System.out.println("значение числа " + a + " в 8-ой степени равно " + x);
		System.out.println("значение числа " + a + " в 10-ой степени равно " + y);
		System.out.println();
	}

	////////////////////////////////////////////////////////////////

	// Составить программу перевода радианной меры угла в градусы, минуты и секунды.

	public static void tast28() {

		double rad;

		double temp;

		double degree;
		double min;
		double sec;

		rad = 2.5;

		degree = rad * 180 / PI;
		temp = (int) round(degree * 100);
		degree = (double) temp / 100;

		min = (degree - (int) degree) * 60;
		sec = (min - (int) min) * 60;

		System.out.print("число " + rad + " в радианах равно ");

		if (degree < 10) {
			System.out.print("0" + (int) degree + "град. ");
		} else {
			System.out.print((int) degree + "град. ");
		}

		if (min < 10) {
			System.out.print("0" + (int) min + "мин. ");
		} else {
			System.out.print((int) min + "мин. ");
		}

		if (sec < 10) {
			System.out.print("0" + (int) sec + "сек. ");
		} else {
			System.out.print((int) sec + "сек. ");
		}

		System.out.println();
	}

	////////////////////////////////////////////////////////////////////

	// Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.

	public static void tast29() {

		double a;
		double b;
		double c;

		double temp1;
		double temp2;
		double temp;

		double angle1;
		double angle2;
		double angle3;

		double radAngle1;
		double radAngle2;
		double radAngle3;

		a = 2;
		b = 3;
		c = 4;

		temp1 = (pow(a, 2) + pow(c, 2) - pow(b, 2)) / (2 * a * c);
		angle1 = acos(temp1) / PI * 180;
		radAngle1 = angle1 * PI / 180;
		temp = (int) round(angle1 * 100);
		angle1 = (double) temp / 100;
		temp = (int) round(radAngle1 * 100);
		radAngle1 = (double) temp / 100;

		System.out.println("первый угол треугольника равен в градусах " + angle1);
		System.out.println("первый угол треугольника равен в радианах " + radAngle1);
		System.out.println();

		temp2 = (pow(a, 2) + pow(b, 2) - pow(c, 2)) / (2 * a * b);
		angle2 = acos(temp2) / PI * 180;
		radAngle2 = angle2 * PI / 180;
		temp = (int) round(angle2 * 100);
		angle2 = (double) temp / 100;
		temp = (int) round(radAngle2 * 100);
		radAngle2 = (double) temp / 100;

		System.out.println("второй угол треугольника равен в градусах " + angle2);
		System.out.println("второй угол треугольника равен в радианах " + radAngle2);
		System.out.println();

		angle3 = 180 - angle1 - angle2;
		radAngle3 = angle3 * PI / 180;
		temp = (int) round(angle3 * 100);
		angle3 = (double) temp / 100;
		temp = (int) round(radAngle3 * 100);
		radAngle3 = (double) temp / 100;

		System.out.println("третий угол треугольника равен в градусах " + angle3);
		System.out.println("третий угол треугольника равен в радианах " + radAngle3);
		System.out.println();
	}

	////////////////////////////////////////////////////////////////

	// Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление
	// соединения.

	public static void tast30() {

		double r1;
		double r2;
		double r3;

		double temp;

		double rTotal;

		r1 = 2;
		r2 = 3;
		r3 = 4;

		rTotal = 1 / ((1 / r1) + (1 / r2) + (1 / r3));
		temp = (int) round(rTotal * 100);
		rTotal = (double) temp / 100;

		System.out.println("сопротивление соединения равно " + rTotal);
		System.out.println();
	}

	//////////////////////////////////////////////////////////////////

	// Составить программу для вычисления пути, пройденного лодкой, если
	// ее скорость в стоячей воде v км/ч, скорость течения реки v1 км/ч,
	// время движения по озеру t1 ч, а против течения реки — t2 ч.

	public static void tast31() {

		double v;
		double v1;
		double t1;
		double t2;

		double d1;
		double d2;

		double dTotal;

		v = 12;
		v1 = 2;
		t1 = 2;
		t2 = 5;

		d1 = t1 * (v + v1);
		d2 = t2 * (v - v1);

		dTotal = d1 + d2;

		System.out.println("путь, пройденный лодкой, составляет " + dTotal + " км");
		System.out.println();
	}

	//////////////////////////////////////////////////////////////////

	// Текущее показание электронных часов: т ч (0 < т <23) п мин (0 < п <59) к с (0
	// <к <59).
	// Какое время будут показывать часы через р ч q мин r с?

	public static void tast32() {

		int m;
		int n;
		int k;

		int p;
		int q;
		int r;

		int x;
		int y;
		int z;

		m = 1;
		n = 11;
		k = 59;

		p = 23;
		q = 1;
		r = 1;

		x = m + p;
		y = n + q;
		z = k + r;

		if (z >= 60) {
			z -= 60;
			y += 1;
		}

		if (y >= 60) {
			y -= 60;
			x += 1;
		}

		if (x >= 24) {
			x -= 24;
		}

		System.out.print("часы будут показывать время ");

		if (x < 10) {
			System.out.print("0" + x + "ч. ");
		} else {
			System.out.print(x + "ч. ");
		}

		if (y < 10) {
			System.out.print("0" + y + "мин. ");
		} else {
			System.out.print(y + "мин. ");
		}

		if (z < 10) {
			System.out.print("0" + z + "с. ");
		} else {
			System.out.print(z + "с. ");
		}

		System.out.println();
	}

	////////////////////////////////////////////////////////////////////

	// Ввести любой символ и определить его порядковый номер, а также указать
	// предыдущий и последующий символы.

	public static void tast33() {

		char ch;
		char chNext;
		char chPrev;

		int code;

		ch = 'f';
		code = ch;

		System.out.print("порядковый номер символа " + ch + " равен " + code);

		code++;
		chNext = (char) code;

		System.out.print(". Последующий символ: " + chNext);

		code -= 2;
		chPrev = (char) code;

		System.out.print(" и предыдущий символ: " + chPrev);

		System.out.println();
	}

	//////////////////////////////////////////////////////////////////////

	// Дана величина А, выражающая объем информации в байтах. Перевести А в более
	// крупные единицы измерения информации.

	public static void tast34() {

		int a;

		double temp;

		double b;
		double c;
		double d;

		a = 10240000;

		b = a / pow(2, 10);
		temp = (int) round(b * 100);
		b = (double) temp / 100;

		c = a / pow(2, 20);
		temp = (int) round(c * 100);
		c = (double) temp / 100;

		d = a / pow(2, 30);
		temp = (int) round(d * 100);
		d = (double) temp / 100;

		System.out.println(a + "байт равно " + b + " килобайт");
		System.out.println(a + "байт равно " + c + " мегабайт");
		System.out.println(a + "байт равно " + d + " гигабайт");
		System.out.println();
	}

	//////////////////////////////////////////////////////////////////////

	// Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую
	// цифру целой части числа M/N.

	public static void tast35() {

		int m;
		int n;

		int temp1; // младшая цифра целой части числа M/N.
		int temp2; // старшая цифра дробной части части числа M/N.

		m = 12;
		n = 45;

		temp1 = m % 10;

		if (n / 10 == 0) {
			temp2 = n % 10;
		} else {
			temp2 = n / 10;
		}

		System.out.println(temp2 + "/" + temp1);
		System.out.println();

	}

	////////////////////////////////////////////////////////////////////////

	// Найти частное произведений четных и нечетных цифр четырехзначного числа

	public static void tast36() {

		int x;

		int temp;

		int mult1;
		int mult2;

		double div;

		x = 1234;
		mult1 = 1;
		mult2 = 1;

		System.out.print("частное произведений четных и нечетных цифр числа " + x + " равно ");

		for (int i = 0; i < 4; i++) {

			temp = x % 10;

			if (temp % 2 == 0) {
				mult2 *= temp;
			} else {
				mult1 *= temp;
			}

			x /= 10;
		}

		if (mult1 == 0) {
			div = 0;
		} else {
			div = (double) mult2 / mult1;
			temp = (int) round(div * 100);
			div = (double) temp / 100;
		}

		System.out.print(div);
		System.out.println();
	}

	///////////////////////////////////////////////////////////////////////////

	// Составить линейную программу, печатающую значение true, если указанное
	// высказывание является истинным,
	// и false — в противном случае:
	// Целое число N является четным двузначным числом.

	public static void tast37() {

		int number;
		boolean result;

		number = 31;

		result = 9 < number && number < 100 && number % 2 == 0;

		System.out.println(result);

		// - Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его
		// последних цифр

		int num1; // pflfyyjt xtnsht[pyfxyjt xbckj

		int temp1;
		int temp2;
		int temp3;
		int temp4;

		num1 = 1234;

		temp1 = num1 % 10;
		temp2 = (num1 / 10) % 10;
		temp3 = (num1 / 100) % 10;
		temp4 = num1 / 1000;

		result = temp1 + temp2 == temp3 + temp4;

		System.out.println(result);

		// - Целое число N является четным двузначным числом.

		int num2; // целое число N

		int tempN1;
		int tempN2;
		int tempN3;

		int sumN;

		num2 = 123;

		tempN1 = num2 % 10;
		tempN2 = (num2 / 10) % 10;
		tempN3 = (num2 / 100) % 10;
		sumN = tempN1 + tempN2 + tempN3;

		result = sumN % 2 == 0;

		System.out.println(result);

		// Точка с координатами (х, у) принадлежит части плоскости, лежащей между
		// прямыми х= т, х= п (т<п).

		int x;
		int y;
		int m;
		int n;

		x = 4;
		y = 4;
		m = 2;
		n = 6;

		result = y > m && y < n;

		System.out.println(result);

		// Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.

		double z; // заданное трехзначное число
		double s;

		double tempZ;

		double sumZ;
		double v;

		z = 345;
		sumZ = 0;

		s = pow(z, 2);

		for (int i = 0; i < 2; i++) {
			tempZ = z % 10;
			sumZ += tempZ;
			z /= 10;
		}

		v = pow(sumZ, 3);

		result = s == v;

		System.out.println(result);

		// Треугольник со сторонами а,Ь,с является равнобедренным

		int aSide;
		int bSide;
		int cSide;

		aSide = 2;
		bSide = 2;
		cSide = 2;

		result = aSide == bSide || aSide == cSide || bSide == cSide;

		System.out.println(result);

		// Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна
		// третьей цифре.

		int num3; // число N

		int tempNum1;
		int tempNum2;
		int tempNum3;

		num3 = 112;

		tempNum1 = num3 % 10;
		tempNum2 = (num3 / 10) % 10;
		tempNum3 = (num3 / 100) % 10;

		result = tempNum1 + tempNum2 == tempNum3 || tempNum2 + tempNum3 == tempNum1 || tempNum1 + tempNum3 == tempNum2;

		System.out.println(result);

		// Заданное число N является степенью числа а (показатель степени может
		// находиться в диапазоне от 0 до 4).

		double num4; // число N
		double a4; // число а

		num4 = 8;
		a4 = 2;

		for (int i = 0; i < 4; i++) {
			result = pow(a4, i) == num4;
			System.out.println(result);
		}

		// График функции у = ах2 + Ьх+ с проходит через заданную точку с координатами
		// (m1, п1).

		int a;
		int b;
		int c;

		int m1;
		int n1;

		a = 2;
		b = 3;
		c = -5;

		m1 = 1;
		n1 = 0;

		result = (a * m1 * m1 + b * m1 + c) == n1;

		System.out.println(result);
		System.out.println();
	}

	/////////////////////////////////////////////////////////////////////

	// Для данных областей составить линейную программу, которая печатает true, если
	// точка с координатами (х, у)
	// принадлежит закрашенной области, и false — в противном случае

	public static void tast38() {

		// координаты трех вершины треугольника
		int xTriangle1;
		int yTriangle1;

		int xTriangle2;
		int yTriangle2;

		int xTriangle3;
		int yTriangle3;

		// координаты точки
		int xTriangle;
		int yTriangle;

		double s;
		double s1;
		double s2;
		double s3;

		boolean result1;

		xTriangle1 = -4;
		yTriangle1 = 0;

		xTriangle2 = 0;
		yTriangle2 = 4;

		xTriangle3 = 4;
		yTriangle3 = 0;

		xTriangle = 1;
		yTriangle = 1;

		s = 1 / 2 * abs((xTriangle2 - xTriangle1) * (yTriangle3 - yTriangle1)
				- (xTriangle3 - xTriangle1) * (yTriangle2 - yTriangle1));

		s1 = 1 / 2 * abs((xTriangle2 - xTriangle1) * (yTriangle - yTriangle1)
				- (xTriangle - xTriangle1) * (yTriangle2 - yTriangle1));

		s2 = 1 / 2 * abs((xTriangle - xTriangle1) * (yTriangle3 - yTriangle1)
				- (xTriangle3 - xTriangle1) * (yTriangle - yTriangle1));

		s3 = 1 / 2 * abs((xTriangle2 - xTriangle) * (yTriangle3 - yTriangle)
				- (xTriangle3 - xTriangle) * (yTriangle2 - yTriangle));

		result1 = s == s1 + s2 + s3;

		System.out.println(result1);

		// координаты точки
		int xRectangle;
		int yRectangle;
		boolean result2;

		xRectangle = 1;
		yRectangle = -2;

		result2 = xRectangle <= 2 && xRectangle >= -2 && yRectangle <= 4
				|| xRectangle <= 4 && xRectangle >= -4 && yRectangle <= -3;

		System.out.println(result2);

		// координаты точки

		int xCircle;
		int yCircle;
		boolean result3;

		xCircle = 1;
		yCircle = -1;

		result3 = xCircle > 0 && yCircle >= 0 && xCircle * xCircle + yCircle * yCircle <= 16
				|| yCircle < 0 && xCircle >= 0 && xCircle * xCircle + yCircle * yCircle <= 25;

		System.out.println(result3);
		System.out.println();

	}

	/////////////////////////////////////////////////////////////////////////

	// Дано действительное число х. Не пользуясь никакими другими арифметическими
	// операциями,
	// кроме умножения, сложения и вычитания, вычислите за минимальное число
	// операций:
	// 2x4 - Зх3 + 4Х2 - 5х + 6.

	public static void tast39() {

		int x;
		int y;

		x = 1;

		y = x * (x * x * (2 * x - 3) + (4 * x - 5) + 6);

		System.out.println("значение выражения равно " + y);
		System.out.println();
	}

	////////////////////////////////////////////////////////////////////////////

	// Дано значение х. Получить значения -2х + Зх2 - 4х3 и 1 + 2х + Зх2 + 4х3 .
	// Позаботьтесь об экономии операций.

	public static void tast40() {

		int x;
		int y1;
		int y2;

		x = 1;

		y1 = x * (x * (3 - 4 * x) - 2);
		y2 = 1 + x * (2 + x * (3 + 4 * x));

		System.out.println("значение выражений равны " + y1 + " и " + y2);

	}

}
