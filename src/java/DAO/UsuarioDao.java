/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import hiber.HibernateUtil;
import java.util.List;
import modelDatabase.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Fucks
 */
public class UsuarioDao {

    static Session session = null;

    public static boolean salvaUsuario(Object user) {
        boolean retorno = false;
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacao = session.beginTransaction();
        transacao.begin();


        session.save(user);
        transacao.commit();
        retorno = true;

        return retorno;
    }

    public static List listaUsuario() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transacao = session.beginTransaction();
        transacao.begin();

        Query listaUsuario = session.createQuery("from Usuario");
        List<Usuario> user = listaUsuario.list();
        for (Usuario a : user) {
            System.out.println(a.getNomeCompleto() + " / " + a.getUsuario());
        }
        return listaUsuario.list();
    }
}
