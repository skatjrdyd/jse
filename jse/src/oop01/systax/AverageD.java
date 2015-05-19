package oop01.systax;

public class AverageD {
	public static void main(String[] args) {
		/*학생 객체생성 및 메모리 할당*/
		AverageC hulk = new AverageC();
		AverageC iron = new AverageC();
		AverageC hawk = new AverageC();
		/*이름 저장*/
		hulk.name = "헐크";
		iron.name = "아이언";
		hawk.name = "호크";
		
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
		System.out.println("==="+iron.name +"의 성적표===");
		System.out.println("국어점수 " + iron.kor);
		System.out.println("영어점수 " + iron.eng);
		System.out.println("총점 " + iron.tot);
		System.out.println("평균 " + iron.avg);
		System.out.println();
		
		System.out.println("==="+hulk.name +"의 성적표===");
		System.out.println("국어점수 " + hulk.kor);
		System.out.println("영어점수 " + hulk.eng);
		System.out.println("총점 " + hulk.tot);
		System.out.println("평균 " + hulk.avg);
		System.out.println();
		
		System.out.println("==="+iron.name +"의 성적표===");
		System.out.println("국어점수 " + iron.kor);
		System.out.println("영어점수 " + iron.eng);
		System.out.println("총점 " + iron.tot);
		System.out.println("평균 " + iron.avg);
	}
}
