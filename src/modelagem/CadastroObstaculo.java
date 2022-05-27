package modelagem;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CadastroObstaculo extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	private JTextField txtmetragem;
	private Controller controller = new Controller();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroObstaculo frame = new CadastroObstaculo();
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
	public CadastroObstaculo() {
		setTitle("Cadastro de obstaculo");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome do obstaculo");
		lblNewLabel.setBounds(44, 37, 115, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Metragem");
		lblNewLabel_1.setBounds(218, 37, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(215, 110, 89, 23);
		contentPane.add(btnSalvar);
		
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtnome.getText().length() > 0 && txtmetragem.getText().length() > 0) {
					JOptionPane.showMessageDialog(null,"Obstaculo cadsatrado com sucesso!");
					setVisible(false);	//Fechar Janela após salvar
				}else {
					JOptionPane.showMessageDialog(null,"Preencha todos os campos.");
				}
			}
		});
		
		
		txtnome = new JTextField();
		txtnome.setBounds(40, 62, 119, 20);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		txtmetragem = new JTextField();
		txtmetragem.setBounds(218, 62, 86, 20);
		contentPane.add(txtmetragem);
		txtmetragem.setColumns(10);
	}
}
