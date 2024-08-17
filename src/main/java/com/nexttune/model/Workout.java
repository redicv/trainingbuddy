package com.nexttune.model;

import com.nexttune.enums.WorkoutType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



// import java.time.Duration;
//@Data so you you dont have to worry about adding the boiler plate(getters & setters as well as contructors)
@Entity
@Table(name="Workout")
public class Workout {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long id;

@Enumerated(EnumType.STRING)
@Column(name="Workouttype")
private WorkoutType workouttype;

@Column(name="Date")
private String date;

@Column(name="Time")
private String time;

@Column(name="distance")
private String distance;

@Column(name="duration")
private String duration;

// @Column(name="workout")
// private Boolean workout;

// is scheduledworkouts  istrue isuser recall two types of users admin and users/ scedule 

@ManyToOne
private User user; //set the user currently logged in 

public Workout() {
}

public Workout(Long id, WorkoutType workouttype, String date, String time, String distance, String duration,
        User user) {
    this.id = id;
    this.workouttype = workouttype;
    this.date = date;
    this.time = time;
    this.distance = distance;
    this.duration = duration;
   
}

public Long getId() {
    return id;
}
public void setId(Long id) {
    id = id;
}

public WorkoutType getWorkouttype() {
    return workouttype;
}

public void setWorkouttype(WorkoutType workouttype) {
    this.workouttype = workouttype;
}

public String getDate() {
    return date;
}

public void setDate(String date) {
    this.date = date;
}

public String getDistance() {
    return distance;
}

public void setDistance(String distance) {
    this.distance = distance;
}

public String getDuration() {
    return duration;
}

public void setDuration(String duration) {
    this.duration = duration;
 }

public String getTime() {
    return time;
}

public void setTime(String time) {
    this.time = time;
}

public User getUser() {
    return user;
}

public void setUser(User user) {
    this.user = user;
   
  }
}



