public class BoldDecorator implements Formatador {
    private Formatador wrappe;

    public BoldDecorator(Formatador wrappe){
        this.wrappe = wrappe;
    }

    @Override
    public String formata() {
        return "<span style=\"font-weight:bold\">" + wrappe.formata() + "</span>";
    }
}
