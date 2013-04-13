package DAO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelDatabase.Paciente;
import modelDatabase.PacienteDataModel;

/**
 *
 * @author Fucks
 */
@ManagedBean
@ViewScoped
public class GerenciaPaciente implements Serializable {

    private String pacienteBusca;
    private String dataNascimento;
    private Paciente paciente = new Paciente();
    private Paciente pacienteSelecionado;
    private List<Paciente> listaPesquisa;
    private PacienteDataModel pacienteDataModel;

    public Paciente getPacienteSelecionado() {
        return pacienteSelecionado;
    }

    public void setPacienteSelecionado(Paciente pacienteSelecionado) {
        this.pacienteSelecionado = pacienteSelecionado;
    }

    
    public PacienteDataModel getPacienteDataModel() {
        return pacienteDataModel;
    }

    public void setPacienteDataModel(PacienteDataModel pacienteDataModel) {
        this.pacienteDataModel = pacienteDataModel;
    }
    
    public String getPacienteBusca() {
        return pacienteBusca;
    }

    public void setPacienteBusca(String pacienteBusca) {
        this.pacienteBusca = pacienteBusca;
    }

    
    public List<Paciente> getListaPesquisa() {
        return listaPesquisa;
    }

    public void setListaPesquisa(List<Paciente> listaPesquisa) {
        this.listaPesquisa = listaPesquisa;
    }
    
    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void salvaPaciente() {
        FacesContext context = FacesContext.getCurrentInstance();
        Calendar dataNasc = Calendar.getInstance();
        dataNasc.set(Integer.parseInt(dataNascimento.substring(6, 10)), Integer.parseInt(dataNascimento.substring(3, 5)), Integer.parseInt(dataNascimento.substring(0, 2)));
        paciente.setDataNascimento(dataNasc.getTime());
        boolean bol = UsuarioDao.salvaUsuario(paciente);
        if (bol) {
            context.addMessage(null, new FacesMessage("Paciente Cadastrado!", "O Paciente " + paciente.getNome() + " foi cadastrado!"));
        } else {
            context.addMessage(null, new FacesMessage("Erro ao Salvar o paciente!!!", "Paciente não foi cadastrado!"));
        }
    }
    
    public void buscaPaciente(){
        listaPesquisa = PacienteDao.pesquisarPaciente(pacienteBusca);
        pacienteDataModel = new PacienteDataModel(listaPesquisa);
        GerenciaAgendamento.mostraListaPacientes();
    }
    
}
