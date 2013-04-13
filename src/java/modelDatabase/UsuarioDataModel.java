/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDatabase;

import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author Fucks
 */
public class UsuarioDataModel extends ListDataModel<Usuario> implements SelectableDataModel<Usuario>{

    public UsuarioDataModel(List<Usuario> lista) {
        super(lista);
    }

    @Override
    public Object getRowKey(Usuario usuario) {
        return usuario.getUsuario();
    }

    @Override
    public Usuario getRowData(String string) {
        List<Usuario> lista = (List<Usuario>) getWrappedData();
        
        for(Usuario usuario: lista){
            if(usuario.getUsuario().equals(string)){
                return usuario;
            }
        }
        return null;
    }

    
}
