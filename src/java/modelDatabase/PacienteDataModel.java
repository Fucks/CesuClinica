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
public class PacienteDataModel extends ListDataModel<Paciente> implements SelectableDataModel<Paciente>{

    public static Paciente pacienteSelecionado;

    public PacienteDataModel(List<Paciente> lista) {
        super(lista);
    }
    
    @Override
    public Object getRowKey(Paciente paciente) {
         return paciente.getNome();
    }

    @Override
    public Paciente getRowData(String string) {
         List<Paciente> lista = (List<Paciente>) getWrappedData();
        
        for(Paciente paciente: lista){
            if(paciente.getNome().equals(string)){
                pacienteSelecionado = paciente;
                return paciente;
            }
        }
        return null;
    }
    
}
