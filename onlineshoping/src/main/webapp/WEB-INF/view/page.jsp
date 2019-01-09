<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>online shopping - ${title}</title>
<script>
 window.menu= '${title}';

</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<!-- Navigation -->
	<!-- adding navigation code -->
	<%@include file="./shared/navigation.jsp"%>
	<!-- Page Content -->
	<!--add page content  -->
	<c:if test="${userClickHome == true}">
		<%@include file="home.jsp"%>
	</c:if>
	
	<c:if test="${userClickAbout == true}">
		<%@include file="about.jsp"%>
	</c:if>
	<c:if test="${userClickContact == true}">
		<%@include file="contact.jsp"%>
	</c:if>
	
	<!--load when user clickAllProduct or clickCategoryProduct  -->
   <c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
		<%@include file="listProducts.jsp"%>
	</c:if>
	<!-- /.container -->

	<!-- Footer -->
	<!--adding footer code  -->
	<%@include file="./shared/footer.jsp"%>

	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>
	<script src="${js}/myapp.js"></script>



<script>
var checkvalue = window.location.pathname;
alert(checkvalue); 
$("#menu li a").each(function () {
   if ($(this).attr('href') == checkvalue) {
       $(this).addClass("active");
   }
});


</script>
</body>

</html>
