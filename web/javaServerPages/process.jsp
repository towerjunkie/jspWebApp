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

        Your usage is <strong>${helper.data.usage}</strong>
        <br>
        your crop is <strong>${helper.data.crop}</strong>
        <br>
        Your region is <strong>${helper.data.region}</strong>.

        <form action="Controller">
            <input type="hidden" name="usage" 
                   value="${helper.data.usage}">
            <input type="hidden" name="crop" 
                   value="${helper.data.crop}">
            <input type="hidden" name="region" 
                   value="${helper.data.region}">
            <p>
                <input type="submit" name="editButton" 
                       value="Edit">
        </form>

    </body>
</html>
