package modelagem;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class MainView extends JFrame {

	private JPanel contentPane;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
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
	public MainView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Cadastrar");
		menuBar.add(mnNewMenu);
		
		JMenuItem MenuItemFuncionario = new JMenuItem("Novo Funcionario");
		mnNewMenu.add(MenuItemFuncionario);
		MenuItemFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFuncionario cadastro_funcionario = new CadastroFuncionario();
				cadastro_funcionario.setVisible(true);
			}
		});
		
		JMenuItem MenuItemCliente = new JMenuItem("Novo Cliente");
		mnNewMenu.add(MenuItemCliente);
		
		MenuItemCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCliente cadastro_cliente = new CadastroCliente();
				cadastro_cliente.setVisible(true);
			}
		});
		JMenuItem MenuItemAviario = new JMenuItem("Novo Aviario");
		mnNewMenu.add(MenuItemAviario);
		
		MenuItemAviario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroAviario cadastro_aviario = new CadastroAviario();
				cadastro_aviario.setVisible(true);
			}
		});
		
		JMenu mnNewMenu_4 = new JMenu("Novo Produto");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenuItem mntmTela = new JMenuItem("Nova Tela");
		mnNewMenu_4.add(mntmTela);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Nova Lona");
		mnNewMenu_4.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Nova Divisoria");
		mnNewMenu_4.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Nova Lampada");
		mnNewMenu_4.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Novo Pedido");
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenu mnNewMenu_1 = new JMenu("Buscar");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Buscar Funcionario");
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarFuncionario consultarFuncionario = new ConsultarFuncionario();
				consultarFuncionario.setVisible(true);
			}
		});
		
		JMenuItem mntmNewMenuItem_6_1 = new JMenuItem("Buscar Cliente");
		mnNewMenu_1.add(mntmNewMenuItem_6_1);
		
		mntmNewMenuItem_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsultarCliente consultar_Cliente = new ConsultarCliente();
				consultar_Cliente.setVisible(true);
			}
		});
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
}
