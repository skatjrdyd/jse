package api02.util.calendar;

import java.util.Calendar;
import api01.lang.object.ToStringDemo;

public class CalendarDemo {
	public static void main(String[] args) {
		// Calendar 의 getInstance()는 스태틱이라
		// 클래스를 통해 바로 불러와서 인스턴스를 생성한다.
		// 그래서 new Calendar()와 같은
		// 생성자 문법을 사용하지 않고 아래처럼 생성했다.
		Calendar date = Calendar.getInstance();
		System.out.print("날짜 : "  ); // println은 줄 개행까지 포함이고, ln을 지우면 개행이 없다.
		System.out.print(date.get(Calendar.YEAR) + "년");
		System.out.print((date.get(Calendar.MONTH)+1) + "월");
		System.out.print(date.get(Calendar.DATE) + "일");
		/*
		 * 위 결과를 그대로 출력하면 날짜 : 2015년4월29일 라고 나온다.
		 * 자바 API 튜토리얼에서 "calendar is January which is 0"
		 * 즉, 월은 0부터 시작하므로 위 식에서 1을 더해서 출력해야 한다.
		 * */
		System.out.println();
		System.out.print("현재시간 : ");
		System.out.print(date.get(Calendar.HOUR) + "시");
		System.out.print(date.get(Calendar.MINUTE) + "분");
		System.out.print(date.get(Calendar.SECOND) + "초");
		/*
		 * 프로그램 트라이얼 보면 30일 사용제한 같은 것이 걸린 것을 본 케이스라면...
		 * 30일 후의 시간을 자동으로 반환하는 로직도 필요합니다. 
		 * */
		System.out.println("현재 기준 임의의 시간을 설정할 때 ");
		System.out.println("30일 후의 날짜를 얻고자 할때. ");
		date.add(Calendar.DATE, 30);
		System.out.println("7시간전의 시간을 얻고자 할때");
		date.add(Calendar.HOUR, -7);
		System.out.println(toString(date));
		/*
		 * 스케쥴 프로그램을 작성할 때 특정일자를 픽스해야 하는 경우에는 다음과 같이 처리
		 * */
		date.set(Calendar.HOUR, 22);
		date.set(Calendar.MINUTE, 30);
		date.set(Calendar.SECOND, 45);
		System.out.print("수정된 시간은 : ");
		System.out.print(date.get(Calendar.HOUR) + "시");
		System.out.print(date.get(Calendar.MINUTE) + "분");
		System.out.print(date.get(Calendar.SECOND) + "초");
		/*
		 * 바로 출력을 하면 시스템에서 제공하는 시간들이 나옵니다.
		 * 따라서 toString() 을 오버라이딩 해야합니다.
		 * 여기서는 static으로 별도로 작성합니다.
		 * */
		
	}
	public static String toString(Calendar date){
		return date.get(Calendar.YEAR)+"년"
				+ date.get(Calendar.MONTH)+"월"
						+ date.get(Calendar.DATE)+"일";
				
	}

}
