package com.ssc.shape;

public class Main {
	public static void main(String[] args) {

		Circle a = new Circle(10);
		a.Area();
		a.Circumference();

		Shape ele = new Circle(100);
		ele.Area();
		ele.Circumference();

		RightAngledRritangle rr = new RightAngledRritangle(3, 4);
		rr.Area();
		rr.Circumference();

		Shape et = new RightAngledRritangle(3, 4);
		et.Area();
		et.Circumference();

		Trapezia tr = new Trapezia(6, 10, 2);
		tr.Area();
		tr.Circumference();

		Shape elt = new Trapezia(6, 10, 4);
		elt.Area();
		elt.Circumference();
	}
}
