package org.vista;

import jdk.dynalink.beans.StaticClass;

import javax.swing.*;
import javax.swing.text.html.parser.Parser;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static Scanner scanner;
    static Scanner scanner2;
    static int select;
    static int select2;
    static int num1;
    static int num2;
    //boolean accesoOk = false;

    static String userId;
    static String passUser;
    static String nomUser;

    static String numCoti;

    static String numCotiNuevosDatos;
    static String fechaVencimiento;
    static String tipoContrato;
    static String numContrato;
    static String numSerie;
    static String nomSitioMicrosoft;
    static String tenant;
    static String tenantMicrosfot;
    static String fechaFinPortalMicrosoft;

    static String nomAdministrador;
    static String mailAdministrador;
    static String observaciones;
    static List<Cotizaciones> listaCotizaciones = new ArrayList<>();

    static String confirmarGuardar;

    //static JPasswordField passAcceso;

    static usuariosLogin acceso;

    public static void main (String[] args) {
        acceso = usuariosLogin.getsingletonInstance("CHRISTIAN OMAR CALVO MARTINEZ","ccalvo","ccalvo12");
        //usuariosLogin objUser1 = new usuariosLogin("CHRISTIAN OMAR CALVO MARTINEZ","ccalvo","ccalvo12");
        //usuariosLogin objUser2 = new usuariosLogin("OMAR BRYAN BERNAL CHAVEZ","omartinez","obernal12");
        //usuariosLogin objUser3 = new usuariosLogin("RUTH LIZET NAVEROS RIVAS","rnaveros","rnaveros12");
        //List<usuariosLogin> listaUserAcceso = new ArrayList();
        //listaUserAcceso.add(objUser1);
        //listaUserAcceso.add(objUser2);
        //listaUserAcceso.add(objUser3);

        //SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy);

        listaCotizaciones.add(new Cotizaciones(1111,"20611484853","AYESA PERU","Christian Calvo","057P1-WW6525-L562-3","AutoCAD","ccalvo@ayesa.com","28/11/2023",5,123.5,"Autodesk",new SuscripcionesAutodesk("Renovacion","11000123456","123-12345678","2023-12-12","No hay","Alfonzo","alfonzo@gmail.com", new usuariosLogin("CHRISTIAN OMAR CALVO MARTINEZ"))));
        listaCotizaciones.add(new Cotizaciones(1112,"20100163391","CES CONSULTING ENGINEERS","Oscar Martinez","057P1-WW6525-L562-3","Civil 3D","oscarm@ces.com","28/11/2023",2,500.5,"Autodesk",new SuscripcionesAutodesk("Nueva","11000854569","456-78945696","2024-02-12","No hay","Carla","carla@hotmail.com",new usuariosLogin("CHRISTIAN OMAR CALVO MARTINEZ"))));
        listaCotizaciones.add(new Cotizaciones(1113,"20557987020","CONSORCIO CONSTRUCTOR M2","Julio Calvo","057P1-WW6525-L562-3","Inventor","jcalvo@m2l.com","28/11/2023",1,600,"Autodesk",new SuscripcionesAutodesk()));
        listaCotizaciones.add(new Cotizaciones(1114,"20511315922","REAL PLAZA","Jorge Manuel","057P1-WW6525-L562-3","Revit","jmanuel@realplaza.com","28/11/2023",3,4568.2,"Autodesk",new SuscripcionesAutodesk()));
        listaCotizaciones.add(new Cotizaciones(1115,"20600654200","SMARTCOLD","Jose María","057P1-WW6525-L562-3","Naviswork","jmaria@smartcold.com","28/11/2023",7,126.6,"Autodesk",new SuscripcionesAutodesk()));

        listaCotizaciones.add(new Cotizaciones(2111,"20556642932","DIDALUSA","Yovana Ramirez","CFQ7TTC0HDB0","Project 3","marco@fsdfsd.com","28/11/2023",5,123.5,"Microsoft",new SuscripcionesMicrosoft("DIDALUSA","DIDALUSA.OnMicrosoft","Nueva","220025478","2023-12-13","2023-12-13","No hay","Omar","omar@gmail.com",new usuariosLogin("CHRISTIAN OMAR CALVO MARTINEZ"))));
        listaCotizaciones.add(new Cotizaciones(2112,"20605928383","DEEP SOIL PERU","Luz Ramos","CFQ7TTC0HDB0","Microsoft 365 Business Basic","marco@fsdfsd.com","28/11/2023",10,205.3,"Microsoft",new SuscripcionesMicrosoft("DEEP SOIL","DEEP_SOIL.OnMicrosoft","Renovacion","230015482","2023-12-15","2023-12-15","Mas renovaciones por venir","Enrique","enrique@gmail.com",new usuariosLogin("CHRISTIAN OMAR CALVO MARTINEZ"))));
        listaCotizaciones.add(new Cotizaciones(2113,"20545543037","DYNAXTI","Myrian tovar","CFQ7TTC0HDB0","Office 365 E3","marco@fsdfsd.com","28/11/2023",3,103.6,"Microsoft",new SuscripcionesMicrosoft()));
        listaCotizaciones.add(new Cotizaciones(2114,"20543521401","CORPORACION AGRICOLA VIÑASOL","Lilian Conislla","CFQ7TTC0HDB0","Microsoft 365 Business Standard","marco@fsdfsd.com","28/11/2023",8,456.9,"Microsoft",new SuscripcionesMicrosoft()));
        listaCotizaciones.add(new Cotizaciones(2115,"20115866355","TECNOSUR","Patricia Mayuri","CFQ7TTC0HDB0","Power BI Pro","marco@fsdfsd.com","28/11/2023",6,200.9,"Microsoft",new SuscripcionesMicrosoft()));



        boolean accesoOk=false;
        System.out.println("Bienvenido, por favor ingrese sus credenciales");
        System.out.println("Ingrese su usuario");
        userId = scanner.nextLine();
        System.out.println("Ingrese su contraseña");
        passUser = scanner.nextLine();

        //System.out.println(passUser);

        //for(usuariosLogin us:listaUserAcceso){

            if(userId.equals(acceso.getUserId())){
                //System.out.println(userId);
                if(passUser.equals(acceso.getPassword())){
                    //System.out.println(passUser);
                    accesoOk=true;
                    nomUser=acceso.getNomUser();
                }
            }
        //}
        //System.out.println(accesoOk);

        System.out.println("\n");

        if(accesoOk==false){
            System.out.println("Usuario y/o contraseña son incorrectos");
        }
        else{
            menuInicio();

        }
    }

    public static void menuInicio(){
        while(select != 0) {
            System.out.println("--- Bienvenido al Sistema " + nomUser + " ---");
            System.out.println("Elija una opcion\n" +
                    "1. Búsqueda de cotizaciones\n" +
                    "2. Ingresar nuevos datos a cotizaciones\n" +
                    "3. Generar reportes de suscripciones\n" +
                    "4. Modificar accesos de ingreso al sistema\n" +
                    "0. Salir");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    busquedaCoti();
                    //System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                    //System.out.println("Seleccion 1");
                    break;
                case 2:
                    ingresoNuevosDatos();
                    //System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    //System.out.println("Seleccion 2");
                    break;
                case 3:
                    reporteSuscripciones();
                    //System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                    //System.out.println("Seleccion 3");
                    break;
                case 4:
                    modificarAccesos();
                    break;
                default:
                    System.out.println("A salido del sistema");
            }
        }
    }

    public static void modificarAccesos(){
        System.out.println("Ingrese nombre del usuario");
        String nom = scanner.nextLine();
        System.out.println("Ingrese usuario ID");
        String user = scanner.nextLine();
        System.out.println("Ingrese contraseña");
        String pass = scanner.nextLine();

        System.out.println("Confirmar la modificacion de los datos" + "\n" + " Y/N:");
        confirmarGuardar = scanner.nextLine();
        if (confirmarGuardar.equals("Y")){
            acceso.setNomUser(nom);
            acceso.setUserId(user);
            acceso.setPassword(pass);
            System.out.println("!Cambios guardados¡");
            //menuInicio();
            nomUser = nom;
            userId = user;
            passUser = pass;
        }else{
            System.out.println("!Cancelado¡");

        }

    }
    public static void busquedaCoti() {
        System.out.println("Ingrese numero de cotización:");
        numCoti = scanner.nextLine();
        System.out.println("\n");

        for(Cotizaciones cot:listaCotizaciones){
            if(Integer.parseInt(numCoti)==cot.getNumCotizacion()){

                if(cot.getFabricante().equals("Autodesk")){
                    System.out.println(cot.toStringAutodesk());
                    break;
                } else if (cot.getFabricante().equals("Microsoft")) {
                    System.out.println(cot.toStringMicrosoft());
                    break;
                }
            }
        }

        }

        public static String getFabricante(String codCoti){
        String fabricante="";
            for(Cotizaciones cot:listaCotizaciones){
                if(Integer.parseInt(codCoti)==cot.getNumCotizacion()){

                    if(cot.getFabricante().equals("Autodesk")){
                        //System.out.println(cot.toStringAutodesk());
                        fabricante = "Autodesk";
                        break;
                    } else if (cot.getFabricante().equals("Microsoft")) {
                        //System.out.println(cot.toStringMicrosoft());
                        fabricante = "Microsoft";
                        break;
                    }
                }
            }
            return fabricante;
        }

    public static void ingresoNuevosDatos() {
        System.out.println("--- Se debe ingresar los nuevos datos para la cotización seleccionada ---");
        System.out.println("Ingrese el numero de cotización a añadir nuevos datos:");
        numCotiNuevosDatos = scanner.nextLine();

        for(Cotizaciones cot:listaCotizaciones){
            if(Integer.parseInt(numCotiNuevosDatos)==cot.getNumCotizacion()){

                if(cot.getFabricante().equals("Autodesk")){
                    //System.out.println(cot.toStringAutodesk());
                    System.out.println("Ingrese la fecha de vencimiento:");
                    fechaVencimiento = scanner.nextLine();
                    System.out.println("Ingrese el tipo de contrato:");
                    tipoContrato = scanner.nextLine();
                    System.out.println("Ingrese el número de contrato:");
                    numContrato = scanner.nextLine();
                    System.out.println("Ingrese el número de serie del producto:");
                    numSerie = scanner.nextLine();
                    System.out.println("Ingrese nombre del administrador:");
                    nomAdministrador = scanner.nextLine();
                    System.out.println("Ingrese correo del administrador:");
                    mailAdministrador = scanner.nextLine();
                    System.out.println("Ingrese alguna observación:");
                    observaciones = scanner.nextLine();

                    System.out.println("Confirmar si se ingresaran los datos" + "\n" + " Y/N:");
                    confirmarGuardar = scanner.nextLine();
                    if (confirmarGuardar.equals("Y")){
                        cot.setSusAutodesk(new SuscripcionesAutodesk(tipoContrato, numContrato, numSerie, fechaVencimiento,observaciones,nomAdministrador,mailAdministrador, new usuariosLogin(nomUser)));
                        System.out.println("!Nuevos datos guardados¡");
                    }else{
                        System.out.println("!Cancelado¡");
                        break;
                    }

                } else if (cot.getFabricante().equals("Microsoft")) {
                    //System.out.println(cot.toStringMicrosoft());
                    System.out.println("Ingrese la fecha de vencimiento:");
                    fechaVencimiento = scanner.nextLine();
                    System.out.println("Ingrese la fecha de vencimiento portal Microsoft:");
                    fechaFinPortalMicrosoft = scanner.nextLine();
                    System.out.println("Ingrese el tipo de contrato:");
                    tipoContrato = scanner.nextLine();
                    System.out.println("Ingrese el número de contrato:");
                    numContrato = scanner.nextLine();
                    System.out.println("Ingrese nombre del tenant:");
                    tenant = scanner.nextLine();
                    System.out.println("Ingrese nombre del tenant Microsoft:");
                    tenantMicrosfot = scanner.nextLine();
                    System.out.println("Ingrese nombre del administrador:");
                    nomAdministrador = scanner.nextLine();
                    System.out.println("Ingrese correo del administrador:");
                    mailAdministrador = scanner.nextLine();
                    System.out.println("Ingrese alguna observación:");
                    observaciones = scanner.nextLine();

                    System.out.println("Confirmar si se ingresaran los datos" + "\n" + " Y/N:");
                    confirmarGuardar = scanner.nextLine();
                    if (confirmarGuardar.equals("Y")){
                        cot.setSusMicrosoft(new SuscripcionesMicrosoft(tenant,tenantMicrosfot,tipoContrato,numContrato,fechaVencimiento,fechaFinPortalMicrosoft,observaciones,nomAdministrador,mailAdministrador,new usuariosLogin(nomUser)));
                        System.out.println("!Nuevos datos guardados¡");
                    }else{
                        System.out.println("!Cancelado¡");
                        break;
                    }
                }
            }
        }



    }
    public static void reporteSuscripciones(){

    while (select2 !=0){
        //System.out.println("Bienvenido al Sistema " + nomUser);
        System.out.println("--- Elija el tipo de reporte ---\n" +
                "1. Listar licencias a vencer de los próximos 15 días\n" +
                "2. Listar la cantidad de licencias y monto por cliente de los próximos 15 días\n" +
                "3. Listar los clientes a renovar productos Autodesk de los próximos 15 días\n" +
                "4. Listar los clientes a renovar productos Microsoft de los próximos 15 días\n" +
                "0. Retornar al menu anterior");
        select2 = Integer.parseInt(scanner2.nextLine());
        switch (select2) {
            case 1:
                //toStringAdsk();
                ult15DiasAdskRepor1();
                ult15DiasMicroReport1();
                //menuInicio();
                break;
            case 2:
                //ingresoNuevosDatos();
                ult15DiasAdskRepor2();
                ult15DiasMicroReport2();
                //ult15DiasMicroReport2();
                //System.out.println("Seleccion 2");
                break;
            case 3:
                for(Cotizaciones lista:listaCotizaciones){
                    try {
                        System.out.println(lista.toStringAutodesk());
                    }catch (NullPointerException ex){
                    }catch (DateTimeParseException ex){
                    }
                }
                break;
            case 4:
                for(Cotizaciones lista:listaCotizaciones){
                    try {
                        System.out.println(lista.toStringMicrosoft());
                    }catch (NullPointerException ex){
                    }catch (DateTimeParseException ex){
                    }
                }
                break;
            default:
                //System.out.println("Numero no reconocido");
                menuInicio();
        }

    }

    }
    public static void ult15DiasAdskRepor1(){
        for(Cotizaciones lista:listaCotizaciones){
            try {
                System.out.println(lista.getSusAutodesk().toStringAdskReporte1());
            }catch (NullPointerException ex){
            }catch (DateTimeParseException ex){
            }
        }
    }
    public static void ult15DiasAdskRepor2(){
        for(Cotizaciones lista:listaCotizaciones){
            try {
                System.out.println(lista.toStringAdskReporte2());
            }catch (NullPointerException ex){
            }catch (DateTimeParseException ex){
            }
        }
    }
    public static void ult15DiasMicroReport1(){
        for(Cotizaciones lista:listaCotizaciones){
            try {
                System.out.println(lista.getSusMicrosoft().toStringMicroReporte1());
            }catch (NullPointerException ex){
            }catch (DateTimeParseException ex){
            }
        }
    }
    public static void ult15DiasMicroReport2(){
        for(Cotizaciones lista:listaCotizaciones){
            try {
                System.out.println(lista.toStringMicroReporte2());
            }catch (NullPointerException ex){
            }catch (DateTimeParseException ex){
            }
        }
    }
    public void inicioSesion(){
        System.out.println("Ingrese su usuario");
        userId = scanner.nextLine();

        System.out.println("Ingrese su contraseña");
        passUser = scanner.nextLine();

        System.out.println("\n");
    }

    static {
        scanner = new Scanner(System.in);
        scanner2 = new Scanner(System.in);
        select =-1;
        select2 =-1;
        num1 = 0;
        num2 = 0;
    }


}