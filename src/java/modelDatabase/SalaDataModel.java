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
public class SalaDataModel extends ListDataModel<Salas> implements SelectableDataModel<Salas>{

    public SalaDataModel(List<Salas> lista) {
        super(lista);
    }

    
    @Override
    public Object getRowKey(Salas sala) {
        return sala.getNumeroSala();
    }

    @Override
    public Salas getRowData(String string) {
        List<Salas> lista = (List<Salas>) getWrappedData();
        
        for(Salas sala: lista){
            if(sala.getNumeroSala().equals(string)){
                return sala;
            }
        }
        return null;
    }
    
}
