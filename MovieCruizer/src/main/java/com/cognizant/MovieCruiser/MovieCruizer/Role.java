package com.cognizant.MovieCruiser.MovieCruizer;

mport java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {

@Id
@GeneratedValue(
strategy = GenerationType.IDENTITY)
@Column(name="ro_id")
private int id;


@Column(name="ro_name")
private String roName;

@ManyToMany(mappedBy = "roleList")
private Set<User> userList;

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public String getRoName() {
return roName;
}

public void setRoName(String roName) {
this.roName = roName;
}

public Set<User> getUserList() {
return userList;
}

public void setUserList(Set<User> userList) {
this.userList = userList;
}
}
