package altas;

import core.model.Estudiantes;
import main.Crud_Estudiantes;

public class Altas {
    public static void darAltaEstudiante() {

        for (int i = 0; i < Crud_Estudiantes.NUMERO_ESTUDIANTES; i++){

            core.output.Output.ingresarNombreCompleto();
            String nombreCompleto = core.input.Input.recibirNombreCompleto();
            core.output.Output.ingresarEdad();
            int edad = core.input.Input.recibirEdad();
            core.output.Output.ingresarFechaNacimiento();
            String fechaNacimiento = core.input.Input.recibirFechaNacimiento();
            core.output.Output.ingresarNombreAsignatura();
            String NombreAsignatura1 = core.input.Input.recibirNombreAsignatura();
            core.output.Output.ingresarNota();
            double Nota1 = core.input.Input.recibirNota();
            core.output.Output.ingresarNombreAsignatura();
            String NombreAsignatura2 = core.input.Input.recibirNombreAsignatura();
            core.output.Output.ingresarNota();
            double Nota2 = core.input.Input.recibirNota();

            Crud_Estudiantes.estudiantes.put(i+1 , new Estudiantes(nombreCompleto, edad, fechaNacimiento,NombreAsignatura1, Nota1, NombreAsignatura2, Nota2));
        }
            core.output.Output.DarAltaExitosamente();
    }
}
