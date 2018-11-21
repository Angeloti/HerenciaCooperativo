/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sflores.controlador;

import com.sflores.modelo.Empleado;
import com.sflores.vista.EditarDatos;
import com.sflores.vista.Login;
import java.util.ArrayList;

/**
 *
 * @author Flia. Carrera
 */
public class Coordinador {
        Login login = new Login(this);   
        EditarDatos editarDatos = new EditarDatos(this);
        ArrayList<Empleado>empleados= new ArrayList<Empleado>();        
        public void agregarEmpleado(Empleado e){
            empleados.add(e);
        }
    
}
