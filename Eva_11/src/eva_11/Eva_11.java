/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_11;

import Emp.Empleado;
import java.util.Scanner;

/**
 *
 * @author Irving Gerardo Mancera Mejia
 */
public class Eva_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lo = new Scanner(System.in);
        Empleado ol = new Empleado();
        
        double total;
        System.out.println("Dame tu nombre: ");
        ol.setNombre(lo.nextLine());
        System.out.println("Dame tu apellido Pat: ");
        ol.setApellidopat(lo.nextLine());
        System.out.println("Dame tu apellido Mat: ");
        ol.setApellidomat(lo.nextLine());
        System.out.println("Dame tu genero: ");
        ol.setGenero(lo.nextLine());
        System.out.println("Dame tu clave: ");
        ol.setClave(lo.nextLine());
        System.out.println("Dame tu edad: ");
        ol.setEdad(lo.nextInt());
        System.out.println("Dame tu salario: ");
        ol.setSalario(lo.nextDouble());
        System.out.println("Dame tu pago extra: ");
        ol.setExtra(lo.nextDouble());
        
        total= (ol.getSalario()+ol.getExtra());
        
        System.out.println("Tus Datos son " +ol.getNombre() + " " +ol.getApellidopat() +" " +ol.getApellidomat() +" "+ol.getGenero() +" "+ol.getClave() +"Tu edad"+ol.getEdad());
        System.out.println("Tus ganancias son " +total);
        
        
        
        
     
        
    }
    
}
