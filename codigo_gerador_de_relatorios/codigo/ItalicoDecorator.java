public class ItalicoDecorator implements Formatador {
    private Formatador wrappee;

    public ItalicoDecorator(Formatador wrappe){
        this.wrappee = wrappe;
    }

    @Override
    public String formata() {
        return "<span style=\"font-style:italic\">" + wrappee.formata() + "</span>";
    }
}
