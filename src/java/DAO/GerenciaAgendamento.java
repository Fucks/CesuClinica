/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
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
    private String dataAgendamento;
    private Agendamento agendamento;
    private Date data;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
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

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
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
        //Calendar data = Calendar.getInstance();
       // data.set(Integer.parseInt(dataAgendamento.substring(6, 10)), Integer.parseInt(dataAgendamento.substring(3, 5)), Integer.parseInt(dataAgendamento.substring(0, 2)));
        agendamento = new Agendamento(paciente.getId(), data, academico.getId(), sala.getId(), null, tipoAtendimento, null);
        boolean bol;
        bol = UsuarioDao.salvaUsuario(agendamento);
        if (bol) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Agendamento Concluido!", "O agendamento do paciente " + paciente.getNome() + " foi concluido!"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Agendamento Falhou!", "O agendamento falhou!"));
        }
    }
}
