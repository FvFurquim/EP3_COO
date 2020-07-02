package formatacao;

public class ItalicoDecorator implements DataSource {
    private DataSource wrappee;

    public ItalicoDecorator(DataSource wrappe){
        this.wrappee = wrappe;
    }

    @Override
    public String formata() {
        return "<span style=\"font-style:italic\">" + wrappee.formata() + "</span>";
    }
}
