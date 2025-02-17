package listado;

import core.model.Estudiantes;
import main.Crud_Estudiantes;
import java.util.Map;

public class Listado {

    public static void listarEstudiante() {

        Crud_Estudiantes.iterator = Crud_Estudiantes.estudiantes.entrySet().iterator();

        if (!Crud_Estudiantes.iterator.hasNext()){
            core.output.Output.noHayEstudiante();
        }
        core.output.Output.cabeceraTabla();
        while(Crud_Estudiantes.iterator.hasNext()) {
            Map.Entry<Integer, Estudiantes> entrada = Crud_Estudiantes.iterator.next();
            Integer id = entrada.getKey();
            Estudiantes estudiante = entrada.getValue();
            core.output.Output.cuerpoTabla(id,estudiante.getNombreCompleto(),estudiante.getAsignatura1(),estudiante.getNota1(),estudiante.getAsignatura2(),estudiante.getNota2());
        }
        core.output.Output.finalTabla();

    }
}
