import java.util.Scanner;

public class Media_edades {
    public static void main(String[] args) throws Exception {
       Scanner teclado  = new Scanner(System.in);
       
       System.out.println("Introduce el nombre de tu Madre");
       String nombreMadre = teclado.nextLine();

       System.out.println("Introduce el edad de tu madre");
       int edadMadre = teclado.nextInt();

       teclado.nextLine();

       System.out.println("introduce el nombre de tu padre");
       String nombrePadre = teclado.nextLine();

       System.out.println("Introduce la edad de tu Padre");
       int edadPadre = teclado.nextInt();

       teclado.close();

       float mediaEdades = (float) (edadMadre + edadPadre) / 2;

       System.out.println("Tu madre se llama " + nombreMadre + " y tiene " + edadMadre + " años, y tu padre se llama " + nombrePadre + " y tiene " + edadPadre + " años, y la media de sus edades es " + mediaEdades);
    

    }
}
