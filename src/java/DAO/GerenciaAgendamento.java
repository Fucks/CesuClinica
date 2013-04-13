/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelDatabase.Agendamento;
import modelDatabase.Curso;
import modelDatabase.Paciente;
import modelDatabase.Salas;
import modelDatabase.Usuario;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Fucks
 */
@ManagedBean
@ViewScoped
public class GerenciaAgendamento implements Serializable {

    private String pacienteBusca;
    private String cursoBusca;
    private String salaBusca;
    private Paciente paciente;
    private Usuario usuario;
    private Curso curso;
    private Salas sala;
    private String tipoAtendimento;
    private Calendar dataAgendamento;
    private Agendamento agendamento;
    //controles de VIEW
    private static boolean MOSTRA_DATA_PACIENTE = false;
    private static boolean MOSTRA_PACIENTE_SELECIONADO = false;
    private static boolean MOSTRA_BUSCA_PACIENTE = true;

    public static boolean isMOSTRA_BUSCA_PACIENTE() {
        return MOSTRA_BUSCA_PACIENTE;
    }

    public static void setMOSTRA_BUSCA_PACIENTE(boolean MOSTRA_BUSCA_PACIENTE) {
        GerenciaAgendamento.MOSTRA_BUSCA_PACIENTE = MOSTRA_BUSCA_PACIENTE;
    }

    
    public boolean isMOSTRA_DATA_PACIENTE() {
        return MOSTRA_DATA_PACIENTE;
    }

    public void setMOSTRA_DATA_PACIENTE(boolean MOSTRA_DATA_PACIENTE) {
        this.MOSTRA_DATA_PACIENTE = MOSTRA_DATA_PACIENTE;
    }

    public boolean isMOSTRA_PACIENTE_SELECIONADO() {
        return MOSTRA_PACIENTE_SELECIONADO;
    }

    public void setMOSTRA_PACIENTE_SELECIONADO(boolean MOSTRA_PACIENTE_SELECIONADO) {
        this.MOSTRA_PACIENTE_SELECIONADO = MOSTRA_PACIENTE_SELECIONADO;
    }

    public String getPacienteBusca() {
        return pacienteBusca;
    }

    public void setPacienteBusca(String pacienteBusca) {
        this.pacienteBusca = pacienteBusca;
    }

    public String getCursoBusca() {
        return cursoBusca;
    }

    public void setCursoBusca(String cursoBusca) {
        this.cursoBusca = cursoBusca;
    }

    public String getSalaBusca() {
        return salaBusca;
    }

    public void setSalaBusca(String salaBusca) {
        this.salaBusca = salaBusca;
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
    }

}
