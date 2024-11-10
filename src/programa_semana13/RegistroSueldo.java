
package programa_semana13;

public class RegistroSueldo {
    // Atributos de la clase
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;

    // Getters y setters para cada sueldo
    public double getSueldo1() {
        return sueldo1;
    }

    public void setSueldo1(double sueldo1) {
        this.sueldo1 = sueldo1;
    }

    public double getSueldo2() {
        return sueldo2;
    }

    public void setSueldo2(double sueldo2) {
        this.sueldo2 = sueldo2;
    }

    public double getSueldo3() {
        return sueldo3;
    }

    public void setSueldo3(double sueldo3) {
        this.sueldo3 = sueldo3;
    }

    public double getSueldo4() {
        return sueldo4;
    }

    public void setSueldo4(double sueldo4) {
        this.sueldo4 = sueldo4;
    }

    // Método para calcular el total de los sueldos
    public double total() {
        return sueldo1 + sueldo2 + sueldo3 + sueldo4;
    }

    // Método para calcular el promedio de los sueldos
    public double promedio() {
        return total() / 4;
    }

    // Método para encontrar el sueldo mayor
    public double mayor() {
        double mayor = sueldo1;
        if (sueldo2 > mayor) {
            mayor = sueldo2;
        }
        if (sueldo3 > mayor) {
            mayor = sueldo3;
        }
        if (sueldo4 > mayor) {
            mayor = sueldo4;
        }
        return mayor;
    }

    // Método para encontrar el sueldo menor
    public double menor() {
        double menor = sueldo1;
        if (sueldo2 < menor) {
            menor = sueldo2;
        }
        if (sueldo3 < menor) {
            menor = sueldo3;
        }
        if (sueldo4 < menor) {
            menor = sueldo4;
        }
        return menor;
    }
    
}
