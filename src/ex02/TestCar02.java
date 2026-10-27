// 26.10.27 화
package ex02;

// private   : 해당 클래스에서만 사용가능
// package   : 해당 클래스에서만 사용가능
// protected : 해당 패키지에서 사용가능 (접근제한자를 생략하면)
// public    : package + protected(상속 관계에서 공유)


// class: 설계도 우리가 표현하고 싶은 대상(객체)
class Car{
	// Fields
	String name;
	String color;
	int year;
	
	// method
	void info(){
		System.out.println("차이름: " + name);
		System.out.println("색상: " + color);
		System.out.println("연식: " + year + "\n");
	}
}


public class TestCar02 {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "아빠차";
		car1.color = "Black";
		car1.year = 2024;
		car1.info();
		
		Car car2 = new Car();
		car2.name = "엄마차";
		car2.color = "Red";
		car2.year = 2025;
		car2.info();
		

	}

}
