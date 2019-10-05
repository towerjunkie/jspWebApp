<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="utf-8">
        <title>Edit Page</title>
        <link rel="stylesheet"
              href="/dllan011/Styles/Styles.css"
              type="text/css">
    </head>
    <body>
        <p>
            This is a tool for helping you find the right fertilizer for your business.
            <br>
            We specialize in three popular mixes of nitrogen, phosphorus and potassium.  
            <br> 
            Each mixture of these three fertilizers is specially formulated based on your crops
            <br> 
            your usage and the region of the country in which you are in. 

        <form action="Controller">
            <p>

            <p>

                Commercial or Residential: <input type="text" name="hobby" 
                                                  value="${helper.data.hobby}">
                <br>

                Food crops, Fiber crops, Feed crops: <input type="text" name="name" 
                                                           value="${helper.data.name}">
                <br>
                Southeast, Northeast, Southwest, Northwest: <input type="text" name="name" 
                                                                value="${helper.data.name}">

                <input type="submit" name="confirmButton" 
                       value="Confirm">     
        </form>
    </body>
</html>