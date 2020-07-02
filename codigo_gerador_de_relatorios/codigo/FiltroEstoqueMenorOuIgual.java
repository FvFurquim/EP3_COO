public class FiltroEstoqueMenorOuIgual implements ComportamentoDeFiltro {

	private Object argFiltro = null;

	public FiltroEstoqueMenorOuIgual(){}

	public FiltroEstoqueMenorOuIgual(Object argFiltro){
		this.argFiltro = argFiltro;
	}

	public boolean filtrar(Produto p){

		return (p.getQtdEstoque() <= (Integer) argFiltro);
	}
}