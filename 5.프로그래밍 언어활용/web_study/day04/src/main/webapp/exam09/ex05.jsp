<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<util:max num1="100" num2="200" />
%{max}
<br>
<util:min var="num" num1="100" num2="200" />
${num}