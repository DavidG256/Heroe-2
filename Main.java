import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean salir = false;

        while (!salir){
            System.out.println("Menu");
            System.out.println("1. Añadir un nuevo heroe");
            System.out.println("2. Añadir un arma nueva al arsenal");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Añada el nuevo heroe");
                    String HeroeNuevo = scanner.nextLine();


                    break;

                case 2:
                    System.out.println("Añada un arma nueva al arsenal");

                    break;

                case 3:
                    System.out.println("");
                    break;

                case 4:


                    break;
            }
        }


    }

}
