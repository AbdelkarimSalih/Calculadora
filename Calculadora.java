import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opc;
        int primeroNumero,segundoNumero;
        System.out.println("**************Operaciones**************");
        System.out.println("1) Suma ");
        System.out.println("2) Resta ");
        System.out.println("3) Multiplicacion ");
        System.out.println("4) Division ");
        System.out.println("Por favor, entre el numero de la operación desea calcular");
        opc = sc.nextInt();
        System.out.println("Entre el primer numero");
        primeroNumero=sc.nextInt();
        System.out.println("Entre el segundo numero");
        segundoNumero=sc.nextInt();
        switch(opc)
        {
            case 1:
                System.out.println("Resulta es " + (primeroNumero + segundoNumero));
                break;
            case 2:
            System.out.println("Resulta es " + (primeroNumero - segundoNumero));
                break;
            case 3:
            System.out.println("Resulta es " + (primeroNumero * segundoNumero));
                break;
            case 4:
                try {
                    System.out.println("Resulta es " + (primeroNumero / segundoNumero));
                } catch (ArithmeticException e) {
                    System.out.println("El segundo numero no puede ser 0");
                }
            
                break;
            default:
                System.out.println("La operación no existe");
        }
    }
}
