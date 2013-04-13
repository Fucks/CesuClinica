package model;

import java.util.Calendar;

public class Salas {
 
	private int id;
	 
	private int numeroSala;
	 
	private boolean status;
	 
	private Calendar horarioUso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Calendar getHorarioUso() {
        return horarioUso;
    }

    public void setHorarioUso(Calendar horarioUso) {
        this.horarioUso = horarioUso;
    }

        
	 
}
 
