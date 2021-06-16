<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>결과!</title>
</head>
<body>
<table>
    <tr>
        <th>거래금액</th>
        <th>건축년도</th>
        <th>거래날짜</th>
        <th>동</th>
        <th>아파트</th>
        <th>전용면적</th>
        <th>지번</th>
        <th>층</th>
    </tr>

    <c:forEach items="${list}" var="item">
    <tr>
        <td>${item.deal_amount}</td>
        <td>${item.build_year}</td>
        <td>${item.deal_year}년${item.deal_month}월${item.deal_day}일</td>
        <td>${item.dong}</td>
        <td>${item.apartment_name}</td>
        <td>${item.area_for_exclusive_use}</td>
        <td>${item.jibun}</td>
        <td>${item.flr}층</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>