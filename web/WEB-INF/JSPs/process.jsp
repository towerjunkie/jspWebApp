<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process </title>
        <link rel="stylesheet"
              href="/styles/stylesheet.css"
              type="text/css">
    </head>
    <body>
        <h1>Your information is being processed!</h1>
        <p>
        Please look over this information and make sure it matches the
        <br> specifications exactly so that we may provide a fertilizer
        <br> to keep you running.
        </p>

        Your usage is <strong>${assist.client.usage}</strong>
        <br>
        your crop is <strong>${assist.client.crop}</strong>
        <br>
        Your region is <strong>${assist.client.region}</strong>.
        <br>
        Size in acres of your farm is <strong>${assist.client.acres}</strong>
        <br>
        The total amount of fertilizer you need is <strong>${assist.client.calculation}</strong> gal/acres.
        <form action="Controller">
           
            <p>
                <input type="submit" name="editButton" 
                       value="Edit">
        </form>

    </body>
</html>
