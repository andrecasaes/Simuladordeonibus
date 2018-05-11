/*
Daniel de Jesus Lima - 10723951
Jonathan Daniel Ramos - 10857082
Matheus Aquati Kurianski - 10687541
*/


interface Ponto {

	String nome = "default";
	int local = 0;
	int pessoas = 0;

	/*	

	****Atribui valores aleatórios às variáveis pois o compilador exigiu que eu as inicializassem.****

		-Sobre o int local:
	Localização em km. Se o trajeto não for linear, 
	pode ser substituído por uma matriz com as coordenadas (x,y) da localização do ponto.
	
	*/

	void setPontoInfo(String nome, int local); //Cadastra informações essenciais e fixas sobre o ponto, no caso, nome e localização.

	void setNome(String nome); //Apenas nomeia o ponto.
	String getNome(); //Recebe o nome do ponto.

	void setLocal(int local); //Apenas cadastra a localização do ponto.
	int getLocal(); //Recebe a localização do ponto.

	void setPessoas(int pessoas); //Define um número de pessoas sem a necessidade de adicionar ou subtrair as existentes.
	void addPessoas(int add); //Adiciona pessoas no ponto.
	void absPessoas(int abs); //Abstrai pessoas no ponto.
	int getPessoas(); //Recebe o número de pessoas no ponto.

}

class pontoOnibus implements Ponto {
	public String nome;
	public int local;
	public int pessoas;

	public void setPontoInfo(String nome, int local){
		this.nome = nome;
		this.local = local;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setLocal(int local){
		this.local = local;
	}

	public int getLocal(){
		return local;
	}

	public void setPessoas(int pessoas){
		this.pessoas = pessoas;
	}

	public void addPessoas(int add){
		pessoas+=add;
	}

	public void absPessoas(int abs){
		pessoas-=abs;
	}

	public int getPessoas(){
		return pessoas;
	}
}
