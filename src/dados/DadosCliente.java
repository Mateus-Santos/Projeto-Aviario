package dados;

import java.util.ArrayList;
import java.util.List;

import modelagem.Funcionario;
import modelagem.Cliente;

public class DadosCliente {

	//Array que contem todos os clientes.
	public List<Cliente> banco_clientes = new ArrayList<>();
	
	//Array que contem todos os funcionarios.
	public List<Funcionario> banco_funcionarios = new ArrayList<>();
	
	//Função para adicionar todo novo funcionario na lista.
	public void armazenar_cliente (Funcionario funcionario) {
		banco_funcionarios.add(funcionario);
	}
	
	//Função para adicionar todo novo cliente.
	public void armazenar_funcionario (Cliente cliente) {
		banco_clientes.add(cliente);
	}

	public List<Cliente> findAll() {
		return banco_clientes;
	}

}
