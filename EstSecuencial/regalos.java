

import java.util.Scanner; 

public class Regalos{

static Scanner sc = new Scanner(System.in);

static void algoritmoRegalos(){
  //Definir Variables
  double monto=0;
  String regalo="";
  //Datos de entrada
  System.out.println("Ingrese el monto que dispone:");  
  monto=sc.nextDouble();
  //Proceso
  if(monto>=1 && monto<=10){
    regalo="\nTarjeta";    
  } else if(monto>=11 && monto<=100){
    regalo="\nChocolate\nTarjeta";
  }else if(monto>=101 && monto<=250){
    regalo="\nFlores\nChocolate\nTarjeta";
  }else if(monto>250){
    regalo="\nAnillo\nFlores\nChocolate\nTarjeta";
  }else{
    regalo="Ninguno";
  }
  //Datos de salida
  System.out.println("Ud. puede elegir los siguientes: "+ regalo);
}



 pagoPolizas vacio  estatico () {
  // Declarar Variebles
  Plan de cuerdas , alcohol, lentes, enfermedad;
  int edad;
  doble costoPago, recargos = 0 ;
  // Datos de entrada
  Sistema . fuera . println ( " Ingrese el Plan (A / B): " );
  plan = sc . Siguiente();
  Sistema . fuera . println ( "¿ Consume alcohol? (S / N): " );
  alcohol = sc . Siguiente();
  Sistema . fuera . println ( "¿ Usa lentes? (S / N): " );
  lentes = sc . Siguiente();
  Sistema . fuera . println ( "¿ Tiene alguna enfermedad? (S / N): " );
  enfermedad = sc . Siguiente();    
  Sistema . fuera . println ( " Ingrese su edad ?: " );
  edad = sc . nextInt ();       
  // Proceso
  if (alcohol . es igual a ( " S " )) {recargos + = 0.10 ;}
  if (lentes . equals ( " S " )) {recargos + = 0.05 ;}
  if (enfermedad . es igual a ( " S " )) {recargos + = 0.05 ;}
  if (edad > 40 ) {recargos + = 0.20 ;} else {recargos + = 0.10 ;}

  if (plan . es igual a ( " A " )) {costoPago = 1200 + 1200 * recargos;}
  else {
      costoPago = 950 + 950 * recargos;
  }
  // Datos de salida
  Sistema . fuera . println ( " Ud. debe pagar el monto de: $ " + costoPago);
}

public  static  void  main ( String [] arg ) {
// algoritmoRegalos ();
  pagoPolizas ();
}

}