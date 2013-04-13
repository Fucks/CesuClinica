/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import model.Academico;

/**
 *
 * @author Fucks
 */
@ManagedBean
@RequestScoped
public class GerenciaAcademico implements Serializable{

   private Academico academico = new Academico();

    public Academico getAcademico() {
        return academico;
    }

    public void setAcademico(Academico academico) {
        this.academico = academico;
    }
   
   
    
    public GerenciaAcademico() {
    }
    
    public void salvaAcademico(){
        System.out.println("PUTAMERDA");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage("Acadêmico Cadastrado!", "O Acadêmico "+academico.getNome()+" foi cadastrado com sucesso!"));
        System.out.println("Foi");
    }
}
