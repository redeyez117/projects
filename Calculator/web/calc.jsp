
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculation Page</title>
    </head>
    <body>
        
       <jsp:useBean id="bean" class="com.list.Bean" />
       <jsp:setProperty name="bean" property= "number1"
                        value='<%= request.getParameter("number1") %>'/>
       <jsp:setProperty name="bean" property="operation"
                        value='<%= request.getParameter("operation") %>'/>
       <jsp:setProperty name="bean" property="number2"
                        value='<%= request.getParameter("number2") %>'/>
                        
       <jsp:getProperty name="bean" property="result"/>
    </body>
</html>
