import java.util.Scanner;

public class Main {
	
	static MyScanner mSc = new MyScanner ();
	static MyR myR = new MyR ();
	static boolean b = false;
	static Object ob;
	
	public static void main(String[] args) {
		do {
			b = false;
			System.out.println("������ ��� �� ��������� Enter:");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			mSc.setData(str);
			ob = mSc.myScanerMethod();
			if (ob == null) {
				System.out.println("������ ��������! �������� ��������.");
				b = true;
			} else {
				System.out.println(ob);
				b = false;
			}
		} while (b);
	}
}