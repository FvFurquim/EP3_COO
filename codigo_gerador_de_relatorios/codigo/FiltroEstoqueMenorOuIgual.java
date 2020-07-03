public class FiltroEstoqueMenorOuIgual implements ComportamentoDeFiltro {

	private int max;

	public FiltroEstoqueMenorOuIgual(int max){
		this.max = max;
	}

	public boolean filtrar(Produto p){

		return (p.getQtdEstoque() <= max);
	}
}