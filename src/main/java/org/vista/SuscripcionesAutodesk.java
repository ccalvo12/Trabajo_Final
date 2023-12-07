package org.vista;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SuscripcionesAutodesk {
    private String tipoContrato="";
    private String nroContrato="";
    private String serieProducto="";
    private String fechaFinSuscripcion="";
    private String observaciones="";
    private String nomAdministrador="";
    private String correoAdministrador="";

    private usuariosLogin userLogin;
    public usuariosLogin getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(usuariosLogin userLogin) {
        this.userLogin = userLogin;
    }

    public SuscripcionesAutodesk(String tipoContrato, String nroContrato, String serieProducto, String fechaFinSuscripcion, String observaciones, String nomAdministrador, String correoAdministrador, usuariosLogin userLogin) {
        this.tipoContrato = tipoContrato;
        this.nroContrato = nroContrato;
        this.serieProducto = serieProducto;
        this.fechaFinSuscripcion = fechaFinSuscripcion;
        this.observaciones = observaciones;
        this.nomAdministrador = nomAdministrador;
        this.correoAdministrador = correoAdministrador;
        this.userLogin = userLogin;
    }

    public SuscripcionesAutodesk() {
    }

    //@Override
    public String toStringAdskReporte1() {
        String salida="";
        //DateTimeFormatter  formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaVencimiento = LocalDate.parse(fechaFinSuscripcion);
        //LocalDate fechaActual = LocalDate.parse(LocalDate.now().toString(), formato);
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaActualMas15 = fechaActual.plusDays(15);

        if (fechaVencimiento.isBefore(fechaActualMas15)){
                salida = "AUTODESK{" +
                        "tipoContrato='" + tipoContrato + '\'' +
                        ", nroContrato='" + nroContrato + '\'' +
                        ", serieProducto='" + serieProducto + '\'' +
                        ", fechaFinSuscripcion='" + fechaFinSuscripcion + '\'' +
                        ", observaciones='" + observaciones + '\'' +
                        ", nomAdministrador='" + nomAdministrador + '\'' +
                        ", correoAdministrador='" + correoAdministrador + '\'' +
                        '}';
        }
        return salida;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getNroContrato() {
        return nroContrato;
    }

    public void setNroContrato(String nroContrato) {
        this.nroContrato = nroContrato;
    }

    public String getSerieProducto() {
        return serieProducto;
    }

    public void setSerieProducto(String serieProducto) {
        this.serieProducto = serieProducto;
    }

    public String getFechaFinSuscripcion() {
        return fechaFinSuscripcion;
    }

    public void setFechaFinSuscripcion(String fechaFinSuscripcion) {
        this.fechaFinSuscripcion = fechaFinSuscripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getNomAdministrador() {
        return nomAdministrador;
    }

    public void setNomAdministrador(String nomAdministrador) {
        this.nomAdministrador = nomAdministrador;
    }

    public String getCorreoAdministrador() {
        return correoAdministrador;
    }

    public void setCorreoAdministrador(String correoAdministrador) {
        this.correoAdministrador = correoAdministrador;
    }

}
