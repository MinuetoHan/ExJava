package chap6;
/*
다음 결과가 출력되도록 동물클래스 구현하기       
  동물클래스(Animal1)
    멤버변수 : 이름(name), 나이(age)
    멤버메서드: eat() ;
         기능 : "맛있게 얌얌" 출력
  동물클래스(Animal2)
    멤버변수 : 이름(name), 나이(age)
    멤버메서드: toString() 결과 출력
             
[결과]
===Animal1===
이름(name):원숭이
나이(age):20
맛있게 얌얌
===Animal2===
이름(name):원숭이
나이(age):20
맛있게 얌얌
*/
class Animal1 {
	String name;
	int age;
	void eat() {
		System.out.println("맛있게 얌얌");
	}
}

class Animal2 {
	String name;
	int age;
	//객체를 문자열화 하는 메서드. 참조변수가 출력되면 자동 호출되는 메서드
	public String toString() {
		return "이름(name):"+name+"\n"+"나이(age):"+age+"\n"+"맛있게 얌얌";
	}
} 

public class Test2 {
	public static void main(String[] args) {
        System.out.println("===Animal1===");
		Animal1 a1 = new Animal1();
		a1.name = "원숭이";
		a1.age = 20;
		System.out.println("이름(name):" + a1.name);
		System.out.println("나이(age):" + a1.age);
		a1.eat();	//맛잇게 얌얌
        System.out.println("===Animal2===");
		Animal2 a2 = new Animal2();
		a2.name = "원숭이";
		a2.age = 20;
		System.out.println(a2);

	}
}