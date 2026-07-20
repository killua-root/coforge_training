<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Management System</title>

<link rel="stylesheet" href="EMSStyle.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>

	<div class="header">
		<h1>Product Management System</h1>
	</div>

	<br>

	<div class="content">

		<form action="product" method="post">

			<table class="table table-bordered w-50">

				<tr>
					<td>Product ID</td>
					<td><input type="text" name="pid" class="form-control"></td>
				</tr>

				<tr>
					<td>Product Name</td>
					<td><input type="text" name="pName" class="form-control"></td>
				</tr>

				<tr>
					<td>Product Price</td>
					<td><input type="text" name="pPrice" class="form-control"></td>
				</tr>

				<tr>
					<td>Product Quantity</td>
					<td><input type="text" name="pQty" class="form-control"></td>
				</tr>

			</table>

			<br>

			<input type="submit" name="Insert" value="Insert"
				class="btn btn-primary">

			<input type="submit" name="Update" value="Update"
				class="btn btn-warning">

			<input type="submit" name="Delete" value="Delete"
				class="btn btn-danger">

			<input type="submit" name="Find" value="Find"
				class="btn btn-info">

			<input type="submit" name="FindAll" value="FindAll"
				class="btn btn-success">

		</form>

	</div>

	<br>

	<div>
		<b>${result}</b>
	</div>

</body>
</html>