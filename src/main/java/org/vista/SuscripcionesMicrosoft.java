package org.vista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class SuscripcionesMicrosoft {
private String tenant="";
private String tenantMicrosoft="";
private String tipoContrato="";
private String nroContrato="";
private String fechaFin="";
private String fechaFinPortal="";
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

    public SuscripcionesMicrosoft(String tenant, String tenantMicrosoft, String tipoContrato, String nroContrato, String fechaFin, String fechaFinPortal, String observaciones, String nomAdministrador, String correoAdministrador, usuariosLogin userLogin) {
        this.tenant = tenant;
        this.tenantMicrosoft = tenantMicrosoft;
        this.tipoContrato = tipoContrato;
        this.nroContrato = nroContrato;
        this.fechaFin = fechaFin;
        this.fechaFinPortal = fechaFinPortal;
        this.observaciones = observaciones;
        this.nomAdministrador = nomAdministrador;
        this.correoAdministrador = correoAdministrador;
        this.userLogin = userLogin;
    }

    //@Override
    public String toStringMicroReporte1() {

        String salida="";
        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaVencimiento = LocalDate.parse(fechaFin);
        //LocalDate fechaActual = LocalDate.parse(LocalDate.now().toString(), formato);
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaActualMas15 = fechaActual.plusDays(15);

        if (fechaVencimiento.isBefore(fechaActualMas15)){
            salida = "MICROSOFT{" +
                    "tenant='" + tenant + '\'' +
                    ", tenantMicrosoft='" + tenantMicrosoft + '\'' +
                    ", tipoContrato='" + tipoContrato + '\'' +
                    ", nroContrato='" + nroContrato + '\'' +
                    ", fechaFin='" + fechaFin + '\'' +
                    ", fechaFinPortal='" + fechaFinPortal + '\'' +
                    ", observaciones='" + observaciones + '\'' +
                    ", nomAdministrador='" + nomAdministrador + '\'' +
                    ", correoAdministrador='" + correoAdministrador + '\'' +
                    '}';
        }

            return salida;
    }

    public SuscripcionesMicrosoft() {
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getTenantMicrosoft() {
        return tenantMicrosoft;
    }

    public void setTenantMicrosoft(String tenantMicrosoft) {
        this.tenantMicrosoft = tenantMicrosoft;
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

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaFinPortal() {
        return fechaFinPortal;
    }

    public void setFechaFinPortal(String fechaFinPortal) {
        this.fechaFinPortal = fechaFinPortal;
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
