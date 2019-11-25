package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.company.model.Endereco;
import com.company.model.Funcionario;
import com.company.model.Pessoa;
import com.company.model.Veterinario;

public class Main {

	public static Scanner entrada, entradaCadastro;
	
    public static void main(String[] args) {
	// write your code here
    	
    	int opcao;
    	entrada = new Scanner(System.in);
    	
    	// Menu
    	do {
    		System.out.println("MENU:");
    		System.out.println("\n 1 - Cadastros");
    		System.out.println("\n 2 - Agendamentos;");
    		System.out.println("\n 3 - Buscar;");
    		System.out.println("\n 4 - Sair;");
    		opcao = entrada.nextInt();
    		
    		switch(opcao) {
    		
	    		case 1:
	    			menuCadastros();
	    			break;
	    		
	    		case 2:
//	    			menuAgendamento();
	    			break;
	    		
	    		case 3:
//	    			menuBusca();
	    			break;
	    		
	    		default:
	    				System.out.println("Opção inexistente\n\n");
    		}
    		
    	} while (opcao != 4);
    	
    	// Menu de Cadastro
    }
    
    public static void menuCadastros() {
    	int opcao;
    	entradaCadastro = new Scanner(System.in);
    	do {
    		System.out.println("Cadastar:");
    		System.out.println("\t\n 1 - Veterinário;");
    		System.out.println("\t\n 2 - Atendente;");
    		System.out.println("\t\n 3 - Cliente;");
    		System.out.println("\t\n 4 - Animal;");
    		System.out.println("\t\n 5 - Retornar ao menu principal;");
    		opcao = entradaCadastro.nextInt();
    		
    		switch(opcao) {
    		
	    		case 1: // Cadastro Veterinário
	    			Pessoa pessoa = cadastraPessoa();
	    			Funcionario funcionario = cadastraFuncionario(0);
	    			Veterinario vet;
	    			String[] vetAux = new String[3];
	    			
	    			System.out.println("Insira as informações do Veterinário: ");
	    			System.out.println("E-mail: ");
	    			vetAux[0] = entrada.nextLine();
	    			System.out.println("Telefone para Emergência: ");
	    			vetAux[1] = entrada.nextLine();
	    			System.out.println("CRMV: ");
	    			vetAux[2] = entrada.nextLine();
	    			
	    			vet = new Veterinario(pessoa, funcionario, vetAux[0], vetAux[1], vetAux[2]);
	    			break;
	    		
	    		case 2: // Cadastro 
//	    			Pessoa pessoa = cadastraPessoa();
//	    			Funcionario funcionario = cadastraFuncionario(1);
	    			
	//    			cadastroAtendente ();
	    			break;
	    		
	    		case 3: // Cadastro 
	//    			cadastroCliente ();
	    			break;
	
	    		case 4: // Cadastro 
	//    			cadastroCliente ();
	    			break;
	
	    		case 5: // Retornar ao menu principal
	    			break;
	    			
	    		default:
	    				System.out.println("Opção inexistente\n\n");
    		}
    		
    	} while (opcao != 5);
    	
    	
    	
    }
    
    
//    public static void menuAgendamento() {
//    	int opcao;
//    	entradaCadastro = new Scanner(System.in);
//    	do {
//    		System.out.println("Cadastro:");
//    		System.out.println("\n 1 - Cadastro de Veterinários;");
//    		System.out.println("\n 2 - Cadastro do Atendente;");
//    		System.out.println("\n 3 - Cadastro do Cliente;");
//    		System.out.println("\n 4 - Cadastro do Animal;");
//    		System.out.println("\n 5 - Voltar;");
//    		opcao = entradaCadastro.nextInt();
//    		
//    		switch(opcao) {
//    		
//    		case 1:
////    			cadastroVet ();
//    			break;
//    		
//    		case 2:
////    			cadastroAtendente ();
//    			break;
//    		
//    		case 3:
////    			cadastroCliente ();
//    			break;
//
//    		case 4:
////    			cadastroCliente ();
//    			break;
//
//    		case 5:
////    			cadastroCliente ();
//    			break;
//    			
//    		default:
//    				System.out.println("Opção inexistente\n\n");
//		}
//    		
//    	} while (opcao);
//    	
//    	
//    	
//    }
//    
//    public static void menuBusca() {
//    	int opcao;
//    	entradaCadastro = new Scanner(System.in);
//    	do {
//    		System.out.println("Cadastro:");
//    		System.out.println("\n 1 - Cadastro de Veterinários;");
//    		System.out.println("\n 2 - Cadastro do Atendente;");
//    		System.out.println("\n 3 - Cadastro do Cliente;");
//    		System.out.println("\n 4 - Cadastro do Animal;");
//    		System.out.println("\n 5 - Voltar;");
//    		opcao = entradaCadastro.nextInt();
//    		
//    		switch(opcao) {
//    		
//    		case 1:
////    			cadastroVet ();
//    			break;
//    		
//    		case 2:
////    			cadastroAtendente ();
//    			break;
//    		
//    		case 3:
////    			cadastroCliente ();
//    			break;
//
//    		case 4:
////    			cadastroCliente ();
//    			break;
//
//    		case 5:
////    			cadastroCliente ();
//    			break;
//    			
//    		default:
//    				System.out.println("Opção inexistente\n\n");
//		}
//    		
//    	} while (opcao);
//    	
//    		
//    }
    
