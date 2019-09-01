package com.kh.studyCafe.kosk.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class mypage extends JPanel{
	
	public mypage() {
		this.setSize(360,640);
		
		//===== 색상 설정 =====
		Color wallPapers = new Color(239,234,222);
		Color textColor = new Color(127,118,104);
				
		//===============
				
		//===== JPanel 설정 =======
		this.setLayout(null);
		this.setBackground(wallPapers);
		//=======================
				
		//============ font 설정 ==========
		Font siguptext = new Font("Noto Sans KR",Font.BOLD,30);
		Font inputtext = new Font("Noto Sans KR",Font.BOLD,17);
		Font checktext = new Font("Noto Sans KR",Font.BOLD,14);
	
		//===============================
		
		//==== 스터디 카페 아이콘 설정 ===============
		Image imgicon = new ImageIcon("img/imgicon.png").getImage().getScaledInstance(60, 80, 0);
		JLabel ib = new JLabel("  마이 페이지",(new ImageIcon(imgicon)),SwingUtilities.CENTER);
		ib.setBounds(10,0,250,80);
		ib.setForeground(textColor);
		ib.setFont(siguptext);
		//===============================
		
		//==== 입력란 =================
		
		 JLabel name = new JLabel("이름"); //이름 라벨
		   name.setBounds(30, 100, 40, 30);
		   name.setFont(inputtext);
		   name.setForeground(textColor);
		   
		   JLabel phnumber = new JLabel("휴대폰");
		   JLabel phnumber2 = new JLabel("번호");
		   phnumber.setBounds(30,160,60,30);
		   phnumber2.setBounds(30,180,60,30);
		   phnumber.setFont(inputtext);
		   phnumber2.setFont(inputtext);
		   phnumber.setForeground(textColor);
		   phnumber2.setForeground(textColor);
		   
		   JLabel hou1 = new JLabel("이용가능시간");
		   hou1.setBounds(30,220,80,30);
		   hou1.setForeground(textColor);
		   hou1.setFont(inputtext);
		   
		   JLabel atime1 = new JLabel("입실시간");
		   atime1.setBounds(30,280,80,30);
		   atime1.setForeground(textColor);
		   atime1.setFont(inputtext);
		   
		   JLabel dtime1 = new JLabel("퇴실시간");
		   dtime1.setBounds(30,340,80,30);
		   dtime1.setForeground(textColor);
		   dtime1.setFont(inputtext);
		   
		   JLabel point1 = new JLabel("포인터");
		   point1.setBounds(30,400,80,30);
		   point1.setForeground(textColor);
		   point1.setFont(inputtext);
		   
		   JLabel rating1 = new JLabel("등급");
		   rating1.setBounds(30,460,80,30);
		   rating1.setForeground(textColor);
		   rating1.setFont(inputtext);
		   
		 
		   
		   JTextField nametf = new JTextField("내용을 입력하세요");
		   nametf.setBounds(120,100,200,40);
		   
		   JTextField phtf = new JTextField("내용을 입력하세요");
		   phtf.setBounds(120,160,200,40);
		   
		   JTextField hou = new JTextField("내용을 입력하세요");
		   hou.setBounds(120,220,200,40);
		   
		   JTextField atime = new JTextField("내용을 입력하세요");
		   atime.setBounds(120,280,200,40);
		   
		   JTextField dtime = new JTextField("내용을 입력하세요");
		   dtime.setBounds(120,340,200,40);
		   
		   JTextField point = new JTextField("내용을 입력하세요");
		   point.setBounds(120,400,200,40);
		   
		   JTextField rating = new JTextField("내용을 입력하세요");
		   rating.setBounds(120,460,200,40);
		 //======================================
		   
		 //=== 버튼 ===========================

		   Image findimg = new ImageIcon("img/okbtnimg.png").getImage().getScaledInstance(100, 40, 0);
		   
		   JButton find = new JButton(new ImageIcon(findimg));
		   find.setBorderPainted(false);
		   find.setBounds(220,530,100,40);
		
		
		this.add(ib);
		this.add(name);
		this.add(nametf);
		this.add(phtf);
		this.add(hou);
		this.add(atime);
		this.add(dtime);
		this.add(point);
		this.add(rating);
		this.add(hou1);
		this.add(phnumber);
		this.add(phnumber2);
		this.add(atime1);
		this.add(rating1);
		this.add(point1);
		this.add(dtime1);
		this.add(find);
	}
}
