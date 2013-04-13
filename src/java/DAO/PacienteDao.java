/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.UsuarioDao.session;
import hiber.HibernateUtil;
import java.util.List;
import modelDatabase.Paciente;
import modelDatabase.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fucks
 */
public class PacienteDao {
    
    static Session session = null;

    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        PacienteDao.session = session;
    }
    
    
    public static List<Paciente> pesquisarPaciente(String nomePaciente){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacao = session.beginTransaction();
        transacao.begin();
        Query listaPaciente = session.createQuery("from Paciente paciente where paciente.nome like '%"+nomePaciente+"%'");
        return listaPaciente.list();
    }
    
}
