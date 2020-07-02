public class EstoqueCresc implements ComportamentoDeCriterio {

	public boolean comparacao(Produto p1, Produto p2){

		return (p1.getQtdEstoque() < p2.getQtdEstoque());
	}
}