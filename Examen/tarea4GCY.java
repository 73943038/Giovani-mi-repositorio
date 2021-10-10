import java.util.Scanner;
  public class Tarea4GCY {
  static Scanner sc = new Scanner(System.in);
  static void ejercicio3 (){
  
    //Declarar variables 
    String signo="";
    double numero1=0, numero2=0, resultado=0;
    //Datos de entrada 
    System.out.println("Ingrese un numero : ");
    numero1=sc.nextInt();
    System.out.println("Ingrese la operacion : \n(+)\n(-)\n(*)\n(/)\n(^)");
    signo=sc.next().toUpperCase();
    System.out.println("Ingrese el segundo numero : ");
    numero2=sc.nextInt();
    //Proceso 
    if(signo.equals("+")){resultado=numero1 + numero2;
    }else if (signo.equals("-")){resultado=numero1 - numero2;
    }else if (signo.equals("/")){resultado=(numero1)/(numero2);
    }else if (signo.equals("*")){resultado=numero1 * numero2;
    }else if (signo.equals("^")){resultado= Math.pow(numero1,numero2);
    }
    //Datos de salida
    System.out.println("Su resultado es: "+resultado);

  }




public static void main(String[] args) {
    ejercicio3();}
}