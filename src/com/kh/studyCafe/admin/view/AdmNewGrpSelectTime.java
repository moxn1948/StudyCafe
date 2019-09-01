package com.kh.studyCafe.admin.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AdmNewGrpSelectTime extends JPanel implements ActionListener{
	
	public AdmNewGrpSelectTime() {

		// �г� ����
		int w = 540;
		int h = 467;
		int x = popPosition(w, h)[0];
		int y = popPosition(w, h)[1];
		
		this.setBounds(x, y, w, h); 
		this.setBackground(new Color(239, 234, 222));
		this.setBorder(BorderFactory.createLineBorder(new Color(189, 177, 157)));

		// title �ؽ�Ʈ ����
		JLabel title = new JLabel("1�ϱ�");

		title.setLocation(230, 34);
		title.setForeground(new Color(127, 118, 104));
		title.setFont(new Font("���� ���", Font.BOLD, 32));
		title.setSize(title.getPreferredSize());

		// �ο� �ؽ�Ʈ ����
		JLabel userCount = new JLabel("�ο�");

		userCount.setLocation(114, 104);
		userCount.setForeground(new Color(127, 118, 104));
		userCount.setFont(new Font("���� ���", Font.BOLD, 28));
		userCount.setSize(userCount.getPreferredSize());
		
		// �� �ο� ǥ��
		JLabel totalUserCount = new JLabel("�� �ο�");

		totalUserCount.setLocation(90, 170);
		totalUserCount.setForeground(new Color(127, 118, 104));
		totalUserCount.setFont(new Font("���� ���", Font.BOLD, 20));
		totalUserCount.setSize(totalUserCount.getPreferredSize());
		
		// �� �ο� - ��� ǥ��
		JLabel totalUserCountNum = new JLabel("2��");

		totalUserCountNum.setLocation(164, 170);
		totalUserCountNum.setForeground(new Color(127, 118, 104));
		totalUserCountNum.setFont(new Font("���� ���", Font.BOLD, 20));
		totalUserCountNum.setSize(totalUserCountNum.getPreferredSize());

		// �� �ð� ǥ��
		JLabel totalUserTime = new JLabel("�̿��Ͻ� �ð�");

		totalUserTime.setLocation(300, 170);
		totalUserTime.setForeground(new Color(127, 118, 104));
		totalUserTime.setFont(new Font("���� ���", Font.BOLD, 20));
		totalUserTime.setSize(totalUserTime.getPreferredSize());
		
		// �� �ð� - �ð� ǥ��
		JLabel totalUserTimeNum = new JLabel("02:00");

		totalUserTimeNum.setLocation(434, 170);
		totalUserTimeNum.setForeground(new Color(127, 118, 104));
		totalUserTimeNum.setFont(new Font("���� ���", Font.BOLD, 20));
		totalUserTimeNum.setSize(totalUserTimeNum.getPreferredSize());
		
		
		// �ð� �ؽ�Ʈ ����
		JLabel userTime = new JLabel("�ð�");

		userTime.setLocation(359, 104);
		userTime.setForeground(new Color(127, 118, 104));
		userTime.setFont(new Font("���� ���", Font.BOLD, 28));
		userTime.setSize(userTime.getPreferredSize());


		// +, - ��ư ����
		JButton countUpBtn = new JButton("+");
		JButton countDownBtn = new JButton("-");
		
		countUpBtn.setBounds(44, 234, 200, 44);
		countDownBtn.setBounds(44, 330, 200, 44);
		countUpBtn.setBackground(new Color(127, 118, 104));
		countDownBtn.setBackground(new Color(127, 118, 104));
		countUpBtn.setForeground(Color.WHITE);
		countUpBtn.setFont(new Font("���� ���", Font.BOLD, 30));
		countDownBtn.setForeground(Color.WHITE);
		countDownBtn.setFont(new Font("���� ���", Font.BOLD, 30));
		countUpBtn.setBorder(BorderFactory.createLineBorder(new Color(189, 177, 157)));
		countDownBtn.setBorder(BorderFactory.createLineBorder(new Color(163, 152, 134)));

		JButton timeUpBtn = new JButton("+");
		JButton timeDownBtn = new JButton("-");

		timeUpBtn.setBounds(294, 234, 200, 44);
		timeDownBtn.setBounds(294, 330, 200, 44);
		timeUpBtn.setBackground(new Color(127, 118, 104));
		timeDownBtn.setBackground(new Color(127, 118, 104));
		timeUpBtn.setForeground(Color.WHITE);
		timeUpBtn.setFont(new Font("���� ���", Font.BOLD, 30));
		timeDownBtn.setForeground(Color.WHITE);
		timeDownBtn.setFont(new Font("���� ���", Font.BOLD, 30));
		timeUpBtn.setBorder(BorderFactory.createLineBorder(new Color(189, 177, 157)));
		timeDownBtn.setBorder(BorderFactory.createLineBorder(new Color(163, 152, 134)));

		// �ο� ǥ��
		JTextField countDisplay = new JTextField("2");
		JTextField timeDisplay = new JTextField("02:00");
		

		countDisplay.setBounds(44, 284, 200, 40);
		countDisplay.setBackground(Color.WHITE);
		countDisplay.setForeground(new Color(127, 118, 104));
		countDisplay.setFont(new Font("���� ���", Font.BOLD, 22));
		countDisplay.setBorder(BorderFactory.createEmptyBorder());
		countDisplay.setHorizontalAlignment(JTextField.CENTER);


		timeDisplay.setBounds(294, 284, 200, 40);
		timeDisplay.setBackground(Color.WHITE);
		timeDisplay.setForeground(new Color(127, 118, 104));
		timeDisplay.setFont(new Font("���� ���", Font.BOLD, 22));
		timeDisplay.setBorder(BorderFactory.createEmptyBorder());
		timeDisplay.setHorizontalAlignment(JTextField.CENTER);
		
		
		
		// ��ư ����
		JButton cancelBtn = new JButton("Cancel");
		JButton confirmBtn = new JButton("Confirm");
		
		cancelBtn.setBounds(25, 394, 240, 50);
		confirmBtn.setBounds(275,394, 240, 50);
		cancelBtn.setBackground(new Color(189, 177, 157));
		confirmBtn.setBackground(new Color(163, 152, 134));
		cancelBtn.setForeground(Color.WHITE);
		cancelBtn.setFont(new Font("���� ���", Font.BOLD, 18));
		confirmBtn.setForeground(Color.WHITE);
		confirmBtn.setFont(new Font("���� ���", Font.BOLD, 18));
		cancelBtn.setBorder(BorderFactory.createLineBorder(new Color(189, 177, 157)));
		confirmBtn.setBorder(BorderFactory.createLineBorder(new Color(163, 152, 134)));
		
		

		this.add(title);
		this.add(userCount);
		this.add(userTime);
		this.add(totalUserCount);
		this.add(totalUserCountNum);
		this.add(totalUserTime);
		this.add(totalUserTimeNum);
		
		this.add(countUpBtn);
		this.add(countDownBtn);
		this.add(countDisplay);
		
		this.add(timeUpBtn);
		this.add(timeDownBtn);
		this.add(timeDisplay);
		
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
