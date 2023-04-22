package view;

import br.mari.quicksort.Ordenacao;

public class Principal {

	public static void main(String[] args) {
		int []vt = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		Ordenacao ord = new Ordenacao();
		vt= ord.quickSort(vt, 0,vt.length -1);
		for(int valor: vt) {
			System.out.print(valor);
			System.out.println(" ");
		}
	}

}
