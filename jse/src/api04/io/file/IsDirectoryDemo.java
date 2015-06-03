package api04.io.file;

import java.io.File;

/*
 * java.io.File 의 메소드인
 * isFile() : 해당 파일이 존재하는지 여부 체크
 * isDirectory() : 해당 폴더가 존재하는지 여부 체크
 * */
/*
 * 폴더 vs 디렉토리
 * 둘은 같은 의미이다. 그러나 약간의 의미적 차이가 있다.
 * 디렉토리 : cmd 모드에서 경로 구분시 사용
 * 폴더 : GUI모드(윈도우 3.5버전부터) 마우스로 제어하면서 이미지 아이콘을 지침.
 * */
public class IsDirectoryDemo {	
	public static void main(String[] args) {
		
	
	String directory = "c:\temp";
	File file = new File(directory);
	// 디렉토리 검사
	if(file.isDirectory()){
		System.out.println("검색 디렉토리 : " + directory);
		System.out.println("디렉토리 내부 목록");
		String[] str = file.list();
		for(int i = 0;i<str.length;i++){
			File file2 = new File(directory + "/" + str[i]);
			if(file2.isDirectory()){
				System.out.println(str[i] + " 디렉토리");
			}else{
				System.out.println(str[i] + " 파일");
			}
		}
	}
}
}
