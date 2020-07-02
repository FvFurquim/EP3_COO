public class CriterioDescCresc implements ComportamentoDeCriterio {

	public boolean comparacao(Produto p1, Produto p2){

		return (p1.getDescricao().compareToIgnoreCase(p2.getDescricao()) < 0);
	}
}