/*
Daniel de Jesus Lima
Jonathan Daniel Ramos
Matheus Aquati Kurianski
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