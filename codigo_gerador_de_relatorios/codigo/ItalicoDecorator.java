public class ItalicoDecorator extends FormatadorDecorator{

    public ItalicoDecorator(Formatador formatador){
        super(formatador);
    }

    @Override
    public String formatar(Produto p) {
        return "<span style=\"font-style:italic\">" + super.formatar(p) + "</span>";
    }
}
