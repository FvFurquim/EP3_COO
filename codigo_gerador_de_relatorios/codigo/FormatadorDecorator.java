public class FormatadorDecorator implements Formatador {

    private Formatador wrappee;

    public FormatadorDecorator(Formatador wrappe){
        this.wrappee = wrappe;
    }

    @Override
    public String formata() {
        return wrappee.formata();
    }
}
