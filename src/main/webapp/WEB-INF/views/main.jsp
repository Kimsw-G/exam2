<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>안녕</title>
    <meta charset="UTF-8">
</head>
<body>
<div>
    <div>
    <form action="/result" method="post">
    <table>
        <tr>
            <th>연</th>
            <th>월</th>
            <th>지역</th>
        </tr>
        <tr>
            <td>
                <select name="deal_year">
                <c:forEach var="year_" begin="2000" end="2020">
                    <option value="${year_}">${year_}</option>
                </c:forEach>
                </select>
            </td>
            <td>
                <select name="deal_month">
                <c:forEach var="month_" begin="1" end="12">
                    <option value="${month_}">${month_}</option>
                </c:forEach>
                </select>
            </td>
            <td>
                <select name="outer_code">
                <c:forEach items="${list}" var="item">
                    <option value="${item.outer_code}">${item.location}</option>
                </c:forEach>
                </select>
            </td>
        </tr>
    </table>
    <input type="submit" value="go">
    </form>
    </div>
</div>
</body>
</html>
