package jun14;
//사람을 만들어보겠습니다.

class Human {
	// 필드
	String name;
	byte age;

	String adress;
	String ssn;

	// 생성자
	// 메소드 : 되돌려주는 타입, void는 되돌려주는 값이 없을때
	public Human what() {
		return new Human();
	}
	
	public  boolean eat(){
		return false;
	}

	public int sleep() {
		return 1;
	}

	public void work() {
		System.out.println(name+ "zzzz");
		String ng = "홍길동";
		name = ng;

		}
}

public class CM01 {
	public static void main(String[] args) {
		
		
		Human human = new Human();
		human.work();
		
		System.out.println(human.name);
		human.sleep();
		
		/*
		Apple a1 = new Apple();
		System.out.println(a1.age);
		*/
	}
}
