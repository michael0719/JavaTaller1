package entidades.alumnos;

public class Notas {

    private double notaSeguimiento;
    private double notaParcial;
    private double notaFinal;

    public double getNotaSeguimiento() {
        return notaSeguimiento;
    }

    public void setNotaSeguimiento(double notaSeguimiento) {
        this.notaSeguimiento = notaSeguimiento;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double calcularNota(){

       return (getNotaSeguimiento()*0.4)+(getNotaParcial()*0.3)+(getNotaFinal()*0.3);
    }
}
