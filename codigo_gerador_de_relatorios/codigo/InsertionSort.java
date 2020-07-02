public class InsertionSort implements ComportamentoDeOrdenacao {

	public void ordenacao(int ini, int fim, GeradorDeRelatorios gdr){

		Produto[] produtos = gdr.getProdutos();

		for(int i = ini; i <= fim; i++){

			Produto p1 = produtos[i];				
			int j = (i - 1);

			while(j >= ini){

				if(gdr.getCc().comparacao(p1, produtos[j])){
					produtos[j + 1] = produtos[j];
					j--;
				}
				else break;
			}

			produtos[j + 1] = p1;
		}
	}
}