/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import modelDatabase.SalaDataModel;
import modelDatabase.Salas;

/**
 *
 * @author Fucks
 */
@ManagedBean
@ViewScoped
public class GerenciaSala {
    
    private Salas salaSelecionado;
    private List<Salas> listaPesquisa;
    private SalaDataModel salaDataModel;
    private String salaPesquisa;
    private Salas sala = new Salas();

    public Salas getSalaSelecionado() {
        return salaSelecionado;
    }

    public void setSalaSelecionado(Salas salaSelecionado) {
        this.salaSelecionado = salaSelecionado;
    }

    public List<Salas> getListaPesquisa() {
        return listaPesquisa;
    }

    public void setListaPesquisa(List<Salas> listaPesquisa) {
        this.listaPesquisa = listaPesquisa;
    }

    public SalaDataModel getSalaDataModel() {
        return salaDataModel;
    }

    public void setSalaDataModel(SalaDataModel salaDataModel) {
        this.salaDataModel = salaDataModel;
    }

    public String getSalaPesquisa() {
        return salaPesquisa;
    }

    public void setSalaPesquisa(String salaPesquisa) {
        this.salaPesquisa = salaPesquisa;
    }

    
    public Salas getSala() {
        return sala;
    }

    public void setSala(Salas sala) {
        this.sala = sala;
    }

    /**
     * Creates a new instance of GerenciaSala
     */
    public GerenciaSala() {
    }

    public void salvaSala() {
        boolean bol = UsuarioDao.salvaUsuario(sala);
        if (bol) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Sala Cadastrada!", "Sala " + sala.getNumeroSala() + " foi cadastrada com sucesso!"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Erro!", "Erro ao cadastrar sala."));
        }
    }
    
    public void buscaSala() {
         listaPesquisa = SalaDao.pesquisarSala(salaPesquisa);
        salaDataModel = new SalaDataModel(listaPesquisa);
    }
}
