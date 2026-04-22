package com.scanner;

import java.util.Scanner;

public class StudentDetail {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Student Name:");
		String Studname = sc.next();

		System.out.println("Enter Student Age:");
		int StudAge = sc.nextInt();

		System.out.println("Enter Student Class:");
		String StudClassName = sc.next();
		sc.close();

		System.out.println("Student Name:" + Studname);
		System.out.println("Student Class Name:" + StudClassName);
		System.out.println("Student Age:" + StudAge);

	}

}
