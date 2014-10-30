/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import HibernateUtil.HibernateUtil;
import Interfaces.InterfaceUser;
import Model.Users;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
/**
 *
 * @author Jonathan
 */
public class DAOUser implements InterfaceUser {

    @Override
    public List<Users> showUsers() {
        Session session=null;
        List<Users> lista=null;
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Query query=session.createQuery("from users");
            lista=(List<Users>) query.list();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
        }
        finally{
            if(session!=null){
                    session.close();
            }
        }
        return lista;
    }

    @Override
    public void insertUser(Users User) {
        Session session=null;
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(User);
            session.getTransaction().commit();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session!=null){
                    session.close();
            }
        }
    }

    @Override
    public void updateUser(Users User) {
        Session session=null;
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(User);
            session.getTransaction().commit();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session!=null){
                    session.close();
            }
        }       
    }

    @Override
    public void deleteUser(Users User) {
        Session session=null;
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(User);
            session.getTransaction().commit();
        }
        catch(HibernateException e){
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        }
        finally{
            if(session!=null){
                    session.close();
            }
        }
    }
    
}
