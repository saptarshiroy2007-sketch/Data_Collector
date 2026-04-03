package helens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class table extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
    private String DefaultTableModel = null;
    private JTable table;
	public  String getDefaulttablemodel() {
		return DefaultTableModel;
	}
	public void setDefaulttablemodel(String Defaulttablemodel) {
		this.DefaultTableModel=Defaulttablemodel;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table frame = new table();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public table() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1334, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(352, 168, 951, 476);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table_1.setColumnSelectionAllowed(true);
		table_1.setRowSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			"Name", "Mother's name", "Father's name", "Registration no.", "Contact Mobile No.", "Class", "Section"
			}));
		scrollPane.setViewportView(table);
		
//		table_1 = new JTable();
		
//
//		));
	}
	
}
