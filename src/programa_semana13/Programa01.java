
package programa_semana13;
import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        //declarar variables
        double venta1,venta2,venta3;
        
        //entrada de datos
         Scanner lectura = new Scanner (System.in);
        
        System.out.print("Ingrese venta 1: ");  
        venta1=lectura.nextDouble();
         System.out.print("Ingrese venta 2: ");
         venta2=lectura.nextDouble();
         System.out.print("Ingrese venta 3: ");
         venta3=lectura.nextDouble();
         
         //Crear un objeto de la clase RegistroVenta
         
         RegistroVenta objetoRegistroVenta=new RegistroVenta();
         objetoRegistroVenta.setVenta1(venta1);
         objetoRegistroVenta.setVenta2(venta2);
         objetoRegistroVenta.setVenta3(venta3);
         
         // salida de datos
         System.out.println("El total de venta es :"+objetoRegistroVenta.total());
         System.out.println("El promedio de la venta es:"+objetoRegistroVenta.promedio());
         System.out.println("La venta mayor es :"+objetoRegistroVenta.mayor());
         System.out.println("La venta menor es :"+objetoRegistroVenta.menor());
    }
    
}
