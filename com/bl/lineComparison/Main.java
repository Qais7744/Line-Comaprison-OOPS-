package com.bl.lineComparison;

public class Main {
	
	private static final int ZERO = 0;

	public static void main(String[] args) {

		System.out.println("Enter the first line points");
		Point p1 = new Point();
		p1.x = p1.sacanInput();
		p1.y = p1.sacanInput();
		Point p2 = new Point();
		p2.x = p2.sacanInput();
		p2.y = p2.sacanInput();
		
		System.out.println("Enter the second line points");
		Point p3 = new Point();
		p3.x = p3.sacanInput();
		p3.y = p3.sacanInput();
		Point p4 = new Point();
		p4.x = p4.sacanInput();
		p4.y = p4.sacanInput();

		Line lineOne = new Line();
		lineOne.p1 = p1;
		lineOne.p2 = p2;

		Line lineTwo = new Line();
		lineTwo.p3 = p3;
		lineTwo.p4 = p4;

		float lineOne1 = lineOne.getLength(p1.x, p1.y, p2.x, p2.y);
		float lineTwo1 = lineTwo.getLength(p3.x, p3.y, p4.x, p4.y);
		if (Double.compare(lineOne1, lineTwo1) == ZERO)
			System.out.println("Both line are equal");
		else if (Double.compare(lineOne1, lineTwo1) < ZERO)
			System.out.println("The line one are grater");
		else
			System.out.println("The line two are grater");
	}

}


