public class FormatadorDecorator implements Formatador {

    private Formatador formatador;

    public FormatadorDecorator(Formatador formatador){
        this.formatador = formatador;
    }

    @Override
    public String formatar(Produto p) {
        return formatador.formatar(p);
    }
}
