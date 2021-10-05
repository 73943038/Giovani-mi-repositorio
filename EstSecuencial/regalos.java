
import  java.util.Scanner ;

 regalos de clase  publica {

 escaner estatico sc =  nuevo  escaner ( System . in);

 algoritmoRegalos vacío  estatico () {
  // Definir variables
  monto doble = 0 ;
  String regalo = " " ;
  // Datos de entrada
  Sistema . fuera . println ( " Ingrese el monto que dispone: " );  
  monto = sc . nextDouble ();
  // Proceso
  if (monto > = 1  && monto <= 10 ) {
    regalo = " \ n Tarjeta " ;    
  } mas  si (monto > = 11  && monto <= 100 ) {
    regalo = " \ n Chocolate \ n Tarjeta " ;
  } mas  si (monto > = 101  && monto <= 250 ) {
    regalo = " \ n Flores \ n Chocolate \ n Tarjeta " ;
  } mas  si (monto > 250 ) {
    regalo = " \ n Anillo \ n Flores \ n Chocolate \ n Tarjeta " ;
  } mas {
    regalo = " Ninguno " ;
  }
  // Datos de salida
  Sistema . fuera . println ( " Ud. puede elegir los siguientes: " + regalo);
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