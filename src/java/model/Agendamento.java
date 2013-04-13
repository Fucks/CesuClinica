package model;

import java.util.Calendar;

public class Agendamento {
 
	private int id;
	 
	private Paciente paciente;
	 
	private Calendar dataAgendamento;
	 
	private Salas sala;
	 
	private Usuario usuario;
	 
	private String tipoAtendimento;
	 
	private Curso tipoClinico;
	 
	private Academico academico;
	 
	private Salas salas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Calendar getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public Curso getTipoClinico() {
        return tipoClinico;
    }

    public void setTipoClinico(Curso tipoClinico) {
        this.tipoClinico = tipoClinico;
    }

    public Academico getAcademico() {
        return academico;
    }

    public void setAcademico(Academico academico) {
        this.academico = academico;
    }

    public Salas getSalas() {
        return salas;
    }

    public void setSalas(Salas salas) {
        this.salas = salas;
    }
	 
        
}
 
