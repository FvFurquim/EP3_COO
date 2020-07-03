public class FiltroContem implements ComportamentoDeFiltro {

	private String palavra;

	public FiltroContem(String palavra){
		this.palavra = palavra;
	}

	public boolean filtrar(Produto p){

		return (p.getDescricao().contains(palavra));
	}
}