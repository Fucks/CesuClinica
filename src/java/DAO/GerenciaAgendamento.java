/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelDatabase.Academico;
import modelDatabase.Agendamento;
import modelDatabase.Curso;
import modelDatabase.Paciente;
import modelDatabase.Salas;
import modelDatabase.Usuario;

/**
 *
 * @author Fucks
 */
@ManagedBean
@ViewScoped
public class GerenciaAgendamento implements Serializable {

    private Academico academico;
    private Paciente paciente;
    private Usuario usuario;
    private Curso curso;
    private Salas sala;
    private String tipoAtendimento;
    private Calendar dataAgendamento;
    private Agendamento agendamento;

    public Academico getAcademico() {
        return academico;
    }

    public void setAcademico(Academico academico) {
        this.academico = academico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    public String getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(String tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public Calendar getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    /**
     * Creates a new instance of AgendamentoDao
     */
    public GerenciaAgendamento() {
    }

    public void agendarConsulta() {
        agendamento = new Agendamento();
        agendamento.setDataAgendamento(dataAgendamento.getTime());
        agendamento.setIdAcademico(academico.getId());
        agendamento.setIdPaciente(paciente.getId());
        agendamento.setIdSala(sala.getId());
        agendamento.setTipoAtendimento(tipoAtendimento);
    }
}
