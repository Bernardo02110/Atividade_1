public class Natal extends CartaoWeb{

    public Natal(String destinatario) {
        super(destinatario);
    }
    @Override
    public void showMessage(){
        System.out.println(getDestinatario()+"Mais um ano chega ao fim, mais uma vez o espírito de Natal chega para suavizar os nossos dias, e trazer brilho e alegria para as nossas vidas.");
    }
}
