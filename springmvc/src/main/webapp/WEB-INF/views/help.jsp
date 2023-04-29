<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

           //without using jspel
<%-- 
        <%  String name=(String)request.getAttribute("name");%>  
               <h1>Name is <%=name %></h1>  --%>
        
       //while using jspel
                <h1>${name }</h1> 
       
       
       
       
</body>
</html>