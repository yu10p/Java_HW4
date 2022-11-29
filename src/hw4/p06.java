package hw4;

public class p06 {
	public static void main(String[] args) {
		RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
	}
}
/*
//parent class
class Car{
	private int num;
	private double gas;
	
	//constructor
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Car(int n, double g) {
		num = n;
		gas = g;
		System.out.println("生產了車號為"+ num + "，汽油量為" + gas + "的車子");
	}
	
	public void setCar(int n,double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+ num +"，汽油設設為"+ gas);
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
	
	public RacingCar(int n, double g, int c) {
		//super()，用來調用parent的constructor，必須寫在第一行
		super(n, g);
		course = c;
		System.out.println("生產了編號為"+ course + "的賽車");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車邊號設為"+ course);
	}
}
*/