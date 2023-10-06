package homework;

import java.util.Random;
import java.util.Scanner;

public class Fight {

	public static void main(String[] args) {
		System.out.println("격투게임 Start");
		Scanner in = new Scanner(System.in);
		
		int wid = 100;
		int war = 200;
		Random r = new Random();
			
		do {
			System.out.println("공격하려면 1을 누르세요.");
			int bt = in.nextInt();
			
			if (bt == 1) {
				int magic = r.nextInt(11) + 15;
				int attack = r.nextInt(11) + 5;
				
				war -= magic;
				wid -= attack;
						
				System.out.printf("마법사 HP : %d , 전사 HP : %d 입니다.\n", wid, war);
		
				if (wid <= 0 && war <= 0) {
					System.out.println("마법사와 전사가 동시에 죽었습니다.");
				}
				else if (wid <= 0 ) {	
					System.out.println("마법사가 죽었습니다.");
				}
				else if (war <= 0) {
					System.out.println("전사가 죽었습니다.");
				}
			}
			else {
				System.out.println("종료합니다.");
				break;
			}
		} while (war > 0 && wid > 0);
		
		in.close();
	}
}
