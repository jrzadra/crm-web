<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>CRM System</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
	integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.min.js"
	integrity="sha384-fbbOQedDUMZZ5KreZpsbe1LCZPVmfTnH7ois6mU1QK+m14rQ1l2bGBq41eYeM/fS"
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<h3>CRM/WEB - Client register</h3>
		<%@include file="navbar.jsp"%>
		<br>
		<p style="color:blue"><% String message = (String) request.getAttribute("message");
			if(message != null) {
				out.println(message);
			}
		%></p>
		<br>

		<div class="mb-3">
			<h6><label for="nameFormControlInput" class="form-label">Name:</label></h6> 
			<%
			String name = (String) request.getAttribute("name");
			if (name != null) {
				out.println(name);
			}
			%>
		</div>
		<div class="mb-3">
			<h6><label for="cpfFormControlInput" class="form-label">CPF:</label></h6> 
			<%
			String cpf = (String) request.getAttribute("cpf");
			if (cpf != null) {
				out.println(cpf);
			}
			%>
		</div>
		<div class="mb-3">
			<h6><label for="emailFormControlInput" class="form-label">Email:</label></h6>
			
			<%
			String email = (String) request.getAttribute("email");
			if (email != null) {
				out.println(email);
			}
			%>
		</div>
		<div class="mb-3">
			<h6><label for="phoneNumberFormControlInput" class="form-label">Phone
				Number:</label></h6> 
			<%
			String phoneNumber = (String) request.getAttribute("phoneNumber");
			if (phoneNumber != null) {
				out.println(phoneNumber);
			}
			%>
		</div>
		<div class="mb-3">
			<h6><label for="birthDateFormControlInput" class="form-label">Birth
				Date:</label></h6> 
			<%
			String birthDate = (String) request.getAttribute("birthDate");
			if (birthDate != null) {
				out.println(birthDate);
			}
			%>
		</div>
		<div class="mb-3">
			<h6><label for="dataFormControlInput" class="form-label">Gender:</label></h6>
			
			<%
			String gender = (String) request.getAttribute("gender");
			if (gender != null) {
				out.println(gender);
			}
			%>
		</div>
		<div class="mb-3">
			<h6><label for="addressFormControlTextarea" class="form-label">Address:</label></h6>
			
			<%
			String address = (String) request.getAttribute("address");
			if (address != null) {
				out.println(address);
			}
			%>
		</div>
	</div>


</body>
</html>