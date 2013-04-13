/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import hiber.HibernateUtil;
import java.util.List;
import modelDatabase.Salas;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fucks
 */
public class SalaDao {

    static Session session = null;

    public static List<Salas> pesquisarSala(String numeroSala){
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacao = session.beginTransaction();
        transacao.begin();
        Query listaPaciente = session.createQuery("from Salas sala where sala.numeroSala like '%"+numeroSala+"%'");
        return listaPaciente.list();
    }
}
