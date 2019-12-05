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
            Password ${assist.errors.password}
            <INPUT type="password" name="password" 
                   value="${assist.data.password}">
            <BR>
            
            <BR>
            Preferred Extras: ${assist.errors.extra}
            <INPUT type="checkbox" name="extra" value="sprinkles" 
                ${assist.checked.extra["sprinkles"]}>Chocolate Sprinkles
            <INPUT type="checkbox" name="extra" value="fudge" 
                ${assist.checked.extra["fudge"]}>Hot Fudge
            <INPUT type="checkbox" name="extra" value="cream" 
                ${assist.checked.extra["cream"]}>Whipped Cream
            <BR>
            Comments
            <TEXTAREA name="comments">${assist.data.comments}</TEXTAREA>
            <BR>
            Grade 
            <SELECT name="grade"> 
                <OPTION value="4.00" ${assist.selected.grade["4.0"]}>A 
                <OPTION value="3.67" ${assist.selected.grade["3.67"]}>A- 
                <OPTION value="3.33" ${assist.selected.grade["3.33"]}>B+ 
                <OPTION value="3.00" ${assist.selected.grade["3.0"]}>B 
                <OPTION value="2.67" ${assist.selected.grade["2.67"]}>B- 
                <OPTION value="2.33" ${assist.selected.grade["2.33"]}>C+ 
                <OPTION value="2.00" ${assist.selected.grade["2.0"]}>C 
            </SELECT> 
            <BR>
            Land Use ${assist.errors.land}<br>
            <SELECT name="land" multiple size="2"> 
                <OPTION value="heat" ${assist.selected.land["heat"]}>
                    Heat 
                <OPTION value="marlins" ${assist.selected.land["marlins"]}>
                    Marlins 
                <OPTION value="dolphins" ${assist.selected.land["dolphins"]}>
                    Dolphins 
                <OPTION value="panthers" ${assist.selected.land["panthers"]}>
                    Panthers 
            </SELECT> 
            <BR>
            <INPUT type="submit" name="confirmButton" value="Confirm">
        </FORM>
    </body>
</html>
