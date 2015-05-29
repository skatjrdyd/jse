package api02.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * java.util.ArrayList 의 메소드인
 * add()는 벡터의 add() 와 동일하다
 * */
public class AddDemo {
	public static void main(String[] args) {
		/*
		 * Vector는 내부적으로 String 사용. 속도가 느림. 동기화 지원
		 * ArrayList는 내부적으로 StringBuffer 사용. 동기화 지원하지 않음
		 * */
		ArrayList<String> lists = new ArrayList<String>();
		
		// 항목추가
		lists.add("서울");
		lists.add("부산");
		lists.add("대구");
		
		// 출력 1 : iterator() 이용
		Iterator<String> it1 = lists.iterator();
		/*
		 * Iterator 를 선언하고 나서 while을 코딩하면
		 * 3가지의 이클립스 제안이 나온다. ...while iterator를 선택
		 * */
		while (it1.hasNext()) {
			System.out.printf("%s",it1.next());
			// 윗 구분 중 printf 인 것에 주의!
			// printf는 포맷팅한 결과를 콘솔에 출력하겠다는 의미
			// %s 는 String 값을 의미하ㅁ, 다음 구문인
			// it1.next() 의 리턴값을 보여주는 역할을 한다.
			// 여기서 %s 와 s 는 String을 의미
			// 만약 숫자를 포맷팅한다면 %d 이며 이때 d는 decimal, 10진수 의미
			
		}
		System.out.println();
		// 출력 : listiterator이용
		ListIterator<String> it2 = lists.listIterator();
		while (it2.hasNext()) {
			System.out.printf("%s",it2.next());
		}
		System.out.println();
		// 출력 : previous 이용
		while (it2.hasNext()) {
			System.out.printf("%s",it2.previous());
	}
		List<String> list2 = new ArrayList<String>();
		list2.addAll(lists); // 서울, 부산 ,대구를 옮겨 담았다.
		/*
        출력. 확장 for이용
        */
		for(String s : list2){
			System.out.printf("%s", s);
		}
		System.out.println();
		// 검색명령을 위한 데이터 추가
		list2.add("광주");
		list2.add("대전");
		list2.add("인천");	
	
		Iterator<String> it3 = list2.iterator();
		String str;
		while (it3.hasNext()) {
			str = it3.next();
			
			if(str.startsWith("대")){
				System.out.printf("%s", str);
			}
			
		}
			System.out.println();
			list2.add("대전");
			list2.add("대전");
			list2.add("서울");
			
			Iterator<String> it4 = list2.iterator();
			while (it4.hasNext()) {
				System.out.printf("%s", it4.next());
	
			}
				System.out.println();
	}	
	
}


