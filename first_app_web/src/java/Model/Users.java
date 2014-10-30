package Model;
// Generated 29/10/2014 10:10:06 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private Integer id;
     private String username;
     private String password;
     private int groupId;
     private Date created;
     private Date modified;

    public Users() {
    }

	
    public Users(String username, String password, int groupId) {
        this.username = username;
        this.password = password;
        this.groupId = groupId;
    }
    public Users(String username, String password, int groupId, Date created, Date modified) {
       this.username = username;
       this.password = password;
       this.groupId = groupId;
       this.created = created;
       this.modified = modified;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public int getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
    public Date getCreated() {
        return this.created;
    }
    
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getModified() {
        return this.modified;
    }
    
    public void setModified(Date modified) {
        this.modified = modified;
    }




}


