public class QuickSort implements ComportamentoDeOrdenacao {

	public void ordenacao(int ini, int fim, GeradorDeRelatorios gdr){
		
		if(ini < fim) {
			int q = particiona(ini, fim, gdr);
			
			ordenacao(ini, q, gdr);
			ordenacao(q + 1, fim, gdr);
		}
	}

	private int particiona(int ini, int fim, GeradorDeRelatorios gdr){

		Produto[] produtos = gdr.getProdutos();
		Produto p1 = produtos[ini];
		int i = (ini - 1);
		int j = (fim + 1);

		while(true){

			do{ 
				j--;

			} while(gdr.getCc().comparacao(p1, produtos[j]));
		
			do{
				i++;

			} while(gdr.getCc().comparacao(produtos[i], p1));

			if(i < j){
				Produto temp = produtos[i];
				produtos[i] = produtos[j]; 				
				produtos[j] = temp;
			}
			else return j;
		}
	}
}