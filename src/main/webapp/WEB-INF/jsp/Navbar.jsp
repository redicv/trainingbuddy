<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" integrity="sha512-Z0FgO0+2zJVWdB9GVKd2c4l/RrA2E8J/i4WdULg0swR+HEuBgp62oG9mZ+RgfVf9W36p+PnsJBaXLbWB/5vziA==" crossorigin="anonymous" />
    <link rel="stylesheet" href="/css/Navbar.css"/>
    <title>Navbar</title>
</head>
<body>
   

    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <div class="container-fluid">
          <a class="navbar-brand" href="/">
            <img src="https://t4.ftcdn.net/jpg/01/62/42/09/240_F_162420902_nU5hnvuGSCaDy4ja3StuTCYybafONrH0.jpg" height="25px" width="35px"/>
          </a>
        
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
        
              
         <c:if test="${empty sessionScope.user}">
          <li class="nav-item">
            <a class="nav-link" href="/signin">Members</a>
          </li>
              <li class="nav-item">
                <a class="nav-link" href="/signup">Sign-up</a>
              </li>
            </c:if>
  <!-- sessionScope is a way to access attributes that are stored in the 'httpsession' object  -->
             
            <c:choose>

              <c:when test="${not empty sessionScope.user}">
             <li class="nav-item">
                <a class="nav-link" href="/profile">Profile</a>
             </li>
             <li class="nav-item">
              <a class="nav-link" href="/workouts">Workouts</a>
            </li>
            <!-- <li class="nav-item">
              <a class="nav-link" href="/postworkout">Post Workout</a>
            </li> -->
                <li class="nav-item">
                  <a class="nav-link" href="/logout">Logout</a>
                </li>
              </c:when>
           
          </c:choose>
            </div>
                
              
            </ul>

          </div>
          </div>
       
      </nav>
    
    

</body>
</html>









</body>
</html>
