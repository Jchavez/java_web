/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import DAO.DAOUser;
import Model.Users;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Jonathan
 */
@ManagedBean
@ViewScoped
public class beanUsers {
public List<Users> usuario = new ArrayList<Users>();
Users usuarioOBJ=new Users();
    /**
     * Creates a new instance of beanUsers
     */
    public beanUsers() {
        
    }

    public List<Users> getUsuario() {
        DAOUser usuarioDAO=new DAOUser();
        return  usuarioDAO.showUsers();
    }

    public void insertUser(){
        DAOUser usuarioDAO=new DAOUser();
        usuarioDAO.insertUser(usuarioOBJ);
    }
    
    public void updateUser(){
        DAOUser usuarioDAO=new DAOUser();
        usuarioDAO.updateUser(usuarioOBJ);
    }
    
    public void deleteUser(){
        DAOUser usuarioDAO=new DAOUser();
        usuarioDAO.deleteUser(usuarioOBJ);
    }
    
    
    
    
    
    
}
