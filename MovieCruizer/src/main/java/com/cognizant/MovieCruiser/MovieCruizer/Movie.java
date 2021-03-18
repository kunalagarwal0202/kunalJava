package com.cognizant.MovieCruiser.MovieCruizer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="movie_id")
private int id;

@Column(name="movies_title")
private String title;

@Column(name="movie_boxoffice")
private String boxOffice;

@Column(name="movie_active")
private String active;

@Column(name="movie_dateoflaunch")
private String dateOfLaunch;

@Column(name="movie_genre")
private String genre;

@Column(name="movie_hasteaser")
private String hasTeaser;

public Movie() {

}



public Movie(int id, String title, String boxOffice, String active, String dateOfLaunch, String genre,
String hasTeaser) {
super();
this.id = id;
this.title = title;
this.boxOffice = boxOffice;
this.active = active;
this.dateOfLaunch = dateOfLaunch;
this.genre = genre;
this.hasTeaser = hasTeaser;
}
public Movie(int id, String title, String boxOffice, String genre,
String hasTeaser) {
super();
this.id = id;
this.title = title;
this.boxOffice = boxOffice;
this.genre = genre;
this.hasTeaser = hasTeaser;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getTitle() {
return title;
}
public void setTitle(String title) {
this.title = title;
}
public String getBoxOffice() {
return boxOffice;
}
public void setBoxOffice(String boxOffice) {
this.boxOffice = boxOffice;
}
public String getActive() {
return active;
}
public void setActive(String string) {
this.active = string;
}
public String getDateOfLaunch() {
return dateOfLaunch;
}
public void setDateOfLaunch(String string) {
this.dateOfLaunch = string;
}
public String getGenre() {
return genre;
}
public void setGenre(String genre) {
this.genre = genre;
}
public String gethasTeaser() {
return hasTeaser;
}
public void sethasTeaser(String string) {
this.hasTeaser = string;
}
@Override
public String toString() {
if(dateOfLaunch==null) {
return "Movie [id=" + id + ", title=" + title + ",  boxOffice=" + boxOffice +", genre=" + genre + ", hasTeaser=" + hasTeaser + "]";

}
return "Movie [id=" + id + ", title=" + title + ", boxOffice=" + boxOffice + ", active=" + active + ", dateOfLaunch="
+ dateOfLaunch + ", genre=" + genre + ", hasTeaser=" + hasTeaser + "]";
}

@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Movie other = (Movie) obj;
if (id != other.id)
return false;
return true;
}
}