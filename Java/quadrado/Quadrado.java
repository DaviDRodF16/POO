public class Quadrado{
    public double lado;

    public void mudaValor(Double lado){
        this.lado = lado;
    }
    public double mostraValor(){
        return this.lado;
    }
    public double calculaArea(){
        return this.lado*this.lado;
    }
}