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


public class AddClienteAviario extends JFrame {
	private JTable table;
	DefaultTableModel model;
	Controller controller = new Controller();
	List<Cliente> clientes = new ArrayList<Cliente>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddClienteAviario frame = new AddClienteAviario();
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
	public AddClienteAviario() {
		
		setBounds(100, 100, 483, 300);
		getContentPane().setLayout(null);
		model= new DefaultTableModel();
		Object[] column = {"Nome", "E-mail", "Telefone", "CPF", "Data de cadastro"};
		
		final Object[] row = new Object[5];
		model.setColumnIdentifiers(column);
		JButton ButtonBuscar = new JButton("Buscar");
		ButtonBuscar.setBounds(10, 11, 94, 23);
		getContentPane().add(ButtonBuscar);
		
		ButtonBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i = 0; i < clientes.size(); i++) {
					model.removeRow(0);
				}
				clientes = controller.listarCliente();
				Cliente cliente = null;
				System.out.print(clientes.size());
				for(int i = 0; i < clientes.size(); i++) {
					cliente = clientes.get(i);
					row[0]= cliente.getNome();
					row[1]= cliente.getEmail();
					row[2]= cliente.getTelefone();
					row[3]= cliente.getCpf();
					row[4]= cliente.getData_cadastro();
					model.addRow(row);
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 45, 467, 216);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(176, 196, 222));
		scrollPane.setViewportView(table);
		table.setModel(model);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(114, 11, 94, 23);
		getContentPane().add(btnAdicionar);
		
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				removeLinhaSelecionada();
			}
			
			public void removeLinhaSelecionada() {
				int indiceLinha = table.getSelectedRow();
				DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
				tableModel.removeRow(indiceLinha);
				tableModel.fireTableDataChanged();
			}
		});	
	}
}
