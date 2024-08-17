package com.nexttune.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nexttune.model.User;
import com.nexttune.model.Workout;
import com.nexttune.repository.UserRepository;
import com.nexttune.service.UserService;
import com.nexttune.service.WorkoutService;

import jakarta.servlet.http.HttpSession;





@Controller
public class WorkoutController {


@Autowired//dependency injection
WorkoutService workoutService;

@Autowired
UserService userService;

@Autowired
UserRepository userRepository;
//Http methods/mappings
    //GET - retrieve or load a resource e. g. just loading a message 
    //POST - submitting data e. g. signing up 
    //PUT - Update a record or entity e.g. updating car information, updating user profile
    //DELETE - if you're trying to delete a resource

   @GetMapping("/{id}")
   public String workoutDetails(@PathVariable Long id, Model model) throws Exception {

   Workout workoutDetails = workoutService.getWorkout(id);

   model.addAttribute("WorkoutDetails", workoutDetails);

   return "WorkoutDetails";
   }

   @GetMapping("/postworkout")
   public String postWorkout(){
   return "PostWorkout";
   }

   @PostMapping("/postworkout")
    public String postWorkoutDetails(@ModelAttribute Workout workout, HttpSession session){
        User sessionuser = (User) session.getAttribute("user");

        User user = userService.findById(sessionuser.getId());
       

        Workout workout1 = workoutService.postWorkout(workout);
        user.getWorkouts().add(workout1);
        user.setWorkouts(user.getWorkouts());
        userRepository.save(user);
       
        
        return "redirect:/workouts";
    }

    @GetMapping("/workouts")
    public String getWorkouts(Model model, HttpSession session) {
         User sessionuser = (User) session.getAttribute("user");

     User user = userService.findById(sessionuser.getId());
      List<Workout> workouts = user.getWorkouts();
      
        model.addAttribute("workouts", workouts);
        //${workouts attributename}
        return "Workouts"; 
    }



    @GetMapping("/workoutdetails")
    public String getWorkoutDetails() {
        return "WorkoutDetails";  
    }
   
    // @GetMapping("/workouts") 
    // public String displayWorkouts(@PathVariable Long id, Model model){
    //  List<Workout> workouts  = workoutService.displayWorkouts();
    //   model.addAttribute("workout", workouts);
    //   return "Workouts";
    // }

    //anytime the info is being extracted from the path we use @PathVariable
    @GetMapping("workouts/remove/{id}")
    public String removeWorkout(@PathVariable Long id){

     workoutService.removeWorkout(id);
     return "redirect:/workouts";
    }


    
}
    

