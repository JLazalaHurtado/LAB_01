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
        int ds, dm, mes, año, a1, hh, m, m1, Se, s1,h1;
        string fj;

        System.out.println("Bienvenido, ingresa una fecha en digitos de la siguiente forma: dia de la semana, dia del mes, mes y año");
        System.out.println("Ingresa el dia de la semana");
        ds = Inicio.nextInt();

        if (ds < 1 | ds > 7) {
            System.out.println("Dia de la semana no valido. Intenta nuevamente.");
        } else {
            System.out.println("Ingresa el dia del mes ");
            dm = Inicio.nextInt();
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
            hh = Inicio.nextInt();
            if (hh < 1 | hh > 12) {
                System.out.println("La hora no es valida. Intenta nuevamente");
            } else {
                System.out.println("Ingresa los minutos");
                m = Inicio.nextInt();
                if (m < 1 | m > 59) {
                    System.out.println("Los minutos ingresados no son validos. Intenta nuevamente");
                } else {
                    System.out.println("Ingresa los segundos");
                    Se = Inicio.nextInt();
                    if (Se < 1 | Se > 59) {
                        System.out.println("Segundos no validos. Intenta nuevamente ");
                     }   else {
                            System.out.println("Ingresar la franja horaria 1. am \tn2. p:m");
                            fj = Inicio.next();
                            if ( fj <  1  | fj > 2 ) { 
                                System.out.println("Franja Horaria no valida. Intenta nuevamente");
                            }
                                }
                    
                }

            }
        }
        s1 = Se + 1; // la nueva variable para los segundos 
        
        if (s1 >60 ) {
            m1 = m+1 ;
            if ( m1 > 60) ; 
            h1 = hh + 1;   // este condicional hace la funcíon de cambiar los minutos y hora con base a los segundos.
        }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
