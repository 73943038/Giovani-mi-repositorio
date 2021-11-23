import java.util.Scanner;
public class tarea5GCY{
  static Scanner sc = new Scanner(System.in);
  static void numerosalazar(){ 
    int numero; 
    String grupo="";

  System.out.println("Ingrese un numero al azar del 1 al 20 : ");
  numero=sc.nextInt();

  switch(numero){
    case 1:  grupo="azul"; break;
    case 2:  grupo="rojo"; break;
    case 3:  grupo="amarillo"; break;
    case 4:  grupo="verde"; break;
    case 5:  grupo="azul"; break;
    case 6:  grupo="amarillo"; break;
    case 7:  grupo="rojo"; break;
    case 8:  grupo="verde"; break;
    case 9:  grupo="verde"; break;
    case 10:  grupo="rojo"; break;
    case 11:  grupo="amarillo"; break;
    case 12:  grupo="azul"; break;
    case 13:  grupo="verde"; break;
    case 14:  grupo="rojo"; break;
    case 15:  grupo="azul"; break;
    case 16:  grupo="rojo"; break;
    case 17:  grupo="verde"; break;
    case 18:  grupo="azul"; break;
    case 19:  grupo="amarillo"; break;
    case 20:  grupo="rojo"; break;
    default: 
    grupo="No existe";
    System.out.println("El numero no es valido!");break;
  }
  System.out.println("tu grupo será el color : "+grupo);
}
public static void main(String[] arg){
  numerosalazar();
}

}