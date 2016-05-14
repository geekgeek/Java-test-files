//xmlfile:
<?xml version="1.0" encoding="utf-8"?>

<xmldata>
    <student>
        <RegistrationNo>1</RegistrationNo>
        <StudentID>1110708058</StudentID>
        <Name>Jatin</Name>
        <FName>Patel</FName>
    </student>
    <student>
        <RegistrationNo>2</RegistrationNo>
        <StudentID>1110708048</StudentID>
        <Name>Ashvin</Name>
        <FName>Patel</FName>
    </student>
</xmldata>


<%@ page contentType="text/html; charset=utf-8" language="java" import="javax.xml.parsers.DocumentBuilderFactory,javax.xml.parsers.DocumentBuilder,org.w3c.dom.*" errorPage="" %>
<%
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

DocumentBuilder db = dbf.newDocumentBuilder();

Document doc = db.parse("firstxml.xml");

NodeList RegistrationNo = doc.getElementsByTagName("RegistrationNo");
NodeList StudentId = doc.getElementsByTagName("StudentID");
NodeList Name = doc.getElementsByTagName("Name");
NodeList FName = doc.getElementsByTagName("FName");
%>

<html>
<head></head>
<body>
<%
int i;
for(i=0;i<=RegistrationNo.getLength()-1;i++)
{
	out.print("{item:'");
	out.print(Name.item(i).getFirstChild().getNodeValue());
	out.print("', code:'");
	out.print(FName.item(i).getFirstChild().getNodeValue());
	out.print("'},");
}
%>

</body>
</html>
