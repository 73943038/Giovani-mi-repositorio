import java.util.Scanner;

public class pagopolizas {

static Scanner sc = new Scanner (System.in);

 static void pagopolizas () {
  // Declare Variables
  Rope plan, alcohol, glasses, illness;
  int age;
  double costPayment, surcharges = 0;
  // Input data
  System . out of . println ("Enter the Plan (A / B):");
  plan = sc. Next();
  System . out of . println ("Do you drink alcohol? (Y / N):");
  alcohol = sc. Next();
  System . out  . println ("Do you wear glasses? (Y / N):");
  lenses = sc. Next();
  System . out  . println ("Do you have any illness? (Y / N):");
  disease = sc. Next();
  System . out  . println ("Enter your age?:");
  age = sc. nextInt ();
  // Process
  if (alcohol. equals ("S")) {surcharges + = 0.10;}
  if (lenses. equals ("S")) {surcharges + = 0.05;}
  if (illness. equals ("S")) {surcharges + = 0.05;}
  if (age> 40) {surcharges + = 0.20;} else {surcharges + = 0.10;}

  if (plan. equals ("A")) {paymentCost = 1200 + 1200 * surcharges;}
  else {
      costPayment = 950 + 950 * surcharges;
  }
  // Output data
  System . out of . println ("You must pay the amount of: $" + costPayment);
}

public static void main (String [] arg) {
// gift algorithm ();
  pagopolizas ();
}

}