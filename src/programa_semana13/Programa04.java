
package programa_semana13;
import java.util.Scanner;
public class Programa04 {
    public static void main (String[]args){
        
        // Declarar variables
        double compra1, compra2, compra3, compra4;
        
        // Entrada de datos
        Scanner lectura = new Scanner (System.in);
        
       System.out.print("Ingrese compra 1: ");
        compra1 = lectura.nextDouble();
        System.out.print("Ingrese compra 2: ");
        compra2 = lectura.nextDouble();
        System.out.print("Ingrese compra 3: ");
        compra3 = lectura.nextDouble();
        System.out.print("Ingrese compra 4: ");
        compra4 = lectura.nextDouble();

        // Crear un objeto de la clase RegistroCompras
        RegistroCompras objetoRegistroCompras = new RegistroCompras();
        objetoRegistroCompras.setCompra1(compra1);
        objetoRegistroCompras.setCompra2(compra2);
        objetoRegistroCompras.setCompra3(compra3);
        objetoRegistroCompras.setCompra4(compra4);

        // Salida de datos
        System.out.println("Total de compras: " + objetoRegistroCompras.total());
        System.out.println("Promedio de compras: " + objetoRegistroCompras.promedio());
        System.out.println("Compra mayor: " + objetoRegistroCompras.mayor());
        System.out.println("Compra menor: " + objetoRegistroCompras.menor()); 
    }
    
}
