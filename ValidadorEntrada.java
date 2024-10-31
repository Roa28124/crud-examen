public class ValidadorEntrada {
    //Validar sólo letras
    public static String validarLetras(String str) throws IllegalArgumentException {
        if (!str.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Debe contener sólo letras 😘👌");

        }

        return str;
    }

    public static int validarEdad(int edad) throws EdadInvalidaException {
        if (edad <= 0) {
            throw new EdadInvalidaException("La edad debe ser mayor que cero. 😁😁😁😁");
        }
        return edad;
    }

    public static float validarNota(float nota) throws IllegalArgumentException{
        if (nota <= 0 || nota > 20) {
            throw new IllegalArgumentException("Nota invalida. Rango: 1 - 20. 😉😉😉");
        }
        return nota;
    }

}
