public class Aniversario extends CartaoWeb{

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println(getDestinatario()+"Tenha um feliz aniversário cheio\n" +
                "de sorrisos e gargalhadas, repleto\n" +
                "de paz, amor e muita alegria.\n" +
                "Parabéns por mais um ano de vida!");
    }
}
