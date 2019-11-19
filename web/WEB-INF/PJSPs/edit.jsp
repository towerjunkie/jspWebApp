<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="utf-8">
        <title>Edit Page</title>
        <link rel="stylesheet"
              href="/styles/stylesheet.css"
              type="text/css">
        <style>
            table, th, td {
                border: 1px solid black;
            }
        </style>
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

        <form method="POST" action="Controller">
            <p>

            <p>

               
                <br>
            <table style="width:30%">
                <tr>
                    <th>Table</th>
                    <th>Output</th>
                </tr>
                <tr>
                    <td>Commercial or Residential:</td>
                    <td><input type="text" name="land" 
                                                  value="${assist.client.land}"></td>
                </tr>
                <tr>
                    <td>Food crop, Feed crop, Fiber crop:</td>
                    <td><input type="text" name="crop" 
                                                         value="${assist.client.crop}"></td>
                </tr>
                <tr>
                    <td>Southeast (1), Northeast (2), Southwest (3), Northwest (4):</td>
                    <td><input type="text" name="region" 
                               value="${assist.client.region}"> ${assist.errors.region}</td>
                </tr>
                <tr>
                    <td>Acres of your farm:</td>
                    <td><input type="text" name="acres" 
                               value="${assist.client.acres}"> ${assist.errors.acres}</td>
                </tr>

            </table>

            <br>

            <br>                              
            <input type="submit" name="confirmButton" value="Confirm">     
        </form>
    </body>
</html>