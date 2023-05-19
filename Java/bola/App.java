public class App{
    public static void main(String args[]){
        Bola bola = new Bola();

        bola.cor = "rosa";
        bola.circunferencia = 12;
        bola.material = "couro";

        System.out.println(bola.mostraCor());
        bola.trocaCor("couro");
        System.out.println(bola.mostraCor());
    }
}