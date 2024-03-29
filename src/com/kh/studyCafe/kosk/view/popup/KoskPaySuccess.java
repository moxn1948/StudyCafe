package com.kh.studyCafe.kosk.view.popup;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KoskPaySuccess {
	public KoskPaySuccess() {
		Font font = new Font("Noto Sans KR",Font.BOLD,15);
		Color textColor = new Color(127,118,104);
		Color wallPapers = new Color(205, 201, 191);
		Color paper = new Color(170, 162, 142);
		Color paper1 = new Color(255,255,255);
		
		JFrame mf =new JFrame();
		mf.setSize(320,150);
		
		JPanel panel = new JPanel();
		panel.setSize(320,150);
		panel.setBackground(wallPapers);
		panel.setLayout(null);
		
		
		JButton button = new JButton("결제가 완료되었습니다");
		button.setBounds(0,0,320,100);
		button.setFont(font);
		button.setBackground(paper);
		button.setForeground(paper1);
		mf.add(panel);
		panel.add(button);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new KoskPaySuccess();
	}

}
