<html>
<body>

<h3>Hello world java</h3>

the time on the server is:

<%= new java.util.Date() %>

<% 
//Some java code:
int x = 2; 
int z = 3;
int sum = z + x;


out.println("<br>" + sum + "<br>");
%>

<jsp:include page="includedFile.jsp"></jsp:include>

</body>
</html>
