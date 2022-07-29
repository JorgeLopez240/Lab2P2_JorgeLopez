
package lab2p2_jorgelopez;

import java.util.Scanner;

public class Lab2P2_JorgeLopez {
    
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean flag1 = true;
        while(flag1 = true){
            System.out.println();
            System.out.print("Ingrese el admin: ");
            String admin = lea.next();
            System.out.print("Ingrese la contraseña: ");
            String contra = lea.next();
            if(admin.equals("admin")&&contra.equals("admin1234")){
                boolean flag2=true;
                while(flag2){
                System.out.println();
                System.out.println("MENU");
                System.out.println("1) Clientes");
                System.out.println("2) Empleados");
                System.out.println("3) Automóviles");
                System.out.println("4) Salir");
                System.out.print("Ingrese la opción que desea: ");
                int op = lea.nextInt();
                System.out.println();
                    switch(op){
                        case 1:{
                            System.out.println("MENU CLIENTES");
                            System.out.println("1) Crear");
                            System.out.println("2) Modificar");
                            System.out.println("3) Eliminar");
                            System.out.println("4) Listar Clientes");
                            System.out.println("5) Listar carros por clientes");
                            System.out.print("Ingrese la opción que desea: ");
                            int opC = lea.nextInt();
                            System.out.println();
                        }
                        break;
                        case 2:{
                            System.out.println("MENU EMPLEADOS");
                            System.out.println("1) Crear");
                            System.out.println("2) Modificar");
                            System.out.println("3) Eliminar");
                            System.out.println("4) Listar Clientes");
                            System.out.println("5) Listar carros por clientes");
                            System.out.print("Ingrese la opción que desea: ");
                            int opE = lea.nextInt();
                            System.out.println();
                        }
                        break;
                        case 3:{
                            System.out.println("MENU CLIENTES");
                            System.out.println("1) Añadir carros al sistema");
                            System.out.println("2) Modificar estado del carro");
                            System.out.println("3) listar carros");
                            System.out.print("Ingrese la opción que desea: ");
                            int opC = lea.nextInt();
                            System.out.println();
                        }
                        break;
                        case 4:{
                            flag2=false;
                        }
                        break;
                        default:{
                            System.out.println("Opción invalida.");
                        }
                        break;
                    }
                }
            }
            else{
                System.out.println("Datos incorrectos.");
            }
        }
    }
    
}
