package hw4;

public class p04 {
	public static void main(String[] args) {
		
		RacingCar rccar1;
		//會先調用parent class的constructor，再調用child class的constructor
		rccar1 = new RacingCar();
		
		rccar1.setCar(1234,20.5);
		
		rccar1.setCourse(5);
		
	}
}

//parent class
class Car{
	private int num;
	private double gas;
	
	//constructor
	public Car() {
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為" + num + "，汽油量設為" + gas);
	}
	
	public void show() {
		System.out.println("車號是"+ num);
		System.out.println("汽油量是" + gas);
	}
}

//child class
//extends將Class RacingCar設為Class Car的延伸
//Class RacingCar 會inheritance(繼承) Class Car 所有屬性
class RacingCar extends Car{
	private int course;
	
	//constructor
	public RacingCar() {
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public void setCourse(int c) {
		course = c;
		System.out.println("將賽車編號設為" + course);
	}
}
