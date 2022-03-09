package projeto;

public abstract class LivroMae implements InterLivroMae {
	//Atributos
	
	private String nome, genero, editora, sinopse, autor,classeInd, tW; 
	private double nota;
	int anoPublicacao,numDePag;
	//numDePag = Número de páginas || classeInd = Classe indicativa || tW = Trigger Warning 

	//Métodos (Getter/Setter)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	


}
