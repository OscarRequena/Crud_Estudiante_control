package bajas;

import core.model.Estudiantes;
import main.Crud_Estudiantes;

import java.util.Map;

public class Bajas {


    public static void darBajaEstudiante() {
        Crud_Estudiantes.iterator = Crud_Estudiantes.estudiantes.entrySet().iterator();

        core.output.Output.ingresarIdEstudiante();
        int idEstudiante = core.input.Input.recibirIdEstudiante();
        while(Crud_Estudiantes.iterator.hasNext()) {
            Map.Entry<Integer, Estudiantes> entrada = Crud_Estudiantes.iterator.next();
            Integer id = entrada.getKey();
            Estudiantes estudiante = entrada.getValue();
            if(id == idEstudiante ){
                Crud_Estudiantes.iterator.remove();
            }
        }
    }
}
