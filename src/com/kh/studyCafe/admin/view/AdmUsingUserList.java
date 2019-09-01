package com.kh.studyCafe.admin.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractCellEditor;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class AdmUsingUserList extends JPanel implements ActionListener {
	
	
	public AdmUsingUserList() {
		
		//���̺� ��� ���
		String[] columnNames = {"No", "ȸ����", "��ȭ��ȣ", "�¼���ȣ", "�Խǽð�", "��ǿ����ð�", "�ܿ��ð�", "����/��ü", "�¼�����","�¼�����","�¼�����" };
		
		//���̺� ����
		Object[][] data = {
				{1, "������", "010-9876-6543", "12��", "02:30AM", "-", "25��", "����", "����","�̵�","���"},
				{2, "������", "010-9876-6543", "12��", "02:30AM", "-", "25��", "����", "����","�̵�","���"},
				{3, "������", "010-9876-6543", "12��", "02:30AM", "-", "25��", "����",  "����","�̵�","���"},
				{4, "������", "010-9876-6543", "12��", "02:30AM", "-", "25��", "����",  "����","�̵�","���"}
		};
		
		//this.�� panel ����
		this.setBounds(0, 0, 978, 700);
		
		//���̺� �𵨸����
		DefaultTableModel model = new DefaultTableModel(data,columnNames) {
			public boolean isCellEditable(int row, int column){
				if(column >= 8) {
					return true;
				}
			    return false;
			 }
		};
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		//���̺� ����
		JTable table = new JTable(model);
		
		//�̹��� ���� �ҷ�����
		Image icon = new ImageIcon("images/logo.PNG").getImage().getScaledInstance(41, 54, 0);
		JLabel logoLabel = new JLabel(new ImageIcon(icon));
		logoLabel.setLocation(470, 35);
		logoLabel.setSize(41, 54);
		JTableHeader header = table.getTableHeader();

		//���̺� ��� ũ�⼳��		
		header.setPreferredSize(new Dimension(10, 50));
		
		//���̺� �� ���� ����
		table.setRowHeight(40);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(36);
		table.getColumnModel().getColumn(1).setPreferredWidth(63);
		table.getColumnModel().getColumn(2).setPreferredWidth(178);
		table.getColumnModel().getColumn(3).setPreferredWidth(74);
		table.getColumnModel().getColumn(4).setPreferredWidth(82);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(73);
		table.getColumnModel().getColumn(7).setPreferredWidth(83);
		table.getColumnModel().getColumn(8).setPreferredWidth(68);
		table.getColumnModel().getColumn(9).setPreferredWidth(68);
		table.getColumnModel().getColumn(10).setPreferredWidth(68);
		
		//���̺� ��ũ�� ��� �߰��ؼ� �ֱ�
		JScrollPane scrollpane = new JScrollPane(table);
		
		//��ü ���̺� ũ�⼳��
		scrollpane.setPreferredSize(new Dimension(920, 504));
		//���̺� ��� ����
		scrollpane.setBounds(21, 118, 920, 504);
		scrollpane.getViewport().setBackground(Color.WHITE); 
		scrollpane.setBackground(Color.WHITE);
		scrollpane.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		table.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createCompoundBorder(), BorderFactory.createMatteBorder(0,1,1,1,new Color(127,118,104))));
		table.setGridColor(new Color(127,118,104));
		table.setForeground(new Color(127, 118, 104)); 		
		table.setFont(new Font("���� ���", Font.PLAIN, 14));
		//���̺� ��� ����
		header.setBorder(BorderFactory.createLineBorder(new Color(127,118,104)));
		header.setForeground(new Color(127, 118, 104)); 		
		header.setFont(new Font("���� ���", Font.BOLD, 14));
		header.setBackground(Color.WHITE);
		
		
		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		// ������ ���̺��� ColumnModel�� ������
		TableColumnModel tcmSchedule = table.getColumnModel();
		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
		tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}
		
		//������������ ��ư ����
		JButton cafeInfo = new JButton("���� ���� ����");
		cafeInfo.setBounds(801, 603, 140, 42);
		cafeInfo.setBackground(new Color(189,177,157));
		cafeInfo.setForeground(Color.WHITE);
		cafeInfo.setFont(new Font("���� ���", Font.BOLD, 15));
		cafeInfo.setBorder(BorderFactory.createLineBorder(new Color(189,177,157)));
		
		//��ü ȸ������ ��ư����
		JButton allUserInfoButton = new JButton("��ü ȸ�� ����");
		allUserInfoButton.setBounds(801, 70, 140, 42);
		allUserInfoButton.setBackground(Color.WHITE);
		allUserInfoButton.setForeground(new Color(189,177,157));
		allUserInfoButton.setFont(new Font("���� ���", Font.BOLD, 15));
		allUserInfoButton.setBorder(BorderFactory.createLineBorder(new Color(189,177,157)));
		
		//������� ��ü������ �󺧻���
		JLabel usingSeatGrp = new JLabel("��ü��    / 5");
		usingSeatGrp.setLocation(23, 83);
		usingSeatGrp.setForeground(new Color(127, 118, 104));
		usingSeatGrp.setFont(new Font("���� ���", Font.BOLD, 12));
		usingSeatGrp.setSize(usingSeatGrp.getPreferredSize());
		
		//������� ���μ����� �� ����
		JLabel usingSeat = new JLabel("���μ�    / 25");
		usingSeat.setLocation(23, 98);
		usingSeat.setForeground(new Color(127, 118, 104));
		usingSeat.setFont(new Font("���� ���", Font.BOLD, 12));
		usingSeat.setSize(usingSeat.getPreferredSize());
		
		//������� ��ü�� ǥ���� ��(�����ؾ���)
		JLabel usingInfoGrp = new JLabel("1");
		usingInfoGrp.setLocation(63, 83);
		usingInfoGrp.setForeground(new Color(127, 118, 104));
		usingInfoGrp.setFont(new Font("���� ���", Font.BOLD, 12));
		usingInfoGrp.setSize(usingInfoGrp.getPreferredSize());
		
		//������� ���μ� ǥ���� ��(�����ؾ���)
		JLabel usingInfo = new JLabel("3");
		usingInfo.setLocation(63, 98);
		usingInfo.setForeground(new Color(127, 118, 104));
		usingInfo.setFont(new Font("���� ���", Font.BOLD, 12));
		usingInfo.setSize(usingInfo.getPreferredSize());
		
		//���̺� ���� �������ϵ��� �ٲ�
		//table.setEnabled(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		
		table.getColumnModel().getColumn(8).setCellRenderer(new AddTime());
        table.getColumnModel().getColumn(8).setCellEditor(new AddTime());
        
        table.getColumnModel().getColumn(9).setCellRenderer(new SeatMove());
        table.getColumnModel().getColumn(9).setCellEditor(new SeatMove());
		
        table.getColumnModel().getColumn(10).setCellRenderer(new ExitSeat());
        table.getColumnModel().getColumn(10).setCellEditor(new ExitSeat());
		
        
		
		//�гο� �߰��ϱ�
		this.add(logoLabel);
		this.add(usingInfo);
		this.add(usingInfoGrp);
		this.add(usingSeat);
		this.add(usingSeatGrp);
		this.add(allUserInfoButton);
		this.add(cafeInfo);
		this.add(scrollpane);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
