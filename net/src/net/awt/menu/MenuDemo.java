package net.awt.menu;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

public class MenuDemo {
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
		
		MenuBar menuBar = new MenuBar();
		Menu menuFile = new Menu("File"); // �޴��� File�̶�� ��Ÿ��
		
		MenuItem itemNew = new MenuItem("New");
		MenuItem itemOpen = new MenuItem("Open");
		Menu subMenu = new Menu("Others");
		MenuItem itemExit = new MenuItem("Exit");
		
		MenuItem subMenuPrint = new MenuItem("Print");
		MenuItem submenuPreview = new MenuItem("Preview");
		MenuItem submenuSetup = new MenuItem("RpintSetup");
		
		/*
		 * [2] ������Ʈ ����
		 */
		subMenu.add(subMenuPrint);
		subMenu.add(submenuPreview);
		subMenu.add(submenuSetup);
		
		Menu menuEdit = new Menu("Edit");
		Menu menuView = new Menu("View");
		Menu menuHelp = new Menu("Help");
		
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.add(subMenu);
		menuFile.addSeparator();  // �޴����� �и����� ��Ÿ��
		menuFile.add(itemExit);
		
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		menuBar.add(menuView);
		menuBar.setHelpMenu(menuHelp);
		
		frame.setMenuBar(menuBar);
				
		
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
