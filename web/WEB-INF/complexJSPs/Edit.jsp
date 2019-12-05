<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Edit Page</title>
    </head>
    <body>
        <p>Give us some information about your operation</p>
        <p> This is a tool for helping you find the right fertilizer for your business.
            <br>
            We specialize in three popular mixes of nitrogen, phosphorus and potassium.  
            <br> 
            Each mixture of these three fertilizers is specially formulated based on your usage
            <br> 
            your crops and the region of the country in which you are.
</p>
        <FORM method="post" action="Controller">
            Customer ID ${assist.errors.password}
            <INPUT type="password" name="password" 
                   value="${assist.data.password}">
            <BR>
            Crop Type: ${assist.errors.crop}
            <INPUT type="checkbox" name="crop" value="feed" 
                ${assist.checked.crop["feed"]}>Feed Crop
            <INPUT type="checkbox" name="crop" value="food" 
                ${assist.checked.crop["food"]}>Food Crop
            <INPUT type="checkbox" name="crop" value="fiber" 
                ${assist.checked.crop["fiber"]}>Fiber Crop
            <BR>
            Acres
            <TEXTAREA name="acres">${assist.data.acres}</TEXTAREA>
            <BR>
            Region 
            <SELECT name="region"> 
                <OPTION value="4" ${assist.selected.region["4"]}>Southeast
                <OPTION value="3" ${assist.selected.region["3"]}>Northeast 
                <OPTION value="2" ${assist.selected.region["2"]}>Southwest
                <OPTION value="1" ${assist.selected.region["1"]}>Northwest
              
            </SELECT> 
            <BR>
            Land Use ${assist.errors.land}<br>
            <SELECT name="land" multiple size="2"> 
                <OPTION value="commercial" ${assist.selected.land["commercial"]}>
                    Commercial 
                <OPTION value="residential" ${assist.selected.land["residential"]}>
                    Residential
               
            </SELECT> 
            <BR>
            <INPUT type="submit" name="confirmButton" value="Confirm">
        </FORM>
    </body>
</html>
