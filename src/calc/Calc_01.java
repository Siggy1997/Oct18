
package calc;

import java.util.Arrays;

public class Calc_01 {
	// 필드
	// 생성자
	// 메소드

	int plus(int num1, int num2) {
		System.out.println("출력문 : 계산을 시작합니다");
		return num1 + num2;
	}

	public static void main(String[] args) {
      Calc_01 calc = new Calc_01();

      String name = "가나다라마";
      int result = calc.plus(15, name.length());

      System.out.println(result);

      Lotto01 lotto = new Lotto01();
      lotto.choose();//중복제거
      lotto.sort();//정렬
      lotto.print();
   }

}// 클래스 밖

class Lotto01 {
	int[] lottoNum = new int[6];

	// 로또 번호 뽑는 메소드
	public int[] choose() {
		// 번호 뽑는 작업은 여기서...
		for (int i = 0; i < lottoNum.length; i++) {
			int temp = (int) (Math.random() * 45) + 1;
			boolean ch = true;

			for (int j = 0; j < i + 1; j++) {
				if (temp == lottoNum[j]) {
					ch = false;// 중복되면 거짓
					break;
				}
			}

			if (ch) {
				lottoNum[i] = temp;// 참이면 등록
			} else {
				i--;// 다시 실행
			}
		}
		return lottoNum;
	}

	public void sort() {
		Arrays.sort(lottoNum);
	}

	public void print() {
		for (int i = 0; i < lottoNum.length; i++) {
			System.out.print(lottoNum[i]);
			System.out.print(", ");
		}
	}

}