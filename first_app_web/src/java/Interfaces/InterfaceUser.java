/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Model.Users;
import java.util.List;
/**
 *
 * @author Jonathan
 */
public interface InterfaceUser {
   public List<Users> showUsers();
   public void insertUser(Users User);
   public void updateUser(Users User);
   public void deleteUser(Users User);
    
}
