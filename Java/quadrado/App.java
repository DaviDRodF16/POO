public class App{
    public static void main(String args[]){
        Quadrado quadrado = new Quadrado();
        quadrado.lado = 7;
        System.out.println(quadrado.mostraValor());
        System.out.println(quadrado.calculaArea());
        quadrado.mudaValor(8.0);
        System.out.println(quadrado.mostraValor());
        System.out.println(quadrado.calculaArea());
    }
}