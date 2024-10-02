package org.example.MODELOS;

import java.time.LocalDate;

public class Agencia
{
    private long id;
    private String nombre;
    private LocalDate anioFundacion;
    private String direccion;
    private String correoCorporativo;
    private String paginaWeb;
    private String nombreFundador;
    private Integer numeroColaboradores;
    private String numeroTelefonico;
    private String tipoServicios;

    public Agencia(long id, String nombre, LocalDate anioFundacion, String direccion, String correoCorporativo, String paginaWeb, String nombreFundador, Integer numeroColaboradores, String numeroTelefonico, String tipoServicios) {
        this.id = id;
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.direccion = direccion;
        this.correoCorporativo = correoCorporativo;
        this.paginaWeb = paginaWeb;
        this.nombreFundador = nombreFundador;
        this.numeroColaboradores = numeroColaboradores;
        this.numeroTelefonico = numeroTelefonico;
        this.tipoServicios = tipoServicios;
    }

    public Agencia()
    {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(LocalDate anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoCorporativo() {
        return correoCorporativo;
    }

    public void setCorreoCorporativo(String correoCorporativo) {
        this.correoCorporativo = correoCorporativo;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getNombreFundador() {
        return nombreFundador;
    }

    public void setNombreFundador(String nombreFundador) {
        this.nombreFundador = nombreFundador;
    }

    public Integer getNumeroColaboradores() {
        return numeroColaboradores;
    }

    public void setNumeroColaboradores(Integer numeroColaboradores) {
        this.numeroColaboradores = numeroColaboradores;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getTipoServicios() {
        return tipoServicios;
    }

    public void setTipoServicios(String tipoServicios) {
        this.tipoServicios = tipoServicios;
    }

    @Override
    public String toString() {
        return "Agencia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anioFundacion=" + anioFundacion +
                ", direccion='" + direccion + '\'' +
                ", correoCorporativo='" + correoCorporativo + '\'' +
                ", paginaWeb='" + paginaWeb + '\'' +
                ", nombreFundador='" + nombreFundador + '\'' +
                ", numeroColaboradores=" + numeroColaboradores +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                ", tipoServicios='" + tipoServicios + '\'' +
                '}';
    }
}
