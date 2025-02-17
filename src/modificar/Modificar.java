package modificar;

import core.model.Estudiantes;
import main.Crud_Estudiantes;

import java.util.Map;

public class Modificar {
    public static void modificarNota(){
        Crud_Estudiantes.iterator = Crud_Estudiantes.estudiantes.entrySet().iterator();

        core.output.Output.ingresarIdEstudiante();
        int idEstudiante = core.input.Input.recibirIdEstudiante();


        while(Crud_Estudiantes.iterator.hasNext()) {
            Map.Entry<Integer, Estudiantes> entrada = Crud_Estudiantes.iterator.next();
            Integer id = entrada.getKey();
            Estudiantes estudiante = entrada.getValue();
            if(id == idEstudiante ){
                core.output.Output.ingresarNota();
                double NuevaNota = core.input.Input.recibirNota();
                estudiante.setNota1(NuevaNota);
            }
        }

    }

}







