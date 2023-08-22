package ordenação.mergesort;

public class OrdMergeSort {

	public OrdMergeSort() {
		super();
	}
	
	public int[]MergeSort(int[]vetor, int inicio, int fim){
		
		if (inicio<fim) {//Subvetor de 2 ou mais posições
			
			int meio = (inicio + fim)/2;
			
			MergeSort(vetor,inicio,meio);//Subvetor da esquerda
			MergeSort(vetor, meio + 1, fim);//Subvetor do meio
			intercala(vetor, inicio, meio, fim);
			
		}
		return vetor;
	}

	private void intercala(int[] vetor, int inicio, int meio, int fim) {
		int tamanho = vetor.length;
		int []vetoraux = new int [tamanho];
		
		for (int i = inicio; i<=fim; i++) {
			vetoraux[i] = vetor[i];
		}
		
		int poEsq = inicio;
		int poDir = meio + 1;
		
		for ( int cont = inicio; cont <= fim; cont ++) {
			if( poEsq > meio) {
				vetor[cont] = vetoraux[poDir];
				poDir++;
			}else if(poDir > fim) {
				vetor[cont] = vetoraux[poEsq];
				poEsq++;	
			}else if( vetoraux[poEsq]< vetoraux[poDir]) {
				vetor[cont] = vetoraux[poEsq];
				poEsq++;
			}else {
				vetor[cont] = vetoraux[poDir];
				poDir++;
			}
		}
	}

}
