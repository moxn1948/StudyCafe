package com.kh.studyCafe.admin.view;

import javax.swing.JFrame;

public class AdmMainFrame extends JFrame{
	
	// ���� ������
	public AdmMainFrame() {
		this.setBounds(0, 0, 978, 700); 
		this.setLayout(null);
		
		new AdmLoginMain(this); // ���α׷� ���� �� ù��° ������
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
