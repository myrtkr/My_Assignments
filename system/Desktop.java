package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop size is better for office work");
		System.out.println("Turn on to do office work");
		System.out.println("Turn off when office is done");
	}
	public static void main (String[] args) {
		Desktop pc = new Desktop();
		pc.computerModel();
		pc.desktopSize();
		
	}

}
