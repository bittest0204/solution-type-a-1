package problem04;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int cnt = 1;
		int strike = 0;
		int ball = 0;
		int start = 1;
		int end = 9;
		double range = end - start + 1;
		
		int randNum[] = new int[3];
	    while(randNum[0] == 0){
	        randNum[0] = (int)(new Random().nextDouble()*range+start);
	    }
	    while(randNum[0] == randNum[1] || randNum[1] == 0){
	        randNum[1] = (int)(new Random().nextDouble()*range+start);
	    }
	    while(randNum[0] == randNum[2] || randNum[1] == randNum[2] || randNum[2] == 0){
	        randNum[2] = (int)(new Random().nextDouble()*range+start);
	    }
	    
		System.out.println("생성된 숫자 " + String.valueOf(randNum[0])+String.valueOf(randNum[1])+String.valueOf(randNum[2]));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("야구게임");
		System.out.println();
		System.out.println("게임규칙");
		System.out.println("정답은 3자리 숫자이며,");
		System.out.println("3자리의 입력을 받습니다.");
		System.out.println();
		System.out.println("N - 도전횟수");
		System.out.println("S - 숫자와 위치가 모두 같은 경우의 개수");
		System.out.println("B - 숫자가 다른 자리에 있는 경우의 개수");
		System.out.println("O - 숫자가 없는 경우");
		System.out.println();
		
		while(true) {
			int input = sc.nextInt();
			int[] userInput = new int[3];
			userInput[0] = input/100;
			userInput[1] = input/10%10;
			userInput[2] = input%100%10;
			System.out.println(userInput[0]);
			System.out.println(userInput[1]);
			System.out.println(userInput[2]);
			for(int i = 0; i < 3; i ++) {
				for(int j = 0; j < 3; j++) {
					if( randNum[i] == userInput[j]) {
						if(i==j)
							strike++;
						else
							ball++;
					}
				}
			}
			
			System.out.print(String.valueOf(cnt) + " - S:" + String.valueOf(strike) + ", B:" + String.valueOf(ball) + ", O:" + String.valueOf(3-strike-ball));

			cnt++;
			
			
			if(strike == 3) {
				System.out.println("종료");
				break;
			}
			strike = 0;
			ball = 0;
			
		}
		
	}
}