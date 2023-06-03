<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<h3>SQL JSTL Demo</h3>
<%@ taglib prefix ="fn" uri ="http://java.sun.com/jsp/jstl/functions" %>

<c:set var="str1" value="ABCD"></c:set>
<c:set var="str2" value="ABC"></c:set>
<c:if test="${fn:contains(str1,str2)}">
YES it contains
</c:if>

<sql:setDataSource var="ecommerce" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/ecommerce" user="root" password="root" />
		
<sql:query dataSource="${ecommerce}" sql="SELECT * FROM eproduct" var="result" />

<table border=1>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Date Added</th>

		</tr>
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.id}" /></td>
				<td><c:out value="${row.name}" /></td>
				<td><c:out value="${row.price}" /></td>
				<td><c:out value="${row.date_added}" /></td>
				<td><a href="product-details?id=${row.id}" />Clicker for product details</a></td>
				
			</tr>
		</c:forEach>
	</table>