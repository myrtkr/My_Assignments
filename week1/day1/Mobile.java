package week1.day1;

/*
 Assignment :2
- Create package name as week1.day1
- Create a  new class as "Mobile" under week1.day1
- Create 2 methods (makeCall() , sendMsg()) with simple print statement
- Create main method
- Create object for Mobile class and call the methods using the object
- Execute the class and get the result in console

 */
public class Mobile {
	public static void makeCall(){
		System.out.println("Go to contacts and call");
	}
	public static void sendMsg() {
		System.out.println("Go to messages and find contact");
	}
	public static void main(String[] args) {
		Mobile phone = new Mobile();
		
		phone.makeCall();
		phone.sendMsg();
	}

}
