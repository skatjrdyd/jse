package cmm04.ary;

public class No02_StringArrayDemo {
	public static void main(String[] args) {
		String[] juso = {"서울","종로","광화문"}; // juso뒤에 juso[]이렇게 해도 됨
		
		for(int i = 0; i < juso.length; i++){     // int < 3 해도 되는데 만약 숫자가 커지면 세기 힘드니, 배열 이름 치고 . 치고 length 선택
			System.out.println("주소는 " + juso[i]);
		}
		
		/*juso[0] = "서울";
		  juso[1] = "종로";
		  juso[2] = "광화문";
		*/
		}
}
