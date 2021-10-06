package com.bl.lineComparison;

public class Main {
	
	public static void main(String[] args) {

		Point p1 = new Point();
		p1.x = 6;
		p1.y = 9; 

		Point p2 = new Point();
		p2.x = 7;
		p2.y = 3;
		
		Point p3 = new Point();
		p3.x = 6;
		p3.y = 9;
		
		Point p4 = new Point();
		p4.x = 7;
		p4.y = 3;

		Line l1 = new Line();
		l1.p1 = p1;
		l1.p2 = p2;
	
		Line l2 = new Line();
		l2.p3 = p3;
		l2.p4 = p4;
	
		float lineOne = l1.getLengthlineOne();
		String line1 =Float.toString(lineOne);
		System.out.println("Distance Between Two point of Lenght line1 : " + lineOne);
		
		float lineTwo = l2.getLengthlineTwo();
		String line2 = Float.toString(lineTwo);
		System.out.println("Distance Between Two point of Lenght line2 : " + lineTwo);
		
		if(line1.equals(line2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}


