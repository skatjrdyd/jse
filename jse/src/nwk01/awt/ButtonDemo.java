package nwk01.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class ButtonDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 * */	
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300); //(너비, 높이)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		Button btnOk = new Button("확 인");
		btnOk.setSize(100, 50);
		btnOk.setBackground(Color.green);
		btnOk.setLocation(100, 75);  //(x좌표,y좌표)
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 * */
		frame.setLayout(null);
		frame.add(btnOk);
		
		
		/*
		 * [3] 컴포넌트를 화면에 띄운다.
		 * */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		// 프레임의 좌표값에 따라 화면에서 보여지는데
		// 위 방식처럼 하면 고정된 위치가 아닌 화면 크기에 따라 동적으로 변화된다.
		// 즉, 14인치 화면이든 6인치 스마트폰 화면이든 
		// 가운데 쯤에 프레임이 보여지게 된다.
		frame.setVisible(true);
		/*
		 * 한글깨짐 솔루션
		 * 프로젝트명 우클릭
		 * > 맨 밑 properties 클릭
		 * > run/debug settings 클릭
		 * > 현재 클래스명 더블클릭 
		 * > arguments 탭 클릭
		 * > VM arguments 빈공간에
		 * > -Dfile.encoding=MS949라고 입력
		 * > 저장 후 재 실행
		 * */
	}
}
