package es.upm.dit.isst.tfgapi.model;

import javax.persistence.Id;


public class DEPARTAMENTOmodel {
    @Id
        private String acronimo; 
        private String nombre; 

        public DEPARTAMENTOmodel(String acronimo, String nombre) {
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
