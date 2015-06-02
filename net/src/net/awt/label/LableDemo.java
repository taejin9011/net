package net.awt.label;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LableDemo {
	public static void main(String[] args) {
		/*
		 * [1] ������Ʈ�� ����
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);
		// import ����Ű Ctrl + Shift + O
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 
		// toolkit ��ü ����.. new�� �ƴ� �޼ҵ� ���Ϲ�����ΰ�ü�� ������Ŵ
		Dimension dim = toolkit.getScreenSize(); // ȭ��ũ��
		
		Label labId = new Label(" ID: ");
		labId.setBounds(50,50,30,10); // 50,50�� ��ġ, 30,10�� ���μ���
		Label labPwd = new Label(" Password: ");
		labPwd.setBounds(50,65,100,10);
		/*
		 * [2] ������Ʈ�� ����
		 */
//		frame.setLayout(new FlowLayout());  // Flow�� ����ϸ� ��ǥ�� �����ϰ� x��ǥ���� ��ġ��
		frame.setLayout(null);
		// LayoutManager �߿��� FlowLayout ����ϰڴ�.
		frame.add(labId);
		frame.add(labPwd);
		
		/*
		 * [3] ������Ʈ�� ��üȭ
		 */
		frame.setLocation(dim.width/3, dim.height/3);
		// ��üȭ�鿡�� ����, ������ ��ġ�� �ΰڴ�.
		// Ư�� ����� ���ϴ� �ͺ��� ����ó�� dim �� ����ϸ�
		// �������� ȭ�鿡 ���� �������� ������ ȭ���� ũ�� �۵�
		// �߾� �αٿ� ��ġ�ϰ� ��
		frame.setVisible(true); 
	}
}
