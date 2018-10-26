package ru.javawebinar.model;

import java.util.Date;
import java.util.Set;

public class User extends NamedEntity {
    private String email;
    private String password;
    private boolean enabled = true;
    private Date registered = new Date();
    private Set<Role> roles;

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public User() {

    }
    public User(User u){
        this(u.getId(), u.getName(),u.getEmail(), u.getPassword(), u.isEnabled(), u.getRoles());
    }

    //public User(Integer id, String name, String email, String password, boolean enabled, Role role, Set<Role> roles){
     //   this(id, name, email, password, enabled, EnumSet.of(role, roles));
    //}
    public User(Integer id, String name, String email, String password, boolean enabled, Set<Role> roles, Role... rolles){
                //Role... roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.enabled = true;
        this.roles = roles;
        //this.authorities = EnumSet.of(role, roles);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

  /*  public Collection<Role> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Role> authorities) {
        this.authorities = authorities;
    }
*/

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", registered=" + registered +
                ", roles=" + roles +
                '}';
    }
}
