package es.upm.dit.isst.tfgapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import java.util.Arrays;
 
@Entity
public class TFGmodel {
    @Id
    private String email; 
    private String pass; 
    private String nombre;
    private String titulo;  
    private int status; 
    @Lob
    private byte[] memoria; 
    private double nota; 
    private String tutor;
    public TFGmodel(String mail, String pass, String nombre, String titulo, int status, byte[] memoria, double nota,
            String tutor) {
        this.email = mail;
        this.pass = pass;
        this.nombre = nombre;
        this.titulo = titulo;
        this.status = status;
        this.memoria = memoria;
        this.nota = nota;
        this.tutor = tutor;
    }
    public String getEmail() {
        return email;
    }
    public String getPass() {
        return pass;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getStatus() {
        return status;
    }
    public byte[] getMemoria() {
        return memoria;
    }
    public double getNota() {
        return nota;
    }
    public String getTutor() {
        return tutor;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setMemoria(byte[] memoria) {
        this.memoria = memoria;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
   
}

