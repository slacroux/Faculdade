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
    	int opcao;
    	entrada = new Scanner(System.in);
    	
    	// Menu
    	do {
    		System.out.println("MENU:");
    		System.out.println("\n 1 - Cadastros");
    		System.out.println("\n 2 - Agendamentos;");
    		System.out.println("\n 3 - Buscar;");
    		System.out.println("\n 4 - Sair;");
    		System.out.println("\nOpção: ");
    		opcao = entrada.nextInt();
    		System.out.println("\n\n\n");
    		
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
    		System.out.println("\nOpção: ");
    		opcao = entradaCadastro.nextInt();
    		System.out.println("\n");
    		
    		switch(opcao) {
    		
	    		case 1: // Cadastro Veterinário
	    			Pessoa pessoa = cadastraPessoa();
	    			Funcionario funcionario = cadastraFuncionario(0);
	    			Veterinario vet = new Veterinario();
	    			
	    			/* Cadastro Informações Veterinário */
	    			System.out.println("\nInsira as informações do Veterinário(a): ");
	    			System.out.println("E-mail: ");
	    			vet.setEmail(entrada.next());
	    			System.out.println("Telefone para Emergência: ");
	    			vet.setTelefoneEmergencia(entrada.next());
	    			System.out.println("CRMV: ");
	    			vet.setCrmv(entrada.next());
	    			
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
    	// TODO: Implementar a conversão de String para Data
    	Pessoa pessoa = new Pessoa();
    	
    	System.out.println(" ----- Informações Pessoais ----- ");
    	System.out.println("Nome: ");
		pessoa.setNome(entrada.next());
		System.out.println("Sobrenome: ");
		pessoa.setSobrenome(entrada.next());
		System.out.println("Sexo: ");
		pessoa.setSexo(entrada.next());
		System.out.println("CPF: ");
		pessoa.setCfp(entrada.next());
		System.out.println("Data de Nascimento:");
		pessoa.setDataNascimento(entrada.next());
		
		System.out.println("\n ----- Endereço ----- ");
		pessoa.setEndereco(cadastraEndereco());
    	
    	return pessoa;
    }
    
    public static Endereco cadastraEndereco() {
    	Endereco endereco = new Endereco();
    	
    	System.out.println("Logradouro: ");
    	endereco.setLogradouro(entrada.next());
    	System.out.println("Número: ");
    	endereco.setNumero(entrada.nextInt());
    	System.out.println("Bairro: ");
    	endereco.setBairro(entrada.next());
    	System.out.println("Cidade: ");
    	endereco.setCidade(entrada.next());
    	System.out.println("Estado: ");
    	endereco.setEstado(entrada.next());
    	System.out.println("CEP: ");
    	endereco.setCep(entrada.next());
    	
    	return endereco;
    }
    
    public static Funcionario cadastraFuncionario(int cargoFuncionario) {
    	Funcionario func = new Funcionario();
    	
    	System.out.println("\n ----- Dados do Funcionário ----- ");
    	if (cargoFuncionario == 0) { // Funcionario
    		func.setCargo("Veterinario");
    	} else { // Atendente
    		System.out.println("Insira dados do Atendente:");
    		func.setCargo("Atendente");
    	}
    	
		System.out.println("Data de Admissão: ");
		func.setDataAdmissao(entrada.next());
		System.out.println("Data de Demissão: ");
		func.setDataDemissao(entrada.next());
		
		return func;
    	
    }
    
}
