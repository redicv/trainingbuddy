package com.nexttune.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nexttune.model.Workout;
import com.nexttune.repository.WorkoutRepository;


@Service
public class WorkoutService {


@Autowired
WorkoutRepository workoutRepository;
 
public List<Workout> displayWorkouts(){
List<Workout> allWorkouts = workoutRepository.findAll();

return allWorkouts;
}     

public Workout getWorkout(Long id){

Workout workout = workoutRepository.findById(id).orElse(null);
//or else(null) may return a workout or return nothing at all 
 
return workout;

}

public Workout postWorkout(Workout workout){

    Workout savedWorkout = workoutRepository.save(workout);

    return savedWorkout;

  }

public void removeWorkout(Long id) {


  workoutRepository.deleteById(id);
  // Assuming workout is a list or collection of Workout objects
  //getAttribute(String name) Returns the object bound with the specified name in this sessions.
  // List<Workout> workouts = (List<Workout>)session.getAttribute("workouts"); // Assuming workouts are stored in session
  // List<Workout> workoutsToRemove = new ArrayList<>();
  
  // Iterate through workouts to find the one with the specified ID
//   for (Workout workout : workouts) {
//       if (workout.getId().equals(id)) {
//           workoutsToRemove.add(workout);
//       }
//   }
  
//   // Remove all workouts in workoutsToRemove from the main list
//   workouts.removeAll(workoutsToRemove);
  
//   // Optionally, update the session attribute if needed
//   session.setAttribute("workouts", workouts);
//   }
  }
}




// public void removeWorkout(Long id, HttpSession session){
//   //get a cart (the current cart in the session)
  
//       Workout workoutsession = Workout.getWorkouttype();
  
//      List<Workout> workoutsToRemove = new ArrayList<>();
      
//      //the For each loop iterates through all the items in workout 
//      for (Workout workoutsession : workout.getWorkouttype()) {
      
//       //if an id of a car in the cart matches with the id which was passed 
//       //into this method, it will remove that car from the items in cart.
//       //the id passed into this method represents the id of the car which  
//       //you want to remove from the items in the cart.  
//       if(workout.getId().equals(id)){
//         workoutsToRemove.add(workout);
//       }
     
//      }
//      workout.get().removeAll(workoutsToRemove);
//    }