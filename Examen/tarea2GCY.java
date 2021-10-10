import java.util.Scanner;

public class tarea2GYC{

  static Scanner sc = new Scanner(System.in);
  static void AlgoritmoBono(){
    // definir variables
    double puntos =0;
    String  bono ="";
    //datos de entrada
    System.out.println("Ingrese los puntos que tiene :");
    puntos=sc .nextDouble();  
    //proceso
    if (puntos>=100 && puntos<=200){
      bono="10% de descuento de salario minimo :";
    }
   else if (puntos>=201 && puntos<=300){
      bono="40% de descuento de salario minimo :";
    }
    else if(puntos>=301 && puntos<=400){
      bono="70% de descuento de salario minimo :";
      }
   else if(puntos>401){
     bono="80% de descuento de salario minimo :";
   }
   else{
      bono="Ninguno";
   }
    //datos de salida
    System.out.println("Usted a obtenido el :"+bono);
  }
    public static void main(String[] arg){
    AlgoritmoBono();
  }
}