package modelagem;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtcpf;
	private JTextField txttelefone;
	private JTextField txtemail;
	private JTextField txtcargo;
	Controller controller = new Controller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario cadastro_funcionario = new CadastroFuncionario();
					cadastro_funcionario.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public CadastroFuncionario() {
		setBounds(100,100,500,300);
		getContentPane().setLayout(null);
		JButton btnNewButton = new JButton("Salvar");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtcargo.getText().length() > 0 && txtnome.getText().length() > 0 && txtcpf.getText().length() > 0 && txttelefone.getText().length() > 0 && txtemail.getText().length() > 0) {
					controller.salvarFuncionario(txtcargo.getText(), txtnome.getText(), txtemail.getText(), txttelefone.getText(), txtcpf.getText());
					setVisible(false);	//Fechar Janela após salvar
				}else {
					JOptionPane.showMessageDialog(null,"Preencha todos os campos.");
				}
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
