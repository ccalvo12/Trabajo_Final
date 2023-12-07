package org.vista;

import java.time.LocalDate;
import java.util.Date;

public class Cotizaciones {
    private int numCotizacion;

    private String ruc;
    private String cliente;
    private String vendedor;
    private String NroParte;
    private String descripcionProducto;
    private String correoVendedor;
    private String fechaCotizacion;
    private int cantidad;
    private double importe;

    private String fabricante;

    private SuscripcionesAutodesk susAutodesk;
    private SuscripcionesMicrosoft susMicrosoft;

    public Cotizaciones() {
    }

    public Cotizaciones(int numCotizacion, String ruc, String cliente, String vendedor, String nroParte, String descripcionProducto, String correoVendedor, String fechaCotizacion, int cantidad, double importe, String fabricante, SuscripcionesAutodesk susAutodesk) {
        this.numCotizacion = numCotizacion;
        this.ruc = ruc;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.NroParte = nroParte;
        this.descripcionProducto = descripcionProducto;
        this.correoVendedor = correoVendedor;
        this.fechaCotizacion = fechaCotizacion;
        this.cantidad = cantidad;
        this.importe = importe;
        this.fabricante = fabricante;
        this.susAutodesk = susAutodesk;
    }


    public Cotizaciones(int numCotizacion, String ruc, String cliente, String vendedor, String nroParte, String descripcionProducto, String correoVendedor, String fechaCotizacion, int cantidad, double importe, String fabricante, SuscripcionesMicrosoft susMicrosoft) {
        this.numCotizacion = numCotizacion;
        this.ruc = ruc;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.NroParte = nroParte;
        this.descripcionProducto = descripcionProducto;
        this.correoVendedor = correoVendedor;
        this.fechaCotizacion = fechaCotizacion;
        this.cantidad = cantidad;
        this.importe = importe;
        this.fabricante = fabricante;
        this.susMicrosoft = susMicrosoft;
    }


    public int getNumCotizacion() {
        return numCotizacion;
    }

    public void setNumCotizacion(int numCotizacion) {
        this.numCotizacion = numCotizacion;
    }

