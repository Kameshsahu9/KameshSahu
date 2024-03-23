package com.Javamodule;

import java.util.Scanner;

public class Weekday {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1-7");
		int sw = s.nextInt();
		switch (sw)
		{
		case  1: System.out.println("Monday");
		break;
		case  2: System.out.println("Tuesday");
		break;
		case  3: System.out.println("Wednesday");
		break;
		case  4: System.out.println("Thusday");
		break;
		case  5: System.out.println("Friday");
		break;
		case  6: System.out.println("Saturday");
		break;
		case  7: System.out.println("Sunday");
		break;
		}
		s.close();

	}

}
