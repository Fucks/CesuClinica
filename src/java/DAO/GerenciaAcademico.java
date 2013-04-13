/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import modelDatabase.Academico;
import modelDatabase.AcademicoDataModel;
import modelDatabase.PacienteDataModel;

/**
 *
 * @author Fucks
 */
@ManagedBean
@RequestScoped
public class GerenciaAcademico implements Serializable {

    private Academico academico = new Academico();
    private Academico academicoSelecionado;
    private List<Academico> listaPesquisa;
    private AcademicoDataModel academicoDataModel;
    private String academicoPesquisa;

    public Academico getAcademico() {
        return academico;
    }

    public void setAcademico(Academico academico) {
        this.academico = academico;
    }

    public GerenciaAcademico() {
    }

    public void salvaAcademico() {
        FacesContext context = FacesContext.getCurrentInstance();
        boolean bol = UsuarioDao.salvaUsuario(academico);
        if (bol) {
            context.addMessage(null, new FacesMessage("Academico Cadastrado!", "O Academico " + academico.getNome() + " foi cadastrado!"));
        } else {
            context.addMessage(null, new FacesMessage("Erro ao Salvar o Academico!!!", "Academico não foi cadastrado!"));
        }
    }

    public void buscaPaciente() {
        listaPesquisa = AcademicoDao.pesquisarAcademico(academicoPesquisa);
        academicoDataModel = new AcademicoDataModel(listaPesquisa);
    }
}
