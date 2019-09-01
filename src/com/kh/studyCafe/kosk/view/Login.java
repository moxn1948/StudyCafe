package com.kh.studyCafe.kosk.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Login extends JPanel{
	private KoskMainFrame mf;
	private JPanel mainpage;
	
	public Login(KoskMainFrame mf) {
		this.mf = mf;
		mainpage = this;
		
		//======= 색 설정 ====
		
		Color wallPapers = new Color(239,234,222);
		Color textColor = new Color(127,118,104);
		
		//=================
		
		
		//================ Frame 설정 ======================
		this.setSize(360,640);
		this.setLayout(null);
		this.setBackground(wallPapers);
		//================================================
		
		//============== font 설정 =========
		
		Font f1 = new Font("Noto Sans KR",Font.BOLD,25);
		
		//============================
		
		// panel 크기 조절
		
		//============== 제목 설정 부분 ========================
		
		JLabel title1 = new JLabel("스터디카페 다니고");
		JLabel title2 = new JLabel("나의 성공시대");
		JLabel title3 = new JLabel("시작됐다");
		
		title1.setBounds(65,150,600,60);// 크기 조절
		title1.setForeground(textColor);// 색상
		title2.setBounds(65,180,600,60);
		title2.setForeground(textColor);
		title3.setBounds(65,210,600,60);
		title3.setForeground(textColor);
		
		// font 설정
		title1.setFont(f1);
		title2.setFont(f1);
		title3.setFont(f1);
		//=================================================
		
		//==================== 텍스트 필드 설정 ==============
		
		JTextField phonenumber = new JTextField("Phone Number");
		JTextField password = new JTextField("password.");
		
		phonenumber.setBounds(65,275,230,40);
		phonenumber.setLayout(null);
		password.setBounds(65,320,230,40);
		password.setLayout(null);
		
		
		
		//===================================================
		
		//===============  버튼 설정 =================
		
		Image loginicon = new ImageIcon("img/loginimg.png").getImage().getScaledInstance(230, 50, 0);
		Image singUpicon = new ImageIcon("img/singUpimg.png").getImage().getScaledInstance(110, 40, 0);
		Image findPwdicon = new ImageIcon("img/findPwdimg.png").getImage().getScaledInstance(110, 40, 0);
		
		JButton loginButton = new JButton(new ImageIcon(loginicon));
		JButton signUp = new JButton(new ImageIcon(singUpicon));
		JButton findPwd = new JButton(new ImageIcon(findPwdicon));
		findPwd.setBorderPainted(false);
		
		loginButton.setBounds(65,365,230,50); //로그인 버튼 크기 조절
		signUp.setBounds(65,420,110,40);
		findPwd.setBounds(185,420,110,40);
		
		
		//=======================================
		
		
		this.add(title1);
		this.add(title2);
		this.add(title3);
		this.add(phonenumber);
		this.add(password);
		this.add(loginButton);
		this.add(findPwd);
		this.add(signUp);
		mf.add(this);
		
		findPwd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ChangePanel.changePanel(mf, mainpage, new mypage());
			}
		});
	
		signUp.addActionListener(new MyActionListener());
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			ChangePanel.changePanel(mf, mainpage, new sigUP());
			
		}	
	}
	
}
