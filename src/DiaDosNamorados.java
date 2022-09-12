public class DiaDosNamorados extends CartaoWeb{


    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage(){
        System.out.println(getDestinatario()+ " Hoje é um dia especial, mais uma data em que celebramos nosso amor e tudo de maravilhoso que temos vivido.");
    }

}
