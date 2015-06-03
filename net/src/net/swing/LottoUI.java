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

//lotto UI���� JFrame���� ��� ����� �ְ� �׼��� ��ɵ� ������ ��
public class LottoUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	Lotto lotto;
	JButton btn;
	JPanel pan_nth, pan_sth; //�г��߿��� ����, ����
	ImageIcon icon;
	List<JButton> btns;
	
	public LottoUI(){
		init(); 
		// ������ �ҽ��� �Ϻη� ������ �޼ҵ�� ó���ؼ�
		// ����� ��ġ�� ������� ȣ��ν� ����� �����ϵ��� �ϴ°�.
		// �ڹ� ��ũ��Ʈ�� ȣ�̽�Ʈ ���� ����
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
		String imgPath = "src/images/"+Integer.toString(i)+".gif"; //�̹��� ��θ� ���ϴ� ���� ����
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
		setTitle("�ζǻ�����");
		lotto = new Lotto(); // ������ ����ϴ� Ŭ������ Lotto�� �����ڿ� �ٿ���.
		btn = new JButton("������");
		btns = new ArrayList<JButton>();
		pan_nth = new JPanel();
		pan_sth = new JPanel();
		/*
		 * this�� LottoUI �� �� �� �ִ� ��� �߿���
		 * ActoinListner�� �޼ҵ� �� 	
		 * actionPerformed(ActionEvent e)��
		 * ��ư���� �ο��ϴ� ���̴�.
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
