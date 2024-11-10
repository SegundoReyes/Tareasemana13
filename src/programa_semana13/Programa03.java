
package programa_semana13;

import java.util.Scanner;
public class Programa03 {
    public static void main (String []args){
        
        // Declarar variables
        double ingresoMensual, otrosIngresos, gastosMensuales;

         // Entrada de datos
        Scanner lectura = new Scanner ( System.in);
        
        System.out.print("Ingrese el ingreso mensual del empleado: ");
        ingresoMensual = lectura.nextDouble();
        System.out.print("Ingrese otros ingresos mensuales del empleado: ");
        otrosIngresos = lectura.nextDouble();
        System.out.print("Ingrese los gastos mensuales del empleado: ");
        gastosMensuales = lectura.nextDouble();

        // Crear un objeto de la clase RegistroAhorros
        RegistroFinanciero objetoRegistroFinanciero = new RegistroFinanciero();
        objetoRegistroFinanciero.setIngresoMensual(ingresoMensual);
        objetoRegistroFinanciero.setOtrosIngresos(otrosIngresos);
        objetoRegistroFinanciero.setGastosMensuales(gastosMensuales);

        // Salida de datos
        System.out.println("Ahorro mensual: " + objetoRegistroFinanciero.ahorroMensual());
        System.out.println("Ahorro semestral proyectado: " + objetoRegistroFinanciero.ahorroSemestral());
        System.out.println("Ahorro anual proyectado: " + objetoRegistroFinanciero.ahorroAnual());
    }
    
}
