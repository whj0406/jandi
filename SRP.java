package homework;

import java.util.Scanner;

public class SRP {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a =0,b= 0;
		do {
			System.out.println("가위(1) 바위(2) 보(3) 를 선택하시오 : ");
			int me =in.nextInt();
			int computer = (int)(Math.random()*3);
			
			
			if(me == 4 ) {
				System.out.printf("시스템을 종료합니다.\n");
				break;
			}
			
			
			if(me == 1 && computer == 2) {
				System.out.printf("나 : 가위, 컴퓨터 : 바위, 내가 졌습니다.\n");
				b++;
			}
			if(me == 1 && computer == 3) {
				System.out.printf("나 : 가위, 컴퓨터 : 보, 내가 이겼습니다.\n");
				a++;
			}
			if(me == 1 && computer == 1) {
				System.out.printf("나 : 가위, 컴퓨터 : 가위, 비겼습니다.\n");
			}
			if(me == 2 && computer == 2) {
				System.out.printf("나 : 바위, 컴퓨터 : 바위, 비겼습니다.\n");
			}
			if(me == 2 && computer == 3) {
				System.out.printf("나 : 바위, 컴퓨터 : 보, 내가 졌습니다.\n");
				b++;
			}
			if(me == 2 && computer == 1) {
				System.out.printf("나 : 바위, 컴퓨터 : 가위, 내가 이겼습니다.\n");
				a++;
			}
			if(me == 3 && computer == 2) {
				System.out.printf("나 : 보, 컴퓨터 : 바위, 내가 이겼습니다.\n");
				a++;
			}
			if(me == 3 && computer == 3) {
				System.out.printf("나 : 보, 컴퓨터 : 보, 비겼습니다.\n");
			}
			if(me == 3 && computer == 1) {
				System.out.printf("나 : 보, 컴퓨터 : 가위, 내가 졌습니다.\n");
				b++;
			}
			
			System.out.printf("나: %d  컴: %d \n",a,b);
			
		} while(a < 3 && b < 3);
		
		if (a > b) {
			System.out.println("내가 이겼습니다.");
		}
		else if (b > a) {
			System.out.println("내가 졌습니다.");
		}
		
		
	}

}