<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:useBean id="book" class="models.book.Book" scope="request" />
<%--
<jsp:setProperty name="book" property="title" />
<jsp:setProperty name="book" property="author" />
<jsp:setProperty name="book" property="publisher" />
--%>

<jsp:setProperty name="book" property="*" />
<jsp:setProperty name="book" property="title" param="booknm"/>
제목 : <jsp:getProperty name="book" property="title" /> <br>
저자 : <jsp:getProperty name="book" property="author" /> <br>
출판사 : <jsp:getProperty name="book" property="publisher"/><br>