    public String getCliente() {
        return cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public SuscripcionesAutodesk getSusAutodesk() {
        return susAutodesk;
    }

    public void setSusAutodesk(SuscripcionesAutodesk susAutodesk) {
        this.susAutodesk = susAutodesk;
    }

    public SuscripcionesMicrosoft getSusMicrosoft() {
        return susMicrosoft;
    }

    public void setSusMicrosoft(SuscripcionesMicrosoft susMicrosoft) {
        this.susMicrosoft = susMicrosoft;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String toStringAutodesk() {
        return  "======== " + fabricante +  " ==================" + "\n" +
                "Cotizacion:       " + numCotizacion + "\n" +
                "RUC:              " + ruc + "\n" +
                "Cliente:          " + cliente + "\n" +
                "Vendedor:         " + vendedor + "\n" +
                "NroParte:         " + NroParte + "\n" +
                "Producto:         " + descripcionProducto + "\n" +
                "Correo Vendedor:  " + correoVendedor + "\n" +
                "Fecha Cotizacion: " + fechaCotizacion + "\n" +
                "Cantidad:         " + cantidad + "\n" +
                "Importe:          " + importe + "\n" +
                "   Tipo de Contrato:       " + susAutodesk.getTipoContrato() + "\n" +
                "   Nro de Contrato:        " + susAutodesk.getNroContrato() + "\n" +
                "   Nro de Licencia:        " + susAutodesk.getSerieProducto() + "\n" +
                "   Fecha Vencimiento:      " + susAutodesk.getFechaFinSuscripcion() + "\n" +
                "   Observaciones:          " + susAutodesk.getObservaciones() + "\n" +
                "   Administrador:          " + susAutodesk.getNomAdministrador() + "\n" +
                "   Correo Administrador:   " + susAutodesk.getCorreoAdministrador() + "\n" +
                "   Datos Creados por:      " + susAutodesk.getUserLogin().getNomUser() + "\n" +
                "============================================";
    }
    public String toStringMicrosoft() {
        return  "========" + fabricante + "==================" + "\n" +
                "Cotizacion:       " + numCotizacion + "\n" +
                "RUC:              " + ruc + "\n" +
                "Cliente:          " + cliente + "\n" +
                "Vendedor:         " + vendedor + "\n" +
                "NroParte:         " + NroParte + "\n" +
                "Producto:         " + descripcionProducto + "\n" +
                "Correo Vendedor:  " + correoVendedor + "\n" +
                "Fecha Cotizacion: " + fechaCotizacion + "\n" +
                "Cantidad:         " + cantidad + "\n" +
                "Importe:          " + importe + "\n" +
                "   Tenant:                   " + susMicrosoft.getTipoContrato() + "\n" +
                "   Tenant Microsoft:         " + susMicrosoft.getNroContrato() + "\n" +
                "   Tipo de Contrato:         " + susMicrosoft.getTipoContrato() + "\n" +
                "   Nro de Contrato:          " + susMicrosoft.getNroContrato() + "\n" +
                "   Fecha Vencimiento:        " + susMicrosoft.getFechaFin() + "\n" +
                "   Fecha Vencimiento Portal: " + susMicrosoft.getFechaFinPortal() + "\n" +
                "   Observaciones:            " + susMicrosoft.getObservaciones() + "\n" +
                "   Administrador:            " + susMicrosoft.getNomAdministrador() + "\n" +
                "   Correo Administrador:     " + susMicrosoft.getCorreoAdministrador() + "\n" +
                "   Datos Creados por:        " + susMicrosoft.getUserLogin().getNomUser() + "\n" +
                "===========================================";
    }

    public String toStringAdskReporte2(){
        String salida="";
        //DateTimeFormatter  formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaVencimiento = LocalDate.parse(susAutodesk.getFechaFinSuscripcion());
        //LocalDate fechaActual = LocalDate.parse(LocalDate.now().toString(), formato);
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaActualMas15 = fechaActual.plusDays(15);

        if (fechaVencimiento.isBefore(fechaActualMas15)){
            salida = "AUTODESK{" +
                    " Cliente='" + cliente + '\'' +
                    ", Cantidad='" + cantidad + '\'' +
                    ", Monto='" + importe + '\'' +
                    ", Vencimiento='" + susAutodesk.getFechaFinSuscripcion() + '\'' +
                    '}';
        }
        return salida;
    }
    public String toStringMicroReporte2(){
        String salida="";
        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaVencimiento = LocalDate.parse(susMicrosoft.getFechaFin());
        //LocalDate fechaActual = LocalDate.parse(LocalDate.now().toString(), formato);
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaActualMas15 = fechaActual.plusDays(15);

        if (fechaVencimiento.isBefore(fechaActualMas15)){
            salida = "MICROSOFT{" +
                    " Cliente='" + getCliente() + '\'' +
                    ", Cantidad='" + getCantidad() + '\'' +
                    ", Monto='" + getImporte() + '\'' +
                    ", Vencimiento='" + susMicrosoft.getFechaFin() + '\'' +
                    '}';
        }

        return salida;
    }

    @Override
    public String toString() {
        return "Cotizaciones" +
                "numCotizacion=" + numCotizacion +
                ", ruc='" + ruc + '\'' +
                ", cliente='" + cliente + '\'' +
                ", vendedor='" + vendedor + '\'' +
                ", NroParte='" + NroParte + '\'' +
                ", descripcionProducto='" + descripcionProducto + '\'' +
                ", correoVendedor='" + correoVendedor + '\'' +
                ", fechaCotizacion='" + fechaCotizacion + '\'' +
                ", cantidad=" + cantidad +
                ", importe=" + importe +
                ", fabricante='" + fabricante + '\'' +
                ", susAutodesk=" + susAutodesk +
                ", susMicrosoft=" + susMicrosoft +
                '}';
    }
}
