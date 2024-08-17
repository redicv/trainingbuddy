package com.nexttune.model;

import java.util.List;
import com.nexttune.enums.ReasonForJoining;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="User")
public class User {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long id;

@Column(name="firstName")
public String firstname;

@Column(name="lastName")
public String lastname;

@Column(name="username")
public String username;

@Column(name="password")
public String password;

@Column(name="address")
public String address;

@Column(name="email")
public String email;

@Column(name="phonenumber")
public String phonenumber;

@Column(name="photoUrl")
public String photoUrl;

@Column(name="city")
public String city;

@Column(name="state")
public String state;

@Enumerated(EnumType.STRING)
@Column(name="Reasonforjoining")
public ReasonForJoining reasonforjoining;



public User(Long id, String firstname, String lastname, String username, String password, String address, String email,
        String phonenumber, String photoUrl, String city, String state, ReasonForJoining reasonforjoining,
        List<Workout> workouts ) {
    this.id = id;
    this.firstname = firstname;
    this.lastname = lastname;
    this.username = username;
    this.password = password;
    this.address = address;
    this.email = email;
    this.phonenumber = phonenumber;
    this.photoUrl = photoUrl;
    this.city = city;
    this.state = state;
    this.reasonforjoining = reasonforjoining;
    this.workouts = workouts;
  
}

@OneToMany
@JoinColumn(name="user_id",referencedColumnName = "id")
private List<Workout> workouts;

public User() {
}

public void setId(Long id) {
    this.id = id;
}

public String getLastname() {
    return lastname;
}

public void setLastname(String lastname) {
    this.lastname = lastname;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

public String getState() {
    return state;
}

public void setState(String state) {
    this.state = state;
}


public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public List<Workout> getWorkouts() {
    return workouts;
}

public void setWorkouts(List<Workout> workouts) {
    this.workouts = workouts;
}

public String getFirstname() {
    return firstname;
}

public void setFirstname(String firstname) {
    this.firstname = firstname;
}

public String getLastName() {
    return lastname;
}

public void setLastName(String lastName) {
    this.lastname = lastName;
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

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPhonenumber() {
    return phonenumber;
}

public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
}

public String getPhotoUrl() {
    return photoUrl;
}

public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
  }

public ReasonForJoining getReasonforjoining() {
    return reasonforjoining;
}

public void setReasonforjoining(ReasonForJoining reasonforjoining) {
    this.reasonforjoining = reasonforjoining;
}
}

