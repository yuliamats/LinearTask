package by.htp.les01.main;

import static java.lang.Math.*;

public class LinearTask {

	//// ���� ��� �������������� ����� � � �. ��������� �� �����, ��������,
	//// ������������ � �������

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

		System.out.println("����� ����� x � y ����� " + sum);
		System.out.println("�������� ����� x � y ����� " + sub);
		System.out.println("������������ ����� x � y ����� " + mult);
		System.out.println("������� ����� x � y ����� " + div);
		System.out.println();
	}

	////////////////////////////////////////////

	// ������� �������� �������: � = 3 + �.

	public static void tast02() {

		double a;

		double c;

		a = 10;

		c = 3 + a;

		System.out.println("�������� ������� ����� " + c);
		System.out.println();
	}

	////////////////////////////////////////////

	// ������� �������� �������: z = 2 * x + (y - 2) * 5.

	public static void tast03() {

		double x;
		double y;

		double z;

		x = 2;
		y = 3;

		z = 2 * x + (y - 2) * 5;

		System.out.println("�������� ������� ����� " + z);
		System.out.println();
	}

	///////////////////////////////////////////

	// ������� �������� �������: z = ((a - 3) * b /2) + c.

	public static void tast04() {

		double a;
		double b;
		double c;

		double z;

		a = 4;
		b = 3;
		c = 2;

		z = ((a - 3) * b / 2) + c;

		System.out.println("�������� ������� ����� " + z);
		System.out.println();
	}

	/////////////////////////////////////////////////

	// ��������� �������� ���������� �������� ��������������� ���� �����

	public static void tast05() {

		double a;
		double b;

		double average;

		a = 2;
		b = 3;

		average = (a + b) / 2;

		System.out.println("������� ��������������� ����� a � b ����� " + average);
		System.out.println();
	}

	/////////////////////////////////////////////////

	// �������� ��� ��� ������� ������. � n ����� ������� 80 � ������.

	public static void tast06() {

		int n; // ���������� ����� �������
		int nMilk; // ���������� ������ � ����� �������

		int mMilk;

		n = 10;
		nMilk = 80;

		mMilk = (nMilk / n + 12) * n;

		System.out.println("� ������� ������� " + mMilk + " ������ ������");
		System.out.println();
	}

	////////////////////////////////////////////////

	// ��� �������������, ������ �������� � ��� ���� ������ �����. ����� �������
	// ��������������

	public static void tast07() {

		double a; // ����� ��������������
		double b; // ������ ��������������

		double square;

		a = 3;

		b = a / 2;
		square = a * b;

		System.out.println("������� ������������ ����� " + square);
		System.out.println();
	}

	//////////////////////////////////////////////////

	// ��������� �������� ��������� �� ������� (��� ���������� ���������
	// �������������� ��������):

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

		System.out.println("�������� ��������� ����� " + result);
		System.out.println();
	}

	//////////////////////////////////////////////////

	// ��������� �������� ��������� �� ������� (��� ���������� ���������
	// �������������� ��������):

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

		System.out.println("�������� ��������� ����� " + result);
		System.out.println();
	}

	/////////////////////////////////////////////////

	// ��������� �������� ��������� �� ������� (��� ���������� ���������
	// �������������� ��������):

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

		System.out.println("�������� ��������� ����� " + result);
		System.out.println();
	}

	/////////////////////////////////////////////////

	// ��������� �������� � ������� �������������� ������������ �� ������ � � b ����
	// �������

	public static void tast11() {

		double a; // ����� ������ 1
		double b; // ����� ������ 2
		double c; // ����� ����������

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

		System.out.println("�������� ������������ ������������ ����� " + perimeter);
		System.out.println("������� ������������ ������������ ����� " + square);
		System.out.println();
	}

	//////////////////////////////////////////////////

	// ��������� ���������� ����� ����� ������� � ������� ������������ (�1, �1)�
	// (x2, �2).

	public static void tast12() {

		// ���������� ������ �����
		double x1;
		double y1;

		// ���������� ������ �����
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

		System.out.println("���������� ����� ����� ������� � ������������ " + "(" + (int) x1 + "," + (int) y1 + ") � ("
				+ (int) x2 + "," + (int) y2 + ") ����� " + distance);
		System.out.println();
	}

	/////////////////////////////////////////////////////

	// ������ ���������� ���� ������ ������������ (�1 �2),(�2, �2) ),(�3, �3).
	// ����� ��� �������� � �������.

	public static void tast13() {

		// ���������� ������ ������� ������������
		double x1;
		double y1;

		// ���������� ������ ������� ������������
		double x2;
		double y2;

		// ���������� ������� ������� ������������
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

		System.out.println("�������� ������������ ����� " + perimeter);
		System.out.println("������� ������������ ����� " + square);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// ��������� ����� ���������� � ������� ����� ������ � ���� �� ��������� �������
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

		System.out.println("����� ���������� ����� " + circumference);
		System.out.println("������� ����� ����� " + squareOfCircle);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// �������� ���������, ������� ������� �� ����� ������ ������ ������� ����� ��.

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

		System.out.println("����� �� � ������ ������� ����� " + x1);
		System.out.println("����� �� �� ������ ������� ����� " + x2);
		System.out.println("����� �� � ������� ������� ����� " + x3);
		System.out.println("����� �� � ��������� ������� ����� " + x4);
		System.out.println();
	}

	//////////////////////////////////////////////////////

	// ����� ������������ ���� ��������� ��������������� �����.

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

		System.out.println("������������ ���� ����� " + x + " ����� " + mult);
		System.out.println();
	}

	//////////////////////////////////////////////////////

	// ���� ��� �����. ����� ������� �������������� ����� ���� ����� � �������
	// �������������� ������� ���� �����.

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

		System.out.println("������� �������������� ����� �����  " + x + " � " + y + " ����� " + averageOfCube);
		System.out.println("������� �������������� ������� �����  " + x + " � " + y + " ����� " + squareRoot);
		System.out.println();
	}

	//////////////////////////////////////////////////////

	// ���� ����� ����� ����. ����� ������� �����, ������� ������ ����������� �
	// ����� ����� ����.

	public static void tast18() {

		double a; // ����� ����� ����

		double sideSquare;
		double allSideSquare;
		double cubeVolume;

		a = 2;

		sideSquare = pow(a, 2);
		allSideSquare = 6 * pow(a, 2);
		cubeVolume = pow(a, 3);

		System.out.println("������� ����� ���� ����� " + sideSquare);
		System.out.println("������� ������ ����������� ���� ����� " + allSideSquare);
		System.out.println("����� ���� ����� " + cubeVolume);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// ���� ������� ��������������� ������������. ����� ������� ����� ������������,
	// ��� ������, ������� ��������� � ��������� �����������.

	public static void tast19() {

		double a; // ������� ��������������� ������������

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

		System.out.println("������� ��������������� ������������ ����� " + square);
		System.out.println("������ ��������������� ������������ ����� " + height);
		System.out.println("������ ��������� ���������� ��������������� ������������ ����� " + inRadius);
		System.out.println("������ ��������� ���������� ��������������� ������������ ����� " + roundRadius);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// �������� ����� ����������. ����� ������� �����, ������������� ����
	// �����������.

	public static void tast20() {

		double c; // ����� ����������

		double radius;
		double temp;

		double circleSquare;

		c = 5;

		radius = c / (2 * PI);
		circleSquare = 2 * PI * pow(radius, 2);
		temp = (int) round(circleSquare * 100);
		circleSquare = (double) temp / 100;

		System.out.println("������� �����, ������������ �����������, ����� " + circleSquare);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� �
	// ����� ������).

	public static void tast21() {

		double x;

		int temp1;
		int temp2;

		x = 123.456;

		temp1 = (int) x;
		temp2 = (int) ((x - temp1) * 1000);

		System.out.print("���������� �������� ����� " + x + " ����� " + temp2 + "." + temp1);
		System.out.println();
	}

	///////////////////////////////////////////////////////

	// ���� ����������� ����� �, ������� ������������ ������������ ����������
	// ������� � ��������.
	// ������� ������ �������� ������������ � �����, ������� � �������� � ���������
	// �����: ��� ����� SSc.

	public static void tast22() {

		int t; // ������������ �������� ��������

		int sec;
		int min;
		int hour;

		t = 3719;

		hour = t / 3600;
		min = t / 60 - hour * 60;
		sec = t - (hour * 3600 + +min * 60);

		if (hour < 10) {
			System.out.print("0" + hour + "�. ");
		} else {
			System.out.print(hour + "�. ");
		}

		if (min < 10) {
			System.out.print("0" + min + "���. ");
		} else {
			System.out.print(min + "���. ");
		}

		if (sec < 10) {
			System.out.print("0" + sec + "�. ");
		} else {
			System.out.print(sec + "�. ");
		}

		System.out.println();
	}

	////////////////////////////////////////////////////////

	// ����� ������� ������, ���������� ������ �������� ����� r, � ������� � R (R>
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

		System.out.println("������� ������ ����� " + ringSquare);
		System.out.println();
	}

	////////////////////////////////////////////////////////

	// ����� ������� �������������� �������� � ����������� � � b � ����� � ���
	// ������� ��������� �.

	public static void tast24() {

		double a; // ������ ��������� �������������� ��������
		double b; // ������� ��������� �������������� ��������
		double angle; // ���� � �������� ��� ������ ��������� �������������� ��������

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
				.println("������� �������������� �������� � ����������� � = " + a + " � b = " + b + " ����� " + square);
		System.out.println();
	}

	///////////////////////////////////////////////////////////

	// ��������� ����� ����������� ��������� ��2+ bx + � = 0 � ���������
	// �������������� a, b � �

	public static void tast25() {

		// ������������ ����������� ���������
		double a;
		double b;
		double c;

		double temp;

		double squareRoot1;
		double squareRoot2;

		double d; // ������������ ����������� ���������

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

			System.out.println("����� ����������� ��������� ����� " + squareRoot1 + " � " + squareRoot2);

		} else {

			System.out.println("������� ������ ������������");
		}

		System.out.println();
	}

	/////////////////////////////////////////////////////////////

	// ����� ������� ������������, ��� ������� �������� ����� � � b, � ���� �����
	// ����� ��������� �.

	public static void tast26() {

		// ������� ������������
		double a;
		double b;

		double angle; // ���� ����� ��������� � � b

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

		System.out.println("������� ������� ������������ �� ��������� � = " + a + " � b = " + b + " ����� " + square);
		System.out.println();
	}

	/////////////////////////////////////////////////////////////

	// ���� �������� �. �� ��������� ������� ������� � ������� ��������, �����
	// ���������,
	// �������� �������� �8 �� ��� �������� � �10 �� ������ ��������.

	public static void tast27() {

		double a;

		double x; // �������� ����� � � 8-�� �������
		double y; // �������� ����� � � 10-�� �������

		double temp1;
		double temp2;

		a = 2;

		temp1 = a * a;
		temp2 = temp1 * temp1;

		x = temp2 * temp2;
		y = x * temp1;

		System.out.println("�������� ����� " + a + " � 8-�� ������� ����� " + x);
		System.out.println("�������� ����� " + a + " � 10-�� ������� ����� " + y);
		System.out.println();
	}

	////////////////////////////////////////////////////////////////

	// ��������� ��������� �������� ��������� ���� ���� � �������, ������ � �������.

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

		System.out.print("����� " + rad + " � �������� ����� ");

		if (degree < 10) {
			System.out.print("0" + (int) degree + "����. ");
		} else {
			System.out.print((int) degree + "����. ");
		}

		if (min < 10) {
			System.out.print("0" + (int) min + "���. ");
		} else {
			System.out.print((int) min + "���. ");
		}

		if (sec < 10) {
			System.out.print("0" + (int) sec + "���. ");
		} else {
			System.out.print((int) sec + "���. ");
		}

		System.out.println();
	}

	////////////////////////////////////////////////////////////////////

	// ����� (� �������� � ��������) ��� ���� ������������ �� ��������� �, b, �.

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

		System.out.println("������ ���� ������������ ����� � �������� " + angle1);
		System.out.println("������ ���� ������������ ����� � �������� " + radAngle1);
		System.out.println();

		temp2 = (pow(a, 2) + pow(b, 2) - pow(c, 2)) / (2 * a * b);
		angle2 = acos(temp2) / PI * 180;
		radAngle2 = angle2 * PI / 180;
		temp = (int) round(angle2 * 100);
		angle2 = (double) temp / 100;
		temp = (int) round(radAngle2 * 100);
		radAngle2 = (double) temp / 100;

		System.out.println("������ ���� ������������ ����� � �������� " + angle2);
		System.out.println("������ ���� ������������ ����� � �������� " + radAngle2);
		System.out.println();

		angle3 = 180 - angle1 - angle2;
		radAngle3 = angle3 * PI / 180;
		temp = (int) round(angle3 * 100);
		angle3 = (double) temp / 100;
		temp = (int) round(radAngle3 * 100);
		radAngle3 = (double) temp / 100;

		System.out.println("������ ���� ������������ ����� � �������� " + angle3);
		System.out.println("������ ���� ������������ ����� � �������� " + radAngle3);
		System.out.println();
	}

	////////////////////////////////////////////////////////////////

	// ��� ������������� R1 R2, � R3 ��������� �����������. ������� �������������
	// ����������.

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

		System.out.println("������������� ���������� ����� " + rTotal);
		System.out.println();
	}

	//////////////////////////////////////////////////////////////////

	// ��������� ��������� ��� ���������� ����, ����������� ������, ����
	// �� �������� � ������� ���� v ��/�, �������� ������� ���� v1 ��/�,
	// ����� �������� �� ����� t1 �, � ������ ������� ���� � t2 �.

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

		System.out.println("����, ���������� ������, ���������� " + dTotal + " ��");
		System.out.println();
	}

	//////////////////////////////////////////////////////////////////

	// ������� ��������� ����������� �����: � � (0 < � <23) � ��� (0 < � <59) � � (0
	// <� <59).
	// ����� ����� ����� ���������� ���� ����� � � q ��� r �?

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

		System.out.print("���� ����� ���������� ����� ");

		if (x < 10) {
			System.out.print("0" + x + "�. ");
		} else {
			System.out.print(x + "�. ");
		}

		if (y < 10) {
			System.out.print("0" + y + "���. ");
		} else {
			System.out.print(y + "���. ");
		}

		if (z < 10) {
			System.out.print("0" + z + "�. ");
		} else {
			System.out.print(z + "�. ");
		}

		System.out.println();
	}

	////////////////////////////////////////////////////////////////////

	// ������ ����� ������ � ���������� ��� ���������� �����, � ����� �������
	// ���������� � ����������� �������.

	public static void tast33() {

		char ch;
		char chNext;
		char chPrev;

		int code;

		ch = 'f';
		code = ch;

		System.out.print("���������� ����� ������� " + ch + " ����� " + code);

		code++;
		chNext = (char) code;

		System.out.print(". ����������� ������: " + chNext);

		code -= 2;
		chPrev = (char) code;

		System.out.print(" � ���������� ������: " + chPrev);

		System.out.println();
	}

	//////////////////////////////////////////////////////////////////////

	// ���� �������� �, ���������� ����� ���������� � ������. ��������� � � �����
	// ������� ������� ��������� ����������.

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

		System.out.println(a + "���� ����� " + b + " ��������");
		System.out.println(a + "���� ����� " + c + " ��������");
		System.out.println(a + "���� ����� " + d + " ��������");
		System.out.println();
	}

	//////////////////////////////////////////////////////////////////////

	// ���� ����������� ����� � � N. ������� ������� ����� ������� ����� � �������
	// ����� ����� ����� ����� M/N.

	public static void tast35() {

		int m;
		int n;

		int temp1; // ������� ����� ����� ����� ����� M/N.
		int temp2; // ������� ����� ������� ����� ����� ����� M/N.

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

	// ����� ������� ������������ ������ � �������� ���� ��������������� �����

	public static void tast36() {

		int x;

		int temp;

		int mult1;
		int mult2;

		double div;

		x = 1234;
		mult1 = 1;
		mult2 = 1;

		System.out.print("������� ������������ ������ � �������� ���� ����� " + x + " ����� ");

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

	// ��������� �������� ���������, ���������� �������� true, ���� ���������
	// ������������ �������� ��������,
	// � false � � ��������� ������:
	// ����� ����� N �������� ������ ���������� ������.

	public static void tast37() {

		int number;
		boolean result;

		number = 31;

		result = 9 < number && number < 100 && number % 2 == 0;

		System.out.println(result);

		// - ����� ���� ������ ���� ��������� ��������������� ����� ����� ����� ���� ���
		// ��������� ����

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

		// - ����� ����� N �������� ������ ���������� ������.

		int num2; // ����� ����� N

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

		// ����� � ������������ (�, �) ����������� ����� ���������, ������� �����
		// ������� �= �, �= � (�<�).

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

		// ������� ��������� ������������ ����� ����� ���� ����� ���� ����� �����.

		double z; // �������� ����������� �����
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

		// ����������� �� ��������� �,�,� �������� ��������������

		int aSide;
		int bSide;
		int cSide;

		aSide = 2;
		bSide = 2;
		cSide = 2;

		result = aSide == bSide || aSide == cSide || bSide == cSide;

		System.out.println(result);

		// ����� �����-���� ���� ���� ��������� ������������ ������������ ����� N �����
		// ������� �����.

		int num3; // ����� N

		int tempNum1;
		int tempNum2;
		int tempNum3;

		num3 = 112;

		tempNum1 = num3 % 10;
		tempNum2 = (num3 / 10) % 10;
		tempNum3 = (num3 / 100) % 10;

		result = tempNum1 + tempNum2 == tempNum3 || tempNum2 + tempNum3 == tempNum1 || tempNum1 + tempNum3 == tempNum2;

		System.out.println(result);

		// �������� ����� N �������� �������� ����� � (���������� ������� �����
		// ���������� � ��������� �� 0 �� 4).

		double num4; // ����� N
		double a4; // ����� �

		num4 = 8;
		a4 = 2;

		for (int i = 0; i < 4; i++) {
			result = pow(a4, i) == num4;
			System.out.println(result);
		}

		// ������ ������� � = ��2 + ��+ � �������� ����� �������� ����� � ������������
		// (m1, �1).

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

	// ��� ������ �������� ��������� �������� ���������, ������� �������� true, ����
	// ����� � ������������ (�, �)
	// ����������� ����������� �������, � false � � ��������� ������

	public static void tast38() {

		// ���������� ���� ������� ������������
		int xTriangle1;
		int yTriangle1;

		int xTriangle2;
		int yTriangle2;

		int xTriangle3;
		int yTriangle3;

		// ���������� �����
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

		// ���������� �����
		int xRectangle;
		int yRectangle;
		boolean result2;

		xRectangle = 1;
		yRectangle = -2;

		result2 = xRectangle <= 2 && xRectangle >= -2 && yRectangle <= 4
				|| xRectangle <= 4 && xRectangle >= -4 && yRectangle <= -3;

		System.out.println(result2);

		// ���������� �����

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

	// ���� �������������� ����� �. �� ��������� �������� ������� ���������������
	// ����������,
	// ����� ���������, �������� � ���������, ��������� �� ����������� �����
	// ��������:
	// 2x4 - ��3 + 4�2 - 5� + 6.

	public static void tast39() {

		int x;
		int y;

		x = 1;

		y = x * (x * x * (2 * x - 3) + (4 * x - 5) + 6);

		System.out.println("�������� ��������� ����� " + y);
		System.out.println();
	}

	////////////////////////////////////////////////////////////////////////////

	// ���� �������� �. �������� �������� -2� + ��2 - 4�3 � 1 + 2� + ��2 + 4�3 .
	// ������������ �� �������� ��������.

	public static void tast40() {

		int x;
		int y1;
		int y2;

		x = 1;

		y1 = x * (x * (3 - 4 * x) - 2);
		y2 = 1 + x * (2 + x * (3 + 4 * x));

		System.out.println("�������� ��������� ����� " + y1 + " � " + y2);

	}

}
