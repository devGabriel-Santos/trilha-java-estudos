import java.util.Scanner;

import br.eugabrieldev.entities.Iphone;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Iphone iphone = new Iphone();
		
		
		//interação com audio, selecionando musica, tocando música e pausando a música
		
		System.out.println("Reprodutor de Música Aberto");
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.pausar();
		System.out.println("Reprodutor de Música Finalizado");
		
		
		
		//Navegando na Web
		
		//reposta true ou false
		boolean estaConectado; 
		estaConectado = sc.nextBoolean();
		estaConectado = iphone.conexaoComInternet();
		System.out.println("Navegador WEB Aberto");
		iphone.adicionarNovaAba();
		iphone.exibirPaginaWeb();
		iphone.atualizarPagina();
		System.out.println("Navegador WEB Finalizado");
		
		
		//Ligações telefonicas
		
		//reposta true ou false
		boolean temRede;
		temRede = sc.nextBoolean();
		temRede = iphone.redeMovelDisponivel();
		System.out.println("Abrindo aplicação de discagem..");
		iphone.iniciarCorreioVoz();
		iphone.ligar();
		iphone.atender();
		
		System.out.println("Ligação finalizada");
		
		//reposta true ou false
		boolean desligarAparelho;
		desligarAparelho = sc.nextBoolean();
		if (desligarAparelho =! false) {
			System.out.println("Desligando Aparelho");
			sc.close();
		}
		else {
			
			System.out.println("Aparelho em estado ligado");
			
		}
		
	}
}
