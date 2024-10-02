package org.example.MODELOS;

public class Inmueble
{
    private long id;
    private String numeroInquilinos;
    private Double metrosCuadrados;
    private String tipoInmueble;
    private String direccionInmueble;
    private String numeroHabitaciones;
    private Integer valorInmobiliario;
    private String estado;
    private String materialesEstructura;
    private Boolean serviciosPublicos;

    public Inmueble()
    {
    }

    public Inmueble(long id, String numeroInquilinos, Double metrosCuadrados, String tipoInmueble, String direccionInmueble, String numeroHabitaciones, Integer valorInmobiliario, String estado, String materialesEstructura, Boolean serviciosPublicos) {
        this.id = id;
        this.numeroInquilinos = numeroInquilinos;
        this.metrosCuadrados = metrosCuadrados;
        this.tipoInmueble = tipoInmueble;
        this.direccionInmueble = direccionInmueble;
        this.numeroHabitaciones = numeroHabitaciones;
        this.valorInmobiliario = valorInmobiliario;
        this.estado = estado;
        this.materialesEstructura = materialesEstructura;
        this.serviciosPublicos = serviciosPublicos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroInquilinos() {
        return numeroInquilinos;
    }

    public void setNumeroInquilinos(String numeroInquilinos) {
        this.numeroInquilinos = numeroInquilinos;
    }

    public Double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(Double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public String getDireccionInmueble() {
        return direccionInmueble;
    }

    public void setDireccionInmueble(String direccionInmueble) {
        this.direccionInmueble = direccionInmueble;
    }

    public String getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(String numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Integer getValorInmobiliario() {
        return valorInmobiliario;
    }

    public void setValorInmobiliario(Integer valorInmobiliario) {
        this.valorInmobiliario = valorInmobiliario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMaterialesEstructura() {
        return materialesEstructura;
    }

    public void setMaterialesEstructura(String materialesEstructura) {
        this.materialesEstructura = materialesEstructura;
    }

    public Boolean getServiciosPublicos() {
        return serviciosPublicos;
    }

    public void setServiciosPublicos(Boolean serviciosPublicos) {
        this.serviciosPublicos = serviciosPublicos;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "id=" + id +
                ", numeroInquilinos='" + numeroInquilinos + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                ", tipoInmueble='" + tipoInmueble + '\'' +
                ", direccionInmueble='" + direccionInmueble + '\'' +
                ", numeroHabitaciones='" + numeroHabitaciones + '\'' +
                ", valorInmobiliario=" + valorInmobiliario +
                ", estado='" + estado + '\'' +
                ", materialesEstructura='" + materialesEstructura + '\'' +
                ", serviciosPublicos=" + serviciosPublicos +
                '}';
    }
}
