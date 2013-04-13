/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import modelDatabase.Curso;

/**
 *
 * @author Fucks
 */
@ManagedBean
@RequestScoped
public class GerenciaCurso {

    private Curso curso = new Curso();

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    /**
     * Creates a new instance of GerenciaCurso
     */
    public GerenciaCurso() {
    }

    public void salvaCurso() {
        boolean bol = UsuarioDao.salvaUsuario(curso);
        if (bol) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Curso Cadastrado!", "Curso " + curso.getNomeCurso() + " foi cadastrado com sucesso!"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Erro!", "Ocorreu um erro ao cadastrar o curso."));
        }
    }
}
