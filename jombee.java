package homework;
import java.util.Random;
import java.util.Scanner;

public class jombee {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int spt = 1;
		int z1 = 7, z2 = 15;
	while(true) {
		System.out.println("왼쪽(1) 오른쪽(2) 점프(3) 종료(4): ");
		int me = in.nextInt();
		
		
		Random zr = new Random();

		 if (me == 1) {
			 spt--;
			 
			 System.out.printf("(1)왼쪽으로 움직였습니다. 현재 위치는 %d입니다.\n",spt);
		 } else if (me == 2) {
			 spt++;
			 System.out.printf("(2)오른쪽으로 움직였습니다. 현재 위치는 %d입니다.\n",spt);
		 }else if (me == 3){
			 Random r = new Random();
			 int jump = r.nextInt(3)+ 1;
			
			 spt += jump;
			 System.out.printf("(3)점프했습니다. 현재 위치는 %d입니다.\n",spt);
		 }else if(me ==4) {
			 System.out.println("게임을 종료합니다.");
			 break;
		 }
		 
		 if(spt <= 0) {
			 System.out.printf("맵밖으로 이동 할 수 없습니다.\n");
			 spt = 1;
		 }
		 
		 z1 = z1 + zr.nextInt(3)-1;
		 z2 = z2 + zr.nextInt(3)-1;
		 System.out.printf("좀비1의 좌표"+ z1 +"  좀비2의 좌표"+ z2+ "\n");
		 
		 if(z1 <= 0) {
			 
			 z1 += 1;
			 
		 }else if(z1 >= 21) {
			 z1 = 20;
		 }
		 if(z2 <= 0) {
			 
			 z2 += 1;
		 }else if(z2 >= 21) {
			 z2 = 20;
		 }
		 
		 if(spt == z1 || spt == z2) {
			 System.out.println("좀비에게 잡혔습니다. 처음위치에서 다시 시작합니다.");
			 spt = 1; z1 = 7; z2 = 15;
			 
		 }
		 if(spt >= 20) {
			 System.out.println("미션클리어!! 목적지에 도착했습니다.");
			 break;
		 }
	}		 
	in.close();
		 
		 
		
	}

}
