package formatacao;

public class BoldDecorator implements DataSource {
    private DataSource wrappe;

    public BoldDecorator(DataSource wrappe){
        this.wrappe = wrappe;
    }

    @Override
    public String formata() {
        return "<span style=\"font-weight:bold\">" + wrappe.formata() + "</span>";
    }
}
