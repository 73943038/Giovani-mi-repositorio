import java.util.Scanner;

public class vacunacorrespondiente {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad, sexo;
        System.out.print("Ingrese su edad :");
        edad = in.nextInt();
        in.nextLine();
        System.out.println("Ingrese el numero correspondiente :");
        System.out.println("\tnumero 1 si es mujer");
        System.out.println("\tnumero 2 si hombre");
        System.out.print("\tnumero :");
        do {
            sexo = in.nextInt();
            in.nextLine();
            if (sexo<1||sexo>2)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (sexo<1||sexo>2);
        if((sexo==2&&edad>=16&&edad<70)||edad<16)
            System.out.println("A usted le corresponder la Vacuna tipo A");
        if(sexo==1&&edad>=16&&edad<70)
            System.out.println("A usted le corresponder la Vacuna tipo B");
        if(edad>70)
            System.out.println("A usted le corresponder la Vacuna tipo C");
    }

}