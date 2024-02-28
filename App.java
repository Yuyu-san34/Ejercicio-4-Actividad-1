import java.util.Scanner;

public class App {
    public static void main(String[] args){
        int x,cuadrado,cubo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el número:");
        x = entrada.nextInt();
        cuadrado=x*x;
        cubo=x*x*x;
        System.out.println("El cuadrado del número es:"+cuadrado);
        System.out.println("El cubo del número es:"+cubo);
        entrada.close();
    }
}