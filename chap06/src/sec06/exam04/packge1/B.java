package sec06.exam04.packge1;

public class B {
	A a1 = new A(true);
	A a2 = new A(1); // 같은 패키지는 default 접근제한 생성자 사용 가능.
	//A a3 = new A("문자열"); // private 생성자는 사용할 수 없음.
}
