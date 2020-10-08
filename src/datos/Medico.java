package datos;

import java.io.Serializable;
import java.util.ArrayList;

public class Medico extends Persona implements Serializable{
    
 public ArrayList<String> horasTrabajo = new ArrayList<>();
 public String horario;

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<String> getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(ArrayList<String> horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    } 
    }