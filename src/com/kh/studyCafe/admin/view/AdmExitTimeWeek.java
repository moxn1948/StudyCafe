package com.kh.studyCafe.admin.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdmExitTimeWeek extends JPanel implements ActionListener{
	
	public AdmExitTimeWeek() {
		// �г� ����
		int w = 410;
		int h = 274;
		int x = popPosition(w, h)[0];
		int y = popPosition(w, h)[1];
		
		this.setBounds(x, y, w, h); 
		this.setBackground(new Color(239, 234, 222));
		this.setBorder(BorderFactory.createLineBorder(new Color(189, 177, 157)));
		
		// title �ؽ�Ʈ ����
		JLabel title = new JLabel("�Ⱓ�� ���");

		title.setLocation(120, 32);
		title.setForeground(new Color(127, 118, 104));
		title.setFont(new Font("���� ���", Font.BOLD, 32));
		title.setSize(title.getPreferredSize());
		
		// subTitle �ؽ�Ʈ ����
		JLabel subTitle = new JLabel("�ܿ��ð�");

		subTitle.setLocation(120, 104);
		subTitle.setForeground(new Color(127, 118, 104));
		subTitle.setFont(new Font("���� ���", Font.BOLD, 24));
		subTitle.setSize(subTitle.getPreferredSize());
		
		// �ܿ��ð� �ؽ�Ʈ ����
		JLabel remainTime = new JLabel("25��"); // ���߿� ������ �޾Ƽ� �� �÷�����

		remainTime.setLocation(237, 104);
		remainTime.setForeground(new Color(127, 118, 104));
		remainTime.setFont(new Font("���� ���", Font.BOLD, 24));
		remainTime.setSize(remainTime.getPreferredSize());
		
		// ȯ�� üũ�ڽ� ����
		JCheckBox refundChk = new JCheckBox("ȯ���Ͻðڽ��ϱ�?");
		refundChk.setLocation(17, 168);
		refundChk.setOpaque(false);
		refundChk.setForeground(new Color(127, 118, 104));
		refundChk.setFont(new Font("���� ���", Font.BOLD, 18));
		refundChk.setSize(refundChk.getPreferredSize());
		
		// ��ư ����
		JButton cancelBtn = new JButton("Cancel");
		JButton confirmBtn = new JButton("Confirm");
		
		cancelBtn.setBounds(16, 209, 184, 50);
		confirmBtn.setBounds(210, 209, 184, 50);
		cancelBtn.setBackground(new Color(189, 177, 157));
		confirmBtn.setBackground(new Color(163, 152, 134));
		cancelBtn.setForeground(Color.WHITE);
		cancelBtn.setFont(new Font("���� ���", Font.BOLD, 18));
		confirmBtn.setForeground(Color.WHITE);
		confirmBtn.setFont(new Font("���� ���", Font.BOLD, 18));
		cancelBtn.setBorder(BorderFactory.createLineBorder(new Color(189, 177, 157)));
		confirmBtn.setBorder(BorderFactory.createLineBorder(new Color(163, 152, 134)));
		
		// �гο� �ø���
		this.add(title);
		this.add(subTitle);
		this.add(remainTime);
		this.add(refundChk);
		this.add(cancelBtn);
		this.add(confirmBtn);
	}

	public int[] popPosition(int w, int h) {
		int[] position = new int[2];
		
		position[0] = (962 - w) / 2;
		position[1] = (662 - h) / 2;
		
		return position;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
