package com.kh.studyCafe.admin.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

//�̹� ������ �¼�
public class AdmUsingSeat extends JPanel implements ActionListener {

	  
	public AdmUsingSeat() {
		//�г� ����
		
		this.setBounds(270,203,410,193);
		this.setBackground(new Color(239,234,222));
		this.setBorder(BorderFactory.createLineBorder(new Color(189,177,157)));
		
		JLabel title = new JLabel("�̹� ���õ� �¼��Դϴ�.");
		
		title.setLocation(80,43);
		title.setForeground(new Color(127,118,104));
		title.setFont(new Font("���� ���",Font.BOLD,24));
		title.setSize(title.getPreferredSize());
		
		JButton closeBtn = new JButton("Close");
		
		closeBtn.setBounds(45,120,326,50);
		closeBtn.setBackground(new Color(8,177,157));
		closeBtn.setFont(new Font("���� ���",Font.BOLD,18));
		closeBtn.setForeground(Color.WHITE);
	
		
		//�гο� �ø���
		this.add(title);
		this.add(closeBtn);
	}
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
