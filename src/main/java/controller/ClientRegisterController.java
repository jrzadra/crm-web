package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientRegisterController
 */
@WebServlet("/ClientRegisterController")
public class ClientRegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ClientForm clientForm = new ClientForm();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClientRegisterController() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ClientForm clientForm = createClientForm(request);
		String message = "";

		if (checkAllFilledFields(clientForm)) {
			message = "Registration completed!";

			request.setAttribute("message", message);
			changeClientsAttributes(request, clientForm);

			RequestDispatcher dispatcher = request.getRequestDispatcher("list.jsp");
			dispatcher.forward(request, response);
		} else {
			message = "Please, fill in all the fields.";
			request.setAttribute("message", message);
			changeClientsAttributes(request, clientForm);

			RequestDispatcher dispatcher = request.getRequestDispatcher("register.jsp");
			dispatcher.forward(request, response);
		}

		System.out.println(clientForm.getFullName());
		System.out.println(clientForm.getCpf());
		System.out.println(clientForm.getEmail());
		System.out.println(clientForm.getPhoneNumber());
		System.out.println(clientForm.getBirthDate());
		System.out.println(clientForm.getGender());
		System.out.println(clientForm.getAddress());
	}

	private void changeClientsAttributes(HttpServletRequest request, ClientForm clientForm) {
		request.setAttribute("name", clientForm.getFullName());
		request.setAttribute("cpf", clientForm.getCpf());
		request.setAttribute("email", clientForm.getEmail());
		request.setAttribute("phoneNumber", clientForm.getPhoneNumber());
		request.setAttribute("gender", clientForm.getGender());
		request.setAttribute("birthDate", clientForm.getBirthDate());
		request.setAttribute("address", clientForm.getAddress());
	}

	private ClientForm createClientForm(HttpServletRequest request) {
		String fullName = request.getParameter("name");
		String cpf = request.getParameter("cpf");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String birthDate = request.getParameter("birthDate");
		String feminine = request.getParameter("feminine-check");
		String masculine = request.getParameter("masculine-check");
		String other = request.getParameter("other-check");
		String address = request.getParameter("address");
		String gender = verifyGender(feminine, masculine, other);

		ClientForm clientForm = new ClientForm(fullName, cpf, email, phoneNumber, birthDate, feminine, masculine, other,
				gender, address);

		return clientForm;
	}

	private String verifyGender(String feminine, String masculine, String other) {

		if (feminine == null && masculine == null && other == null) {
			return " ";
		} else if (feminine == null && masculine == null) {
			return "O";
		} else if (feminine != null && masculine == null) {
			return "F";
		} else if (feminine == null && masculine != null) {
			return "M";
		} else {
			return "O";
		}

	}

	private boolean checkAllFilledFields(ClientForm clientForm) {

		if (clientForm.getFullName() != "" && clientForm.getCpf() != "" && clientForm.getEmail() != ""
				&& clientForm.getPhoneNumber() != "" && clientForm.getBirthDate() != "" && clientForm.getGender() != ""
				&& clientForm.getAddress() != "") {
			return true;

		} else {
			return false;
		}
	}

}
