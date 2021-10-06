import java.util.Scanner;
import java.util.Random;


public class Ciclicas{
  static Scanner sc=new Scanner(System.in);//para leer valores del teclado
 static final Random generator = new Random();
    public static int random(int min, int max) {
        return min + (generator.nextInt() * (max - min));
    }
static void contarNumMenorCeroMayorCeroWhile(){
//declaracion de variables
int numeroMenorIgualCero=0, numeroMayorqueCero=0, numeroN, cantNum;
//Datos de entrada
System.out.println("Ingrese la cantidad de numero a evaluar:");
cantNum=sc.nextInt();
//proceso
  while (cantNum>=1) {
    numeroN=random(-9, 9);
  System.out.println(numeroN);
  if (numeroN<=0) {
    numeroMenorIgualCero++;
  }else{
    numeroMayorqueCero++;
  }
cantNum--;
//code clock to be executed
  }
//Dtos de salida
System.out.println("Cantidad de numeros menores o iguales a cero son:"+numeroMenorIgualCero+"\nLa cantidad de numeros mayores a cero son:"+numeroMayorqueCero);
}
  public static void main(String [] arg){
    contarNumMenorCeroMayorCeroWhile();
  }


}