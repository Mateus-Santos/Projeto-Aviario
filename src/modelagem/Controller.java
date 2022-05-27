package modelagem;

import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Controller {
	
	public BasedeDados basededados = new BasedeDados();
	
	//Salvar funcionario na base de dados
	public void salvarFuncionario(String cargo, String nome, String email, String telefone, String cpf) {
		Funcionario funcionario = new Funcionario(cargo, nome, email, telefone, cpf);
		System.out.printf(funcionario.getCargo());
		System.out.printf("\n" + funcionario.getNome());
		System.out.printf("\n" + funcionario.getEmail());
		System.out.printf("\n" + funcionario.getTelefone());
		System.out.printf("\n" + funcionario.getCpf());
		basededados.setFuncionarios(funcionario);
		System.out.printf("Cadastrado com sucesso!!");
	}
	
	public List<Funcionario> listarFuncionario() {
		return basededados.getFuncionarios();
	}
	
	//Salvar cliente na base de dados
	public void salvarCliente(String nome, String email, String telefone, String cpf) {
		DateTimeFormatter data = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String data_cadastro;
		data_cadastro = data.format(LocalDateTime.now());
		Cliente cliente = new Cliente(data_cadastro, nome, email, telefone, cpf);
		basededados.setClientes(cliente);
		System.out.printf("Cadastrado com sucesso!!");
	}
	
	public List<Cliente> listarCliente() {
		return basededados.getClientes();
	}
	
	//Cadsatro de obstaculos.
	public Obstaculo salvarObstaculo(String nome, double metragem) {
		Obstaculo obstaculo = new Obstaculo(nome, metragem);
		basededados.setObstaculo(obstaculo);
		System.out.printf("Cadastrado com sucesso!!");
		return obstaculo;
	}
	
	public List<Obstaculo> listarObstaculo() {
		return basededados.getObstaculos();
	}
	
}
