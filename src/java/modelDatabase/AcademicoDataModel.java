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
public class AcademicoDataModel extends ListDataModel<Academico> implements SelectableDataModel<Academico> {

    public AcademicoDataModel(List<Academico> list) {
        super(list);
    }

    @Override
    public Object getRowKey(Academico academico) {
        return academico.getNome();
    }

    @Override
    public Academico getRowData(String string) {
        List<Academico> lista = (List<Academico>) getWrappedData();

        for (Academico academico : lista) {
            if (academico.getNome().equals(string)) {
                return academico;
            }
        }
        return null;
    }

    
}
