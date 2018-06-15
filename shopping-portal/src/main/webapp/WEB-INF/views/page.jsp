<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="s" uri="http://www.springframework.org/tags"%>

<s:url var="css" value="/resources/css" />
<s:url var="js" value="/resources/js" />
<s:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shopping portal - ${title}</title>
<script type="text/javascript">
	window.menu = "${title}";
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp-css.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->
		<div class="content">
			<c:if test="${userClick == 'Home'}">
				<%@include file="./home.jsp"%>
			</c:if>
			<c:if test="${userClick == 'About'}">
				<%@include file="./About.jsp"%>
			</c:if>
			<c:if test="${userClick == 'listProduct'}">
				<%@include file="./listProduct.jsp"%>
			</c:if>
			<c:if test="${userClick == 'Contact'}">
				<%@include file="./Contact.jsp"%>
			</c:if>
		</div>

		<!-- /.container -->

		<!-- Footer -->
		<div class="footer">
			<%@include file="./shared/footer.jsp"%>
		</div>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
