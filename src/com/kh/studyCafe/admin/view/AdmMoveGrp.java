package com.kh.studyCafe.admin.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdmMoveGrp extends JPanel implements ActionListener{
//�ڸ��̵� �˾� 2��
//�̰��ϳ���...	
	
	public AdmMoveGrp() {
		
		//�г� ����
		this.setBounds(270,203,410,193); //����
		this.setBackground(new Color(239,234,222));
		this.setBorder(BorderFactory.createLineBorder(new Color(189,177,157)));
	
		//title �ؽ�Ʈ ����
		JLabel title = new JLabel("���͵���� �̵��� �Ұ����մϴ�.");
	 
		    
		title.setLocation(29, 43);
		title.setForeground(new Color(127,118,104));
		title.setFont(new Font("���� ���",Font.BOLD,24));
		title.setSize(title.getPreferredSize());
		
		/*//subTitle�ؽ�Ʈ ����
		JLabel subTitle = new JLabel("���͵���� �̵��� �Ұ����մϴ�.");
		//340,75
		  
		subTitle.setLocation(120, 104);
		subTitle.setForeground(new Color(127,118,104));//��������.
		subTitle.setFont(new Font("���� ���",Font.BOLD,24));
		subTitle.setSize(subTitle.getPreferredSize());
		*/
		//��ư ����
		JButton closeBtn = new JButton("Close");
		
		//close��
		
//		closeBtn.setLocation(600,543); �̰� �� �غ���..
		closeBtn.setBounds(45,120,326,50);
		
		closeBtn.setBackground(new Color(18,177,157)); //�÷�
		
		closeBtn.setFont(new Font("���� ���",Font.BOLD,18)); 	
		
		closeBtn.setForeground(Color.WHITE);
		
		
		
		//�гο� �ø���
		this.add(title);
//		this.add(subTitle);
		this.add(closeBtn);
	}
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	//�ڸ��̵�
	//���͵�� �̵� �Ұ��˾�

}
