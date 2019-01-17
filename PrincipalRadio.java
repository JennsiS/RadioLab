/**
 * @author Jennifer Sandoval, Esteban del Valle, Andrea Paniagua
 * @Carne 18962,
 * @date 15/01/19
 * @name PrincipalRadio.java
 * */
package radiolab;
import java.util.Scanner;

public class PrincipalRadio {
    private static Scanner teclado;

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        Radio radio = (Radio) new RadioImp();
        String op=" ";
    System.out.println("****************************");
    System.out.println("Simulador de Radio");
    System.out.println("****************************");
    System.out.println("Indique la accion que desea realizar");
    System.out.println("1. Encender radio");
    System.out.println("2. Cambio de frecuencia (AM/FM)");
    System.out.println("3. Cambio de emisoras");
    System.out.println("4. Guardar una emisora");
    System.out.println("5. Seleccionar emisora guardada");
    System.out.println("6. Apagar radio");
    System.out.println("7. Salir de la simulacion");
    op= scan.nextLine();
    while (op!="7"){
      if (op.equals("1")) {
          radio.toggle();
      } 
      if (op.equals("2")) {
          radio.changeFrequency();
      }
      if (op.equals("3")) {
          radio.changeStation();
      }
       if (op.equals("4")) {
          radio.saveStation();
       }
        if (op.equals("5")) {
          System.out.println("Ingrese el numero del boton de la emisora guardada");
          int numButton = scan.nextInt();
          scan.nextLine();
          radio.changeStationButton(numButton);
      }
        if (op.equals("6")) {
          radio.toggle();
      }
      }
    
    
      }
    }
    

