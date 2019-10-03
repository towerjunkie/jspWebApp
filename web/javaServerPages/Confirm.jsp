<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirm page</title>
    </head>
    <body>
        <p>This is the confirm page for Two Pages Folder</p>
        <br>
        The name that was sent from edit page was <strong>${helper.data.hobby}.</strong> <br>
        The hobby that was sent from edit page was <strong>${helper.data.name}.</strong> 
        <form action ="Controller">

            <p></p>
            <em> If there is an error please press the "EDIT" button</em>
            <p></p>
            <em> If everything is good press Process </em>
            <p></p>
            <br>
            <input type="hidden" name="name" value="${helper.data.name}">
            <input type="hidden" name="hobby" value="${helper.data.hobby}">
            <input type="Submit" name="editButton" value="Edit">

            <input type="Submit" name="processButton" value="Process">
        </form>

    </body>
</html>
