<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="row">
    <ul class="nav">
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/posts.do">Вакансии</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/candidates.do">Кандидаты</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/post/edit.jsp">Добавить вакансию</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/candidate/edit.jsp">Добавить кандидата</a>
        </li>
        <li class="nav-item">
            <c:choose>
                <c:when test="${user == null}">
                    <a class="nav-link" href='<c:url value="/login.jsp"/>'>
                        Anonymous | Войти
                    </a>
                </c:when>
                <c:otherwise>
                    <a class="nav-link" href='<c:url value="/logout.do"/>'>

                    </a>
                </c:otherwise>
            </c:choose>
        </li>
        <c:if test="${user != null}">
            <li class="nav-item">
                <a class="nav-link" href='<c:url value="/logout.do"/>'>Выйти</a>
            </li>
        </c:if>
        <li class="nav-item">
            <a class="nav-link" href="<%=request.getContextPath()%>/reg.jsp">Регистрация</a>
        </li>
    </ul>
</div>
</body>
</html>
