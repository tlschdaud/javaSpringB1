<%@ page contentType="text/html; charset=UTF-8" %>
<jsp:userBean id="names" class="java.util.ArrayList" />
<%
    names.add("이름1");
    names.add("이름2");
    names.add("이름3");

    System.out.println(names);
 %>
