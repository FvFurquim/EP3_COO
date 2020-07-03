public class ProdutoFormatador implements Formatador {
    Produto produto;

    public ProdutoFormatador(Produto p){
        this.produto = p;
    }

    @Override
    public String formata() {
        return this.produto.formataParaImpressao();
    }

    public String getProdutoFormat() {
        return this.produto.formataParaImpressao();
    }
}
