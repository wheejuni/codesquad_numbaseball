package codesquad_numbaseball;
import java.util.Scanner;

public class App {
	
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		boolean progSwitch = true;
		int repeatTimes = 3;
		int ballCount = 0;
		int strikeCount = 0;
		
		
		/*int [] result = NumShuffler.returnRandint();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}*/
		
		int [] computerBall = NumShuffler.returnRandint();
		System.out.println("랜덤한 숫자 3개가 생성되었습니다. \n 숫자야구를 시작합니다!");
		//System.out.println("랜덤한 숫자 세 개는 " + computerBall [0] + computerBall [1] + computerBall[2] + "입니다");//프로그램 테스트용 코드입니다.
		int [] userInputBall = new int [repeatTimes];
		
		while(progSwitch) {
			
			for (int i = 0; i < repeatTimes; i++) {
				System.out.println((i + 1) + "번째 숫자 입력: ");
				try {
				userInputBall [i] = input.nextInt();}
				catch(Exception e) {
					e.printStackTrace();;
				}
				
			}
		
		ballCount = Umpire.Ball(userInputBall, computerBall);
		strikeCount = Umpire.Strike(userInputBall, computerBall);
		System.out.println("볼카운트는 " + ballCount  + "B " + strikeCount + "S 입니다.");
		if (strikeCount == 3) {
			System.out.println("수뚜라익~~삼진!! 정답을 맞추셨습니다!");
			progSwitch = false;
		}
		}
	}

}
