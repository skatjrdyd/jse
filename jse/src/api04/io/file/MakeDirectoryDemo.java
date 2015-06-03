package api04.io.file;

import java.io.File;

public class MakeDirectoryDemo {
	public static void main(String[] args) {
		File file = null;
		boolean isDirectory = false;
		
		try{
			// 원하는 경로를 파라미터로 입력함
			file = new File("C:"+File.separator+"Texts2");
			/*
			 * /가 디렉토리를 분할 할 때 사용
			 * 윈도우에서는 \\ 이걸 사용하기도 하고
			 * unix에서는 / 사용하기도 해서..
			 * 환경에 따라 프로그램에 에러를 발생시키는 사례가 빈번하여..
			 * File.separator 환경에 따라 동적으로 구분자를 주므로 에러가 발생하지 않는다.
			 * */
			if(!file.isDirectory()){
				// 폴더 생성
				isDirectory = file.mkdir();
				// 폴더 생성여부 알려줌
				System.out.println((isDirectory)?"폴더생성성공 !!" : "폴더생성실패..");
			}else{
				System.out.println("이미 존재합니다.");
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("MakeDirectoryDemo 에서 에러발생 !");
		}
	}
}
