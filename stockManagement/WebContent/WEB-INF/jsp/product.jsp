
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Product page</h1>
<form action="productStore" method="post" >
<input type="text" name="pname" placeholder="Product Name"><br>
<input type="text" name="pcategory" placeholder="Product Category"><br>
<input type="text" name="company" placeholder="Company Name"><br>
<input type="number" name="quantity" placeholder="Enter Quantity"><br>
<input type="number" name="price" placeholder="Enter Price"><br>
<input  type="submit" value="Add">
</form>
</body>
</html>