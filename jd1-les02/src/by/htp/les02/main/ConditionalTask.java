package by.htp.les02.main;

import static java.lang.Math.*;
import java.util.Scanner;

public class ConditionalTask {

	// ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 - ������� ��
	// ����� ����� 7, � ��������� ������ - ����� 8.

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

	// ��������� ��������� ��������� ���� ����� 1 � 2. ���� 1 ������ 2 - ������� ��
	// ����� ����� �yes�, � ��������� ������ - ����� �no�

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

	// ��������� ��������� ��������� ���������� ����� � � ����� 3. ������� �� �����
	// ����� �yes�, ���� ����� � ������ 3; ���� ������, �� ������� ����� �no�.

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

	// ��������� ���������: ����� �� ��� ����� � � b?

	public static void task04() {

		int a;
		int b;

		a = 12;
		b = 13;

		if (a == b) {
			System.out.println("�����" + a + " ����� ����� " + b);
		} else {
			System.out.println("����� " + a + " � " + b + " �� �����");
		}

		System.out.println();
	}

	// ��������� ���������: ����������� ����������� �� ���� ����� � � b.

	public static void task05() {

		int a;
		int b;

		a = 12;
		b = 13;

		if (a < b) {
			System.out.println("���������� ����� " + a);
		} else {
			System.out.println("���������� ����� " + b);
		}

		System.out.println();
	}

	// ��������� ���������: ����������� ����������� �� ���� ����� � � b

	public static void task06() {

		int a;
		int b;

		a = 12;
		b = 13;

		if (a > b) {
			System.out.println("���������� ����� " + a);
		} else {
			System.out.println("���������� ����� " + b);
		}

		System.out.println();
	}

	// ��������� ��������� ���������� ������ ��������� a*x*x + �*� + � ��� ��������
	// ��������� a, �, � � �

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

	// ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b.

	public static void task08() {

		int a;
		int b;

		a = 4;
		b = 5;

		if (a * a < b * b) {
			System.out.println("���������� ������� �� ���� ����� ����� " + a * a);
		} else {
			System.out.println("���������� ������� �� ���� ����� ����� " + b * b);
		}

		System.out.println();
	}

	// ��������� ���������, ������� ��������� �� ���� ��������� ��������, ��������
	// �� ������ ����������� ��������������.

	public static void task09() {

		int a;
		int b;
		int c;

		a = 4;
		b = 4;
		c = 4;

		if (a == b && a == c) {
			System.out.println("����������� �������� �������������");
		} else {
			System.out.println("����������� �� �������� ��������������");
		}

		System.out.println();
	}

	// ��������� ���������, ������� ��������� ������� ������ ����� ������.

	public static void task10() {

		int s1; // ������� ����� �1
		int s2; // ������� ����� �2

		s1 = 4;
		s2 = 5;

		if (s1 < s2) {
			System.out.println("������� ����� �1 ������");
		} else {
			System.out.println("������� ����� �2 ������");
		}

		System.out.println();
	}

	// ��������� ���������, ������� ��������� ������� ������ ������������ ������.

	public static void task11() {

		int s1; // ������� ������������ �1
		int s2; // ������� ������������ �2

		s1 = 4;
		s2 = 5;

		if (s1 < s2) {
			System.out.println("������� ������������ �1 ������");
		} else {
			System.out.println("������� ������������ �2 ������");
		}

		System.out.println();
	}

	// ���� ��� �������������� �����. �������� � ������� �� �� ���, �������� �������
	// ��������������, � � ��������� ������� � �������������.

	public static void task12() {

		double a;
		double b;
		double c;

		a = 4;
		b = 5;
		c = -2;

		if (a > 0) {
			a *= a;
			System.out.println("����� � �������� ����� " + a);
		} else {
			a = pow(a, 4);
			System.out.println("����� � 4-�� ������� ����� " + a);
		}

		if (b > 0) {
			b *= b;
			System.out.println("����� � �������� ����� " + b);
		} else {
			b = pow(b, 4);
			System.out.println("����� � 4-�� ������� ����� " + b);
		}

		if (c > 0) {
			c *= c;
			System.out.println("����� � �������� ����� " + c);
		} else {
			c = pow(c, 4);
			System.out.println("����� � 4-�� ������� ����� " + c);
		}
		System.out.println();
	}

	// ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������,
	// ������� �� ����� ��������� ����� � ������ ���������.

	public static void task13() {

		// ���������� ����� 1
		double x1;
		double y1;

		// ���������� ����� 2
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
			System.out.println("����� 1 ����� � ������ ���������");
		} else {
			System.out.println("����� 2 ����� � ������ ���������");
		}

	}

	// ���� ��� ���� ������������ (� ��������). ����������, ���������� �� �����
	// �����������, � ���� ��, �� ����� �� �� �������������.

	public static void task14() {

		int x;
		int y;
		int z;

		x = 30;
		y = 90;

		z = 180 - x - y;

		if (z > 0 && (x == 90 || y == 90 || z == 90)) {
			System.out.println("����������� � ������ " + x + "," + y + "," + z + " ����������.");
			System.out.println("���� ����������� �������������");
		} else if (z > 0) {
			System.out.println("����������� � ������ " + x + "," + y + "," + z + " ����������");
		} else {
			System.out.println("������������ � ������ " + x + "," + y + "," + z + " �� ����������");
		}

		System.out.println();
	}

	// ���� �������������� ����� � � �, �� ������ ���� �����. ������� �� ���� ����
	// ����� �������� ��������� �� �����, � ������� � �� ��������� �������������.

	public static void task15() {

		int x;
		int y;

		int temp;

		x = 2;
		y = 4;

		System.out.println("��������� �������� x � y  ����� " + x + " " + y);

		if (x != y && x < y) {
			temp = (x + y) / 2;
			y = x * y * 2;
			x = temp;
			System.out.println("�������� �������� x � y  ����� " + x + " " + y);
		} else {
			temp = (x + y) / 2;
			x = x * y * 2;
			y = temp;
			System.out.println("�������� �������� x � y  ����� " + x + " " + y);
		}

		System.out.println();
	}

	// �� ��������� XOY ������ ������ ������������ ����� �. �������, ��� ���
	// ����������� (�� ����� ��� ��� � ����� ������������ ����).

	public static void task16() {

		// ���������� �����
		int x;
		int y;

		x = 2;
		y = 4;

		if (x > 0 && y > 0) {
			System.out.println("����� ��������� � 1 ������������ ����");
		} else if (x > 0 && y < 0) {
			System.out.println("����� ��������� �� 2 ������������ ����");
		} else if (x < 0 && y > 0) {
			System.out.println("����� ��������� � 3 ������������ ����");
		} else {
			System.out.println("����� ��������� � 4 ������������ ����");
		}

		System.out.println();
	}

	// ���� ����� ����� �, �. ���� ����� �� �����, �� �������� ������ �� ��� ����� �
	// ��� �� ������, ������ �������� �� ��������, � ���� �����, �� �������� �����
	// ������

	public static void task17() {

		int m;
		int n;

		m = 4;
		n = 4;

		System.out.println("��������� �������� m � n  ����� " + m + " " + n);

		if (m == n) {
			n = 0;
			m = 0;

		} else if (m > n) {
			n = m;

		} else {
			m = n;
		}

		System.out.println("�������� �������� m � n  ����� " + m + " " + n);
		System.out.println();
	}

	// ���������� ���������� ������������� ����� ����� �, b, �.

	public static void task18() {

		int a;
		int b;
		int c;

		a = 4;
		b = 4;
		c = -2;

		if (a < 0 && b < 0 && c < 0) {
			System.out.println("��� ����� �������������");

		} else if (a < 0 && b < 0 || a < 0 && c < 0 || b < 0 && c < 0) {
			System.out.println("����� ���� �������� ����� ���� ��� ������������� �����");

		} else if (a < 0 || c < 0 || b < 0) {
			System.out.println("����� ���� �������� ����� ���� ���� ������������� �����");

		} else {
			System.out.println("��� ����� �������������");
		}

		System.out.println();
	}

	// ���������� ���������� ������������� ����� ����� �, b, �.

	public static void task19() {

		int a;
		int b;
		int c;

		a = 4;
		b = 4;
		c = -2;

		if (a > 0 && b > 0 && c > 0) {
			System.out.println("��� ����� �������������");

		} else if (a > 0 && b > 0 || a > 0 && c > 0 || b > 0 && c > 0) {
			System.out.println("����� ���� �������� ����� ���� ��� ������������� �����");

		} else if (a > 0 || c > 0 || b > 0) {
			System.out.println("����� ���� �������� ����� ���� ���� ������������� �����");

		} else {
			System.out.println("��� ����� �������������");
		}

		System.out.println();
	}

	// ����������, ��������� ����� ����� �, b, � �������� ����� �.

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
			System.out.println("k = " + k + " �������� ��������� ��� ���� �����");

		} else if (a % k == 0 && b % k == 0 || a % k == 0 && c % k == 0 || b % k == 0 && c % k == 0) {
			System.out.println("k = " + k + " �������� ��������� ��� ���� �����");

		} else if (a % k == 0 || b % k == 0 || c % k == 0) {
			System.out.println("k = " + k + " �������� ��������� ��� ������ �����");

		} else {
			System.out.println("k = " + k + " �� �������� ��������� �� ��� ������ �����");
		}

		System.out.println();
	}

	// ��������� � ������. �� ������ ������������� ������ ���� ��: ������� ���
	// �������? ����� � ��� ̻. � ����������� �� ������ �� ������ ������ ���������
	// ����� ���� �������� �������!� ��� ���� �������� ��������!�.

	public static void task21() {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ����� � ��� � :");

		String letter;
		letter = sc.nextLine();

		switch (letter) {
		case "�":
			System.out.println("��� �������� ��������!");
			break;
		case "�":
			System.out.println("��� �������� �������!");
			break;
		default:
			System.out.println("������� ������������ ������");
		}

		System.out.println();
	}

	// ���������������� �������� ���������� � � � ���, ����� � � ��������� �������
	// �� ���� ��������, � � � - �������.

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

	// ���������� ������������ ����, ��������� � ���������� (����� � �� 1 �� 31,
	// ����� � �� 1 �� 12). ���� ������� ������������ ������, �� �������� �� ����.

	public static void task23() {

		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.print("������� ���� � �����: ");

		int day = k.nextInt();
		int month = k.nextInt();

		if (day < 1 || day > 31 || month < 1 || month > 12) {
			System.out.println("���� ������� �����������");
		} else {
			System.out.println("���� ������� ���������");
		}

		System.out.println();
	}

	// ��������� ���������, ������������ ��������� ������� �� ������� � ��������
	// �����, ���� �� �������� ������ ���������� ��������� �.

	public static void task24() {

		int n = 10; // ���������� ��������� �� �������
		int count = 0;

		for (int i = n; i == 1; i--) {
			n--;
			count++;
		}
		if (count % 2 == 0) {
			System.out.println("��������� �������: �� �����");
		} else {
			System.out.println("��������� �������: �����");
		}

		System.out.println();
	}

	// �������� ��������� � ������ ������� ��������� ������� � ���������, �������
	// ������� ��������� �������������� �������� �, ���� ����������� � �������
	// ��������� 60� �.

	public static void task25() {

		int t = 65; // ����������� � �������

		if (t > 60) {
			System.out.println("������������� ��������");
		}
		System.out.println();
	}

	// �������� ��������� ���������� ����� �������� � �������� �� ���� �����.

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

	// ����� max{min(a, b), min(c, d)}.

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

	// ���� ��� ����� a, b, �. ����������, ����� �� ��� ����� d. ���� �� ���� ��
	// ����� d, �� ����� max(d � a, d � b, d � c).

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

	// ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ���
	// ����������� �� ����� ������.

	public static void task29() {

		// ���������� ����� �
		int x1;
		int y1;

		// ���������� ����� B
		int x2;
		int y2;

		// ���������� ����� C
		int x3;
		int y3;

		x1 = 1;
		y1 = 1;

		x2 = 2;
		y2 = 2;

		x3 = 3;
		y3 = 3;

		if (Math.abs((x1 - x3) / (x2 - x1)) == Math.abs((y1 - y3) / (y2 - y3))) {
			System.out.println("����� �,B,� ����������� �� ����� ������");
		} else {
			System.out.println("����� �,B,� �� ����������� �� ����� ������");
		}

		System.out.println();
	}

	// ���� �������������� ����� �,�,�. ������� ��� �����, ���� � > b > �, �
	// �������� �� ����������� ����������, ���� ��� �� ���.

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

	// ������ ������� �, � �������������� ��������� � ������� �, �, z �������.
	// ����������, ������� �� ������ ����� ���������.

	public static void task31() {

		// ������� ��������� ��*���
		int a;
		int b;

		// ������� ������� ��*���*���
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
				System.out.println("������ �������� � ���������");
			} else {
				System.out.println("������ �� �������� � ���������");
			}
		} else {
			if (z < b && x < a || y < a && z < b || x < b && y < a) {
				System.out.println("������ �������� � ���������");
			} else {
				System.out.println("������ �� �������� � ���������");
			}
		}

		System.out.println();
	}

	// �������� ���������, ������� �� �������� ���� ������ ����������, �������� ��
	// ����� �����-���� ���� �� ��� �������������.

	public static void task32() {

		int a;
		int b;
		int c;

		a = 3;
		b = -2;
		c = -1;
		//
		if ((a + b > 0 && a + c > 0) || (a + b > 0 && b + c > 0)) {
			System.out.println("����� ���� ����� �� ���� �������� �������������");
		} else {
			System.out.println("����� ���� ����� �� ���� �� �������� �������������");
		}

		System.out.println();
	}

	// �������� ���������, ������� �� ������ ����� ���������� ������� �������
	// ���������� � ��������� ���������� � ���� ������. ������ � ���� ����� ������
	// ����� �������, �������� �� ��� ������ �� ������� �������. ��� ����� ���������
	// ������: 9583, 1747 � �������� ������ ��� �, �, �; 3331, 7922 � ��������
	// ������ ��� �, �; 9455, 8997 � �������� ������ ���� �.

	public static void task33() {

		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.print("������� ������: ");

		int password = k.nextInt();

		switch (password) {
		case 1747:
		case 9583:
			System.out.println("������� �������: �������� ������ ��� �,B,�");
			break;
		case 3331:
		case 7922:
			System.out.println("������� �������: �������� ������ ��� B,�");
			break;
		case 9455:
		case 8997:
			System.out.println("������� �������: �������� ������ ���� �");
			break;
		default:
			System.out.println("��� ������� � ��������� ����������");
		}

		System.out.println();
	}

	// ��������� ���������, ����������� ������ ���������� ���������� � �������
	// ��������. ��������� ����������� ��������� ����, ����� �����, ���������
	// �����������; ���� ����� �� ���������, �������� �� ������ ��������; ����
	// ����� ������� ������, ��� ����������, �� �������� ��������� ����� �
	// ��������� ����� �����; ���� ����� ������������, �� �������� ��������� �� ����
	// � ��������� ������ ����������� �����.

	public static void task34() {

		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);

		System.out.print("������� ��������� ����: ");
		int bookValue = k.nextInt();

		System.out.print("������� ��������� ����� �����: ");
		int cashIn = k.nextInt();

		if (bookValue == cashIn) {
			System.out.println("�������");
		} else if (bookValue < cashIn) {
			System.out.println("�������� �����: " + (cashIn - bookValue));
		} else {
			System.out.println("����� ������������.�������: " + (bookValue - cashIn));
		}

		System.out.println();
	}

	// ��������� ����� � ����� � ������������ ���� �� ������ ���.

	public static void task35() {

		@SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
		System.out.print("������� ����� ��� � ����: ");

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
			System.out.println("������� �������� ������");
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
			System.out.print("�����: 0" + m);
		} else {
			System.out.print("�����: " + m);
		}
		System.out.println();

		if (d < 10) {
			System.out.print("����: 0" + d);
		} else {
			System.out.print("����: " + d);
		}
		System.out.println();

	}

	// 36. ��������� �������� �������:

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

	// 37. ��������� �������� �������:

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

	// 38. ��������� �������� �������:

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

	// 39. ��������� �������� �������:

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

	// 40. ��������� �������� �������:

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
