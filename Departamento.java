import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private int id;
    private List<Empleado> empleados;

    public Departamento(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        empleado.asignarDepartamento(this);
    }

    public void removerEmpleado(Empleado empleado) {
        empleados.remove(empleado);
        empleado.asignarDepartamento(null);
    }

    public List<Empleado> obtenerListaEmpleados() {
        return empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
