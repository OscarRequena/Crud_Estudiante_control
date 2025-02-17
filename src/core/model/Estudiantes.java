package core.model;

public class Estudiantes {
    private String nombreCompleto;
    private int edad;
    private String fechaNacimiento;
    private String asignatura1;
    private double nota1;
    private String asignatura2;
    private double nota2;

    public Estudiantes(String nombreCompleto, int edad, String fechaNacimiento, String asignatura1, double nota1, String asignatura2, double nota2) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.asignatura1 = asignatura1;
        this.nota1 = nota1;
        this.asignatura2 = asignatura2;
        this.nota2 = nota2;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getAsignatura1() {
        return asignatura1;
    }

    public double getNota1() {
        return nota1;
    }

    public String getAsignatura2() {
        return asignatura2;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
}
