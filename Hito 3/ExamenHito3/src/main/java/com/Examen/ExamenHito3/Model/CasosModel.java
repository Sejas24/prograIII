package com.Examen.ExamenHito3.Model;

import javax.persistence.*;


@Table(name = "corona_virus_paciente")
public class CasosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idcoronavirus;

    @Column(name = "nombre_dep", length = 50, nullable = false)
    private String nombre_dep;

    @Column(name = "nombre_paciente", length = 50, nullable = false)
    private String nombre_paciente;

    @Column(name = "apellidos_paciente", length = 50, nullable = false)
    private String apellidos_paciente;

    @Column(name = "edad_paciente")
    private int edad_paciente;

    @Column(name = "casos_contagiados")
    private int casos_contagiados;

    @Column(name = "casos_sospechosos")
    private int casos_sospechosos;

    @Column(name = "casos_recuperados")
    private int casos_recuperados;

    public Integer getIdcoronavirus() {
        return idcoronavirus;
    }

    public void setIdcoronavirus(Integer idcoronavirus) {
        this.idcoronavirus = idcoronavirus;
    }

    public String getNombredep() {
        return nombre_dep;
    }

    public void setNombresdep(String nombresdep) {
        this.nombre_dep = nombresdep;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
    }

    public String getApellidos_paciente() {
        return apellidos_paciente;
    }

    public void setApellidos_paciente(String apellidos_paciente) {
        this.apellidos_paciente = apellidos_paciente;
    }

    public int getEdad_paciente() {
        return edad_paciente;
    }

    public void setEdad_paciente(int edad_paciente) {
        this.edad_paciente = edad_paciente;
    }

    public int getCasoscontagiados() {
        return casos_contagiados;
    }

    public void setCasoscontagiados(int casoscontagiados) {
        this.casos_contagiados = casoscontagiados;
    }

    public int getCasossospechosos() {
        return casos_sospechosos;
    }

    public void setCasossospechosos(int casossospechosos) {
        this.casos_sospechosos = casossospechosos;
    }

    public int getCasosrecuperados() {
        return casos_recuperados;
    }

    public void setCasosrecuperados(int casosrecuperados) {
        this.casos_recuperados = casosrecuperados;
    }

}