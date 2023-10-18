package calc;

import java.util.Arrays;
import java.util.Iterator;

public class Calc {


	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		// lotto.choose();

		int[] number = lotto.choose();

		// lotto.print(lotto.choose());

		// 중복제거
		// 정렬
		int[] number23 = lotto.sort(number);
		lotto.print(number23);
	}
}

class Lotto {
	// 로또 번호 뽑는 메소드
	public int[] choose() {
		int[] lottoNum = new int[6];
		// 번호 뽑는 작업은 여기서....
		for (int i = 0; i < lottoNum.length; i++) {

			int temp = (int) (Math.random() * 45 + 1);
			boolean ch = true;

			for (int j = 0; j <= i; j++) {
				if (temp == lottoNum[j]) {
					ch = false;
					break;
				}
			}
			if (ch) {
				lottoNum[i] = temp;
			} else {
				i--;
			}
		}
		System.out.println(Arrays.toString(lottoNum));
		return lottoNum;
	}

	public int[] sort(int[] i) {
		Arrays.sort(i);
	
		return i;
	}

	public void print(int[] number) {
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]);
			System.out.print(", ");

		}

	}
}