package com.bl.lineComparison;

public class Line {
	Point p1, p2, p3, p4;
	
	public float getLength(int x, int y, int x1, int y1) {
		float value = (float) Math.sqrt(Math.pow((x - y), 2) + Math.pow((x1 - y1), 2));
		return value;
	}
	
}
