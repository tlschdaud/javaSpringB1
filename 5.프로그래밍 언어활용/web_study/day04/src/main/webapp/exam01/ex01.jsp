<%@ page contentType="text/html; charset=UTF-8" %>
<%
    int num1 = 10;
    int num2 = 20;
    int result= num1+num2;
    out.write(num1 + " + " + num2 + " = " + result);
%>
<%=num1%> + <%=num2%>
<%!
    int num1 = 10;
    int num2 = 20;

    int add(int num1, int num2) {
    return num1 + num2;
    }
%>