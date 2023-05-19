import java.util.Scanner;
public class TesteRetangulo{
    public static void main(String args[]){
        Retangulo retangulo = new Retangulo();
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a altura do retangulo");
        retangulo.altura = leia.nextDouble();
        System.out.println("Informe a base do retangulo");
        retangulo.base = leia.nextDouble();
        System.out.println(retangulo.mostraValor());
        System.out.println(retangulo.calculaArea());
        System.out.println(retangulo.calculaPerimetro());
        
    }
}