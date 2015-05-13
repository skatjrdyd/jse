package cmm03.flow;

import java.util.Scanner;

public class No02_IfElseDemo02 {
	public static void main(String[] args) {
		
		int kor = 0, eng = 0, math = 0, sum = 0;  // 지역변수 선언시(임시값을 줄 때 타입의 기본값을 주는 걸) default값을 줘야한다.
		double avg = 0.0;
		String msg = "message";
		/*char m = 'm';
		char e = 'e';*/
		Scanner scanner = new Scanner(System.in);       // sum과 avg를 계산하기 전에 스캐너를 올려야 내가 입력하는값을 더해서 원하는 평균을 준다.
		System.out.println("국어점수를 입력하세요.");
		kor = scanner.nextInt();						// 콘솔창 커서 다음에 숫자를 입력하라는 의미
		System.out.println("영어점수를 입력하세요.");
		eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = scanner.nextInt();
		
		sum = kor + eng + math;
    //avg = Math.floor(sum/3);
		avg = sum / 3;
		
		if(avg==100){
			msg = "보너스 지급";
		}else if(avg > 70){
			msg = "시험 합격";
		}else {
			msg = "재시험을 보세요";
		}
		
		
		System.out.println("국어 = " + kor);
		System.out.println("영어 = " + eng);
		System.out.println("수학 = " + math);
		System.out.println("평균 = " + (int)avg);  // 캐스팅을 써서 type을 int로 바꿔서 소숫점 밑을 버린다.
		System.out.println("귀하의 시험 결과 = " + msg + "입니다.");
		
		
		
	}
}
//String도 객체 : abc이렇게 알파벳이 합쳐진거