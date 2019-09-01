package com.kh.studyCafe.kosk.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KoskSeatTable extends KoskMainFrame{
	
public KoskSeatTable() {
		
		JButton[] iuser = new JButton[25];
		JButton[] dfuser = new JButton[2];
		JButton[] dsuser = new JButton[2];
		JButton[] deuser = new JButton[1];
		
		JButton logOut = new JButton("·Î±×¾Æ¿ô");
		JButton myPage = new JButton("¸¶ÀÌÆäÀÌÁö");
		
		int f = 0, s = 0, e = 0;
		
		this.setBounds(500, 0, 360, 640);

		int x = 29;
		int y = 152;

		String name = null;
		
		this.setLayout(null);
				

		JPanel panel = new JPanel();
		panel.setBackground(new Color(239, 234, 222));
		panel.setSize(700, 1000);
		
		Font font1 = new Font("µ¸¿ò", Font.BOLD, 32);
		JLabel label = new JLabel("ÁÂ¼®Ç¥");
		label.setForeground(new Color(127, 118, 104));
		label.setFont(font1);
		label.setLocation(131, 50);
		label.setSize(200, 90);
				
		panel.add(label);
		
		Image image = new ImageIcon("image/logo.png").getImage().getScaledInstance(34, 26, 0);
		JLabel imageLabel = new JLabel(new ImageIcon(image));
		
		panel.add(imageLabel);
		
		logOut.setBorderPainted(false);
		logOut.setForeground(new Color(163, 152, 134));
		logOut.setBackground(new Color(239, 234, 222));
		logOut.setLocation(11, 12);
		logOut.setSize(87, 27);
		
		panel.add(logOut);
		
		myPage.setBorderPainted(false);
		myPage.setForeground(new Color(163, 152, 134));
		myPage.setBackground(new Color(239, 234, 222));
		myPage.setLocation(230, 12);
		myPage.setSize(103, 27);
		
		panel.add(myPage);
		
		panel.setLayout(null);
		
		for(int i = 0; i < iuser.length; i++) {
			
			iuser[i] = new JButton();
			iuser[i].setBackground(Color.WHITE);
			iuser[i].setForeground(new Color(163, 152, 134));
			iuser[i].setLocation(x,y);
			iuser[i].setSize(33,34);
			
			panel.add(iuser[i]);
			
			x += 36;

			if((i+1) % 5 == 0 && i != 0) {
				if(i == 4 || i == 14) {
					y += 68;
				}else {
					y += 52;
				}
				x = 29;
			}
			
		}
		
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				name = "4-A";
				y = 151; 
			} else {
				name = "4-B";
				y += 67;
				
			}
			dfuser[i] = new JButton(name);
			dfuser[i].setBackground(Color.WHITE);
			dfuser[i].setForeground(new Color(163, 152, 134));
			dfuser[i].setLocation(240, y);
			dfuser[i].setSize(90, 64);
			
			panel.add(dfuser[i]);
		}	
					
		    deuser[0] =new JButton("8-A");
		    deuser[0].setBackground(Color.WHITE);
		    deuser[0].setForeground(new Color(163, 152, 134));
			deuser[0].setLocation(241, 289);
			deuser[0].setSize(90, 151);
			
			panel.add(deuser[0]);
			
			for(int i = 0; i < 2; i++) {
				if(i == 0) {
					name = "6-A";
					y = 27;
				}else if(i == 1) {
					name = "6-B";
					y += 154;
				}
				
				dsuser[i] = new JButton(name);
				dsuser[i].setBackground(Color.WHITE);
				dsuser[i].setForeground(new Color(163, 152, 134));
				dsuser[i].setLocation(y, 458);
				dsuser[i].setSize(148 , 65);
				
				panel.add(dsuser[i]);
			}
		
		this.add(panel);
		
	}

}
