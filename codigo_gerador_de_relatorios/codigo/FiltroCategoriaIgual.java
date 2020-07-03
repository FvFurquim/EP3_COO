public class FiltroCategoriaIgual implements ComportamentoDeFiltro {

	private String categoria;

	public FiltroCategoriaIgual(String categoria){
		this.categoria = categoria;
	}

	public boolean filtrar(Produto p){

		return (p.getCategoria().equalsIgnoreCase(categoria));
	}
}