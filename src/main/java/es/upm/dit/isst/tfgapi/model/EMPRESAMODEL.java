package es.upm.dit.isst.tfgapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

public class EMPRESAMODEL {
        @Id
        private String acronimo; 
        private String nombre; 


        public EMPRESAMODEL(String acronimo, String nombre) {
        this.acronimo = acronimo; 
        this.nombre = nombre;
    }

    public String getAcronimo() {
        return acronimo;
    }
    public String getNombre() {
        return nombre;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}