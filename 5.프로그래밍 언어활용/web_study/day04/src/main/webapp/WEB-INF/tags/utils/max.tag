<%@ tag body-content="empty" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ attribute name="num1" type="java.lang.Integer" required="true" %>
<%@ attribute name="num2" type="java.lang.Integer" required="true" %>
<%@ variable name-given="max" variable-0class="java.lang.Integer" scope="AT_END" %>

<%
    int result = num1;
    if(num2 > num1) {
        result = num2;
    }
 %>
 <c:set var="max" value="<%=result%>" />
