package homework;

import java.util.Random;

public class work_4_1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int a = r.nextInt(45) + 1;
		System.out.println(a);
		int b = r.nextInt(45) + 1;

		while (a == b) {
			b = r.nextInt(45) + 1;

		}
		System.out.println(b);
		int c = r.nextInt(45) + 1;

		while (c == a && c == b) {
			c = r.nextInt(45) + 1;

		}
		System.out.println(c);
		int d = r.nextInt(45) + 1;

		while (d == a && d == b && d == c) {
			d = r.nextInt(45) + 1;

		}
		System.out.println(d);
		int e = r.nextInt(45) + 1;

		while (e == a && e == b && e == c && e == d) {
			e = r.nextInt(45) + 1;

		}
		System.out.println(e);
		int f = r.nextInt(45) + 1;

		while (f == a && f == b && f == c && f == d && f == e) {
			f = r.nextInt(45) + 1;

		}
		System.out.println(f);
	}
}
