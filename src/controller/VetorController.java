package controller;

public class VetorController {

	public VetorController() {
		super();
	}

	public void preencheVetor(int[] vet) {
		//Calcula tamanho e tempo inicial		
		int tamanho = vet.length;
		double tempoInicial = System.nanoTime();
		
		//Preenche vetor com zeros
		for (int i = 0; i < tamanho; i++) {
			vet[i] = 0;
		}
		
		//Calcula tempo final e exibe
		double tempoFinal = System.nanoTime();
		double tempoTotal = (tempoFinal - tempoInicial) / Math.pow(10, 9);
		System.out.println("Vetor de " + vet.length + " posições: " + tempoTotal + "s.");
	}
}
