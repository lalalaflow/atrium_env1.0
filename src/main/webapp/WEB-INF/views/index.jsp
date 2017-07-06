<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<!-- jQuery -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/jquery-3.2.1.min.js" ></script>
<!-- Real Grid -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/realgrid/realgridjs-lic.js" ></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/realgrid/realgridjs_eval.1.1.23.min.js" ></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/realgrid/realgridjs-api.1.1.23.js" ></script>
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/realgrid/jszip.min.js" ></script>
<!-- eCharts -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/js/echars/echarts.min.js" ></script>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  Welcome!
</h1>

<P>  The time on the server is <c:out value="${serverTime}" />. </P>
<P>  The Context Path is <c:out value="${pageContext.servletContext.contextPath == '' ? '/':pageContext.servletContext.contextPath }" />. </P>
</body>
</html>