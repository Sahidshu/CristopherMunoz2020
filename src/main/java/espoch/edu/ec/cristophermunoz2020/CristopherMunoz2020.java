/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package espoch.edu.ec.cristophermunoz2020;

import java.util.Scanner;

/**
 *
 * @author sahid
 */
public class CristopherMunoz2020 {

    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        double vector[]= new double [7];
        double promedioVentas=0;
        double suma = 0;
        double valorVenta=0;
        int i = 0;
        
        do{
            System.out.println("Ingrese los valores de las ventas del dia"+" "+(i+1)+"  :");
            valorVenta=r.nextDouble();
            if (valorVenta>0){
                vector[i]=valorVenta;
                i++;
            }else{
                System.out.println("Error, el valor es negativo");
            }
        }while(i<7);
        
        for (i = 0; i<7; i++){
            suma=suma+vector[i];
            promedioVentas=suma/7;   
        }
        
        System.out.println("Ingrese la accion a realizar: ");
        System.out.println("1. Calcular el total de ventas semanal");
        System.out.println("2. Calcular el dia con ventas mas cercanas al promedio");
        System.out.println("3. Mostrar el dia con la venta mas alta y baja");
        System.out.println("4. Calcular el monto acumulado de ventas durante los primerostres dias y los ultimos tres dias");
        System.out.println("5. Salir");
        
        int opcion=0;
        do{
            
         opcion=r.nextInt();
           switch(opcion){
           case 1:
                double totalVentas=suma;
                System.out.println("El valor total de las ventas en la semana es: "+totalVentas); 
                break;
           case 2:
                for (i=0;i<7;i++){
                    double diferenciaMinima = promedioVentas-vector[i];  
                    if (diferenciaMinima)
                }
               System.out.println("El dia mas cercano al promedio es el dia: ");
               break;
           case 3:
            double mayor = vector[0];
            double menor = vector[0];
                for (i=1; i<7; i++){
                    if (vector[i]>mayor){
                        mayor=vector[i];
                        
                    }if (vector[i]<menor){
                        menor=vector[i];
                    }
                }
                System.out.println("El precio mas alto es: "+mayor);
                System.out.println("El precio mas bajo es: "+menor);
                break;
           case 4:
               double totalPrimerosTres=vector[0]+vector[1]+vector[2];
               double totalUltimosTres=vector[4]+vector[5]+vector[6];
               System.out.println("El monto acumulado de ventas de los primeros 3 dias es: "+totalPrimerosTres);
               System.out.println("El monto acumulado de ventas de los ultimos 3 dias es: "+totalUltimosTres);
               break;
           case 5:
               System.out.println("Saliendo del programa...");
               break;
           default:
               System.out.println("La opcion no es valida");
               }

        }while(opcion<5);
        

               
        }
                

                    
                
        
    }

