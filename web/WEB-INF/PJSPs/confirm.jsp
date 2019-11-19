<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm page</title>
        <link rel="stylesheet"
              href="/styles/stylesheet.css"
              type="text/css">
    </head>
    <body>
        <h1>Confirmation</h1>
                
        <p>
        Please use this page to look over your choices and make sure that you've
        <br> chosen your fields correctly.
        <br> It is important that your usage, crop type and region are correct so that 
        <br> we may provide the proper quantity for your needs. 
        </p>
        <br>
        <ol>
        <li>${assist.client.land}.</li> 
        <li>${assist.client.crop}.</li> 
        <li>${assist.client.region}.</li> 
        <li>${assist.client.acres}</li> 
        </ol>
       
        
        <form method="POST" action="Controller">

            <p></p>
            <em> Press edit to go back</em>
            <p></p>
            <em> Press process to confirm </em>
            <p></p>
            <br>
          
            <br>
            <input type="Submit" name="editButton" value="Edit">

            <input type="Submit" name="processButton" value="Process">
            
            
            
           
            
            
        </form>

    </body>
</html>
