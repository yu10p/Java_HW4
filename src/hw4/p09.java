package hw4;

public class p09 {
	public static void main(String[] args) {
		RacingCar rccar1;
		rccar1 = new RacingCar();
		
		rccar1.newShow();
	}
}
/*
//parent class
class Car{
	//protected可以讓其child class存取
	protected int num;
	protected double gas;
	
	//constructor
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+ num + "，汽油量設為" + gas);
	}
	
	public void show() {
		System.out.println("車號是"+ num);
		System.out.println("汽油量是"+ gas);
	}
}

//child class
class RacingCar extends Car{
	private int course;
	
	//constructor
	public RacingCar() {
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為"+ course);
	}
	
	public void newShow() {
		System.out.println("賽車的車號是"+ num);
		System.out.println("汽油量是"+ num);
		System.out.println("賽車編號是"+ course);
	}
}
*/
