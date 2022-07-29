
package lab2p2_jorgelopez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_JorgeLopez {
    
    static Scanner lea = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ArrayList inventario = new ArrayList(); // no tipado
        
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
                        case 1:{ //clientes
                            System.out.println("MENU CLIENTES");
                            System.out.println("1) Crear");
                            System.out.println("2) Modificar");
                            System.out.println("3) Eliminar");
                            System.out.println("4) Listar Clientes");
                            System.out.println("5) Listar carros por clientes");
                            System.out.print("Ingrese la opción que desea: ");
                            int opC = lea.nextInt();
                            System.out.println();
                            switch(opC){
                                case 1:{ // agregar cliente
                                    String nombre,numID;
                                    int edad;
                                    double saldo;
                                    System.out.print("Ingrese el nombre: ");
                                    lea.nextLine();
                                    nombre = lea.nextLine();
                                    System.out.print("Ingrese la edad: ");
                                    edad = lea.nextInt();
                                    System.out.print("Ingrese el numero de identidad: ");
                                    numID = lea.next();
                                    System.out.print("Ingrese el saldo: ");
                                    saldo = lea.nextDouble();
                                    inventario.add(new Cliente(nombre, edad, numID, saldo));
                                    System.out.println();
                                    System.out.println("Cliente agregado exitosamente.");
                                }
                                break;
                                case 2:{ // modificar cliente
                                    System.out.print("Ingrese la posicion del cliente: ");
                                    int pos=lea.nextInt();
                                    if(inventario.get(pos) instanceof Cliente){
                                        //System.out.println("Ingrese el apartado que desea modificar: ");
                                        System.out.println("1) Nombre");
                                        System.out.println("2) Edad");
                                        System.out.println("3) Numero de identidad");
                                        System.out.println("4) Saldo");
                                        System.out.print("Ingrese la opcion que desea modificar: ");
                                        int mod = lea.nextInt();
                                        switch(mod){
                                            case 1:{
                                                System.out.print("Ingrese el nuevo nombre: ");
                                                lea.nextLine();
                                                String nombre = lea.nextLine();
                                                ((Cliente)inventario.get(pos)).setNombre(nombre);
                                                System.out.println();
                                                System.out.println("Modificacion exitosa.");
                                            }
                                            break;
                                            case 2:{
                                                System.out.print("Ingrese la nueva edad: ");
                                                int edad = lea.nextInt();
                                                ((Cliente)inventario.get(pos)).setEdad(edad);
                                                System.out.println();
                                                System.out.println("Modificacion exitosa.");
                                            }
                                            break;
                                            case 3:{
                                                System.out.print("Ingrese el nuevo ID: ");
                                                lea.nextLine();
                                                String id = lea.nextLine();
                                                ((Cliente)inventario.get(pos)).setNum_id(id);
                                                System.out.println();
                                                System.out.println("Modificacion exitosa.");
                                            }
                                            break;
                                            case 4:{
                                                System.out.print("Ingrese el nuevo saldo: ");
                                                double saldo = lea.nextDouble();
                                                ((Cliente)inventario.get(pos)).setSaldo(saldo);
                                                System.out.println();
                                                System.out.println("Modificacion exitosa.");
                                            }
                                            break;
                                        
                                        }
                                    } else{
                                        System.out.println("Posicion invalida.");
                                    }
                                }
                                break;
                                case 3:{ // Eliminar cliente
                                    System.out.print("Ingrese la posicion: ");
                                    int pos = lea.nextInt();
                                    inventario.remove(pos);
                                    System.out.println();
                                    System.out.println("Eliminado exitosamente.");
                                    
                                }
                                break;
                                case 4:{ //Listar clientes
                                    String salida ="";
                                    for (Object o : inventario) { // For especial
                                        if(o instanceof Cliente){
                                            salida += inventario.indexOf(o)+"- "+o+"\n";
                                        }
                                    }
                                    System.out.println("Listado de clientes: ");
                                    System.out.println();
                                    System.out.println(salida);
                                }
                                break;
                                case 5:{ // Listar carros por cliente
                                    
                                }
                                break;
                            }
                        }
                        break;
                        case 2:{ // Empleados
                            System.out.println("MENU EMPLEADOS");
                            System.out.println("1) Crear");
                            System.out.println("2) Modificar");
                            System.out.println("3) Eliminar");
                            System.out.println("4) Listar Empleados");
                            System.out.print("Ingrese la opción que desea: ");
                            int opE = lea.nextInt();
                            System.out.println();
                            switch(opE){
                                case 1:{
                                    String nombre, numRH;
                                    int edad;
                                    double sueldo;
                                    boolean estado;
                                    System.out.print("Ingrese el nombre: ");
                                    lea.nextLine();
                                    nombre = lea.nextLine();
                                    System.out.print("Ingrese el numero RRHH: ");
                                    numRH = lea.next();
                                    System.out.print("Ingrese la edad: ");
                                    edad = lea.nextInt();
                                    System.out.print("Ingrese el sueldo: ");
                                    sueldo = lea.nextDouble();
                                    System.out.print("Ingrese su estado laboral de hoy, [1-Si esta trabajando, 2-No esta trabajando]: ");
                                    int estate = lea.nextInt();
                                    if(estate ==1){
                                        estado = true;
                                    } else{
                                        estado = false;
                                    }
                                    inventario.add(new Empleado(nombre, edad, sueldo, numRH, estado));
                                    System.out.println();
                                    System.out.println("Empleado creado exitosamente.");
                                }
                                break;
                                case 2:{
                                    System.out.print("Ingrese la posicion del empleado: ");
                                    int pos=lea.nextInt();
                                    if(inventario.get(pos) instanceof Empleado){
                                        //System.out.println("Ingrese el apartado que desea modificar: ");
                                        System.out.println("1) Nombre");
                                        System.out.println("2) Edad");
                                        System.out.println("3) Numero RRHH");
                                        System.out.println("4) Sueldo");
                                        System.out.println("5) Estado");
                                        System.out.print("Ingrese la opcion que desea modificar: ");
                                        int mod = lea.nextInt();
                                        switch(mod){
                                            case 1:{
                                                System.out.print("Ingrese el nuevo nombre: ");
                                                lea.nextLine();
                                                String nombre = lea.nextLine();
                                                ((Empleado)inventario.get(pos)).setNombre(nombre);
                                                System.out.println();
                                                System.out.println("Modificacion exitosa.");
                                            }
                                            break;
                                            case 2:{
                                                System.out.print("Ingrese la nueva edad: ");
                                                int edad = lea.nextInt();
                                                ((Empleado)inventario.get(pos)).setEdad(edad);
                                                System.out.println();
                                                System.out.println("Modificacion exitosa.");
                                            }
                                            break;
                                            case 3:{
                                                System.out.print("Ingrese el nuevo numero RRHH: ");
                                                lea.nextLine();
                                                String id = lea.nextLine();
                                                ((Empleado)inventario.get(pos)).setNum_RRHH(id);
                                                System.out.println();
                                                System.out.println("Modificacion exitosa.");
                                            }
                                            break;
                                            case 4:{
                                                System.out.print("Ingrese el nuevo sueldo: ");
                                                double saldo = lea.nextDouble();
                                                ((Empleado)inventario.get(pos)).setSueldo(saldo);
                                                System.out.println();
                                                System.out.println("Modificacion exitosa.");
                                            }
                                            break;
                                            case 5:{
                                                System.out.println("Ingrese el nuevo estado [1-Activo , 2- Inactivo]: ");
                                                int estado = lea.nextInt();
                                                boolean estate;
                                                if(estado==1){
                                                    estate = true;
                                                } else{
                                                    estate=false;
                                                }
                                            }
                                            break;
                                        
                                        }
                                    } else{
                                        System.out.println("Posicion invalida.");
                                    }
                                }
                                break;
                                case 3:{
                                    System.out.print("Ingrese la posicion: ");
                                    int pos = lea.nextInt();
                                    inventario.remove(pos);
                                    System.out.println();
                                    System.out.println("Eliminado exitosamente.");
                                }
                                break;
                                case 4:{
                                    String salida ="";
                                    for (Object o : inventario) { // For especial
                                        if(o instanceof Empleado){
                                            salida += inventario.indexOf(o)+"- "+o+"\n";
                                        }
                                    }
                                    System.out.println("Listado de empleados: ");
                                    System.out.println();
                                    System.out.println(salida);
                                }
                                break;
                            }
                        }
                        break;
                        case 3:{ // Automoviles
                            System.out.println("MENU AUTOMÓVILES");
                            System.out.println("1) Añadir carros al sistema");
                            System.out.println("2) Modificar estado del carro");
                            System.out.println("3) listar carros");
                            System.out.print("Ingrese la opción que desea: ");
                            int opA = lea.nextInt();
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
