package MainPackage;

import java.util.Scanner;

public class Triangle extends GeometricObject {
	private double side1,side2,side3;
	
	public Triangle(double s1, double s2, double s3){
		this.side1 = s1;
		this.side2 =s2;
		this.side3 = s3;
	}
	public static void main(String[] args){
		double s1,s2,s3;
		String color;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Color  ");
		color = input.nextLine();
		
		System.out.println("\nEnter All three sides \npressing enter with each entrysides: ");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
		System.out.println("\nFill triangle ?");
		
		Triangle firstT = new Triangle(s1,s2,s3);
		firstT.setColor(color);
		firstT.isFilled();
		
		System.out.println("Sides of " + firstT.toString());
		System.out.print("\nAre of Triangle  "+firstT.getArea());
		System.out.println("\nPerimeter of triangle" + firstT.getPerimeter());
		System.out.println("\nis Triangle filled "+ firstT.isFilled());
		
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	public double getArea(){
		double total = (side1+side2+side3)/2;
		double area = total*(total=side1)*(total-side2)*(total-side3);
		return area;
	}
	
	public double getPerimeter(){
		return (side1+side2+side3);
	}
	
}
