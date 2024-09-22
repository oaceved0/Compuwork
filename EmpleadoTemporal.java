public class EmpleadoTemporal extends Empleado {
    private int duracionContrato;
    private double salarioHora;

    public EmpleadoTemporal(String nombre, int id, double salario, int duracionContrato, double salarioHora) {
        super(nombre, id, salario);
        this.duracionContrato = duracionContrato;
        this.salarioHora = salarioHora;
    }

    @Override
    public String obtenerReporteDesempeño() {
        return "Desempeño de " + nombre + " (Empleado Temporal): Bueno.";
    }

    public int getDuracionContrato() {
        return duracionContrato;
    }

    public double getSalarioHora() {
        return salarioHora;
    }
}
