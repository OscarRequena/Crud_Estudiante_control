package main;

import core.model.Estudiantes;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Crud_Estudiantes {
    public static int opcionMenu;
   public final static int DAR_ALTA_ESTUDIANTE = 1;
    final static int DAR_BAJA_ESTUDIANTE = 2;
    final static int MODIFICAR_NOTA = 3;
    final static int LISTADO_ESTUDIANTE = 4;
   public final static int SALIR_PROGRAMA = 5;
   public final static int NUMERO_ESTUDIANTES = 2;
   public static HashMap<Integer, Estudiantes> estudiantes;
   public static Iterator<Map.Entry<Integer,Estudiantes>> iterator;
    public static void main(String[] args) {
        estudiantes = new HashMap<>();

        boolean UsuarioQuiereSalir = false;
        do {
            boolean ValidadorIncorrecto = false;
            do {
                mostrarMenu();
                opcionMenu = recibirParametroMenu();
                ValidadorIncorrecto = validadorMenu();
                if (!ValidadorIncorrecto){
                    core.output.Output.mensajeError();
                }
            }while(!ValidadorIncorrecto);
            if (opcionMenu == SALIR_PROGRAMA){
                UsuarioQuiereSalir = true;
            }else {
                switch (opcionMenu){
                    case DAR_ALTA_ESTUDIANTE:
                        darAltaEstudiante();
                        listarEstudiante();
                        break;
                    case LISTADO_ESTUDIANTE:
                        listarEstudiante();
                        break;
                    case  DAR_BAJA_ESTUDIANTE:
                        listarEstudiante();
                        darBajaEstudiante();
                        break;
                }
            }
        }while(!UsuarioQuiereSalir);
    }

    private static void darBajaEstudiante() {
        bajas.Bajas.darBajaEstudiante();
    }

    private static void listarEstudiante() {
        listado.Listado.listarEstudiante();
    }

    private static void darAltaEstudiante() {
        altas.Altas.darAltaEstudiante();
    }

    private static int recibirParametroMenu() {
        return core.input.Input.recibirParametroMenu();
    }

    private static boolean validadorMenu() {
        return core.validador.Validador.validadorMenu(opcionMenu);
    }

    private static void mostrarMenu() {
        core.output.Output.mostrarMenu();
    }
}
