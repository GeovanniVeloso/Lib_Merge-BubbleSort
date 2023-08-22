package ordenação.bubblesort;

public class OrdenaçãoBubbleSort {

	public OrdenaçãoBubbleSort() {
		super();
	}
	
	
	public int [] bubblesort (int [] vetor) {
		int tamanho = vetor.length;
		for (int i = 0; i < tamanho; i++) {
			for ( int j = 0; j < tamanho - 1; j ++) {
				if (vetor[j] > vetor [j+1]) {
					int aux = vetor [j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
			//printBubbleSort(vetor, i +1);
		}
		return vetor;
	}
	
	
	/*private void printBubbleSort(int[] vetor, int rodada) {
		for (int i: vetor) {
			System.out.println(i + " ");
		}
		System.out.println("Rodada #"+rodada);
	}*/
	
	
}
