
package programa_semana13;


public class RegistroFinanciero {
    
    // Atributos de la clase
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    // Getters y setters para cada atributo
    public double getIngresoMensual() {
        return ingresoMensual;
    }

    public void setIngresoMensual(double ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public void setOtrosIngresos(double otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
    }

    public double getGastosMensuales() {
        return gastosMensuales;
    }

    public void setGastosMensuales(double gastosMensuales) {
        this.gastosMensuales = gastosMensuales;
    }

    // Método para calcular el ahorro mensual
    public double ahorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }

    // Método para calcular el ahorro semestral proyectado
    public double ahorroSemestral() {
        return ahorroMensual() * 6;
    }

    // Método para calcular el ahorro anual proyectado
    public double ahorroAnual() {
        return ahorroMensual() * 12;
    }
}
