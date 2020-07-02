package formatacao;

public class DataSourseDecorator implements DataSource {

    private DataSource wrappee;

    public DataSourseDecorator(DataSource wrappe){
        this.wrappee = wrappe;
    }

    @Override
    public String formata() {
        return wrappee.formata();
    }
}
