/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.sc202.proyectoacademia;
import javax.swing.JOptionPane;

/**
 *
 * @author frefr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("Bienvenido al Instituto de Idiomas de Costa Rica ,favor seleccione la opcion que de sea realizar:");
            Integer opcion = Integer.parseInt(JOptionPane.showInputDialog("favor seleccione la opcion que de sea realizar:"));

            //Modulo de Opciones e Idiomas
        if (1 == opcion) {
            System.out.println("Haz seleccionado la opcion de nuevo ingreso");
            Integer idioma = Integer.parseInt(JOptionPane.showInputDialog("Aleman: 1 \n Ingles: 2 \n Portugues: 3 \n \nFavor escoja el numero del idioma que quieres estudiar:"));

            switch (idioma){
                case 1:
                    System.out.println("Haz seleccionado el idioma Ingles ocupamos que escojas tu horario");
                    break;
                case 2:
                    System.out.println("Haz seleccionado el idioma Aleman ocupamos que escojas tu horario");
                    break;
                case 3:
                    System.out.println("Haz seleccionado el idioma Portugues ocupamos que escojas tu horario");
                    break;
                default:
                    System.out.println("No haz seleccionado ninguna  opcion correcta"); 
                    break;
            }

            //Modulo de Estudiante Regular
        } else if (opcion == 2 ) {     
            System.out.println("Haz seleccionado la opcion de Estudiante regular ");
        System.out.println("Haz seleccionado la opcion de estudiante regular ");
            Integer idioma = Integer.parseInt(JOptionPane.showInputDialog("favor escoja el idioma que quieres estudiar :"));
                switch (idioma) {
                    case 1:
                        System.out.println("Haz seleccionado el idioma Ingles ocupamos que escojas tu horario");
                        break;
                    case 2:
                        System.out.println("Haz seleccionado la opcion de Estudiante regular ");
                        //Modulo para imprimir la facturasS
                        break;
                    case 3:
                        System.out.println("Haz seleccionado la opcion de ver la factura");
                        break;
                    default:
                        break;
                }
        }
    }
    
}