    public static Pessoa cadastraPessoa () {
    	
    	Pessoa pessoa = new Pessoa();
//    	String date;
    	
    	System.out.println("Nome: ");
		pessoa.setNome(entrada.nextLine());
		System.out.println("Sobrnome: ");
		pessoa.setSobrenome(entrada.nextLine());
		System.out.println("Sexo: ");
		pessoa.setSexo(entrada.nextLine());
		System.out.println("CPF: ");
		pessoa.setCfp(entrada.nextLine());
		System.out.println("Data de Nascimento:");
		pessoa.setDataNascimento(entrada.next());
		
//		date = entrada.nextLine();
//		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//		
//		try { 
//			Date dateFormated = data.parse(date); 
//		} catch (ParseException ex) {
//			ex.printStackTrace(); 
//		}
//		pessoa.setDataNascimento(entrada.next());
    	
    	System.out.println("Endereço: ");
		pessoa.setEndereco(cadastraEndereco());
    	
    	return pessoa;
    }
    
    public static Endereco cadastraEndereco() {
    	Endereco endereco = new Endereco();
    	
    	System.out.println("Preecha o Endereço: ");
    	System.out.println("Logradouro: ");
    	endereco.setLogradouro(entrada.nextLine());
    	System.out.println("Número: ");
    	endereco.setNumero(entrada.nextInt());
    	System.out.println("Bairro: ");
    	endereco.setBairro(entrada.nextLine());
    	System.out.println("Cidade: ");
    	endereco.setCidade(entrada.nextLine());
    	System.out.println("Estado: ");
    	endereco.setEstado(entrada.nextLine());
    	System.out.println("CEP: ");
    	endereco.setCep(entrada.nextLine());
    	
    	return endereco;
    }
    
    public static Funcionario cadastraFuncionario(int cargoFuncionario) {
    	Funcionario func = new Funcionario();

    	
    	if (cargoFuncionario == 0) { // Funcionario
    		System.out.println("Insira dados do Veterinario:");
    		func.setCargo("Veterinario");
    	} else { // Atendente
    		System.out.println("Insira dados do Atendente:");
    		func.setCargo("Atendente");
    	}
    	
		System.out.println("Data de Admissão: ");
		func.setDataAdmissao(entrada.nextLine());
		System.out.println("Data de Demissão: ");
		func.setDataDemissao(entrada.nextLine());
		
		return func;
    	
    }
    
}
