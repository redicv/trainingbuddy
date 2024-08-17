package com.nexttune.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexttune.model.User;
import java.util.List;
import com.nexttune.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class UserService {

@Autowired
UserRepository userRepository;

public User signUp(User user){

User saveduser = userRepository.save(user);

return saveduser;

 }
    
public User findById(Long id){

 User user = userRepository.findById(id).orElse(null);
//what is the meaninig behind .orElse(other:null)?
 return user;
}

public User signIn(User user) throws Exception{
//method declarations--???
      //check whether the buyer exists in the database, using their email
    
      User foundUser = userRepository.findByEmail(user.getEmail());
      
    
      if (foundUser == null) {
    
        //null means empty 
        //checking if the user repository found anything in the database with
        // the entered email 
       throw new Exception("User not found");
     }
    
        //check if the password from the foundUser in the database matches
        // the password from the user entered in the view/jsp page
        if(!foundUser.getPassword().equals(user.getPassword())){
          throw new Exception("Invalid credentials.Wrong password");
        }
          return foundUser;
      }

public User editProfile(User user, HttpSession session){
  
User sessionUser = (User) session.getAttribute("user");

User editeduser = userRepository.findById(sessionUser.getId()).orElse(null);

editeduser.setFirstname(user.getFirstname());
editeduser.setLastName(user.getLastName());
editeduser.setAddress(user.getAddress());
editeduser.setEmail(user.getEmail());
editeduser.setPhonenumber(user.getPhonenumber());

return userRepository.save(editeduser);

  
  }
 
    //methods for finding training buddy
  public List<User> searchBuddy(){

    List<User> searchBuddy = userRepository.findAll();

    return searchBuddy;
  }

  public List<User> searchForBuddy(){

    List<User> searchForBuddy = userRepository.findAll();

    return searchForBuddy;
  }

  public User requestBuddy(Long id, User user){

   User requestBuddy = userRepository.findById(id).orElse(null);

    return requestBuddy;
  }
  // public User requestBuddy(Long id, User user){
   
  //   List<User> requestBuddy = userRepository.findAll();
  // }


  public User buddyRequest(Long id, User user){

    User buddyRequest = userRepository.save(null);

    return buddyRequest;
  }
}
   
   


