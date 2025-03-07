public class Iphone implements ReprodutorMusical, AparelhoTelefonico,Navegador{
	//Implementação dos métodos da interface ReprodutorMusical
	@Override
	public void tocar(){
		System.out.println("A música está tocando.");
	}

	@Override
	public void pausar(){
		System.out.println("A música está em pausa.");
	}

	@Override
	public String selecionarMusica(String musica){
		return musica;
	}
	//--

	//Implementação dos métodos da interface AparelhoTelefonico
	@Override
	public void ligar(String numero){
		System.out.println("Ligando para "+numero+"...");
	}

	@Override
	public void atender(){
		System.out.println("Atendendo...");
	}

	@Override
	public void iniciarCorreioVoz(){
		System.out.println("Chamando Correio de Voz!!");
	}
	//--

	//Implementação dos métodos da interface Navegador
	@Override
	public String exibirPagina(String url){
		return url;
	}

	@Override
	public void adicionarNovaAba(){
		System.out.println("Nova aba criada!");
	}

	@Override
	public void atualizarPagina(){
		System.out.println("Atualizando página!");
	}
	//--

	//Método de execução
	public static void main(String[] args){
		Iphone tel = new Iphone();

		//Selecionando o aplicativo Reprodutor Musical
		System.out.println("Reprodutor Musical \n----------");
		System.out.println(tel.selecionarMusica("minha música"));
		tel.tocar();
		tel.pausar();

		//Selecionando o aplicativo Telefone
		System.out.println("Telefone \n----------");
		tel.ligar("88888-9999");
		tel.iniciarCorreioVoz();

		//Selecionando o aplicativo Navegador de Internet
		System.out.println("Navegador \n----------");
		System.out.println("URL: "+tel.exibirPagina("www.google.com"));
		tel.atualizarPagina();
	}

}