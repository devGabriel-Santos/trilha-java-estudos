package br.eugabrieldev.entities;

import br.eugabrieldev.entities.interfaces.IAparelhoTelefone;
import br.eugabrieldev.entities.interfaces.INavegadorInternet;
import br.eugabrieldev.entities.interfaces.IReprodutorMusical;

public class Iphone implements IAparelhoTelefone, IReprodutorMusical, INavegadorInternet{

	@Override
	public boolean conexaoComInternet() {
		
		boolean temConexao = false;
		
		if (temConexao =! false) {
			System.out.println("Conexão com a internet ativada");
			return true;
		}
		else {
			System.out.println("Não tem conexao com a internet");
		
			return false;
		}
	}

	@Override
	public void exibirPaginaWeb() {
		System.out.println("Pagina exibida com sucesso!");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Pagina adicionada com sucesso!");
		
	}

	@Override
	public void atualizarPagina() {
		
		System.out.println("Pagina atualizada com sucesso!");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música...");
		System.out.println("Música pausada com sucesso!");
		
	}

	@Override
	public void selecionarMusica() {
		
		System.out.println("Selecionando música...");
		System.out.println("Música selecionada com sucesso!");
	}

	@Override
	public boolean redeMovelDisponivel() {
		
		boolean redeDisponivel = false;
		
		if(redeDisponivel != true) {
			System.out.println("Rede disponível");
			return true;
		}else {
			System.out.println("Rede indisponivel");
			return false;
		}
	}

	@Override
	public void ligar() {
		System.out.println("Iniciando ligação de voz...");
		System.out.println("ligação de voz iniciado com sucesso!");
		
	}

	@Override
	public void atender() {
		

		System.out.println("Chamada atendida com sucesso!");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		
		System.out.println("Iniciando correio de voz...");
		System.out.println("Correio de voz iniciado com sucesso!");
		
	}

}
