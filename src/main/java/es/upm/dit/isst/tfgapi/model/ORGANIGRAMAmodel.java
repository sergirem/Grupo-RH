package es.upm.dit.isst.tfgapi.model;

import javax.persistence.Id;

public class ORGANIGRAMAmodel {
    @Id
    private String estructura; 
    private String jerarquia; 

    /**
     * @param estructura
     * @param jerarquia
     */
    public ORGANIGRAMAmodel (String estructura, String jerarquia){
        this.estructura = estructura; 
        this.jerarquia = jerarquia; 
    }

    public String getJerarquia(){
        return jerarquia; 
    }
    
    public String getEstructura(){
        return estructura; 
    }

    public void setEstructura(String estructura){
        this.estructura = estructura; 
    }

    public void setJerarquia(String jerarquia){
        this.jerarquia = jerarquia; 
    }
}
