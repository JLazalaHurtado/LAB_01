/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author Flia. Lazala Hurtado
 */
public class Lab01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Inicio = new Scanner(System.in);
        int ds, dm = 0, mes, año, a1, hh1 = 0, m = 0, m1, S = 0, fj = 0, d1;
        String dsp = null;

        System.out.println("Bienvenido, ingresa una fecha en digitos de la siguiente forma: dia de la semana, dia del mes, mes y año");
        System.out.println("Ingresa el dia de la semana");
        ds = Inicio.nextInt();
        ds++;
        if (ds < 1 | ds > 8) {
            System.out.println("Dia de la semana no valido. Intenta nuevamente.");

        } else {
            System.out.println("Ingresa el dia del mes ");
            dm = Inicio.nextInt();
            dm++;
            if (dm < 1 | dm > 31) {
                System.out.println("Dia del mes no valido. Intenta nuevamente. ");
            } else {
                System.out.println("Ingresa el mes");
                mes = Inicio.nextInt();
                if (mes < 1 | mes > 12) {
                    System.out.println("Mes invalido. Intenta nuevamente");
                } else {
                    System.out.println("Ingresa el los ultimos dos digitos del año, teniendo en cuenta que debe estar en el rango del siglo 21");
                    año = Inicio.nextInt();
                    if (año < 01 | año > 100) {
                        System.out.println("Ingrese el siguiente digito del año");
                        a1 = Inicio.nextInt();
                        if (a1 >= 1 | a1 < 19) { // se agrega una nueva variable, dado que hay casos que el colocar los ultimos dos digitos puede ser un año del siglo siguiente o anterior (revisar si se podria utilizar la misma variable año) 
                            System.out.println("Año no valido, Intenta nuevamente");
                        }
                    }
                }
            }

            System.out.println("Ingresa la hora en digitos de 2 ");
            hh1 = Inicio.nextInt();
            if (hh1 < 1 | hh1 > 12) {
                System.out.println("La hora no es valida. Intenta nuevamente");
            } else {
                System.out.println("Ingresa los minutos");
                m = Inicio.nextInt();
                if (m < 1 | m > 59) {
                    System.out.println("Los minutos ingresados no son validos. Intenta nuevamente");
                } else {
                    System.out.println("Ingresa los segundos");
                    S = Inicio.nextInt();
                    S++;
                    if (S < 1 | S > 59) {
                        System.out.println("Segundos no validos. Intenta nuevamente ");
                    } else {
                        System.out.println("Ingresa la franja Horaria seleccionando alguna de las 2 opciones: \t1. a:m ");
                        System.out.println("\t2. P:m ");
                        fj = Inicio.nextInt();
                    }

                }

            }

            if (S > 59) {
                m++;
            }
            if (m > 59) {
                hh1++;
                m = 00;
                S = 0;  
            }

        }

        switch (ds) {
            case 1:
                dsp = "Lunes";
                break;
            case 2:
                dsp = "Martes";
                break;
            case 3:
                dsp = "Miercoles";
                break;
            case 4:
                dsp = "Jueves";
                break;
            case 5:
                dsp = "Viernes";
                break;
            case 6:
                dsp = "Sabado";
                break;
            case 7:
                dsp = "Domingo";
                break;
                 case 8:
                    dsp = "lunes";
                    break;
        }
   // Este condicional sirve para cambiar el dia de la semana de lunes a martes etc, asimismo cambiar el dia de la semana (dm)
       
            
                

        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
