package umariana.taller2;

import java.util.Scanner;
import producto.Productos;

/**
 *
 * @author Andres Muñoz
 */
public class Tienda {
        public static void main(String[] args) {
        Productos p = new Productos();
        Scanner lector= new Scanner(System.in);
       
        boolean activo = true;
        do{
            System.out.println("Menu tienda");
            System.out.println("Elgie una opcion");
            System.out.println("1:Agregrar producto");
            System.out.println("2:Ver inventario");
            System.out.println("3:Organizar Productos");
            System.out.println("4:Eliminar Productos");
            System.out.println("5:Salir");
            
            
            int opcion =lector.nextInt();
            switch(opcion){
                // agregrar producto
                case 1: 
                    p.agregarProducto();

                    break;
                    // ver inventario
                case 2:
                    
                  p.verInventario();
                    
                    
                    break;
                // Organizar productos de manera ascendente 
               
                case 3:
                 p.organizar();
                    break;

                    //Elimirar productos
                case 4:
                  p.eliminarProducto();
                 
                         break;

                    //salir
                case 5:
               activo = false; 
                    System.out.println("programa finalizado");
                    break;
                default:
                    System.out.println("opcion no valida");
                    
                    
            }
            
        }while(activo);
        

        }
        

        }

