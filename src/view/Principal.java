/*Fazer uma aplicação Java em Eclipse que tenha uma operação que receba um vetor de 1000
posições inteiras (Preencher todas as posições com valor 0) e gere o tempo gasto, em
Segundos, para percorrer o vetor. Repetir para 10000 e 100000 posições. A aplicação deve
ter uma classe de controle com métodos para operações e uma classe de visão que instancie
a classe de controle para a comunicação. A resposta da tarefa deve ser o print do console
com cada tempo.*/

package view;

import controller.VetorController;

public class Principal {
	public static void main(String[] args) {
		//Criação de vetores de mil, dez mil e cem mil posições
		int[] vet1 = new int[1000];
		int[] vet2 = new int[10000];
		int[] vet3 = new int[100000];
		
		//Instancia do controle
		VetorController controle = new VetorController();
		
		//Chamada dos metodos
		controle.preencheVetor(vet1);
		controle.preencheVetor(vet2);
		controle.preencheVetor(vet3);
	}
	
	
}
