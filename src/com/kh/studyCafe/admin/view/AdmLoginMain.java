package com.kh.studyCafe.admin.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import org.jdesktop.swingx.prompt.PromptSupport;

public class AdmLoginMain extends MouseAdapter implements ActionListener{ // MouseAdapter�� �����̰�, �ʿ��� �̺�Ʈ���� ControlPanel �������ָ� �˴ϴ�.
	private JPanel login = new JPanel();
	private AdmMainFrame mf;
	private JTextField loginTextField;
	private JPasswordField passwordField;
	private JButton loginBtn;
	private int resultId;
	private int resultPw;
	
	public AdmLoginMain(AdmMainFrame mf) {
		this.mf = mf;
		
		login.setLayout(null);
		login.setSize(978, 700);
		login.setBackground(Color.WHITE);
		
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 978, 700);
        layeredPane.setLayout(null);
        
		// ���� �ΰ� �ؽ�Ʈ ����
		JLabel logoTxt = new JLabel("<html><body><p>���͵�ī�� �ٴϰ�<br>���� �����ô�<br>���۵ƴ�</p></body></html>");
		
		logoTxt.setLocation(250, 130);
		logoTxt.setForeground(new Color(127, 118, 104));
		logoTxt.setFont(new Font("���� ���", Font.BOLD, 53));
		logoTxt.setSize(logoTxt.getPreferredSize());
		
		// ���� �ȳ� �ؽ�Ʈ ����
		JLabel versionTxt = new JLabel("�����ڿ� version");

		versionTxt.setLocation(457, 358);
		versionTxt.setForeground(new Color(127, 118, 104));
		versionTxt.setFont(new Font("���� ���", Font.PLAIN, 12));
		versionTxt.setSize(versionTxt.getPreferredSize());
		
		// ID ����
		loginTextField = new JTextField(" ID");
		loginTextField.setBounds(340, 380, 207, 40);
		loginTextField.setBackground(Color.WHITE);
		loginTextField.setBorder(BorderFactory.createLineBorder(new Color(189, 177, 157)));
		loginTextField.setEnabled(false);
		loginTextField.addMouseListener(this); 
		
		
		// PassWord ����
		passwordField = new JPasswordField(" PASSWORD");
		passwordField.setBounds(340, 425, 207, 40);
		passwordField.setBackground(Color.WHITE);
		passwordField.setBorder(BorderFactory.createLineBorder(new Color(189, 177, 157)));
		passwordField.setEnabled(false);
		passwordField.addMouseListener(this); 
		
		
		// Login button ����
		loginBtn = new JButton("Login");
		loginBtn.setBounds(340, 475, 207, 40);
		loginBtn.setBackground(new Color(189, 177, 157));
		loginBtn.setForeground(Color.WHITE);
		loginBtn.setFont(new Font("���� ���", Font.BOLD, 18));
		loginBtn.setBorder(BorderFactory.createLineBorder(new Color(189, 177, 157)));
		loginBtn.addActionListener(this); 
		login.add(logoTxt);
		login.add(versionTxt);
		
		layeredPane.add(loginTextField);
		layeredPane.add(passwordField);
		layeredPane.add(loginBtn);
		
		login.add(layeredPane);
		
		mf.add(login);
		
		login.addMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {

		if(e.getSource() == loginTextField) {
			if(resultId == 0) {
				loginTextField.setText("");
				loginTextField.setEnabled(true);
				loginTextField.requestFocus();
				
				resultId++;
			}
		}

		if(e.getSource() == passwordField) {
			if(resultPw == 0) {
				passwordField.setText("");
				passwordField.setEnabled(true);
				passwordField.requestFocus();
				
				resultPw++;
			}
		}
		
		
		ControlPanel cp = new ControlPanel();
//		cp.changePanel(mf, login, new AdmExitTimeHour()); // 3��° ���ڴ� �׽�Ʈ ���Դϴ�.
//		cp.changePanel(mf, login, new AdmExitTimeWeek()); // 3��° ���ڴ� �׽�Ʈ ���Դϴ�.
//		cp.changePanel(mf, login, new AdmChkUserDelete()); // 3��° ���ڴ� �׽�Ʈ ���Դϴ�.
//		cp.changePanel(mf, login, new AdmSeatTable()); // 3��° ���ڴ� �׽�Ʈ ���Դϴ�.
//		cp.changePanel(mf, login, new AdmNewIndvSelectTime()); // 3��° ���ڴ� �׽�Ʈ ���Դϴ�.
		cp.changePanel(mf, login, new AdmNewGrpSelectTime()); // 3��° ���ڴ� �׽�Ʈ ���Դϴ�.
	}

}
