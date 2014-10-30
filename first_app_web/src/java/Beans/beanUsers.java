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
public List<Users> usuario;
    /**
     * Creates a new instance of beanUsers
     */
    public beanUsers() {
        usuario = new ArrayList<Users>();
    }

    public List<Users> getUsuario() {
        DAOUser usuarioDAO=new DAOUser();
        usuario=  usuarioDAO.showUsers();
        return usuario;
    }

    

    
    
    
    
    
}
