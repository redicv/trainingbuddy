<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/css/EditProfile.css"/>
    <title>Edit Profile</title>
   
</head>
<body>
    <jsp:include page="Navbar.jsp"/>
    <div class="editprofile">
        <div class="editbox">
            <h1>Edit Profile</h1>
       
           <form method="post" action="/editprofile"> 

     <label>Profile Picture</label><br>
     <div class="mb-3">
     <input type="text"class="form-control" name="photoUrl" value="${userprofile.photoUrl}" /><br>
     </div>
     <label>First Name</label><br>
    <input type="text"class="form-control" name="firstname" value="${userprofile.firstname}"/><br>
    <label>Last Name</label><br>
    <input type="text" class="form-control"name="lastname"value="${userprofile.lastName}"/><br>
    <label>Address</label><br>
    <input type="text" class="form-control"name="address"value="${userprofile.address}"/><br>
    <label>Phone Number</label><br>
    <input type="text" class="form-control"name="phonenumber"value="${userprofile.phonenumber}"/><br>
    <label>Email</label><br>
    <input type="text" class="form-control"name="email"value="${userprofile.email}"/><br>
    <label>Password</label><br>
    <input type="password"class="form-control" name="password"value="${userprofile.password}"/><br><br>
    <button type="Submit" class="btn btn-primary">Save</button>
          </form>

        </div> 
    </div>
</body>
</html>

