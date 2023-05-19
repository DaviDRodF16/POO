public class Retangulo{
    Double base;
    Double altura;

     public void mudaValor(Double b, Double h){
        this.base = b;
        this.altura =  h;
}
    public String mostraValor(){
            return this.base+ " "+this.altura;
           
        }
        public double calculaArea(){
            return this.altura*this.base;
        } 
        public double calculaPerimetro(){
            return this.altura*2.0 + this.base*2.0;
        }
}