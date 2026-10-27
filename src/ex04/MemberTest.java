// 26.10.27 화

package ex04;

import java.time.LocalDate;

/* 원이 리브 미나미 메이 제나
 * 2004 2004 2006   18   17
 * 리더 보컬 보컬   랩   보컬
 */

class GirlMember{
	// fields
	private String role;
	private String name;
	private int bYear;
	
	// constructor
	
	// method
	public void info() {
		int age =LocalDate.now().getYear();
		System.out.printf("%s %d %d %s\n",
				name, bYear, age, role);
	}

	public GirlMember(String role, String name, int bYear) {
		super();
		this.role = role;
		this.name = name;
		this.bYear = bYear;
	}
}

public class MemberTest {

	public static void main(String[] args) {
		GirlMember resc1 =new GirlMember("원이", "리더", 2004);
		resc1.info();
		GirlMember resc2 =new GirlMember("리브", "리더", 2004);
		resc2.info();
		GirlMember resc3 =new GirlMember("미나미", "보컬", 2006);
		resc3.info();
		GirlMember resc4 =new GirlMember("메이", "랩", 18);
		resc4.info();
		GirlMember resc5 =new GirlMember("제나", "보컬", 17);
		resc5.info();
		System.out.println("\n");
		
		GirlMember[] rescArr = new GirlMember[5];
		
		rescArr[0] = new GirlMember("원이","리더",2004);
		rescArr[1] = new GirlMember("리브","보컬",2004);
		rescArr[2] = new GirlMember("미나미","보컬",2006);
		rescArr[3] = new GirlMember("메이","랩",18);
		rescArr[4] = new GirlMember("제나","보컬",17);
		
		for(int i=0; i<rescArr.length; i++) {
			rescArr[i].info();
		}
		
		/*rescArr[0].info();
		rescArr[1].info();
		rescArr[2].info();
		rescArr[3].info();
		rescArr[4].info();*/
		
				
				
	}

}
