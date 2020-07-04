public class BoldDecorator extends FormatadorDecorator {

    public BoldDecorator(Formatador formatador){
        super(formatador);
    }

    @Override
    public String formatar(Produto p) {
        return "<span style=\"font-weight:bold\">" + super.formatar(p) + "</span>";
    }
}
