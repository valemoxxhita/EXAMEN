package org.example.MODELOS;

public class Beneficiario
{
    private long id;
    private String numeroIdentificacion;
    private String relacionAsegurado;
    private String fechaNacimiento;
    private String ocupacion;
    private String ingresos;
    private String direccion;
    private String numeroTelefono;
    private String correoElectronico;
    private String nombre;

    public Beneficiario()
    {
    }

    public Beneficiario(long id, String numeroIdentificacion, String relacionAsegurado, String fechaNacimiento, String ocupacion, String ingresos, String direccion, String numeroTelefono, String correoElectronico, String nombre) {
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.relacionAsegurado = relacionAsegurado;
        this.fechaNacimiento = fechaNacimiento;
        this.ocupacion = ocupacion;
        this.ingresos = ingresos;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getRelacionAsegurado() {
        return relacionAsegurado;
    }

    public void setRelacionAsegurado(String relacionAsegurado) {
        this.relacionAsegurado = relacionAsegurado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getIngresos() {
        return ingresos;
    }

    public void setIngresos(String ingresos) {
        this.ingresos = ingresos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Beneficiario{" +
                "id=" + id +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", relacionAsegurado='" + relacionAsegurado + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", ingresos='" + ingresos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
