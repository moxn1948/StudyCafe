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
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class AdmAllUserList extends JPanel implements ActionListener {


	public AdmAllUserList() {

		//���̺� ��� ���
		String[] columnNames = {"No", "ȸ����", "��ȭ��ȣ", "�¼���ȣ", "�Խǽð�", "��ǿ����ð�", "�ܿ��ð�", "����/��ü", "�¼�����","�¼�����","�¼�����","�¼�����" };

		//���̺� ����
		Object[][] data = {
				{1, "������", "010-9876-6543", "12��", "02:30AM", "-", "25��", "����", "����","�̵�","���","�Խ�"},
				{2, "������", "010-2222-3333", "4-B��", "09:30AM", "11:30AM", "02:00", "��ü", "����","�̵�","���","�Խ�"},
				{3, "������", "010-4321-1234", "23��", "08:10AM", "12:10PM", "03:00", "����", "����","�̵�","���","�Խ�"},
				{4, "����ȣ", "010-5050-5858", "14��", "-", "-", "10��", "����", "����","�̵�","���","�Խ�"},
				{1, "��ȣ��", "010-7895-5555", "-", "-", "-", "-", "-", "����","�̵�","���","�Խ�"},
				{2, "�ȵ�ȯ", "010-1111-1111", "-", "-", "-", "-", "-", "����","�̵�","���","�Խ�"},
				{3, "�̹���", "010-5656-4545", "-", "-", "-", "-", "-", "����","�̵�","���","�Խ�"}
		};

		//this.�� panel ����
		this.setBounds(0, 0, 978, 700);

		//���̺� �𵨸����
		//��ư�κл��� ���� ���� �����Ұ��ϵ��� ����
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
		//�̿����� ȸ���� ��� ���� ���� �ٲپ ǥ����
		//��ư �κ��� ��׶��� ������ ������� ĥ�Ͽ� ���°�ó�� ���̰� �س������� �������ʿ���
		JTable table = new JTable(model) {
			@Override
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
				if(row <= 2) {
					JComponent component = (JComponent) super.prepareRenderer(renderer, row, column);
					component.setBackground(new Color(239, 234, 222));
					if(column >= 8) {
						component.setBackground(new Color(127, 118, 104));
					}
					return component;
				}else {
					JComponent component = (JComponent) super.prepareRenderer(renderer, row, column);
					component.setBackground(Color.WHITE);
					if(column == 11) {
						component.setBackground(new Color(127, 118, 104));
					}
					return component;
				}
				
			}
		};

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
		table.getColumnModel().getColumn(2).setPreferredWidth(110);
		table.getColumnModel().getColumn(3).setPreferredWidth(74);
		table.getColumnModel().getColumn(4).setPreferredWidth(82);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(73);
		table.getColumnModel().getColumn(7).setPreferredWidth(83);
		table.getColumnModel().getColumn(8).setPreferredWidth(68);
		table.getColumnModel().getColumn(9).setPreferredWidth(68);
		table.getColumnModel().getColumn(10).setPreferredWidth(68);
		table.getColumnModel().getColumn(11).setPreferredWidth(68);

		//���̺� ��ũ�� ��� �߰��ؼ� �ֱ�
		JScrollPane scrollpane = new JScrollPane(table);

		//��ü ���̺� ũ�⼳��
		scrollpane.setPreferredSize(new Dimension(920, 504));
		//���̺� ��� ����rgb(239, 234, 222)
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


		//��ü ȸ������ ��ư����
		JButton allUserInfoButton = new JButton("�̿� ���� ȸ�� ����");
		allUserInfoButton.setBounds(780, 70, 160, 42);
		allUserInfoButton.setBackground(new Color(189,177,157));
		allUserInfoButton.setForeground(Color.WHITE);
		allUserInfoButton.setFont(new Font("���� ���", Font.BOLD, 15));
		allUserInfoButton.setBorder(BorderFactory.createLineBorder(new Color(189,177,157)));
		
		
		//���̺��� ũ�⸦ �������� ���ϵ��� ��
		table.getTableHeader().setReorderingAllowed(false);
		table.getTableHeader().setResizingAllowed(false);
		
		//���̺� ���� / �̵� / ��� ���� ��ư�� ������
		table.getColumnModel().getColumn(8).setCellRenderer(new AddTime());
		table.getColumnModel().getColumn(8).setCellEditor(new AddTime());

		table.getColumnModel().getColumn(9).setCellRenderer(new SeatMove());
		table.getColumnModel().getColumn(9).setCellEditor(new SeatMove());

		table.getColumnModel().getColumn(10).setCellRenderer(new ExitSeat());
		table.getColumnModel().getColumn(10).setCellEditor(new ExitSeat());

		table.getColumnModel().getColumn(11).setCellRenderer(new EnterSeat());
		table.getColumnModel().getColumn(11).setCellEditor(new EnterSeat());

		
		//ȸ���˻��� �ؽ�Ʈ �ʵ� ����
		JTextField searchForm = new JTextField();
		searchForm.setBounds(59, 74, 178, 40);
		searchForm.setBorder(BorderFactory.createLineBorder(new Color(127,118,104)));

		//ȸ���˻��� �̹��� ���� �ҷ�����
		Image icon2 = new ImageIcon("images/search.PNG").getImage().getScaledInstance(32, 39, 0);
		JLabel searchLabel = new JLabel(new ImageIcon(icon2));
		searchLabel.setLocation(23, 75);
		searchLabel.setSize(32, 39);

		//�гο� �߰��ϱ�
		this.add(searchForm);
		this.add(searchLabel);
		this.add(logoLabel);
		this.add(allUserInfoButton);
		this.add(scrollpane);
	}



	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}

//�Խ� ��ư�� ���鶧 �ʿ��� Ŭ����
class EnterSeat extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
	JButton jb;

	public EnterSeat() {

		jb = new JButton("�Խ�");
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