// 26.10.27 화
package ex03;

/* 원이 리브 미나미 메이 제나
 * 2004 2004 2006   18   17
 * 리더 보컬 보컬   랩   보컬
 */

class GMember{
	private String name;
	private int bYear;
	private String role;
	
	// 생성자 : 객체를 생성 (new) 할때 실행되는 명령
	public GMember() {
		System.out.println("Hi 방가.....");
	}
	public GMember(String n ,int bY,String r) {
		name = n;
		bYear = bY;
		role = r;
		
	}
	
	
	// methods : public
	public void info() {
		System.out.printf("%s %d %s \n", 
				name, bYear, role);
	}
}


public class MemberTest {
	// null 널 :변수를 만들었으나 사용한 적 없다
	// " " : 빈 문자열 empty String
	
	// 모두 대문자 : Ctrl + Shift + x
	// 모두 소문자 : Ctrl + Shift + y
	public static void main(String[] args) {
		/*GMember r = new GMember();
		System.out.println(r);
		r.name = "원이";
		r.info();
		GMember r2 = null;
		System.out.println(r2);
		*/
		
		GMember r1 = new GMember();
		// r1.name = "원이";
		// 오류 : private 변수를 . 으로 직접 사용했다
		// The field GMember.name is not visible
		
		// private 변수에 값을 넣는 방법 2가지
		GMember r2 = new GMember("원이", 2004, "리더");
		// 1. 생성자를 이용
		// 2. Getter / Setter 를 사용

	}
}


