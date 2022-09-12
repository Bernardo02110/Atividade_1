public class Main {
    public static void main(String[] args) {

    DiaDosNamorados amor = new DiaDosNamorados("Bernardo");
    Natal papainoel = new Natal("SantaClaus");
    Aniversario niver = new Aniversario("Bernardo");


    amor.showMessage();
    System.out.println("\n");
    papainoel.showMessage();
    System.out.println("\n");
    niver.showMessage();
    }
}