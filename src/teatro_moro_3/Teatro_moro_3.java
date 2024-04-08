
package teatro_moro_3;

import java.util.Scanner;


public class Teatro_moro_3 {

     static Scanner entrada = new Scanner(System.in);                      
     static double estudiante=0.10;                                             //variables estatica
     static double tercera_edad=0.15;                                           //variables estatica
     static double general=0.00;                                                //variables estatica
                                                                                
     class Combo_pareja{                                                         
        static String combo_pareja="COMBO PAREJA";                              //variable de instancia
     }
     
     class Combo_familiar{
         static String combo_familiar="COMBO FAMILIAR";                         //variable de instancia
     }
     
     class banco_duoc{
        static double combo_bancoduoc=0.50;                                     //variable de instancia
     }
     
     class ubicacion{
         static String ubicacion=null;                                          //variable de instancia
     }
     
    public static void main(String[] args) {
        int Opciones;
        
        System.out.println("Bienvendio al Teatro Moro");
        System.out.println("");
          System.out.println("estudiante 10% descuento");
        System.out.println("adulto mayor 15% descuento");
        System.out.println("banco duoc 50% descuento(opcion promociones)");
        System.out.println("");
        System.out.println("Este 8/04/2025 (Aplicando variables en Java)");
        System.out.println("");
        System.out.println(" 1- Comprar Entrada ");
        System.out.println(" 2- Promociones ");
        System.out.println(" 3- Salir ");
        do{
        Opciones=entrada.nextInt();
        switch (Opciones) {
            
            case 1:{
                entradas();
                break;
                    }
            case 2:{
                promociones();
                break;
                    }
            case 3:{
                System.out.println(" ! Vuelve Pronto ! ");
                break;
                    }
            default:{
                    System.out.println("opcion invalida");
                break;
                    }
        }
        } while (Opciones<1||Opciones>3);
        System.out.println("");
        System.out.println("FIN DEL PROGRAMA");
    }
 public static void entradas (){
     int edad,vip,plateabaja,plateaalta,palcos,preciobase=0,total=0;
     double descuento=0,descuentoAplicado;
     String edades,categoria,pagar;
     
     System.out.println("Por favor ingresar su edad:");
            do{ 
            edad = entrada.nextInt();
            if (edad<5||edad>100){
             System.out.println("edad incorrecta");}
             } while (edad<5 || edad>100);
             
            if (edad < 18) {
                edades = "estudiante";
            } else if (edad >= 60) {
                edades = "tercera edad";
            } else {
                edades = "general";
            }

            System.out.println("Su edad califica como !" + edades + "! para la entrada.");
            System.out.println("Que categoria necesitas?");
            System.out.println("Por favor escribir la opcion");
            System.out.println("- Vip");
            System.out.println("- Platea baja");
            System.out.println("- Platea alta");
            System.out.println("- Palcos");
            entrada.nextLine(); 
            categoria = entrada.nextLine().toLowerCase();
            switch (categoria){
             case "vip":
                    vip = 25000;
                    total =(total+vip);
                    ubicacion.ubicacion = "Vip";
                    preciobase = 25000;
                    break;
                case "platea baja":
                    plateabaja = 19000;
                    total = (total+plateabaja);
                    ubicacion.ubicacion = "Platea baja";
                    preciobase = 19000;
                    break;
                case "platea alta":
                    plateaalta =11000;
                    total = (total+plateaalta);
                    ubicacion.ubicacion = "Platea alta";
                    preciobase = 11000;
                    break;
                case "palcos":
                    palcos = 7200;
                    total = (total+palcos);
                    ubicacion.ubicacion = "Palcos";
                    preciobase = 7200;
                    break;
                default:
                    System.out.println("Categoria invalida.");
                    return;
            }
            
                // Descuentos según edad
            if (edades.equalsIgnoreCase("estudiante")) {
                descuento = estudiante; // Descuento estudiante
            } 
            else if (edades.equalsIgnoreCase("tercera edad")) {
                descuento = tercera_edad; // Descuento tercera edad
            }
            else  {
                descuento=general;
            }
            descuentoAplicado = total * descuento;
            total -=descuentoAplicado;
     
            
            System.out.println("Resumen de la compra:");
            System.out.println("Ubicacion del asiento: " + ubicacion.ubicacion);
            System.out.println("Precio base de la entrada: $" + preciobase);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final a pagar: $" + total);
            System.out.println("");
            do{
                System.out.println("ingrese pagar para finalizar la compra");
                pagar=entrada.nextLine().toLowerCase();
            if (pagar.equalsIgnoreCase("pagar")){
                System.out.println("COMPRA APROBADA");
                System.out.println("QUE DISFRUTE EL EVENTO");}
            else {
                System.out.println(" !Opcion Invalida! ");
                System.out.println("");
                }
                    
            } while (!pagar.equalsIgnoreCase("pagar"));
                                }
 public static void promociones(){
     
     int edad,vip,plateabaja,plateaalta,palcos,Opciones,preciobase=0,total=0;
     double descuento=0,descuentoAplicado;
     String edades,categoria,pagar;
     
     
     
     System.out.println("Promociones disponible");
     System.out.println("1- COMBO PAREJAS (por la compra de 2 entradas paga 1)");
     System.out.println("2- COMBO FAMILIAR (por la compra de 4 entradas pagas 2)");
     System.out.println("3- COMBO BANCO_DUOC (pagando con tu tarjeta banco duoc tendras 50% descuento)");
     do{
     Opciones=entrada.nextInt(); 
     
     
     switch (Opciones){
         
         
         case 1:
     System.out.println("Por favor ingresar su edad para validar si opta para los descuento (estudiante/adulto_mayor):");
            do{ 
            edad = entrada.nextInt();
            if (edad<5||edad>100){
             System.out.println("edad incorrecta");}
             } while (edad<5 || edad>100);
             
            if (edad < 18) {
                edades = "estudiante";
            } else if (edad >= 60) {
                edades = "tercera edad";
            } else {
                edades = "general";
            }

            System.out.println("Su edad califica como !" + edades + "! para la entrada.");
            System.out.println("Que categoria necesitas?");
            System.out.println("Por favor escribir la opcion");
            System.out.println("- Vip");
            System.out.println("- Platea baja");
            System.out.println("- Platea alta");
            System.out.println("- Palcos");
            entrada.nextLine(); 
            categoria = entrada.nextLine().toLowerCase();
            switch (categoria){
             case "vip":
                    vip = 25000;
                    total =(total+vip);
                    ubicacion.ubicacion = "Vip";
                    preciobase = 25000;
                    break;
                case "platea baja":
                    plateabaja = 19000;
                    total = (total+plateabaja);
                    ubicacion.ubicacion = "Platea baja";
                    preciobase = 19000;
                    break;
                case "platea alta":
                    plateaalta =11000;
                    total = (total+plateaalta);
                    ubicacion.ubicacion= "Platea alta";
                    preciobase = 11000;
                    break;
                case "palcos":
                    palcos = 7200;
                    total = (total+palcos);
                    ubicacion.ubicacion = "Palcos";
                    preciobase = 7200;
                    break;
                default:
                    System.out.println("Categoria invalida.");
                    return;
            }
            
                // Descuentos según edad
            if (edades.equalsIgnoreCase("estudiante")) {
                descuento = estudiante; // Descuento estudiante
            } 
            else if (edades.equalsIgnoreCase("tercera edad")) {
                descuento = tercera_edad; // Descuento tercera edad
            }
            else  {
                descuento=general;
            }
            descuentoAplicado = total * descuento;
            total -=descuentoAplicado;
     
            
            System.out.println("Resumen de la compra:");
            System.out.println("Ubicacion del asiento: " + ubicacion.ubicacion);
            System.out.println("Precio base de la entrada: $" + preciobase*2);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Descuento Promocion: "+Combo_pareja.combo_pareja);
            System.out.println("Precio final a pagar: $" + total);
            System.out.println("");
            do{
                System.out.println("ingrese pagar para finalizar la compra");
                pagar=entrada.nextLine().toLowerCase();
            if (pagar.equalsIgnoreCase("pagar")){
                System.out.println("COMPRA APROBADA");
                System.out.println("QUE DISFRUTEN EL EVENTO");}
            else {
                System.out.println(" !Opcion Invalida! ");
                System.out.println("");
                }
                    break;
            } while (!pagar.equalsIgnoreCase("pagar"));
         break;
         
         case 2:
              System.out.println("Por favor ingresar su edad para validar si opta para los descuento (estudiante/adulto_mayor):");
            do{ 
            edad = entrada.nextInt();
            if (edad<5||edad>100){
             System.out.println("edad incorrecta");}
             } while (edad<5 || edad>100);
             
            if (edad < 18) {
                edades = "estudiante";
            } else if (edad >= 60) {
                edades = "tercera edad";
            } else {
                edades = "general";
            }

            System.out.println("Su edad califica como !" + edades + "! para la entrada.");
            System.out.println("Que categoria necesitas?");
            System.out.println("Por favor escribir la opcion");
            System.out.println("- Vip");
            System.out.println("- Platea baja");
            System.out.println("- Platea alta");
            System.out.println("- Palcos");
            entrada.nextLine(); 
            categoria = entrada.nextLine().toLowerCase();
            switch (categoria){
             case "vip":
                    vip = 25000;
                    total =(total+vip);
                    ubicacion.ubicacion = "Vip";
                    preciobase = 25000;
                    break;
                case "platea baja":
                    plateabaja = 19000;
                    total = (total+plateabaja);
                    ubicacion.ubicacion = "Platea baja";
                    preciobase = 19000;
                    break;
                case "platea alta":
                    plateaalta =11000;
                    total = (total+plateaalta);
                    ubicacion.ubicacion = "Platea alta";
                    preciobase = 11000;
                    break;
                case "palcos":
                    palcos = 7200;
                    total = (total+palcos);
                    ubicacion.ubicacion = "Palcos";
                    preciobase = 7200;
                    break;
                default:
                    System.out.println("Categoria invalida.");
                    return;
            }
            
                // Descuentos según edad
            if (edades.equalsIgnoreCase("estudiante")) {
                descuento = estudiante; // Descuento estudiante
            } 
            else if (edades.equalsIgnoreCase("tercera edad")) {
                descuento = tercera_edad; // Descuento tercera edad
            }
            else  {
                descuento=general;
            }
            descuentoAplicado = total * descuento;
            total -=descuentoAplicado;
     
            
            System.out.println("Resumen de la compra:");
            System.out.println("Ubicacion del asiento: " + ubicacion.ubicacion);
            System.out.println("Precio base de la entrada: $" + preciobase*4);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Descuento Promocion: "+Combo_familiar.combo_familiar);
            System.out.println("Precio final a pagar: $" + total*2);
            System.out.println("");
            do{
                System.out.println("ingrese pagar para finalizar la compra");
                pagar=entrada.nextLine().toLowerCase();
            if (pagar.equalsIgnoreCase("pagar")){
                System.out.println("COMPRA APROBADA");
                System.out.println("QUE DISFRUTEN EL EVENTO");}
            else {
                System.out.println(" !Opcion Invalida! ");
                System.out.println("");
                }
                    break;
            } while (!pagar.equalsIgnoreCase("pagar"));
              break;
         case 3 :
     System.out.println("Por favor ingresar su edad:");
            do{ 
            edad = entrada.nextInt();
            if (edad<5||edad>100){
             System.out.println("edad incorrecta");}
             } while (edad<5 || edad>100);
             
            if (edad < 18) {
                edades = "estudiante";
            } else if (edad >= 60) {
                edades = "tercera edad";
            } else {
                edades = "general";
            }

            System.out.println("Su edad califica como !" + edades + "! para la entrada.");
            System.out.println("Que categoria necesitas?");
            System.out.println("Por favor escribir la opcion");
            System.out.println("- Vip");
            System.out.println("- Platea baja");
            System.out.println("- Platea alta");
            System.out.println("- Palcos");
            entrada.nextLine(); 
            categoria = entrada.nextLine().toLowerCase();
            switch (categoria){
             case "vip":
                    vip = 25000;
                    total =(total+vip);
                    ubicacion.ubicacion = "Vip";
                    preciobase = 25000;
                    break;
                case "platea baja":
                    plateabaja = 19000;
                    total = (total+plateabaja);
                    ubicacion.ubicacion = "Platea baja";
                    preciobase = 19000;
                    break;
                case "platea alta":
                    plateaalta =11000;
                    total = (total+plateaalta);
                    ubicacion.ubicacion = "Platea alta";
                    preciobase = 11000;
                    break;
                case "palcos":
                    palcos = 7200;
                    total = (total+palcos);
                    ubicacion.ubicacion = "Palcos";
                    preciobase = 7200;
                    break;
                default:
                    System.out.println("Categoria invalida.");
                    return;
            }
            
                // Descuentos según edad
            if (edades.equalsIgnoreCase("estudiante")) {
                descuento = estudiante+banco_duoc.combo_bancoduoc; // Descuento estudiante
            } 
            else if (edades.equalsIgnoreCase("tercera edad")) {
                descuento = tercera_edad+banco_duoc.combo_bancoduoc; // Descuento tercera edad
            }
            else  {
                descuento=general+banco_duoc.combo_bancoduoc;        //Descuento banco duoc
            }
            descuentoAplicado = total * descuento;
            total -=descuentoAplicado;
     
            
            System.out.println("Resumen de la compra:");
            System.out.println("Ubicacion del asiento: " + ubicacion.ubicacion);
            System.out.println("Precio base de la entrada: $" + preciobase);
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final a pagar: $" + total);
            System.out.println("");
            do{
                System.out.println("ingrese pagar para finalizar la compra");
                pagar=entrada.nextLine().toLowerCase();
            if (pagar.equalsIgnoreCase("pagar")){
                System.out.println("COMPRA APROBADA");
                System.out.println("QUE DISFRUTE EL EVENTO");}
            else {
                System.out.println(" !Opcion Invalida! ");
                System.out.println("");
                }
                    
            } while (!pagar.equalsIgnoreCase("pagar"));  
             
         default:
             System.out.println("!opcion invalida!");
             break;
     }
     }while(Opciones<1||Opciones>2);
     
 
     
       
     
                                }
             
                                }  
 
 
 
 
                            
 

  
     