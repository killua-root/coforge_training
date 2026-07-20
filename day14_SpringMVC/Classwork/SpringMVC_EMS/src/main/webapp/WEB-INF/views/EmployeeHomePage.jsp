<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>

<link rel="stylesheet" href="EMSStyle.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB"
	crossorigin="anonymous">
</head>

<body>

	<div class="header">
		<h1>Employee Management System</h1>
	</div>

	<br>

	<div class="content">

		<form action="employee" method="post">

			<table class="table table-bordered w-50">

				<tr>
					<td>Employee ID</td>
					<td><input type="text" name="eid" class="form-control"></td>
				</tr>

				<tr>
					<td>Employee Name</td>
					<td><input type="text" name="ename" class="form-control"></td>
				</tr>

				<tr>
					<td>Employee Salary</td>
					<td><input type="text" name="esalary" class="form-control"></td>
				</tr>

				<tr>
					<td>Employee Dept No</td>
					<td><input type="text" name="dno" class="form-control"></td>
				</tr>

			</table>

			<br>

			<input type="submit" name="Insert" value="Insert" class="btn btn-primary">
			<input type="submit" name="Update" value="Update" class="btn btn-warning">
			<input type="submit" name="Delete" value="Delete" class="btn btn-danger">
			<input type="submit" name="Find" value="Find" class="btn btn-info">
			<input type="submit" name="FindAll" value="FindAll" class="btn btn-success">

		</form>

	</div>

	<br>

	<div>
		<b>${result}</b>
	</div>

</body>
</html>