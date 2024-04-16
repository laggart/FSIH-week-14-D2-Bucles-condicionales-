import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("dime tu edad");
        int edad = teclado.nextInt();

        teclado.close();

         if(edad > 6 && edad <= 12){
            System.out.println("estas en primaria");
        } else if(edad > 12 && edad <= 16){
            System.out.println("estás en secundaria");
        } else if(edad > 16 && edad <= 22){
            System.out.println("Deberías estar en la universidad");
        } else if(edad > 22 && edad < 120){
            System.out.println("si no estas en paro, deberías estar trabajando");
        } else {
            System.out.println("error, ni Matusalén ni niños prodigios aceptamos en este curso");
        }

    }
}
