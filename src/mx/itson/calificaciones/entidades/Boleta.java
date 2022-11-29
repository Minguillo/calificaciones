/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.calificaciones.entidades;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.List;

/**
 *
 * @author beltr
 */
public class Boleta {
    private Alumno alumno;
   
    private List<Materia> materias;

    public Boleta descerializar(String json) {
        Boleta boleta = new Boleta();

        try {
            boleta = new Gson().fromJson(json, Boleta.class);
        } catch (JsonSyntaxException e) {
            System.err.println("Error: " + e.getMessage());
        }

        return boleta;
    }
    /**
     * @return the alumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * @return the materias
     */
    public List<Materia> getMaterias() {
        return materias;
    }

    /**
     * @param materias the materias to set
     */
    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
    
    
}
