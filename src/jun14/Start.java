package jun14;

import java.util.Scanner;

//클래스 선언
//클래스는 대문자로 시작

class Apple {
	// 필드 = 변수 = 인스턴스 변수 = 초기화 하지 않아도 쓸 수 있습니다.
	String color;
	int age;

	// 생성자 = 인스턴스를 발생하기 위한 코드 = 메소드

	// 메소드
	// (메소드 안에서만) 지역변수는 초기화 해야합니다. = 선언 + 값대입
	public void info() {
		System.out.println("색상 : " + color);
		System.out.println("나이 : " + age);
	}
}

public class Start {
	public static void main(String[] args) {

		// 인스턴스 만들기
		// 데이터타입 변수명 = 값
		int num = 100;
		Apple apple = new Apple();
		Apple apple2 = new Apple();
		System.out.println(apple);
		String str = new String("Hi");
		Scanner sc = new Scanner(System.in);

		apple.color = "빨강";
		apple.age = 10;

		apple.info();

		System.out.println(apple2.color);

	}

}
