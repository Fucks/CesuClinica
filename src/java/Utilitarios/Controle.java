/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Fucks
 */
@ManagedBean
@RequestScoped
public class Controle {

    public boolean MOSTRA_DATA_PACIENTE = false;
    public boolean MOSTRA_PACIENTE_SELECIONADO = false;
    public boolean MOSTRA_BUSCA_PACIENTE = true;

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

    public boolean isMOSTRA_BUSCA_PACIENTE() {
        return MOSTRA_BUSCA_PACIENTE;
    }

    public void setMOSTRA_BUSCA_PACIENTE(boolean MOSTRA_BUSCA_PACIENTE) {
        this.MOSTRA_BUSCA_PACIENTE = MOSTRA_BUSCA_PACIENTE;
    }
    /**
     * Creates a new instance of Controle
     */
    public Controle() {
    }
}
