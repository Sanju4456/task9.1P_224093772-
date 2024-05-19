<html>
<body>

<h2>HTML Forms</h2>

<div>${message}</div><br/><br/>

<form action="http://127.0.0.1:8080/login" method="post">
  <label for="username">User name:</label><br>
  <input type="text" id="username" name="username"><br>
  <label for="passwd">Password:</label><br>
  <input type="password" id="passwd" name="passwd"><br>
  <label for="dob">DoB:</label><br>
  <input type="date" id="dob" name="dob"><br><br>   
<html>
<body>

<h2>Q1</h2>

<div>${message}</div><br/><br/>

<form action="http://127.0.0.1:8080/q1" method="post">
  <label for="number1">First number:</label><br>
  <input type="text" id="number1" name="number1"><br>
  <label for="number2">Second number:</label><br>
  <input type="text" id="number2" name="number2"><br>
  <label for="result">ADD:</label><br>
  <input type="text" id="result" name="result"><br><br>   
  <input type="submit" value="Submit">
</form> 

</body>
</html>
</form> 

<p>If you click the "Login" button, the form-data will be sent to login-servlet.</p>

</body>
</html>