//���� ��ư�� ���鶧 �ʿ��� Ŭ����
class AddTime extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
    JButton jb;

    public AddTime() {
        jb = new JButton("����");
        jb.setForeground(Color.WHITE);
		jb.setFont(new Font("���� ���", Font.BOLD, 15));
        jb.setBackground(new Color(127, 118, 104));
        
        //Ŭ���� �˾� 
        jb.addActionListener(e -> {
        	jb.setBackground(Color.WHITE);
        	jb.setForeground(new Color(127, 118, 104));
        });
    }
    
    @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        return jb;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
            int column) {
        return jb;
    }
}
//�ڸ��̵��� �Ҷ� �ʿ��� ��ư�� ����� Ŭ����
class SeatMove extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
    JButton jb;

    public SeatMove() {
        jb = new JButton("�̵�");
        jb.setForeground(Color.WHITE);
		jb.setFont(new Font("���� ���", Font.BOLD, 15));
        jb.setBackground(new Color(127, 118, 104));
        
        jb.addActionListener(e -> {
        	jb.setBackground(Color.WHITE);
        	jb.setForeground(new Color(127, 118, 104));
        });
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        return jb;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
            int column) {
        return jb;
    }
} 

//����� �Ҷ� �ʿ��� ��ư�� ����� Ŭ����
class ExitSeat extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
    JButton jb;

    public ExitSeat() {
        jb = new JButton("����");
        jb.setForeground(Color.WHITE);
		jb.setFont(new Font("���� ���", Font.BOLD, 15));
        jb.setBackground(new Color(127, 118, 104));
        
        jb.addActionListener(e -> {
        	jb.setBackground(Color.WHITE);
        	jb.setForeground(new Color(127, 118, 104));
        });
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
        return jb;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row,
            int column) {
        return jb;
    }
} 




