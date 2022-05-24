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
		
		setBounds(100, 100, 483, 300);
		getContentPane().setLayout(null);
		model= new DefaultTableModel();
		Object[] column = {"Nome", "E-mail", "Telefone", "CPF", "Cargo"};
		final Object[] row = new Object[5];
		model.setColumnIdentifiers(column);
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setBounds(10, 11, 94, 23);
		getContentPane().add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 45, 467, 216);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(176, 196, 222));
		scrollPane.setViewportView(table);
		table.setModel(model);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(114, 11, 94, 23);
		getContentPane().add(btnExcluir);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < funcionarios.size(); i++) {
					model.removeRow(0);
				}
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
	}
}
