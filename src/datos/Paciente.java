package datos;

import java.io.Serializable;

public class Paciente extends Persona implements Serializable{
    public String horaCita;
    public String medico;
    public String problema;
    public Paciente(String horaCita, String medico, int edad, String nombre, String cedula, String problema) {
        this.horaCita = horaCita;
        this.medico = medico;
        this.problema = problema;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }
    
    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }   
}
