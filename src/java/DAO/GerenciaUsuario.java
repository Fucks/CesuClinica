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
import modelDatabase.Usuario;
import modelDatabase.UsuarioDataModel;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Fucks
 */
@ManagedBean
@ViewScoped
public class GerenciaUsuario {

    private Usuario usuario = new Usuario();
    
    private Usuario usuarioSelecionado = new Usuario();

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }
    
    private UsuarioDataModel seila;

    public UsuarioDataModel getSeila() {
        return seila;
    }

    public void setSeila(UsuarioDataModel seila) {
        this.seila = seila;
    }
    
    
    private List<Usuario> lista ;

    public List<Usuario> getLista() {
        return lista;
    }

    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        
        
    }
    
    private boolean visualizar = false;

    public boolean isVisualizar() {
        return visualizar;
    }

    public void setVisualizar(boolean visualizar) {
        this.visualizar = visualizar;
    }
    
    
    
    
    /**
     * Creates a new instance of GerenciaUsuario
     */
    public GerenciaUsuario() {
        
    }
    
    public void salvaUsuario(){
        boolean transacao = UsuarioDao.salvaUsuario(usuario);
        System.out.println(transacao);
        if(transacao){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuário Cadastrado!", "O Usuário "+usuario.getNomeCompleto()+" foi cadastrado com sucesso!"));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Erro!", "O Usuário não foi cadastrado."));
        }
        
        System.out.println(usuario);
    }
    
    public void listaUsuarios(){
        setVisualizar(true);
        lista = UsuarioDao.listaUsuario();
        seila = new UsuarioDataModel(lista);
    }
    
    public void mostraSelecionado(SelectEvent event){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Selecionou", "Usuario "+((Usuario) event.getObject()).getUsuario()+" foi selecionado!"));
    }
}
