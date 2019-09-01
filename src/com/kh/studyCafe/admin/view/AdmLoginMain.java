package com.kh.studyCafe.admin.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class AdmLoginMain extends MouseAdapter implements ActionListener{ // MouseAdapter는 예시이고, 필요한 이벤트에다 ControlPanel 선언해주면 됩니다.
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
		//사용중인 유저 리스트 화면입니다.
		//cp.changeTablePanel(mf, login, new AdmUsingUserList());
		//전체 회원보기 했을때 나오는 전체회원 화면입니다.
		//cp.changeTablePanel(mf, login, new AdmAllUserList());
	}

}
