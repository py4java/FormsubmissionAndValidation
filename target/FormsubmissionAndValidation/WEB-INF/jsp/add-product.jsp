<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<h2>Add Product</h2>
	<form:form modelAttribute="addProductForm">
	ProductName:<form:input path="productName" />
		<p style="color: red;">
			<form:errors path="productName" />
		</p>
		<br />
	Description:<form:input path="description" />
		<p style="color: red;">
			<form:errors path="description" />
		</p>
		<br />
	Manufacturer:<form:input path="manufacturer" />
		<p style="color: red;">
			<form:errors path="manufacturer" />
		</p>
		<br />
	Warranty Months:<form:input path="warrantyMonths" />
		<p style="color: red;">
			<form:errors path="warrantyMonths" />
		</p>
		<br />
	Price:<form:input path="price" />
		<p style="color: red;">
			<form:errors path="price" />
		</p>
		<br />
		<input type="submit" value="add product">
	</form:form>
</body>
</html>