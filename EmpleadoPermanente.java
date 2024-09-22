public class EmpleadoPermanente extends Empleado {
    private String beneficios;
    private double salarioAnual;

    public EmpleadoPermanente(String nombre, int id, double salario, String beneficios, double salarioAnual) {
        super(nombre, id, salario);
        this.beneficios = beneficios;
        this.salarioAnual = salarioAnual;
    }

    @Override
    public String obtenerReporteDesempeño() {
        return "Desempeño de " + nombre + " (Empleado Permanente): Excelente.";
    }

    public String getBeneficios() {
        return beneficios;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }
}

