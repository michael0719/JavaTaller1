package main;

import static entidades.Mensajes.*;
import entidades.alumnos.Notas;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args){

        DecimalFormat formato = new DecimalFormat("#.0");

        double nTotal;

        Double notaS = Double.parseDouble(JOptionPane.showInputDialog(null,
                MENSAJE_NOTA_SEGUIMIENTO.getMensaje()));
        Double notaP = Double.parseDouble(JOptionPane.showInputDialog(null,
                MENSAJE_NOTA_PARCIAL.getMensaje()));
        Double notaF = Double.parseDouble(JOptionPane.showInputDialog(null,
                MENSAJE_NOTA_FINAL.getMensaje()));

        Notas notas = new Notas();

        notas.setNotaSeguimiento(notaS);
        notas.setNotaParcial(notaP);
        notas.setNotaFinal(notaF);

        nTotal =notas.calcularNota();

        if(nTotal >=4 && nTotal <=5){
            JOptionPane.showMessageDialog(null,MENSAJE_EXELENTE.getMensaje()+formato.format(nTotal));
        }else if(nTotal >=3 && nTotal <4){
            JOptionPane.showMessageDialog(null,MENSAJE_SOBRESALIENTE.getMensaje()+formato.format(nTotal));
        }else if(nTotal >=2 && nTotal <3){
            JOptionPane.showMessageDialog(null,MENSAJE_ACEPTABLE.getMensaje()+formato.format(nTotal));
        }else if(nTotal >=1 && nTotal <2){
            JOptionPane.showMessageDialog(null,MENSAJE_INSUFICIENTE.getMensaje()+formato.format(nTotal));
        }else{
            JOptionPane.showMessageDialog(null,MENSAJE_DEFICIENTE.getMensaje()+formato.format(nTotal));
        }

    }

}
