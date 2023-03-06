package week3day1;

public class AxisBank extends BankiInfo {
	public int deposit() {
		return 15000;
	}
	public static void main(String[] arg){
		AxisBank totalSaving = new AxisBank();
		
		int d = totalSaving.deposit();
		int f = totalSaving.fixed();
		int s = totalSaving.saving(d, f);
		
		System.out.println(d);
		System.out.println(f);
		System.out.println(s);
		
	}
	

}
