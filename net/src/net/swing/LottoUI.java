package net.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//lotto UI에게 JFrame에게 모든 기능을 주고 액션의 기능도 가지게 함
public class LottoUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	Lotto lotto;
	JButton btn;
	JPanel pan_nth, pan_sth; //패널중에서 북쪽, 남쪽
	ImageIcon icon;
	List<JButton> btns;
	
	public LottoUI(){
		init(); 
		// 복잡한 소스를 하부로 보내고 메소드로 처리해서
		// 선언된 위치에 관계없이 호출로써 기능을 수행하도록 하는것.
		// 자바 스크립트의 호이스트 같은 개념
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btns.size()==0){
			makeBtns();
		}
		lotto.setLotto();  
		showLotto();
	}

	private void showLotto() {
		int[] arr = lotto.getLotto();
		for(int i=0; i<arr.length; i++){
			btns.get(i).setIcon(getIcon(arr[i]));
		}
	}
	private Icon getIcon(int i){
		String imgPath = "src/images/"+Integer.toString(i)+".gif"; //이미지 경로를 구하는 것은 직접
		return new ImageIcon(imgPath);
	}
	
	private void makeBtns() {
		JButton tmp = null;
		for(int i=0; i<6; i++ ){
			tmp = new JButton();
			btns.add(tmp);
			pan_sth.add(tmp);
		}
	}
	private void init() {
		setTitle("로또생성기");
		lotto = new Lotto(); // 로직을 담당하는 클래스인 Lotto를 생성자에 붙였다.
		btn = new JButton("생성기");
		btns = new ArrayList<JButton>();
		pan_nth = new JPanel();
		pan_sth = new JPanel();
		/*
		 * this는 LottoUI 가 할 수 있는 기능 중에서
		 * ActoinListner의 메소드 중 	
		 * actionPerformed(ActionEvent e)를
		 * 버튼에서 부여하는 것이다.
		 */
		btn.addActionListener(this);
		pan_nth.add(btn);
		add(pan_nth,BorderLayout.NORTH);
		add(pan_sth,BorderLayout.SOUTH);
		setBounds(300,400, 1200,300);
		setResizable(false);
		setVisible(true);
	}
}
