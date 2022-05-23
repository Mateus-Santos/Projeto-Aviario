package modelagem;

import java.util.ArrayList;
import java.util.List;

public class BasedeDados {
	
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Aviario> aviarios = new ArrayList<Aviario>();
    
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public void setClientes(Cliente cliente) {
		this.clientes.add(cliente);
	}
}
