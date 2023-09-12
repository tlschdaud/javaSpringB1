<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<util:forEach var="num" begin="1" end="10">
    %{num}<br>
</util:forEach>