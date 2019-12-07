<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="utf-8">
    <title>Login Page</title>
  </head>
  <body>
      <h1>Login Page</h1>
    <p>Please enter your account number 
       to access your data.
    <form method="POST" action="Controller">
      <p>
        Account Number ${assist.client.accountNumber}
        <input type="text" name="accountNumber" 
               value="${assist.client.accountNumber}">
        <input type="submit" name="loginButton" 
               value="Login">
      </p> 
    </form>
  </body>
</html>
