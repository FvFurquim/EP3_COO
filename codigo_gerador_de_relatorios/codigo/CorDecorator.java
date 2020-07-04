import java.awt.Color;

public class CorDecorator extends FormatadorDecorator {
    private Color color;

    public CorDecorator(Formatador formatador, Color color){
        super(formatador);
        this.color = color;
    }

    @Override
    public String formatar(Produto p) {
		int r = color.getRed();
		int g = color.getGreen();
		int b = color.getBlue();
		
        return String.format("<span style=\"color:rgb(%d,%d,%d);\">%s</span>", r,g,b, super.formatar(p));
    }
}
