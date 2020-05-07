package com.ssc.shape;

public class RightAngledRritangle extends Shape {
	private double a;
	private double b;

	public RightAngledRritangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public void Circumference() {
		double c = Math.sqrt(a * a + b * b);
		System.out.println("直角三角形的周长：" + (a + b + c));
	}

	public void Area() {
		System.out.println("直角三角形的面积：" + (a * b / 2));
	}

	public double getArea() {
		return (a * b / 2);
	}

	public String toString() {
		return "ch1005_12.RightAngledRritangle[直角边长:" + a + "," + b + ",面积:" + getArea() + ",周长:"
				+ (a + b + Math.sqrt(a * a + b * b)) + "]\n";
	}

}
