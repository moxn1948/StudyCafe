package com.kh.studyCafe.kosk.view.popup;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class IndividualPanel {
	
	public IndividualPanel(){
	
	JFrame fm = new JFrame();
	fm.setBounds(30, 40, 300, 400);
	fm.setLayout(null);
	
	//===== 컬러 =====

	Color wallPapers = new Color(239,234,222);
	Color textColor = new Color(127,118,104);
					
	

	Font siguptext = new Font("Noto Sans KR",Font.BOLD,30);
	Font inputtext = new Font("Noto Sans KR",Font.BOLD,25);
	Font checktext = new Font("Noto Sans KR",Font.BOLD,14);
		

	
	//===== 패널 =======
	JPanel panel = new JPanel();
	panel.setSize(300,400);
	panel.setLayout(null);
	panel.setBackground(wallPapers);
	
	//===== 라벨 =========
	JLabel logo = new JLabel("1일권");
	logo.setBounds(100,30,200,30);
	logo.setFont(inputtext);
	logo.setForeground(textColor);
	
	JLabel Rt = new JLabel("잔여 시간");// 잔여시간
	Rt.setBounds(40,80, 100, 30);
	Rt.setFont(checktext);
	Rt.setForeground(textColor);
	
	JLabel et = new JLabel("연장 후 시간"); // 연장 후 시간
	et.setBounds(40, 100, 100, 30);
	et.setFont(checktext);
	et.setForeground(textColor);
	//===================
	
	//====== textField =======
	JTextField Rttime = new JTextField("02:30") {
		  @Override
		   public void setBorder(Border border) {
			   
		   }
	};
	Rttime.setBounds(150, 80, 100, 30);
	Rttime.setFont(checktext);
	Rttime.setForeground(textColor);
	Rttime.setBackground(wallPapers);
	
	JTextField ettime = new JTextField("03:30") {
		@Override
		public void setBorder(Border border) {
			
		}
	};
	ettime.setBounds(150, 100, 100, 30);
	ettime.setBackground(wallPapers);
	ettime.setFont(checktext);
	ettime.setForeground(textColor);
	
	JTextField time = new JTextField("01 : 00");
	time.setBounds(85,175,110,40);
	time.setFont(checktext);
	time.setForeground(textColor);
	time.setHorizontalAlignment(JTextField.CENTER);
	
	
	
	//================================
	
	//==== 버튼 ========
	Image plusimg = new ImageIcon("image/plusbtnimg.png").getImage().getScaledInstance(120, 40, 0);
	JButton plus = new JButton(new ImageIcon(plusimg));
	plus.setBounds(85, 130, 110, 40);
	
	
	Image minusimg = new ImageIcon("image/minusbtnimg.png").getImage().getScaledInstance(120, 40, 0);
	JButton	minus = new JButton(new ImageIcon(minusimg));
	minus.setBounds(85, 220, 110, 40);
	

	Image cancelimg = new ImageIcon("image/Cancelbtnimg.png").getImage().getScaledInstance(117, 50, 0);
	JButton cancel = new JButton(new ImageIcon(cancelimg));
	cancel.setBounds(20, 280, 117, 50);
	
	Image confirmimg = new ImageIcon("image/confirmbtnimg.png").getImage().getScaledInstance(117, 50, 0);
	JButton confirm = new JButton(new ImageIcon(confirmimg));
	confirm.setBounds(139, 280, 117, 50);
	
	//============
	fm.add(panel);
	panel.add(logo);
	panel.add(Rt);
	panel.add(et);
	panel.add(Rttime);
	panel.add(ettime);
	panel.add(plus);
	panel.add(time);
	panel.add(minus);
	panel.add(cancel);
	panel.add(confirm);
	
	fm.setVisible(true);
	fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	new IndividualPanel();
}
}


