package Projeto;

public class Serie extends Midia {
	
	private int temporada;
	private int episodio;
	private float duracaoMedia;
	
	public Serie(String titulo, String genero, String autor, String sinopse, int ano, int temporada,
			int episodio, float duracaoMedia) {
		super(titulo, genero, autor, sinopse, ano);
		this.temporada = temporada;
		this.episodio = episodio;
		this.duracaoMedia = duracaoMedia;
	}
	
	@Override
	public int imprime() {
		System.out.println("\tInforma��es");
		System.out.println("t�tulo: "+getTitulo()+"\nSinopse: "+getSinopse());
		
		
		System.out.println("\n\n\tOp��es");
		int decisao;
		do {
			System.out.println("\nDigite o n�mero de acordo com o que voc� quer fazer: "
					+ "\n1- Marcar como conclu�do"
					+ "\n2- Adicionar como favorito"
					+ "\n3- Voltar");
			decisao = ler.nextInt();
			
			if(decisao == 3) {
				return decisao;
			}
			else if(decisao<1 || decisao>3) {
				System.out.println("N�mero digitado incorreto!");
			}
			
			} while(decisao<1 || decisao>3);
			return decisao;
	}

	public int getTemporada() {
		return temporada;
	}

	public int getEpisodio() {
		return episodio;
	}

	public float getDuracaoMedia() {
		return duracaoMedia;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}

	public void setDuracaoMedia(float duracaoMedia) {
		this.duracaoMedia = duracaoMedia;
	}	
	
}
