package core.input;

import java.util.Scanner;

public class Input {
    public static Scanner sc = new Scanner(System.in);

    public static int recibirParametroMenu() {
        return sc.nextInt();
    }

    public static String recibirNombreCompleto() {
        return sc.next();
    }

    public static int recibirEdad() {
        return sc.nextInt();
    }

    public static String recibirFechaNacimiento() {
        return sc.next();
    }

    public static String recibirNombreAsignatura() {
        return sc.next();
    }

    public static double recibirNota() {
        return sc.nextInt();
    }

    public static int recibirIdEstudiante() {
        return sc.nextInt();
    }
}
