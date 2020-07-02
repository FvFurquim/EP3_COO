public class FiltroCategoriaIgual implements ComportamentoDeFiltro {

	private Object argFiltro = null;

	public FiltroCategoriaIgual(){}

	public FiltroCategoriaIgual(Object argFiltro){
		this.argFiltro = argFiltro;
	}

	public boolean filtrar(Produto p){

		return (p.getCategoria().equalsIgnoreCase((String)argFiltro)) ;
	}
}