/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcarrera.modelo;

/**
 *
 * @author Flia. Carrera
 */
public class Empleado extends Persona{
    private double salario;
    private String area;

    public Empleado() {
    }

    public Empleado(double salario, String area) {
        this.salario = salario;
        this.area = area;
    }

    public Empleado(double salario, String area, String nombre, String apellido, String direccion, String CI, int edad) {
        super(nombre, apellido, direccion, CI, edad);
        this.salario = salario;
        this.area = area;
    }
    

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n EL salario es:"+getSalario()+"\n Su area es: "+getArea();
                }
    
    
}
