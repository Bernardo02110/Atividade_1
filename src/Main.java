import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    DiaDosNamorados amor = new DiaDosNamorados("Bernardo");
    Natal papainoel = new Natal("SantaClaus");
    Aniversario niver = new Aniversario("Bernardo");

    ArrayList<CartaoWeb> mensagens = new ArrayList<>();

    mensagens.add(amor);
    mensagens.add(papainoel);
    mensagens.add(niver);

        for (int i=1; i<mensagens.size(); i++) {
            mensagens.get(i).showMessage();
        }
    }
}