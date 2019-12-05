<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Edit Page</title>
    </head>
    <body>
        <p>This is a simple HTML page that has a form in it.</p>
        <FORM method="post" action="Controller">
            Secret Code ${assist.errors.secretCode}
            <INPUT type="password" name="secretCode" 
                   value="${assist.data.secretCode}">
            <BR>
            Level of Happiness:
            <INPUT type="radio" name="happiness" value="1" 
                ${assist.checked.happiness["1"]}>Elated
            <INPUT type="radio" name="happiness" value="2" 
                ${assist.checked.happiness["2"]}>Ecstatic
            <INPUT type="radio" name="happiness" value="3" 
                ${assist.checked.happiness["3"]}>Joyous
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
            Team ${assist.errors.team}<br>
            <SELECT name="team" multiple size="2"> 
                <OPTION value="heat" ${assist.selected.team["heat"]}>
                    Heat 
                <OPTION value="marlins" ${assist.selected.team["marlins"]}>
                    Marlins 
                <OPTION value="dolphins" ${assist.selected.team["dolphins"]}>
                    Dolphins 
                <OPTION value="panthers" ${assist.selected.team["panthers"]}>
                    Panthers 
            </SELECT> 
            <BR>
            <INPUT type="submit" name="confirmButton" value="Confirm">
        </FORM>
    </body>
</html>
