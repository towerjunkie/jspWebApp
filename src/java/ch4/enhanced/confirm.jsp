<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm page</title>
        <link rel="stylesheet"
              href="/dllan011/Styles/Styles.css"
              type="text/css">
    </head>
    <body>
        <h1>Confirmation</h1>
                
        <p>
        Please use this page to look over your choices and make sure that you've
        <br> chosen your fields correctly.
        <br> It is important that your usage, crop type and region are correct so that 
        <br> we may provide the best fertilizer for your needs. 
        </p>
        <br>
        Your usage is  <strong>${helper.data.usage}.</strong> <br>
        Your crop is <strong>${helper.data.crop}.</strong> <br>
        Your region is <strong>${helper.data.region}.</strong> <br>
        
        <form action ="Controller">

            <p></p>
            <em> Press edit to go back</em>
            <p></p>
            <em> Press process to confirm </em>
            <p></p>
            <br>
          
            <br>
            <input type="Submit" name="editButton" value="Edit">

            <input type="Submit" name="processButton" value="Process">
            
            <input type="Submit" name="wishList" value="Send to Wishlist">
        </form>

    </body>
</html>
