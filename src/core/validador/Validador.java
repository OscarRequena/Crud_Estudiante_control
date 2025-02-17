package core.validador;

import main.Crud_Estudiantes;

public class Validador {
    public static boolean validadorMenu(int opcionMenu) {
        return opcionMenu >= Crud_Estudiantes.DAR_ALTA_ESTUDIANTE && opcionMenu <= Crud_Estudiantes.SALIR_PROGRAMA;
    }
}
