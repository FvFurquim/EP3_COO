public class FormatacaoPadrao implements Formatador {
    Produto produto;

    @Override
    public String formatar(Produto p) {
        return p.formataParaImpressao();
    }

}
