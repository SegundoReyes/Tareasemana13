
package programa_semana13;
import java.util.Scanner;
public class Programa02 {
    public static void main (String []args){
        
        // Declarar variables
        double sueldo1, sueldo2, sueldo3, sueldo4;
        
        // Entrada de datos
        Scanner lectura = new Scanner (System.in);
       System.out.print("Ingrese sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        System.out.print("Ingrese sueldo 2: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Ingrese sueldo 3: ");
        sueldo3 = lectura.nextDouble();
        System.out.print("Ingrese sueldo 4: ");
        sueldo4 = lectura.nextDouble();

        // Crear un objeto de la clase RegistroSueldos
        RegistroSueldo objetoRegistroSueldos = new RegistroSueldo();
        
        objetoRegistroSueldos.setSueldo1(sueldo1);
        objetoRegistroSueldos.setSueldo2(sueldo2);
        objetoRegistroSueldos.setSueldo3(sueldo3);
        objetoRegistroSueldos.setSueldo4(sueldo4);

        // Salida de datos
        System.out.println("El total de sueldos es: " + objetoRegistroSueldos.total());
        System.out.println("El promedio de sueldos es: " + objetoRegistroSueldos.promedio());
        System.out.println("El sueldo mayor es: " + objetoRegistroSueldos.mayor());
        System.out.println("El sueldo menor es: " + objetoRegistroSueldos.menor());
    }
}
 
    
    

