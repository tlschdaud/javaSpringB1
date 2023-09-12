<%@ tag body-content="scriptless" pageEncoding="UTF-8" trimDirectiveWhitespace="true" %>
<%@ taglib prefix="layout" tagdir="/WEB-INF/tags/layouts" %>
<%@ attribute name="pageTitle" %>
<layout:common pageTitle="${pageTitle}">
    <jsp:attribute name="header">
        <h1>main헤더</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
        <h1>main푸터</h1>
    </jsp:attribute>
    <jsp:body>
        <jsp:doBody />
    </jsp:body>
</layout:common>