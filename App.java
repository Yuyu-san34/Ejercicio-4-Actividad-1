public class Trapecio{
    int pequena;
    int grande;
    int altura;
    int izquierda;
    int derecha;
    @param pequena;
    @paran grande; 
    @paran altura;
    @param izquierda;
    @param derecha;
public Trapecio(int grande,int pequena,int altura,int derecha,int izquierda) {
    this.izquierda = izquierda;
    this.derecha = derecha;
    this.pequena = pequena;
    this.grande = grande;
    this.altura = altura;
    double calcularArea(){
        reutrun ((pequena+grande)*altura/2);
    double calcularPerímetro(){
        return (izquierda+derecha+pequena+grande);
    }
}

public class Rombo{
    int lado;
    int diagonalpeque;
    int diagonalgran;
    @param lado
    @param diagonalpeque;
    @param diagonalgran;
public Rombo(int lado, int diagonalgran, int diagonalpeque){
    this.lado=izquierda;
    this.diagonalpeque;
    this.diagonalgran;
    double calcularArea(){
        return (diagonalpeque*diagonalpeque)/2;
    double calcularPerímetro(){
        return lado*4
    }
    }
}
