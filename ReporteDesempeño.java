// ReporteDesempeño.java
public class ReporteDesempeño {
    public String generarReporteIndividual(Empleado empleado) {
        return "Reporte Individual: " + empleado.obtenerReporteDesempeño();
    }

    public String generarReporteDepartamento(Departamento departamento) {
        StringBuilder reporte = new StringBuilder("Reporte de Departamento: " + departamento.getNombre() + "\n");
        for (Empleado empleado : departamento.obtenerListaEmpleados()) {
            reporte.append(empleado.getNombre()).append(": ").append(empleado.obtenerReporteDesempeño()).append("\n");
        }
        return reporte.toString();
    }
}