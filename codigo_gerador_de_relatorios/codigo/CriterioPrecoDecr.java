public class CriterioPrecoDecr implements ComportamentoDeCriterio {

	public boolean comparacao(Produto p1, Produto p2){

		return (p1.getPreco() > p2.getPreco());
	}
}