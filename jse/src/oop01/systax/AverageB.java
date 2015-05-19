package oop01.systax;

public class AverageB {
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
	public static void main(String[] args) {
		/*학생 객체생성 및 메모리 할당*/
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA hawk = new AverageA();
		/*이름 저장*/
		hulk.Name = "헐크";
		iron.Name = "아이언";
		hawk.Name = "호크";
		
		/*점수 저장*/
		hulk.kor = 100;
		hulk.eng = 80;
		iron.kor = 50;
		iron.eng = 90;
		hawk.kor = 20;
		hawk.eng = 40;
		
		/*총점과 평균을 계산하는 기능*/
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot/2;
		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot/2;
		hawk.tot = hawk.kor + hawk.eng;
		hawk.avg = hawk.tot/2;
		
		/*출력*/
		System.out.println("==="+iron.Name +"의 성적표===");
		System.out.println("국어점수 " + iron.kor);
		System.out.println("영어점수 " + iron.eng);
		System.out.println("총점 " + iron.tot);
		System.out.println("평균 " + iron.avg);
		System.out.println();
		
		System.out.println("==="+hulk.Name +"의 성적표===");
		System.out.println("국어점수 " + hulk.kor);
		System.out.println("영어점수 " + hulk.eng);
		System.out.println("총점 " + hulk.tot);
		System.out.println("평균 " + hulk.avg);
		System.out.println();
		
		System.out.println("==="+iron.Name +"의 성적표===");
		System.out.println("국어점수 " + iron.kor);
		System.out.println("영어점수 " + iron.eng);
		System.out.println("총점 " + iron.tot);
		System.out.println("평균 " + iron.avg);
	}
}
