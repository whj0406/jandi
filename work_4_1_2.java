package homework;

import java.util.Random;

public class work_4_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();

		int one = r.nextInt(100) + 1;

		int two = r.nextInt(100) + 1;
		while (two == one) {
			two = r.nextInt(100) + 1;
		}
		int thr = r.nextInt(100) + 1;
		while (thr == one && thr == two) {
			thr = r.nextInt(100) + 1;
		}
		System.out.println("뽑힌 숫자는 " + one + "," + two + "," + thr);
	}
}