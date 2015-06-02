package api03.text.simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
	public static void main(String[] args) {
		/*
		 * java.util.Date를 취한다..
		 * */
		Date today = new Date();
		/*
		 * 타입이 같은 변수를 선언할 때는
		 * 아래와 같이 한 번의 타입 선언과 다수의 변수선언이 가능하다.
		 * */
		SimpleDateFormat date01,date02,date03,date04;
		date01 = new SimpleDateFormat("yyyy-MM-dd");
		date02 = new SimpleDateFormat("yy년 MM월 dd일 E요일");
		// MM은 월을 뜻하고, mm은 분을 뜻함
		date03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 끝에 a가 있으면 현재시간이 오전인지 오후인지 밝힘
		date04 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		System.out.println(date01.format(today));
		System.out.println(date02.format(today));
		System.out.println(date03.format(today));
		System.out.println(date04.format(today));
		
	}
}
