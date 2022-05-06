package uniftc.projeto;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("06/05/2022", "Mateus Santos", "mateus.jesus2@ftc.edu.br");
        
        System.out.println("Cliente cadastrado com sucesso!!");
        System.out.println("\nNome: " + cliente.getNome());
        System.out.println("\nEmail: " + cliente.getEmail());
        System.out.println("\nData de Cadastro: " + cliente.getData_cadastro());
        
        Funcionario funcionario = new Funcionario("Gerente", "Mateus Santos", "mateus.jesus2@ftc.edu.br");
        System.out.println("\nFuncionario cadastrado com sucesso!!");
        System.out.println("\nNome: " + funcionario.getNome());
        System.out.println("\nEmail: " + funcionario.getEmail());
        System.out.println("\nCargo: " + funcionario.getCargo());
        
        /*
        //Criando e alterando o objeto Aviario
        Aviario av1 = new Aviario();
        av1.consultar_estrutura();

        av1.setCliente("Juliel Vieira");
        av1.setEstrutura_direita(10);
        av1.setEstrutura_esquerda(10);
        av1.setLargura(30);
        av1.setComprimento(40);
        av1.setAltura(2);
        
        System.out.println("");
        System.out.println("Atualizando...");
        System.out.println("");
        
        av1.consultar_estrutura();
        
        
        //Criando e alterando o objeto estrutura
        
        Estrutura e1 = new Estrutura();
        e1.status();
        e1.setObstaculo("Ventilador");
        e1.setQtd_obstaculo(10);
        
        
        System.out.println("");
        System.out.println("Atualizando...");
        System.out.println("");
        
        e1.status();
        
        
        //Criando e alterando o objeto obstaculo
        Obstaculo o1 = new Obstaculo();
        o1.status();
        String name = e1.getObstaculo();
        o1.setNome(name);
        o1.setMetragem(200);
        
        System.out.println("");
        System.out.println("Atualizando...");
        System.out.println("");
        
        o1.status();
        
        av1.atualizar_estrutura();
        
        
        System.out.println("");
        System.out.println("RESUMO");
        av1.consultar_estrutura();
        e1.status();
        o1.status();
        
        */
    }
    
}
