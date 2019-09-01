package com.kh.studyCafe.admin.view;

import javax.swing.JPanel;

public class ControlPanel{
	
	public void changePanel(AdmMainFrame mf, JPanel op, JPanel np) { // �ִ� �г� ����� �� �г� �ø���
		mf.remove(op);
		mf.add(np);
		mf.repaint();

	}

	public void addPanel(AdmMainFrame mf, JPanel op, JPanel np) { // �ִ� �г� �����ϰ� �� �г� �ø���
		mf.add(np, 1, 0);
		mf.repaint();
	}
	
	public void changeTablePanel(AdmMainFrame mf, JPanel op, JPanel np) { // �ִ� �г� ����� �� �г� �ø���
		mf.remove(op);
		mf.add(np);
		mf.revalidate();
		mf.repaint();
	}
}
