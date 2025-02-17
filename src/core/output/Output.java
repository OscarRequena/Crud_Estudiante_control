package core.output;

public class Output {
    public static void mostrarMenu() {
        System.out.println("""
                
                ||Bienvenidos al CRUD de Alumnos||
                
                Opciones del Menú:
                
                1. Dar de alta a un Estudiante
                2. Dar de baja a un Estudiante
                3. Modificar la nota de un Estudiante
                4. Listar a los Estudiantes
               
                Ingrese la Opción que deseas realizar:
                """);
    }

    public static void mensajeError() {
        System.out.println("La opción que has dado no es valida");
    }

    public static void ingresarNombreCompleto() {
        System.out.println("Ingrese el Nombre completo: ");
    }

    public static void ingresarEdad() {
        System.out.println("Ingrese la Edad: ");
    }

    public static void ingresarFechaNacimiento() {
        System.out.println("Ingrese la fecha de nacimiento:  ");
    }

    public static void ingresarNombreAsignatura() {
        System.out.println("Ingrese el nombre de la asignatura: ");
    }

    public static void ingresarNota() {
        System.out.println("Ingrese la nota de la asignatura: ");
    }

    public static void DarAltaExitosamente() {
        System.out.println("Se a dado de alta correctamente !!! ");
    }
}
