package staticDemo;

public class Statdemo {
	private static int count=0;
	public Statdemo() {
		// TODO Auto-generated constructor stub
		count++;
		System.out.println(count);
	}
	/*public void disp() {
		System.out.println(count);
	}*/
	public static void main(String[] args) {
		Statdemo s1 = new Statdemo();
		Statdemo s2 = new Statdemo();
		Statdemo s3 = new Statdemo();
		Statdemo s4 = new Statdemo();
		Statdemo s5 = new Statdemo();
		Statdemo s6 = new Statdemo();
	}
}
