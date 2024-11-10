
package programa_semana13;

public class RegistroCompras {
    
    // Atributos de la clase
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    
    public double getCompra1() {
        return compra1;
    }

    public void setCompra1(double compra1) {
        this.compra1 = compra1;
    }

    public double getCompra2() {
        return compra2;
    }

    public void setCompra2(double compra2) {
        this.compra2 = compra2;
    }

    public double getCompra3() {
        return compra3;
    }

    public void setCompra3(double compra3) {
        this.compra3 = compra3;
    }

    public double getCompra4() {
        return compra4;
    }

    public void setCompra4(double compra4) {
        this.compra4 = compra4;
    }

    // Método para calcular el total de las compras
    public double total() {
        return compra1 + compra2 + compra3 + compra4;
    }

    // Método para calcular el promedio de las compras
    public double promedio() {
        return total() / 4;
    }

    // Método para encontrar la compra mayor
    public double mayor() {
        double mayor = compra1;
        if (compra2 > mayor) {
            mayor = compra2;
        }
        if (compra3 > mayor) {
            mayor = compra3;
        }
        if (compra4 > mayor) {
            mayor = compra4;
        }
        return mayor;
    }

    // Método para encontrar la compra menor
    public double menor() {
        double menor = compra1;
        if (compra2 < menor) {
            menor = compra2;
        }
        if (compra3 < menor) {
            menor = compra3;
        }
        if (compra4 < menor) {
            menor = compra4;
        }
        return menor;
    }    
}
