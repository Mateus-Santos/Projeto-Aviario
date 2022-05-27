package modelagem;

import java.util.ArrayList;
import java.util.List;

public class BasedeDados {
	
	private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private static List<Cliente> clientes = new ArrayList<Cliente>();
    private static List<Obstaculo> obstaculos = new ArrayList<Obstaculo>();
    
    private static List<Aviario> aviarios = new ArrayList<Aviario>();
    
    //Funções sobre Funcionarios.
	public List<Funcionario> getFuncionarios() {
		return this.funcionarios;
	}
	
	public void setFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		System.out.println("Quantidade atual de funcionarios cadastrados " + this.funcionarios.size());
	}
	
	//Funções sobre clientes.
	public List<Cliente> getClientes() {
		return this.clientes;
	}
	
	public void setClientes(Cliente cliente) {
		System.out.println(cliente.getNome());
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getCpf());
		this.clientes.add(cliente);
		System.out.println("Quantidade atual de clientes cadastrados. " + this.clientes.size());
	}
	
	//Funções sobre obstaculos.
	
	public List<Obstaculo> getObstaculos() {
		return this.obstaculos;
	}
	
	public void setObstaculo(Obstaculo obstaculo) {
		System.out.println(obstaculo.getNome());
		System.out.println(obstaculo.getMetragem());
		this.obstaculos.add(obstaculo);
		System.out.println("Quantidade atual de obstaculos cadastrados." + this.obstaculos.size());
	}
}
