package week1.day1;

public class Car{
	
	public static void driveCar(){
		System.out.println("Start by pressing start button");
	}
	public static void applyBrake() {
		System.out.println("When find red light on signal");
	}
	public static void soundHorn() {
		System.out.println("Honk only when its your right of way");
	}
	public static void isPuncture() {
		System.out.println("Find garage soon");
	}
	public static void main(String[] args) {
		Car driver = new Car();
		
		driver.driveCar();
		driver.applyBrake();
		driver.soundHorn();
		driver.isPuncture();
		
	}

}
