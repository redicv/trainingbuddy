package com.nexttune.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import com.nexttune.model.User;
import com.nexttune.repository.UserRepository;
import com.nexttune.service.UserService;


import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {
//Http methods/mappings
    //GET - retrieve or load a resource e. g. just loading a message 
    //POST - submitting data e. g. signing up 
    //PUT - Update a record or entity e.g. updating car information, updating user profile
    //DELETE - if you're trying to delete a resource
@Autowired
UserService userService;

@Autowired
UserRepository userRepository;

 @GetMapping("/signup")
 public String signUp()  {
     return "Signup";
 }

 @PostMapping("/signup")
 public String submitSignUp(@ModelAttribute User user) {
    userService.signUp(user);
     return "Signin";
 }
 
 @GetMapping("/signin")
 public String signIn() {
     return "Signin";
 }

@PostMapping("/signin")
public String signIn(@ModelAttribute User user, Model model, HttpSession session) {

    try{ 
    
    User loggedinUser = userService.signIn(user);

    model.addAttribute("user", loggedinUser);
    session.setAttribute("user", loggedinUser);
    
    
    return "Home";
    }

    catch (Exception e){
    
        return "Signin";
    }
}
 
  @GetMapping("/profile")
  public String userProfile(Model model, HttpSession session) {
  User sessionuser = (User) session.getAttribute("user");

  User user = userService.findById(sessionuser.getId());
    
    if (user == null){
    return "Signin";

    } else {

    model.addAttribute("user");

    return "Profile";
   }
   
}

@GetMapping("/logout")
public String logout(HttpSession session){

  //this will remove/clear the logged in user from the session
  //invalidate this session then unbinds any objects bound to it 
session.invalidate();

return "redirect:/signin";

}

 @GetMapping("/editprofile/{id}")
  public String editProfile(@PathVariable Long id, Model model) {//anytime the info is being extracted from the path we use @PathVariable

    User userProfile = userService.findById(id);

    if(userProfile != null){

      model.addAttribute("userprofile", userProfile);

      return "EditProfile";

    
       } else{

        return "redirect:/signup";
      }

   }
     
     @PostMapping("/editprofile") 
     public String editProfileForm(@ModelAttribute User user, HttpSession session){
      userService.editProfile(user, session);
        return "redirect:/profile";
  
    }

//these are methods created for the buddy search/request & schedule workout features
@GetMapping("/buddysearch")//load the buddy search page with getmapping
public String searchBuddy(Model model){

List<User> user = userRepository.findAll();
model.addAttribute("user", user);
return "BuddySearch";
}

//requestparam allows spring to take input data from the search query or form data
@PostMapping("/buddysearch")//to search for a buddy on the buddy search page 
public String searchForBuddy(@RequestParam ("Model") Model model, User user) { //we use Model model because we're trying to send over the cart session 
//data over to the cart webpage/jsp
List<User> users = userService.searchForBuddy();
//sends all users received from the "searchForBuddy()" method over to the "BuddySearch.jsp" webpage
model.addAttribute("user", users);//do I need to create a buddy object instead of continuing to use the user object 

return "BuddyProfile";//is this the same method as the one sbove this? 
}


//need a buddyProfile method in the service layer  
@GetMapping("/buddyprofile/{id}")//load the buddy profile page 
public String buddyProfile(@PathVariable Long id, Model model){
User user = userService.findById(id);
model.addAttribute("user", user);
return "BuddyProfile";
}

@GetMapping("/scheduleworkout")
public String scheduleWorkout(){
return "Schedule Workout";
}

@GetMapping("/buddyrequest")
public String buddyRequest(@ModelAttribute Long id, User user){
userService.buddyRequest(null, user);
return "Schedule Workout";
  }
}
  