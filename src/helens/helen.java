package helens;

import java.awt.BorderLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.EventQueue;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.TimerTask;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.accessibility.AccessibleContext;
import javax.swing.ButtonGroup;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.event.TableModelEvent;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class helen extends JFrame {
	public JTable publictable;
	protected static final String DefaultTableModel = null;
	public JTable getPublictable() {
		return publictable;
	}
	public String getDefaulttablemodel() {
		return DefaultTableModel;
	}
//	public JPanel getContentPane() {
//		return contentPane;
//	}
//	public JFrame getFrame() {
//		return frame;
//	}
//	public ButtonGroup getButtonGroup() {
//		return buttonGroup;
//	}
//	public JTextField getTextField() {
//		return textField;
//	}
//	public JTextField getTextField_1() {
//		return textField_1;
//	}
//	public JTextField getTextField_2() {
//		return textField_2;
//	}
//	public JTextField getTextField_3() {
//		return textField_3;
//	}
//	public JTextField getTextField_4() {
//		return textField_4;
//	}
//	public JTable getTable_1() {
//		return table_1;
//	}
//	public String getA() {
//		return a;
//	}
//	public AccessibleContext getB() {
//		return b;
//	}
//	public String getC() {
//		return c;
//	}
//	public String getD() {
//		return d;
//	}
//	public String getK() {
//		return k;
//	}
//	public Object getF() {
//		return f;
//	}
//	public Object getG() {
//		return g;
//	}
	private JPanel contentPane;
	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_1;
	String a;
	AccessibleContext b;
	String c;
	String d;
	String k;
	Object f;
	Object g;
	public int i = 0;
	class Helper extends TimerTask 
	{ 
	    
	 
	   
	    
	public void run() {
		try (Socket socket = new Socket("localhost", 5000)) {
	        BufferedReader echoes = new BufferedReader(
	                new InputStreamReader(socket.getInputStream()));
	        PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(), true);

	     //   Scanner scanner = new Scanner(System.in);
	        String echoString;
	        String response;

	        do {
	          //  System.out.println("Enter string to be echoed: ");
	        //    echoString = scanner.nextLine();
	        	//h.setVisible(true);
	        	echoString=getDefaulttablemodel();
	            stringToEcho.println(echoString);
	           // if(!echoString.equals("exit")) {
	                response = echoes.readLine();
	                
	               
	         //   }
	        } while(!echoString.equals("exit"));

	    } catch (IOException e) {
	        System.out.println("Client Error: " + e.getMessage());

	    }
	}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
		public void run() {
				try {
				helen frame = new helen();
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
	public helen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1334, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 106, 292, 540);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(10, 11, 186, 27);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mother's name");
		lblNewLabel_1.setBounds(10, 80, 186, 27);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Father's name");
		lblNewLabel_2.setBounds(10, 143, 186, 27);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Registration no.");
		lblNewLabel_3.setBounds(10, 226, 186, 27);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contact Mobile no.");
		lblNewLabel_4.setBounds(10, 304, 186, 27);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Class");
		lblNewLabel_5.setBounds(10, 384, 186, 27);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Section");
		lblNewLabel_6.setBounds(10, 462, 186, 27);
		panel.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(10, 49, 272, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 118, 272, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 181, 272, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 273, 272, 20);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 341, 272, 20);
		panel.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Montessori", "KG I", "KG II", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"}));
		comboBox.setBounds(10, 416, 272, 35);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"A", "B", "C", "D", "E"}));
		comboBox_1.setBounds(10, 493, 272, 35);
		panel.add(comboBox_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(null);
		scrollPane.setBounds(352, 168, 951, 476);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setColumnSelectionAllowed(true);
		table_1.setRowSelectionAllowed(true);
		table_1.setCellSelectionEnabled(true);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Mother's name", "Father's name", "Registration no.", "Contact Mobile No.", "Class", "Section"
			}

		));
		scrollPane.setViewportView(table_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(352, 168, 951, 476);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table_1.getModel();
				model.addRow(new Object[] {
						textField.getText(),
						textField_1.getText(),
						textField_2.getText(),
						textField_3.getText(),
						textField_4.getText(),
						comboBox.getSelectedItem(),
						comboBox_1.getSelectedItem(),
				});
				if (table_1.getSelectedRow() == -1) {
					if (table_1.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Process Completed",
								 "jj", JOptionPane.OK_OPTION, null);
						
					}
				}
			}
		});
		btnNewButton.setBounds(20, 72, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("Admisson Register");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(352, 11, 938, 69);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				DefaultTableModel model = (DefaultTableModel)table_1.getModel();
//				model.addRow(new Object[] {
//						publictable
//				});
//				if (table_1.getSelectedRow() == -1) {
//					if (table_1.getRowCount() == 0) {
//						JOptionPane.showMessageDialog(null, "Process Completed",
//								 "jj", JOptionPane.OK_OPTION, null);
//						
//					}
//				}
			}
		});
	
	
		btnNewButton_1.setBounds(115, 72, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Load Previous");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
				
		});
		btnNewButton_2.setBounds(214, 72, 128, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reset");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				comboBox.setSelectedItem("Montessori");
				comboBox_1.setSelectedItem("A");
			}
		});
		btnNewButton_3.setBounds(20, 38, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 366, 22);
		contentPane.add(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("File");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Print");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent  arg0) {
				try {
					table_1.print();
				}
				catch(java.awt.print.PrinterException e) {
					System.err.format("Printer not found",e.getMessage());
				}
				
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame,"Confirm you want to exit","Admmisson Register",
						JOptionPane.YES_NO_OPTION) ==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu = new JMenu("Edit");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Delete");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)table_1.getModel();
				model.removeRow(table_1.getSelectedRow());
			}
		});
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		mnNewMenu.add(mntmNewMenuItem);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
		
	}
	// public static void lg(String[] args) {
		//	String html=helen();
		//	File f = new File("D:\\test.html");
		//	try {
		//		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		//		bw.write(html);		
		//		bw.close();
		//	}catch (IOException e) {
		///            e.printStackTrace();
	   //// }
		//	    } 
}
