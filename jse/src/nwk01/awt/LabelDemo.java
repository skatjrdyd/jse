package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트를 만든다. 조립할 객체를 생성한다.
		 * */	
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300); //(너비, 높이)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dim = toolkit.getScreenSize();
		
		Label labId = new Label("ID : ");
		labId.setBounds(50, 50, 30, 10);
		Label labPwd = new Label("Password : ");
		labPwd.setBounds(50, 65, 100, 10);
		/*
		 * [2] 만들어진 컴포넌트들을 조립한다.
		 * */
		// frame.setLayout(new FlowLayout());
		/*
		 * FlowLayout() 은 가로로 (좌에서 우로) 정렬시킨다.
		 * */
		frame.setLayout(null); // null 이면 x,y 좌표로 정렬된다.
		frame.add(labId);
		frame.add(labPwd);
		
		
		/*
		 * [3] 컴포넌트를 화면에 띄운다.
		 * */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		// 프레임의 좌표값에 따라 화면에서 보여지는데
		// 위 방식처럼 하면 고정된 위치가 아닌 화면 크기에 따라 동적으로 변화된다.
		// 즉, 14인치 화면이든 6인치 스마트폰 화면이든 
		// 가운데 쯤에 프레임이 보여지게 된다.
		frame.setVisible(true);
	}
}
