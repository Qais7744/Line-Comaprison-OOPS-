package com.bl.lineComparison;

import java.util.Scanner;

public class Point {

	public int x;
	public int y;
	
	public int sacanInput() {
		@SuppressWarnings("resource")
		Scanner scannerobject = new Scanner(System.in);
		int userInput  = scannerobject.nextInt();
		return userInput;
	}
	
}





