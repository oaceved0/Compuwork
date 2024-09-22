import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Creación de departamentos
        Departamento departamentoTI = new Departamento("TI", 1);
        Departamento departamentoRH = new Departamento("Recursos Humanos", 2);
        
        // Creación de empleados
        EmpleadoPermanente emp1 = new EmpleadoPermanente("Juan Perez", 101, 50000, "Seguro Médico", 60000);
        EmpleadoTemporal emp2 = new EmpleadoTemporal("Ana Gomez", 102, 20000, 12, 15);
        
        // Asignación de empleados a departamentos
        departamentoTI.agregarEmpleado(emp1);
        departamentoRH.agregarEmpleado(emp2);
        
        // Generación de reportes
        ReporteDesempeño reporte = new ReporteDesempeño();
        
        // Reporte individual
        System.out.println(reporte.generarReporteIndividual(emp1));
        System.out.println(reporte.generarReporteIndividual(emp2));
        
        // Reporte por departamento
        System.out.println(reporte.generarReporteDepartamento(departamentoTI));
        System.out.println(reporte.generarReporteDepartamento(departamentoRH));
        
        // Interfaz de Usuario - Simulación básica
        System.out.println("Ingrese el ID de empleado para ver el reporte: ");
        int id = scanner.nextInt();
        if (id == emp1.getId()) {
            System.out.println(reporte.generarReporteIndividual(emp1));
        } else if (id == emp2.getId()) {
            System.out.println(reporte.generarReporteIndividual(emp2));
        } else {
            System.out.println("Empleado no encontrado.");
        }

        scanner.close();
    }
}
