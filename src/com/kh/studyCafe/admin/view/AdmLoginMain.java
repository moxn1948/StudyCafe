package com.kh.studyCafe.admin.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class AdmLoginMain extends MouseAdapter implements ActionListener{ // MouseAdapter�� �����̰�, �ʿ��� �̺�Ʈ���� ControlPanel �������ָ� �˴ϴ�.
	private JPanel login = new JPanel();
	private AdmMainFrame mf;
	
	public AdmLoginMain(AdmMainFrame mf) {
		this.mf = mf;
		
		login.setSize(200, 200);
		login.setBackground(Color.BLUE);
		
		login.addMouseListener(this);
		
		mf.add(login);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		ControlPanel cp = new ControlPanel();
		cp.changePanel(mf, login, new AdmChkUserDelete());
	}

}
