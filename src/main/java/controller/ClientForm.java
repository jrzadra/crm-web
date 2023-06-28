package controller;

public class ClientForm {

	private String fullName;
	private String cpf;
	private String birthDate;
	private String feminine;
	private String masculine;
	private String other;
	private String gender;
	private String email;
	private String address;
	private String phoneNumber;

	public ClientForm() {

	}

	public ClientForm(String fullName, String cpf, String birthDate, String feminine, String masculine, String other,
			String gender, String email, String address, String phoneNumber) {

		this.fullName = fullName;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.feminine = feminine;
		this.masculine = masculine;
		this.other = other;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getFeminine() {
		return feminine;
	}

	public void setFeminine(String feminine) {
		this.feminine = feminine;
	}

	public String getMasculine() {
		return masculine;
	}

	public void setMasculine(String masculine) {
		this.masculine = masculine;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "ClientForm [fullName=" + fullName + ", cpf=" + cpf + ", birthDate=" + birthDate + ", feminine="
				+ feminine + ", masculine=" + masculine + ", other=" + other + ", gender=" + gender + ", email=" + email
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}

	 
}
