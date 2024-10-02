package org.example.MODELOS;

import java.time.LocalDate;

public class Asegurado
{
    private long id;
    private String numeroIdentificacion;
    private String nombre;
    private String apellidos;
    private String direccion;
    private LocalDate fechaNacimiento;
    private String sueldo;
    private String edad;
    private Boolean esBeneficiario;
    private String estadoCivil;
    private String ocupacion;
    private String correoElectronico;
    private String genero;
    private String nacionalidad;
    private String relacionBeneficiario;

    public Asegurado()
    {
    }

    public Asegurado(long id, String numeroIdentificacion, String nombre, String apellidos, String direccion, LocalDate fechaNacimiento, String sueldo, String edad, Boolean esBeneficiario, String estadoCivil, String ocupacion, String correoElectronico, String genero, String nacionalidad, String relacionBeneficiario) {
        this.id = id;
        this.numeroIdentificacion = numeroIdentificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldo = sueldo;
        this.edad = edad;
        this.esBeneficiario = esBeneficiario;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.correoElectronico = correoElectronico;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.relacionBeneficiario = relacionBeneficiario;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Boolean getEsBeneficiario() {
        return esBeneficiario;
    }

    public void setEsBeneficiario(Boolean esBeneficiario) {
        this.esBeneficiario = esBeneficiario;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getRelacionBeneficiario() {
        return relacionBeneficiario;
    }

    public void setRelacionBeneficiario(String relacionBeneficiario) {
        this.relacionBeneficiario = relacionBeneficiario;
    }

    @Override
    public String toString() {
        return "Asegurado{" +
                "id=" + id +
                ", numeroIdentificacion='" + numeroIdentificacion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", sueldo='" + sueldo + '\'' +
                ", edad='" + edad + '\'' +
                ", esBeneficiario=" + esBeneficiario +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", genero='" + genero + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", relacionBeneficiario='" + relacionBeneficiario + '\'' +
                '}';
    }
}
