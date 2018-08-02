import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stock extends JFrame {

	private JPanel contentPane;
	private JTextField SexField;
	private JTextField SalaryField;
	private JTextField AgeField;
	private JTextField LnameField;
	private JTextField FnameField;
	private JTextField IdField;
	private JTable table;
	private JTextField DeletField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stock frame = new Stock();
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
	public Stock() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 60, 87, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("First name:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(10, 95, 87, 14);
		contentPane.add(label);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLastName.setBounds(10, 130, 87, 14);
		contentPane.add(lblLastName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAge.setBounds(10, 162, 87, 14);
		contentPane.add(lblAge);
		
		JLabel lblScalaire = new JLabel("Salary:");
		lblScalaire.setHorizontalAlignment(SwingConstants.CENTER);
		lblScalaire.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblScalaire.setBounds(10, 196, 87, 14);
		contentPane.add(lblScalaire);
		
		JLabel lblNature = new JLabel("Sex:");
		lblNature.setHorizontalAlignment(SwingConstants.CENTER);
		lblNature.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNature.setBounds(10, 232, 87, 14);
		contentPane.add(lblNature);
		
		JButton btnNewButton = new JButton("Man");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SexField.setText("Man");
			}
		});
		btnNewButton.setBounds(10, 257, 69, 23);
		contentPane.add(btnNewButton);
		
		JButton btnWoman = new JButton("Woman");
		btnWoman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SexField.setText("Woman");
			}
		});
		btnWoman.setHorizontalAlignment(SwingConstants.LEFT);
		btnWoman.setBounds(119, 257, 79, 23);
		contentPane.add(btnWoman);
		
		SexField = new JTextField();
		SexField.setBounds(130, 230, 96, 20);
		contentPane.add(SexField);
		SexField.setColumns(10);
		
		SalaryField = new JTextField();
		SalaryField.setColumns(10);
		SalaryField.setBounds(130, 194, 96, 20);
		contentPane.add(SalaryField);
		
		AgeField = new JTextField();
		AgeField.setColumns(10);
		AgeField.setBounds(130, 160, 96, 20);
		contentPane.add(AgeField);
		
		LnameField = new JTextField();
		LnameField.setColumns(10);
		LnameField.setBounds(130, 124, 96, 20);
		contentPane.add(LnameField);
		
		FnameField = new JTextField();
		FnameField.setColumns(10);
		FnameField.setBounds(130, 93, 96, 20);
		contentPane.add(FnameField);
		
		IdField = new JTextField();
		IdField.setColumns(10);
		IdField.setBounds(130, 58, 96, 20);
		contentPane.add(IdField);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(236, 61, 404, 297);
		contentPane.add(scrollPane);
		
		DeletField = new JTextField();
		DeletField.setHorizontalAlignment(SwingConstants.CENTER);
		DeletField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		DeletField.setColumns(10);
		DeletField.setBounds(130, 338, 96, 20);
		contentPane.add(DeletField);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setHorizontalAlignment(SwingConstants.CENTER);
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblId.setBounds(10, 344, 87, 14);
		contentPane.add(lblId);
		
		JLabel lblNewLabel_1 = new JLabel("List of workers");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(159, 11, 323, 23);
		contentPane.add(lblNewLabel_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "First/N", "Last/N", "Age", "Scalaire", "Sex"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(79);
		table.getColumnModel().getColumn(3).setPreferredWidth(48);
		table.getColumnModel().getColumn(5).setPreferredWidth(64);
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		scrollPane.setViewportView(table);
		
		
		JButton btnNewButton_1 = new JButton("Add the perssonne");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int ide = Integer.valueOf(IdField.getText());
				int ag = Integer.valueOf(AgeField.getText());
				Float sal = Float.valueOf(SalaryField.getText());
				
				Workers wrk = new Workers(ide,
						                  FnameField.getText(),
						                  LnameField.getText(),
						                  ag,
						                  sal,
						                  SexField.getText()
						                  );
				Object [] w = {wrk.getId(),wrk.getfName(),wrk.getlName(),wrk.getAge(),wrk.getSalary(),wrk.getSex()
					
				};
				
				model.addRow(w);
				
				IdField.setText("");
				FnameField.setText("");
				LnameField.setText("");
				AgeField.setText("");
				SalaryField.setText("");
				SexField.setText("");
			}
		});
		btnNewButton_1.setBounds(46, 301, 180, 23);
		contentPane.add(btnNewButton_1);
		
		
		
		JButton btnNewButton_2 = new JButton("Delete the perssonne");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int index = 0;
				boolean found = false;
				for(int i=0;i < model.getRowCount();i++){
					if(DeletField.getText().matches(model.getValueAt(i, 0).toString())){
						index = i;
						found = true;
						
					}
						
				}
				System.out.print("bla bla");
					
				if(found == true){
					model.removeRow(index);
					System.out.print("bli bli");

				}
				
			}
		});
		btnNewButton_2.setBounds(46, 372, 180, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Edit the perssonne");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String a = model.getValueAt(table.getSelectedRow(),table.getSelectedColumn()).toString();
				EditFrame alt = new EditFrame(a,model, table.getSelectedRow(),table.getSelectedColumn());
				alt.setVisible(true);
				
				
			}
		});
		btnNewButton_3.setBounds(329, 394, 220, 23);
		contentPane.add(btnNewButton_3);
		
		
		
		JButton btnNewButton_4 = new JButton("Refresh");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4.setBounds(393, 369, 89, 23);
		contentPane.add(btnNewButton_4);
	}
}
