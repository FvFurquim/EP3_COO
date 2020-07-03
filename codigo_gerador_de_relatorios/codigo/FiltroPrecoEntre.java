public class FiltroPrecoEntre implements ComportamentoDeFiltro {

	private double min;
	private double max;

	public FiltroPrecoEntre(double min, double max){
		this.min = min;
		this.max = max;
	}

	public boolean filtrar(Produto p){

		return (min <= p.getPreco() && p.getPreco() <= max);
	}
}