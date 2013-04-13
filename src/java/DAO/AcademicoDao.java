/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import hiber.HibernateUtil;
import java.util.List;
import modelDatabase.Academico;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fucks
 */
public class AcademicoDao {
    static Session session = null;

    public static Session getSession() {
        return session;
    }

    public static void setSession(Session session) {
        PacienteDao.session = session;
    }
    
    
    public static List<Academico> pesquisarAcademico(String nomeAcademico){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacao = session.beginTransaction();
        transacao.begin();
        Query listaAcademico = session.createQuery("from Academico academico where academico.nome like '%"+nomeAcademico+"%'");
        return listaAcademico.list();
    }
}
