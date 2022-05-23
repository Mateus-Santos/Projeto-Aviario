package modelagem;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class ConsultarFuncionario extends JFrame {
	private JTable table;
	DefaultTableModel model;
	Controller controller = new Controller();
	List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarFuncionario frame = new ConsultarFuncionario();
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
	public ConsultarFuncionario() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(0, 0, 434, 261);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(30, 36, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(86, 36, 46, 14);
		panel.add(lblEmail);
		
		JLabel lblNewLabel_1_1 = new JLabel("Telefone");
		lblNewLabel_1_1.setBounds(142, 36, 60, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("CPF");
		lblNewLabel_1_1_1.setBounds(210, 36, 46, 14);
		panel.add(lblNewLabel_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 60, 375, 190);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model= new DefaultTableModel();
		Object[] column = {"Nome", "E-mail", "Telefone", "CPF", "Cargo"};
		final Object[] row = new Object[5];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				funcionarios = controller.listarFuncionario();
				Funcionario funcionario = null;
				System.out.print(funcionarios.size());
				for(int i = 0; i < funcionarios.size(); i++) {
					funcionario = funcionarios.get(i);
					row[0]= funcionario.getNome();
					row[1]= funcionario.getEmail();
					row[2]= funcionario.getTelefone();
					row[3]= funcionario.getCpf();
					row[4]= funcionario.getCargo();
					model.addRow(row);
				}
			}
		});
		btnNewButton.setBounds(297, 32, 89, 23);
		panel.add(btnNewButton);
	}
}
