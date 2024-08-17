<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buddy Profile</title>
    <link rel="stylesheet" href="/css/BuddyProfile.css"/>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>

    <form method="post" action="/buddyprofile">
    <div class="buddyprofile">
    <div class="profileboxtwo"> 
    
    <div class="m-b-25">
    <img src="${user.photoUrl}" style="height: 200px; width: 200px;"/>
    
    <h1>${user.firstname} <br>${user.lastName}</h1>
    <label>Location</label>
    <p>${user.city}, ${user.state}</p>
    <label>Email:</label>
    <p>${user.email}</p>
    <label>Phone Number:</label>
    <p>${user.phonenumber}</p><br>
    <label>Reason for joining:</label>
    <p>${user.reasonforjoining}</p>
     
</div>
        <div>
        <button type="Submit"class="btn btn-primary" href="/scheduleworkout">Schedule Workout</button>
       </div>

    </div>
    </div>
    </form>
</body>
</html>
