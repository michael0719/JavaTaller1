package entidades;

public enum Mensajes {

    MENSAJE_EXELENTE("Excelente,tu rendimiento ha sido el mejor. \n Nota:"),
    MENSAJE_SOBRESALIENTE("Tu rendimiento es aceptable,pero finalizaste bien. \n Nota:"),
    MENSAJE_ACEPTABLE("Te sugerimos comprometerte más con tus estudio. \n Nota:"),
    MENSAJE_INSUFICIENTE("Malas noticias,no cumpliste con el minimo para avanzar. \n Nota:"),
    MENSAJE_DEFICIENTE("Nuevamente vuelve a iniciar tus estudios y dedícate. \n Nota:0"),
    MENSAJE_NOTA_SEGUIMIENTO("Ingrese la nota de seguimiento"),
    MENSAJE_NOTA_PARCIAL("Ingrese la nota del parcial"),
    MENSAJE_NOTA_FINAL("Ingrese nota del examen final"),
    MENSANJE_ERROR("Error... la nota debe estar entre 0.0 y 5.0");

    private String mensaje;

    Mensajes(String s) {
        this.mensaje=s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
