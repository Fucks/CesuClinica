/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import modelDatabase.Salas;

/**
 *
 * @author Fucks
 */
@ManagedBean
@RequestScoped
public class GerenciaSala {

    private Salas sala = new Salas();

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
}
