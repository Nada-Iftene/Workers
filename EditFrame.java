import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditFrame frame = new EditFrame("",null,0,0);
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
	public EditFrame(String change, DefaultTableModel model, int row, int column) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 186);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThePerssonne = new JLabel("Change :");
		lblThePerssonne.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblThePerssonne.setHorizontalAlignment(SwingConstants.CENTER);
		lblThePerssonne.setBounds(34, 46, 96, 14);
		contentPane.add(lblThePerssonne);
		
		textField = new JTextField(change);
		textField.setBounds(188, 44, 139, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnEditThePerssonne = new JButton("Edit the perssonne");
		btnEditThePerssonne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setValueAt(textField.getText(), row, column);
				setVisible(false);
			}
		});
		btnEditThePerssonne.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnEditThePerssonne.setBounds(106, 103, 156, 23);
		contentPane.add(btnEditThePerssonne);
	}
}
