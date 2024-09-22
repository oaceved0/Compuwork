public abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;
    protected Departamento departamento;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public void asignarDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public abstract String obtenerReporteDesempeño();
    
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}