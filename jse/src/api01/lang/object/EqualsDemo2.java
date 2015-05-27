package api01.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1555555");
		Person p2 = new Person("800101-1555555");
		String result = "";
		result = (p1 == p2) ? "p1과 p2는 같은사람" : "p1과 p2는 다른사람";
		System.out.println("(p1 == p2)의 결과값 : " + result); // 해쉬코드 주소값을 비교하고 있음
		//(p1 == p2)의 결과값 : p1과 p2는 다른사람
		
		result = (p1.equals(p2)) ? "p1과 p2는 같은사람" : "p1과 p2는 다른사람";
		System.out.println("(p1.equals(p2)의 결과값 : " + result);  //equals는 실제 literal value를 비교
		//(p1.equals(p2)의 결과값 : p1과 p2는 같은사람
	}
}
class Person{
	private String ssn; // 주민번호
	public Person(String ssn) {
		this.ssn = ssn;
	}
	// getter, setter 만드는 단축기 : alt + shift + s
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person){
			return ssn == ((Person)obj).ssn;
		}else{
			return false;
		}
	}
	
}