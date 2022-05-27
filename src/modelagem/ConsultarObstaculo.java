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

public class ConsultarObstaculo extends JFrame {
	private JTable table;
	DefaultTableModel model;
	Controller controller = new Controller();
	List<Obstaculo> obstaculos = new ArrayList<Obstaculo>();
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarObstaculo frame = new ConsultarObstaculo();
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
	public ConsultarObstaculo() {
		
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
				for(int i = 0; i < obstaculos.size(); i++) {
					model.removeRow(0);
				}
				obstaculos = controller.listarObstaculo();
				Obstaculo obstaculo = null;
				System.out.print(obstaculos.size());
				for(int i = 0; i < obstaculos.size(); i++) {
					obstaculo = obstaculos.get(i);
					row[0]= obstaculo.getNome();
					row[1]= obstaculo.getMetragem();
					model.addRow(row);
				}
			}
		});
	}
}
