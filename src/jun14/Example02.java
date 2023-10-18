package jun14;

import java.util.Arrays;

public class Example02 {
	/*
	 * 문자열 형식으로 입력 받은 모스코드(dot: . dash:-)를 해독하여 영어 문장으로 출력하는 프로그램을 작성하시오.
	 * 
	 * 글자와 글자 사이는 공백 하나, 단어와 단어 사이는 공백 두개로 구분한다.
	 * 
	 * 예를 들어 다음 모스부호는 "he sleeps early"로 해석해야 한다.
	 * 
	 * .... . ... .-.. . . .--. ... . .- .-. .-.. -.--
	 */
	public static void main(String[] args) {

		String[] mos = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		String a = ".... . ... .-.. . . .--. ... . .- .-. .-.. -.--";
		String[] aSplit = a.split(" ");
		char[] ch = new char[26];
		for (int c = 0; c < ch.length; c++) {
			ch[c] = (char) (c + 65);
		}
		
		
		
		System.out.println(Arrays.toString(ch));
		for (int i = 0; i < aSplit.length; i++) {
			for (int j = 0; j < mos.length; j++) {
				if (aSplit[i] == mos[j]) {
					aSplit[i] = mos[j];
					mos[j] = String.valueOf(ch[j]);
					
					System.out.println(Arrays.toString(aSplit));
				}
			}
		}

		
		
		
	}
}
