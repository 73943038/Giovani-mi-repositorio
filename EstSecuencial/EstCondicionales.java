import java.util.Scanner;
public class EstCondicionales {
  static  Scanner sc = new Scanner(System.in);

  static void VentaDeLapices(){
    //definir variables
    int CantDeLapices;
    double pago;
    //Datos de entrada
    System.out.println("Ingrese la cantidad de lapiceros a comprar:");
    CantDeLapices=sc.nextInt();
    //proceso
    if (CantDeLapices>=1000) {
    pago=CantDeLapices*0.85;}
    else {pago=CantDeLapices*0.90;}
    //Datos de salida
    System.out.println("El pago a realizar es:"+pago);
  }
    public static void main(String[] args) {
      System.out.println("Hello World");
      VentaDeLapices();
    }
  }