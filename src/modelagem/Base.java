package modelagem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;

public class Base extends JFrame {

	private JPanel contentPane = null;
	private JTextField txtnome = null;
	private JTextField txtcpf = null;
	private JTextField txttelefone = null;
	private JTextField txtemail = null;
	private JTextField txtcargo = null;
	Controller controller = new Controller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Base frame = new Base();
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
	public Base() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,500,300);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.salvarFuncionario(txtcargo.getText(), txtnome.getText(), txtcpf.getText(), txttelefone.getText(), txtemail.getText());
			}
		});
		
		JLabel lblNewLabel_4 = new JLabel("Cadastrar novo funcionario!");
		lblNewLabel_4.setBounds(144, 29, 162, 14);
		getContentPane().add(lblNewLabel_4);
		btnNewButton.setBounds(296, 230, 107, 20);
		getContentPane().add(btnNewButton);
		
		txtnome = new JTextField();
		txtnome.setBounds(41, 92, 157, 20);
		getContentPane().add(txtnome);
		txtnome.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome completo");
		lblNewLabel.setBounds(41, 71, 107, 20);
		getContentPane().add(lblNewLabel);
		
		txtcpf = new JTextField();
		txtcpf.setBounds(246, 92, 157, 20);
		getContentPane().add(txtcpf);
		txtcpf.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setBounds(246, 74, 46, 14);
		getContentPane().add(lblNewLabel_1);
		
		txttelefone = new JTextField();
		txttelefone.setBounds(41, 154, 157, 20);
		getContentPane().add(txttelefone);
		txttelefone.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Telefone");
		lblNewLabel_2.setBounds(41, 139, 94, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(246, 139, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		txtemail = new JTextField();
		txtemail.setBounds(246, 154, 157, 20);
		getContentPane().add(txtemail);
		txtemail.setColumns(10);
		
		txtcargo = new JTextField();
		txtcargo.setBounds(41, 201, 157, 20);
		getContentPane().add(txtcargo);
		txtcargo.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Cargo");
		lblNewLabel_5.setBounds(41, 185, 46, 14);
		getContentPane().add(lblNewLabel_5);

	}
}
