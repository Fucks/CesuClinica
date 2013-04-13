/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelDatabase.Academico;
import modelDatabase.AcademicoDataModel;

/**
 *
 * @author Fucks
 */
@ManagedBean
@ViewScoped
public class GerenciaAcademico implements Serializable {

    private Academico academico = new Academico();
    private Academico academicoSelecionado;
    private List<Academico> listaPesquisa;
    private AcademicoDataModel academicoDataModel;
    private String academicoPesquisa;

    public Academico getAcademicoSelecionado() {
        return academicoSelecionado;
    }

    public void setAcademicoSelecionado(Academico academicoSelecionado) {
        this.academicoSelecionado = academicoSelecionado;
    }

    public List<Academico> getListaPesquisa() {
        return listaPesquisa;
    }

    public void setListaPesquisa(List<Academico> listaPesquisa) {
        this.listaPesquisa = listaPesquisa;
    }

    public AcademicoDataModel getAcademicoDataModel() {
        return academicoDataModel;
    }

    public void setAcademicoDataModel(AcademicoDataModel academicoDataModel) {
        this.academicoDataModel = academicoDataModel;
    }

    public String getAcademicoPesquisa() {
        return academicoPesquisa;
    }

    public void setAcademicoPesquisa(String academicoPesquisa) {
        this.academicoPesquisa = academicoPesquisa;
    }

    
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

    public void buscaAcademico() {
        listaPesquisa = AcademicoDao.pesquisarAcademico(academicoPesquisa);
        academicoDataModel = new AcademicoDataModel(listaPesquisa);
    }
}
