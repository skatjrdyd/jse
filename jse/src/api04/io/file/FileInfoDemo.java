package api04.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfoDemo {
	public static void main(String[] args) {
		System.out.println("파일 이름을 넣으세요");
		String name = ""; //지역변수 초기화 필수
		// file api를 사용하고자 하면 try catch를 쓰고 본다.
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine(); // 스캐너처럼 한 단어가 아닌 한 문장을 읽어 들이기 위해
			// 스캐너보다 더 많은 문자를 읽어 들임으로 BufferedReader 사용 권장
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("FileInfoDemo 에서 에러남 !!");
		}
		// import 단축기 : ctrl + shift + o
		File file = new File(name);
		if(file.exists()){
			System.out.println("파일이름 : " + file.getName());
			System.out.println("파일경로 : " + file.getPath());
			System.out.println("쓰기가능여부 : " + file.canWrite());
			System.out.println("읽기가능여부 : " + file.canRead());
			System.out.println("파일 길이 : " + file.length() + "byte");
		}else{
			System.out.println("해당 파일은 존재하지 않음");
		}
	}
}
