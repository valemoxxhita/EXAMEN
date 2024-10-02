package org.example.MODELOS;

import java.time.LocalDate;

public class Asesor
{
    private long id;
    private String nombre;
    private String especializacion;
    private String numeroTelefonico;
    private String aniosExperiencia;
    private String correoElectronico;
    private String empresa;
    private String estadoCivil;
    private String nacionalidad;
    private LocalDate fechaNacimiento;

    public Asesor(long id, String nombre, String especializacion, String numeroTelefonico, String aniosExperiencia, String correoElectronico, String empresa, LocalDate fechaNacimiento, String estadoCivil, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.especializacion = especializacion;
        this.numeroTelefonico = numeroTelefonico;
        this.aniosExperiencia = aniosExperiencia;
        this.correoElectronico = correoElectronico;
        this.empresa = empresa;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoCivil = estadoCivil;
        this.nacionalidad = nacionalidad;
    }

    public Asesor()
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

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Asesor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", especializacion='" + especializacion + '\'' +
                ", numeroTelefonico='" + numeroTelefonico + '\'' +
                ", aniosExperiencia='" + aniosExperiencia + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", empresa='" + empresa + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
