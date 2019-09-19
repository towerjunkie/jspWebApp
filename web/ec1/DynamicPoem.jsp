<%-- 
    Document   : DynamicPoem
    Created on : Sep 2, 2019, 11:51:03 AM
    Author     : dllan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8>
        <title>Dynamic Poem</title>
          <link rel="stylesheet"
              href="/Tutorials/styles/tutorialStyle.css"
              type="text/css">
    </head>
    <body>
        <h2>Constant Reader</h2>
        <p>
           “You just couldn't get hold of the things you had done and turn them right again.
           Such power might be given to the gods, but it was not given to men and women - that was probably a good thing.
           Had it been otherwise, people would die of old age still trying to rewrite their teens."
           -Stephen King
        </p>
        
        <form>
            Finish the poem below with a final line<br>
            Last line of poem:<input type="text" value="${param.lastline}" name="lastline">
            <input type="Submit" value="Add last line" name="buttonLastline">
        </form>
        
        <p>
            See the turtle of enormous girth<br>
            On his shell he holds the earth.<br>
            If you want to run and play,<br>
            <strong>${param.lastline}</strong>
            
        </p>
           
        <p>
        <a href="../">Index </a>
        </p>
        
    </body>
</html>