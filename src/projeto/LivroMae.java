package projeto;

public abstract class LivroMae implements InterLivroMae {
	//Atributos
	
	private String nome, genero, editora, sinopse, autor,classeInd, tW; 
	private double nota;
	int anoPublicacao,numDePag;
	//numDePag = N�mero de p�ginas || classeInd = Classe indicativa || tW = Trigger Warning 

	//M�todos (Getter/Setter)
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
