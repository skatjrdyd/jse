package api01.lang.string;
/*
 java.lang.String에 있는 메소드
 contain("a") : 문자열 중에 a가 있는지 체크 
 * */
public class ContainsDemo {
	public static void main(String[] args) {
		String str = "abcde";
		/*
		  (str.contains("f"))? "f가 있음" : "f가 없음"
		  
		 * */
		System.out.println((str.contains("f"))? "f가 있음" : "f가 없음");
	}
}
