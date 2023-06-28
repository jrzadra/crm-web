<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
		
		<form action="register" method="post" class="ClientRegisterForm">
		
		<p style="color:blue"> <% String message = (String) request.getAttribute("message");
			if(message != null) {
				out.println(message);
			}
		%></p>
		<br>
		
		<div class="mb-3">
			<label for="nameFormControlInput" class="form-label">Name</label> <input
				type="text" class="form-control" id="nameFormControlInput"
				name="name" placeholder="Full name">
		</div>

		<div class="mb-3">
			<label for="cpfFormControlInput" class="form-label">CPF</label> <input
				type="text" class="form-control" id="cpfFormControlInput" name="cpf"
				placeholder="CPF">
		</div>

		<div class="mb-3">
			<label for="emailFormControlInput" class="form-label">Email</label> <input
				type="text" class="form-control" id="emailFormControlInput"
				name="email" placeholder="Email">
		</div>

		<div class="mb-3">
			<label for="phoneNumberFormControlInput" class="form-label">Phone
				Number</label> <input type="text" class="form-control"
				id="phoneNumberFormControlInput" name="phoneNumber"
				placeholder="Phone Number">
		</div>

		<div class="mb-3">
			<label for="birthDateFormControlInput" class="form-label">Birth
				Date</label> <input type="text" class="form-control"
				id="birthDateFormControlInput" name="birthDate"
				placeholder="Birth Date">
		</div>
		<div class="mb-3">
			<label for="dataFormControlInput" class="form-label">Gender</label>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="feminine-check"
					id="flexRadioDefault"> <label class="form-check-label"
					for="flexRadioDefault"> Feminine </label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="masculine-check"
					id="flexRadioDefault"> <label class="form-check-label"
					for="flexRadioDefault"> Masculine </label>
			</div>
			<div class="form-check">
				<input class="form-check-input" type="radio" name="other-check"
					id="flexRadioDefault"> <label class="form-check-label"
					for="flexRadioDefault"> Other </label>
			</div>
		</div>
		<div class="mb-3">
			<label for="addressFormControlTextarea" class="form-label">Address</label>
			<textarea class="form-control" id="addressFormControlTextarea" name="address"
				rows="3"></textarea>
		</div>
		
		<button type="button" class="btn btn-dark">Save</button>
		</form>
</body>
</html>