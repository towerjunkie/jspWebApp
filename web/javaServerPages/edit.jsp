<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="utf-8">
        <title>Edit Page</title>
        <link rel="stylesheet"
              href="/styles/stylesheet.css"
              type="text/css">
    </head>
    <body>
        <h1> Give us some information about your operation </h1>
        <p>
            This is a tool for helping you find the right fertilizer for your business.
            <br>
            We specialize in three popular mixes of nitrogen, phosphorus and potassium.  
            <br> 
            Each mixture of these three fertilizers is specially formulated based on your usage
            <br> 
            your crops and the region of the country in which you are.

        <form action="Controller">
            <p>

            <p>

                Commercial or Residential: <input type="text" name="usage" 
                                                  value="${helper.data.usage}">
                <br>

                Food crop, Feed crop, Fiber crop: <input type="text" name="crop" 
                                                         value="${helper.data.crop}">
                <br>

                Southeast, Northeast, Southwest, Northwest: <input type="text" name="region" 
                                                                   value="${helper.data.region}">
                <br>
                <input type="submit" name="confirmButton" 
                       value="Confirm">     
        </form>
    </body>
</html>
