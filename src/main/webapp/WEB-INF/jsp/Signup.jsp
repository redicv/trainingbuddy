<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup</title>
    <link rel="stylesheet" href="/css/Signup.css"/>
</head>
<body>
<jsp:include page="Navbar.jsp"/>

<Form method="Post" action="/signup">
   
<div class="Signupbox">
<div class="Signupform">
<h1>Sign-Up</h1>
<div class="mb-3">
<label>First Name</label><br>
<input type="text" class="form-control" name="firstname" placeholder="First Name"><br>
</div>

<div class="mb-3">
<label>Last Name</label><br>
<input type="text" class="form-control" name="lastname" placeholder="Last Name"><br>
</div>
<div class="mb-3">
<label>Phone Number</label><br>
<input type="text" class="form-control" name="phonenumber" placeholder="Phone Number"><br>
</div>
<div class="mb-3">
<label>Username</label><br>
<input type="text" class="form-control" name="username" placeholder="Username">
</div>
<div class="mb-3">
<label>Email</label><br>
<input type="exampleInputEmail1" class="form-control" name="email" placeholder="Email"><br>
<div id="emailHelp">We'll never share your email with anyone else.</div>
</div>
<div class="mb-3">
<label>Password</label><br>
 <input type="password" class="form-control" name="password"placeholder="Password"/><br>
 <button type="Submit"class="btn btn-primary">Submit</button>
</div>

</div>
</div>
    </Form>
</body>
</html>