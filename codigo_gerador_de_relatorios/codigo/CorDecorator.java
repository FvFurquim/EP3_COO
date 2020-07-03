import java.awt.*;

public class CorDecorator implements Formatador {
    private Formatador wrappe;
    private Color color;

    public CorDecorator(Formatador wrappe, Color color){
        this.wrappe = wrappe;
        this.color = color;
    }

    @Override
    public String formata() {
		int r = color.getRed();
		int g = color.getGreen();
		int b = color.getBlue();
		
        return String.format("<span style=\"color:rgb(%d,%d,%d);\">%s</span>", r,g,b, wrappe.formata());
    }
}
