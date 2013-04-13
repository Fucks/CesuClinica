/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import hiber.HibernateUtil;
import java.util.List;
import modelDatabase.Curso;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fucks
 */
public class CursoDao {
    static Session session = null;

    public static List<Curso> todosOsCursos(){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacao = session.beginTransaction();
        transacao.begin();
        Query listaPaciente = session.createQuery("from Curso");
        return listaPaciente.list();
    }
}
