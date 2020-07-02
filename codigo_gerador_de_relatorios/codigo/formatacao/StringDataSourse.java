package formatacao;

public class StringDataSourse implements DataSource {
    String frase_original;

    public StringDataSourse(String s){
        this.frase_original = s;
    }

    @Override
    public String formata() {
        return this.frase_original;
    }

    public String getFrase_formatada() {
        return frase_original;
    }
}
