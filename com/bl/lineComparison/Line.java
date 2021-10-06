package com.bl.lineComparison;

public class Line {
	Point p1, p2, p3, p4;
	
	public float getLengthlineOne()	{
		return (float) Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
	
	@Override
	public String toString() {
		return "Line [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + "]";
	}

	public float getLengthlineTwo() {
		return (float) Math.sqrt(Math.pow(p3.x -p4.x, 2) + Math.pow(p3.y - p4.y, 2));
	}
	
}
