package es.upm.dit.isst.tfgapi.model;

import javax.persistence.Id;
import javax.persistence.Lob;

public class TRABAJADORmodel {
    @Id
    private double identificador; 
    private String nombre; 
    private String hora_entrada; 
    private String hora_salida; 
    private double telf_contacto; 
    private String email; 
    @Lob
    private byte[] curriculum; 

    public TRABAJADORmodel(double identificador, String nombre, String hora_entrada, String hora_salida, double telf_contacto, String email) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.email = email;
        this.telf_contacto= telf_contacto;
        this.curriculum = curriculum;
    }

    public double getIdentificador (){
        return identificador; 
    }

    public String getNombre() {
        return nombre;
    }

    public String getHora_Entrada(){
        return hora_entrada; 
    }

    public String getHora_Salida(){
        return hora_salida; 
    }

    public double getTelfContacto() {
        return telf_contacto;
    }

    public String getEmail() {
        return email;
    }

    public byte[] getCurriculum() {
        return curriculum;
    }

    public void setIdentificador(double identificador){
        this.identificador = identificador; 
    }


    public void setTelfcontacto(double telf_contacto){
        this.telf_contacto = telf_contacto; 
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public void setCurriculum(byte[] curriculum) {
        this.curriculum = curriculum;
    }

}
