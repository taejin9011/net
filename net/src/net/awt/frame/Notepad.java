package net.awt.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Notepad extends Frame{
	private TextArea ta = new TextArea();
	private Font font = new Font("�ü�ü",Font.BOLD,30);
	public Notepad(){
		ta.setFont(font);
		this.add(ta);
		
		// ȭ�� ������ ��� ũ�� �����
		this.setTitle("�޸���");
		this.setBackground(Color.YELLOW); // ����ȭ�� ������ �ַ��� Panel�� �־����
		this.setBounds(100, 100, 600, 450); // ��ǥ, ����,����
		this.setVisible(true); //ȭ���� �����ֶ�
		//ExitAdapter exit = new ExitAdapter();
		this.addWindowListener(new ExitAdapter());
	}
	public static void main(String[] args) {
		new Notepad();  // ��ü �̸��� ���� => ��ϸӽ�
	}
	class ExitAdapter extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("������ â�� �ݽ��ϴ�.");
			System.exit(1);
			// ��¥ ����ó��.. ���� ���� ���� ���α׷��� ������� ���
		}
	}
}
