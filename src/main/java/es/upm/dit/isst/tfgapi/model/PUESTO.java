package es.upm.dit.isst.tfgapi.model;

import javax.persistence.Id;

public class PUESTO {
    @Id
    private String funcion; 
    private double nomina; 
    private String hora_entrada;
    private String hora_salida;  
    private boolean disponible; 

    public void PUESTOmodel(String funcionn, Double nomina, String hora_entrada, String hora_salida, boolean disponible) {
     this.funcion = funcion;
     this.nomina = nomina;     
     this.hora_entrada = hora_entrada; 
     this.hora_salida = hora_salida;
     this.disponible = disponible;
    }

    public String getPuesto(){
        return funcion; 
    }

    public Double getNomina(){
        return nomina; 
    }

    public String getHora_Entrada(){
        return hora_entrada; 
    }

    public String getHora_Salida(){
        return hora_salida; 
    }

    public boolean disponible (){
        return disponible; 
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setNomina(Double nomina) {
        this.nomina = nomina;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public void setDisponible(Boolean disponible){
        this.disponible = disponible; 
    }

}

