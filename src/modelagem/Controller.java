package modelagem;

import java.util.List;

public class Controller {
	
	public BasedeDados basededados = new BasedeDados();
	
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
	
}
