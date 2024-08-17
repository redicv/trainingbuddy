<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signin</title>
    <link rel="stylesheet" href="/css/Signin.css"/>
</head>
<body>
    <jsp:include page="Navbar.jsp"/>
    <Form method="Post" action="/signin">
     
    <div class="Signinform">
    <div class="Signinbox">
    <h1>Sign-In</h1>
    <div class="mb-3">
    <label>Email</label><br>
    <input type="exampleInputEmail1" class="form-control" name="email" placeholder="Email"><br>
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