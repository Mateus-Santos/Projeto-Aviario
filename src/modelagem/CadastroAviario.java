package modelagem;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JButton;

public class CadastroAviario extends JFrame {

	private JPanel contentPane;
	private JTextField Cliente;
	private JTextField estrutura_direita;
	private JTextField estrutura_esquerda;
	private JTextField largura;
	private JTextField comprimento;
	private JTextField altura;
	private JTextField pe_direito;
	
	Controller controller = new Controller();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtcliente;
	private JTextField textField_4;
	private JTextField textField_3;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_5;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroAviario frame = new CadastroAviario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public CadastroAviario() {
		setBounds(100, 100, 613, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Largura");
		lblNewLabel.setBounds(14, 50, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(14, 142, 46, 14);
		contentPane.add(lblAltura);
		
		JLabel lblNewLabel_1_1 = new JLabel("Comprimento");
		lblNewLabel_1_1.setBounds(14, 95, 70, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(11, 64, 78, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(11, 111, 78, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(14, 158, 77, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Adicionar cliente");
		btnNewButton.setBounds(98, 11, 130, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Adicionar Obstaculo direito");
		btnNewButton_1.setBounds(238, 11, 161, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Adicionar Obstaculo esquerdo");
		btnNewButton_1_1.setBounds(409, 11, 181, 23);
		contentPane.add(btnNewButton_1_1);
		
		txtcliente = new JTextField();
		txtcliente.setEditable(false);
		txtcliente.setBounds(98, 64, 130, 20);
		contentPane.add(txtcliente);
		txtcliente.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(248, 64, 70, 20);
		contentPane.add(textField_4);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(14, 210, 75, 20);
		contentPane.add(textField_3);
		
		JLabel area = new JLabel("Area");
		area.setBounds(14, 189, 46, 14);
		contentPane.add(area);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(328, 64, 70, 20);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(328, 136, 71, 20);
		contentPane.add(textField_7);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do cliente");
		lblNewLabel_1.setBounds(98, 50, 94, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(99, 111, 130, 20);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(98, 158, 130, 20);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setBounds(98, 95, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Data de cadastro");
		lblNewLabel_3.setBounds(98, 142, 94, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Obstaculo");
		lblNewLabel_4.setBounds(248, 50, 70, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("metragem");
		lblNewLabel_4_1.setBounds(328, 50, 70, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("Metragem total");
		lblNewLabel_5.setBounds(328, 119, 78, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_2 = new JLabel("Obstaculo");
		lblNewLabel_4_2.setBounds(419, 50, 70, 14);
		contentPane.add(lblNewLabel_4_2);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(419, 64, 70, 20);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("metragem");
		lblNewLabel_4_1_1.setBounds(499, 50, 70, 14);
		contentPane.add(lblNewLabel_4_1_1);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(499, 64, 70, 20);
		contentPane.add(textField_10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Metragem total");
		lblNewLabel_5_1.setBounds(499, 119, 78, 14);
		contentPane.add(lblNewLabel_5_1);
		
		textField_11 = new JTextField();
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(499, 136, 71, 20);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(498, 210, 71, 20);
		contentPane.add(textField_12);
		
		JLabel lblNewLabel_5_2 = new JLabel("Metragem total de obstaculos");
		lblNewLabel_5_2.setBounds(419, 189, 150, 14);
		contentPane.add(lblNewLabel_5_2);
	}
}
