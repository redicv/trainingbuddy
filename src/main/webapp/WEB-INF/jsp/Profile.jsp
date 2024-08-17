<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile</title>
    <link rel="stylesheet" href="/css/Profile.css"/>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>

    <form method="post" action="/profile">
    <div class="profile">
    <div class="profilebox"> 
    <div class="m-b-25">
      
    <img src="${user.photoUrl}" style="height: 150px; width: 140px;"/>
   </div>
    <h1>${user.firstname} <br> ${user.lastName}</h1>
    <label>Address:</label>
    <p>${user.address}</p>
    <label>Email:</label>
    <p>${user.email}</p>
    <label>Phone Number:</label>
    <p>${user.phonenumber}</p>
    
    <div>
    <a type="Submit" style="height: 40px; width: 80px;" href ="/editprofile/${user.id}"class="btn btn-primary">Edit</a>
    </div>

    </div>
    </div>
    </form>
</body>
</html>