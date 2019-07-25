/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        AtmUK cajero = new AtmUK();
        Account cuenta;
        int opcion;
        ArrayList<Account> cuentas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        Manejador manejador100 = new Manejador(100,100);
        Manejador manejador20 = new Manejador(100,20);
        Manejador manejador10 = new Manejador(100,10);
        
        ManejadorMonedas manejadorM50 = new ManejadorMonedas(10,0.5);
        ManejadorMonedas manejadorM25 = new ManejadorMonedas(10,0.25);
        ManejadorMonedas manejadorM10 = new ManejadorMonedas(10,0.1);
        ManejadorMonedas manejadorM5 = new ManejadorMonedas(1000,0.05);
        
        cajero.addManejador(manejador100);
        cajero.addManejador(manejador20);
        cajero.addManejador(manejador10);        
        /* añadir manejadores de monedas 
        
        cajero.addManejador(manejadorM50);
        cajero.addManejador(manejadorM25);
        cajero.addManejador(manejadorM10);
        cajero.addManejador(manejadorM5);
        
        */
        
        // Crear un único cajero Automático de dólares con 100 billetes de 20, 100 de 10, 
        //SINGLETON DE CONSTRUCTOR PRIVADO E INSTANCIA ESTATICA DE SI MISMO CON METODO GET INSTANCE
        // 10 monedas de 0.50, 10 de 0.25 y 1000 de 0.05
        
        
        
        for(int i = 0; i<10; i++){
            cuenta = new Account(i+1,100+i*100);
            cuentas.add(cuenta);
            
        }
        // Crear 10 cuentas nuevas en dólares locale.US con un saldo inicial entre 100.00 y 1000.00 USD cada una.
        
        try{
            System.out.print("Ingrese una cuenta (disponibles del 1 al 10): ");
            opcion = sc.nextInt();
            opcion--;
            cuenta = cuentas.get(opcion);
                    // Menú principal para seleccionar una de las 10 cuentas solo con el id
            AtmUK.transaction(cuenta);
            // Mostrar el menú para realizar transacciones en el cajero automático
        } catch (Exception e){
                        System.out.print("Error ingresando dato");
        }

        
        
        
    }

    
}
