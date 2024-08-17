<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Workouts</title>
    <link rel="stylesheet" href="/css/Workouts.css"/>
</head>

<body>
    <jsp:include page="Navbar.jsp"/>
    <div class="workoutmain">
    <form method="post" action="workout">
     
            
            <c:forEach var="workout" items="${workouts}">
              
                    <a href="/${workout.id}">
                        <div class="workoutmin">

        <div class="workoutitems">       
        <label style="color: black;" for="floatingTextarea"></label> 
        <textarea class="form-control" type="submit" id="floatingTextarea" style="width: 200px;">${workout.date} - ${workout.time} - ${workout.workouttype}</textarea>
        </div>
       

         <div class="remove">
         <a href ="workouts/remove/${workout.id}" class="btn btn-primary">Remove</a><br>
         </div>
         </a>
        
                  
            </div>
            </c:forEach>
            
           <div class="post" style="padding-left: 200px; display:block;">
            <a type="Submit" style="height: 60px; width: 120px;" href ="/buddysearch"class="btn btn-primary">Search Buddy</a>
           </div>
           <div class="post" style="padding-left: 200px; display:block;">
            <a type="Submit" style="height: 60px; width: 120px;" href ="/postworkout"class="btn btn-primary">Post Workout</a>
           </div>
    </div>

</div>
</div>


</form>
</body>
</html>

   <!-- your code on the workouts page will essentially need to display a list of potential workout options -->
        <!-- the workout options are the names of the workouts available  -->
        <!-- We want it to display the workout duration -->
          <!-- we want to display the date/time of the workout -->