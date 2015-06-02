package net.awt.frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameDemo {
	public static void main(String[] args) {
		/*
		 * [1] 컴포넌트의 생성
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);
		// import 단축키 Ctrl + Shift + O
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		// toolkit 객체 생성.. new가 아닌 메소드 리턴방식으로객체를 생성시킴
		Dimension dim = toolkit.getScreenSize(); // 화면크기
		
		/*
		 * [2] 컴포넌트의 구체화
		 */
		frame.setLocation(dim.width/3, dim.height/3);
		// 전체화면에서 절반, 절반의 위치에 두겠다.
		// 특정 사이즈를 잘하는 것보다 위에처럼 dim 을 사용하면
		// 보여지는 화면에 따라 동적으로 무조건 화면이 크든 작든
		// 중앙 부근에 위치하게 됨
		frame.setVisible(true); 
	}
}
