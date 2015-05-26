package oop01.encapusle;

public class AverageC {
	/*필드값 선언*/
	String name;
	int kor;
	int eng;
	int tot; // 합계
	double avg;
	
	/*이름저장 기능*/
	public void setName(String foo){              //괄호안에 있는 거랑 밑에 this 옆에 있는 foo랑 같게 하자.
		this.name = foo;                          //그냥 Name만 쓰면 메소드 안에 지역변수로 인식하니, 구별하기 위해 this.를 씀
		// 이 부분 중요!! this.인변 = 매개변수ㄴ
	}
	/*점수를 저장하는 기능*/
	public void setKor(int kor){                 // 괄호안에 kor가 필드값 선언에 있는 kor가 아니다
		this.kor = kor;
	}
	/*영어 점수를 저장하는 기능*/
	public void setEng(int eng){
		this.eng = eng;
	}
	/*합계를 저장하는 기능*/
	public void setTot(int kor, int eng){
		this.tot = kor + eng;
	}
	/*평균을 저장하는 기능*/  
	public void setAvg(int kor, int eng){
		this.avg = (kor + eng)/2;
	}
	/*평균을 저장하는 기능2*/
	public void setAvg2(int tot){
		this.avg = tot/2;
	}
}
