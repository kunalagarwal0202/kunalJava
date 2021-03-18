package com.cognizant.MovieCruiser.MovieCruizer;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {

@Id
@GeneratedValue(
strategy = GenerationType.IDENTITY)
@Column(name="us_id")
private int id;

@Column(name="us_username")
private String username;

@Column(name="us_password")
private String password;

@ManyToMany(fetch = FetchType.EAGER)
@JoinTable(name = "user_role",
joinColumns = @JoinColumn(name = "user_us_id"),
inverseJoinColumns = @JoinColumn(name = "role_ro_id"))
private Set<Role> roleList;

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}

public String getPassword() {
return password;
}

public void setPassword(String password) {
this.password = password;
}

public Set<Role> getRoleList() {
return roleList;
}

public void setRoleList(Set<Role> roleList) {
this.roleList = roleList;
}
}
