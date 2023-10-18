package jun14;

import java.util.Arrays;
import java.util.Scanner;

public class Example01 {
	public static void main(String[] args) {

		/*
		 * 1. 10번게임을 합니다 2. 사용자가 1가위 2바위 3보 중 하나 선택 3. 컴퓨터는 랜덤으로 1~3을 뽑아서 비교하기 4. 승패를
		 * 저장합니다 5. 10번게임이 끝나면 승률을 출력하세요 예) 5승2패 3 비김 75%
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보를 합니다");
		System.out.println("1.가위 2.바위 3.보");

		int game = 1;
		int[] per = new int[3];
		// 변수 정해주기 : i = 승 j = 패 k = 비김
		int i = 1;
		int j = 1;
		int k = 1;

		// 1~3랜덤하게 받기
		int comp = (int) (Math.random() * 3 + 1);

		// 10번게임 하기
		for (game = 1; game < 11; game++) {

			// 입력 받기
			int input = sc.nextInt();

			System.out.println(comp);
			// 승리할 경우
			if ((input == 1 && comp == 3) || (input == 2 && comp == 1) || (input == 3 && comp == 2)) {

				per[0] = i;
				i += 1;
				System.out.println("승");
				// 패할경우
			} else if ((input == 1 && comp == 2) || (input == 2 && comp == 3) || (input == 3 && comp == 1)) {

				per[1] = j;
				j += 1;

				System.out.println("패");
				// 비길 경우
			} else if (input == comp) {

				per[2] = k;
				k += 1;
				System.out.println("비김");

			}

			comp = (int) (Math.random() * 3 + 1);
		}
		System.out.println(Arrays.toString(per));
		System.out.println(per[0] % game * 10 + "%");
		sc.close();
	}
}
