/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_9;

import Paquete.Automóvil;
import Paquete.Circulo;
import Paquete.Empleado;
import java.util.Scanner;

/**
 *
 * @Irving Gerardo Mancera Mejia
 */
public class Evaluacion_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Importamos las clases
        double peri, area,total;
        Scanner ui = new Scanner(System.in);
        Automóvil po = new Automóvil();
        Scanner yo = new Scanner (System.in);
        Circulo a = new Circulo();
        Scanner lo = new Scanner(System.in);
        Empleado ol = new Empleado();
        
        
        
        
        
        System.out.println("  ");
        
        System.out.println("Dame la marca del carro \n ");
        po.setMarca(ui.nextLine());
        System.out.println("Dame la placa del carro plis ");
        po.setPlaca(ui.nextLine());
        System.out.println("Que gasolina usas: ");
        po.setGasolina(ui.nextLine());
        System.out.println("Es automatico o estandar: ");
        po.setAues(ui.nextLine());
        System.out.println("Que motor usas ");
        po.setMotor(ui.nextLine());
        System.out.println("Cual es el precio del carro ");
        po.setPrecio(ui.nextDouble());
        System.out.println("Cuanto es tu kilometraje ");
        po.setKilometraje(ui.nextDouble());
        System.out.println("Cuantos cambios tienes ");
        po.setCambios(ui.nextInt());
        System.out.println("De que años es ");
        po.setAño(ui.nextInt());
        System.out.println("Cuantas llantas de respuesto tiene ");
        po.setLlanrepu(ui.nextInt());
        
        System.out.println(" Tus datos del carro son  " +po.getMarca() +"  " +po.getPlaca() +"  " +po.getGasolina() +"  " +po.getAues() +"  " +po.getMotor());
        System.out.println("\n Tus datos del carro entero\n  "  +"\n El precio es  "+po.getPrecio() +"\n El kilometraje es " +po.getKilometraje() +"\n Los cambios son: " +po.getCambios() +"\n El año del carro es" +po.getAño() +"\n Las llantas de repuesto son  "+po.getLlanrepu());
        
        
        System.out.println("Ahora sacaremos el área y perimetro del circulo:  \n ");
        System.out.println("Dame el radio");
        a.setRadio(yo.nextDouble());
        
        peri= 3.14* (2*a.getRadio());
        area= 3.14* (a.getRadio() * a.getRadio());
        System.out.println("El perimetro es " +peri);
        System.out.println("El area es " +area);
        
        System.out.println("   ");
        
        System.out.println("Ahora tomaresmos los datos personales amiguito:   ");
        
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
        
        System.out.println("Tus Datos son " +ol.getNombre() + " " +ol.getApellidopat() +" " +ol.getApellidomat() +" \n Tu genero es "+ol.getGenero() +" \n Tu clave es "+ol.getClave() +" \n Tu edad es "+ol.getEdad());
        System.out.println("Tus ganancias son " +total);
        
        
    }
    
}
